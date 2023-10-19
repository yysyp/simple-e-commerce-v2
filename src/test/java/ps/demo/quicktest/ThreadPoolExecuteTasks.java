package ps.demo.quicktest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolExecuteTasks {

    private static final int MAX_RETRY_COUNT = 3; // 最大重试次数

    public static void main(String[] args) {
        // 创建线程池
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // 创建任务列表
        List<Callable<Boolean>> tasks = new ArrayList<>();
        tasks.add(new Task("Task 1"));
        tasks.add(new Task("Task 2"));
        tasks.add(new Task("Task 3"));
        tasks.add(new Task("Task 4"));
        tasks.add(new Task("Task 5"));

        try {
            // 提交任务并获取Future对象列表
            List<Future<Boolean>> futures = executorService.invokeAll(tasks);

            // 等待所有任务完成
            for (Future<Boolean> future : futures) {
                int retryCount = 0;
                while (!future.get() && retryCount < MAX_RETRY_COUNT) {
                    retryCount++;
                    System.out.println("Task failed. Retrying... (Retry Count: " + retryCount + ")");
                    future = executorService.submit(new Task("Retry " + retryCount));
                }
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            // 关闭线程池
            executorService.shutdown();
        }
    }

    static class Task implements Callable<Boolean> {

        private final String name;

        Task(String name) {
            this.name = name;
        }

        @Override
        public Boolean call() throws Exception {
            // 模拟任务执行，这里只是简单的输出任务名称
            System.out.println("Executing task: " + name);
            // 假设任务执行失败的条件是名称中包含"Task 2"
            return !name.contains("Task 2");
        }
    }
}
