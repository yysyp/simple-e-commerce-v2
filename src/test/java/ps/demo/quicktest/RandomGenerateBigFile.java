package ps.demo.quicktest;

import org.apache.commons.lang3.RandomStringUtils;
import ps.demo.common.MyFileUtil;
import ps.demo.common.MyReadWriteUtil;

import java.io.File;

public class RandomGenerateBigFile {

    public static void main(String [] args) {

        File file = MyFileUtil.getFileTsInHomeDir("BigFile.txt");
        String m1 = RandomStringUtils.randomAlphabetic(1024*1024);
        MyReadWriteUtil.writeFileContent(file, m1, "UTF-8", true);

        System.out.println("1m file generated file="+file);
    }
}
