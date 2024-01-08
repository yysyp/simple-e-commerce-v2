--javacore   
Java 30道面试题：

1. 讲一下Java的反射机制?反射可以在运行时获取类的信息,调用对象的属性,方法和构造方法,绕过编译时的访问检查。

2. 动态代理是什么?有什么用?动态代理是在运行时动态生成代理类,代理类负责调用实际对象的方法。可以进行额外处理,不修改源码的情况下添加功能。

3. 讲一下Java的内存模型?Java内存模型规定所有的变量都存储在主内存中,每个线程有自己的工作内存,线程对变量的操作先在工作内存进行,然后同步到主内存中。

4. 什么是多线程之间的通信?有哪些方式?wait/notify、join、volatile、BlockingQueue、生产者消费者等。

5. 什么是原子性、有序性和可见性?原子性是操作indivisible不可分割,有序性是操作顺序符合代码顺序,可见性是线程修改后对其他线程可见。

6. 创建线程的几种方式?继承Thread类、实现Runnable接口、实现Callable接口+FutureTask、线程池。

7. 线程的生命周期有哪些状态?新建、可运行、阻塞、无限期等待和死亡。

8. sleep()和wait()有什么区别?sleep()是线程类静态方法,让出CPU时间片,不释放锁。wait()是Object方法,让线程等待并释放锁。

9. 什么是死锁和活锁?死锁是互相持有对方需要的锁,陷入永久等待。活锁是竞争失败后重试,不断重复。

10. 说一下Runnable和Callable的区别?Runnable没有返回值,Callable有返回值。Callable可以抛出异常。

11. 什么是线程池?为什么要用线程池?线程池可以重用线程,减少创建和销毁线程的开销,提供线程并发数控制。

12. Java Collection框架的结构?Collection和Map两大接口。主要实现有List、Set、Queue和Map等。

13. ArrayList和LinkedList有什么区别?ArrayList基于数组,LinkedList基于双向链表。查询快增删慢,LinkedList相反。

14. HashMap和Hashtable的区别?HashMap非线程安全,效率高。Hashtable线程安全,效率低。Hashtable不允许null键和值。

15. HashMap的工作原理?HashMap基于哈希表,通过key的hashCode映射到对应桶中。当发生冲突时再比较equals方法。

16. 说一下HashSet的工作原理?HashSet底层使用HashMap存储元素,不允许重复。向HashSet添加元素等于向HashMap的key中添加,value使用PRESENT。

17. 动态代理和Cglib区别?动态代理基于接口,Cglib基于继承。Cglib通过生成子类并覆写其中方法建立代理。

18. 为什么要使用泛型?泛型可以进行编译时类型检查,提高安全性。无需进行强制类型转换,程序更加简洁。

19. 泛型通配符?、<? extends T> 和 <? super T> 的区别?<?>代表任意泛型类型,<? extends T> 限定上界,<? super T>限定下界。

20. 重载和重写的区别?重载是同名不同参数方法,属于静态绑定;重写父类方法,属于动态绑定。

21. String为什么要设计成不可变的?String Pool的需要,字符串驻留在常量池中,不可变保证安全性。

22. 什么是标记-清除算法和复制算法?标记清除标记可达对象,直接清理未标记对象。复制把可达对象复制到空间,待回收空间一次清理掉。

23. 说一下强、软、弱和虚引用?强引用是普通引用,回收不了。软引用内存不足回收,弱引用下一次GC回收,虚引用不决定对象生命周期。

24.  finalize()方法的作用是什么?finalize() 是对象被垃圾回收前调用的方法,用于释放资源。但不能保证一定会调用。

25. 什么是BIO、NIO和AIO? BIO是阻塞IO,NIO是非阻塞IO,AIO是异步IO。NIO和AIO是非阻塞的,不会导致线程阻塞。

26. 用过哪些网络协议?应用层主要用HTTP协议;传输层用TCP和UDP协议;网络层主要是IP协议。

27. TCP为什么可靠? TCP通过三次握手建立连接,滑动窗口,确认应答,超时重传,拥塞控制来保证可靠传输。

28. GET和POST请求有什么区别?GET把参数加入URL传递,POST放在请求体中。GET安全性低,长度限制。适合信息获取,POST用于修改服务器资源。

29. Session和Cookie有什么区别?Session保存在服务器端,Cookie在客户端。Session安全,Cookie可以被禁用。Session默认失效时间长,与browser session 绑定。

30. 什么是持续集成、持续交付、持续部署?持续集成时频繁合并代码到主干;持续交付是频繁构建软件生成测试版;持续部署是频繁部署软件新版本到生产环境。


--javadev   
100道Java面试题,由易到难,并包含答案:

1. Java的主要特性是什么?封装、继承、多态、抽象。

2. 什么是JDK、JRE、JVM的关系?JDK是Java开发工具包,包含JRE和开发工具;JRE是Java运行时环境;JVM是Java虚拟机,负责运行Java程序。

3. Java面向对象的三大特性?封装、继承、多态。

4. Java的访问修饰符有哪些?private、protected、public、默认(不写为默认)。

5. 接口和抽象类的区别?接口完全是抽象的,可以有默认方法实现;抽象类可以有抽象方法和非抽象方法。接口不能实例化,抽象类可以。

6. ==和equals的区别?==比较的是对象的地址,equals比较对象的内容。

7. String类为什么要设计成不可变的?因为String经常当做HashMap的key,不可变可以防止键值对被意外改变,提高安全性。

8. 重载和重写的区别?重载是同名不同参数方法,属于静态绑定;重写父类方法,属于动态绑定。

9. try-catch-finally的顺序?try块-->catch块-->finally块,finally总会被执行,除非JVM退出。

10. 为什么main方法必须声明为public static void?Java程序的入口点,供JVM调用,不需要创建实例即可调用。

11. 构造方法可以被重写吗?不能,构造方法不能被继承,因此不能被重写。

12. 面向对象编程的基本思想是什么?以类为中心,对类进行抽象、封装,通过对象间交互、消息传递来完成对系统的建模。

13. Java匿名内部类是什么?没有名字的本地内部类,必须继承或实现一个接口或类。

14. 异常的继承体系结构?顶层是Throwable,下面主要分为Exception和Error两大支系。

15. final关键字的作用?可以修饰类不能被继承,修饰方法不能被重写,修饰变量为常量。

16. 内部类可以被声明为static吗?可以,静态内部类不需要依赖外部类实例。

17. StringBuilder和StringBuffer的区别?StringBuilder非线程安全但效率高,StringBuffer线程安全,方法加了同步锁。

18. 接口可以继承另一个接口吗?可以,接口与接口直接是继承关系,而不是实现关系。

19. 泛型有什么作用?参数化类型,使代码可以应用于多种类型,增加灵活性且类型安全。

20. 什么是方法的返回值?方法完成运算或执行操作后的结果返回,没有返回值则为void。

21. 一个类的构造方法的作用是什么?创建类对象时初始化对象,给对象属性赋初始值。

22. 静态方法可以被重写吗?不能,静态方法属于类不属于实例,只能被隐藏。

23. 对象的相等与引用的相等,两者有什么不同?对象相等比较的是属性值,引用相等比较的是他们指向的内存地址。

24. 构造器Constructor是否可被继承?构造器不能被继承,但是可以调用父类构造器。

25. 接口的变量默认是什么性质?接口中变量默认是 public static final 类型。

26. 一个类实现接口时要实现接口的所有方法吗?不需要,可以只实现部分方法,但要声明是抽象类。

27. 重载和重写的区别是什么?重载方法名必须相同,参数列表必须不同;重写父类方法名和参数都相同。

28. 访问修饰符public、protected、private的作用分别是什么?public完全开放访问;protected允许子类和同一个包访问;private只允许内部和嵌套类访问。

29. 对象的哈希码有什么作用?哈希码的作用是获取对象的内存地址,以方便进行快速查找。

30. 异常处理的5个关键字分别是什么?try、catch、finally、throw、throws。

31. 多catch块时的异常处理顺序?catch按捕获异常的子父类关系从上到下顺序匹配捕获。

32. 静态方法和实例方法有何不同?静态方法属于类不需要实例就可以调用,实例方法需要实例对象才能调用。

33. 自定义异常的用途是什么?用于表示特殊错误情况,需要跟其他调用者进行不同处理。

34. hashCode()与equals()之间的关系?如果两个对象通过equals()比较是相等的,那么他们的hashCode()应该相同。

35. 序列化和反序列化的作用分别是什么?序列化是将对象状态转换为可存储或传输的形式;反序列化是恢复序列化对象。

36. String类为什么要设计成不可变的?因为String经常当做HashMap的key,不可变可以防止键值对被意外改变。

37. wait()和sleep()方法的区别?wait()释放锁,sleep()不释放锁。wait()需在同步块中调用,sleep()可以在任何地方调用。

38. 字符流和字节流的区别?字符流以字符为单位,字节流以字节为单位;字符流处理文本文件,字节流处理二进制文件。

39. 输入流和输出流的区别?输出流将数据从内存写出,输入流将数据读入内存。

40. 重载(Overload)和重写(Override)的区别?重载方法名必须相同,参数列表必须不同;重写父类方法名和参数都相同。

41. 集合类Collection和Collections的区别?Collection是集合接口,Collections是操作集合的工具类。

42. 深拷贝和浅拷贝有什么区别?浅拷贝复制对象的引用,深拷贝复制对象的内容。

43. hashCode()与equals()之间关系?如果两个对象通过equals()方法比较返回true,则hashCode()应该相等。

44. 谈谈你对IOC的理解?控制反转,将对象创建交给容器完成,可以减低耦合度。主要实现方式是依赖注入。

45. 用过哪些Map类?HashMap、LinkedHashMap、TreeMap、HashTable、ConcurrentHashMap等。

46. 用过哪些List类?ArrayList、LinkedList、Vector、Stack等主要实现类。

47. 数组(Array)和数组列表(ArrayList)有何区别?数组长度不可变,ArrayList长度可变。数组可以存基本类型,ArrayList只能存对象。

48. 谈谈你对AOP的理解?在不改变原代码的情况下,通过预编译方式和运行时动态代理,实现程序功能的统一维护的一种技术。

49. 用过哪些多线程开发方式?继承Thread类、实现Runnable接口、线程池等方式。

50. 线程有哪些基本状态?新建、可运行、阻塞、无限期等待和死亡。

51. 进程和线程的区别?进程有独立的地址空间,线程共享进程地址空间;线程更轻量,进程切换开销更大。

52. 说一说volatile关键字的作用?volatile关键字会强制从共享内存中读取变量,可以避免线程缓存变量而导致数据不一致。

53. 线程池的主要参数?核心线程数、最大线程数、线程存活时间、阻塞队列容量、拒绝策略等。

54. 说一说死锁产生的原因?互斥、持有、不可剥夺和环路等待条件同时满足。

55. 乐观锁和悲观锁的区别?悲观锁假定会发生冲突,访问同步资源时都加锁;乐观锁假设不会发生冲突,只在提交操作时检查。

56. 说一说线程安全的集合类?Vector、Hashtable、Stack等都是线程安全的。

57. 多线程访问时HashMap线程不安全的原因?在多线程条件下,扩容时可能出现环形链表导致死循环。

58. 创建线程池的方式?通过ThreadPoolExecutor构造函数、Executors的静态工厂方法等。

59. ExecutorService接口中的方法?submit、execute、shutdown、shutdownNow等。

60. 线程池参数corePoolSize作用?核心线程数线程池线程最小数量。

61. 用过CountDownLatch吗?什么场景下用的?可实现线程之间的同步,一个线程等待另一组线程完成操作之后再执行。

62. CountDownLatch的两个主要方法?countDown()和await(),前者计数减1,后者等待计数变为0。

63. 说一说Java内存模型?主内存、工作内存、缓存一致性、原子性、有序性等概念。

64. 什么是线程本地存储(Thread Local)?提供线程内部的数据存储,各线程互不影响。

65. 线程安全的Singletonsingleton的实现?饿汉式、懒汉式、双重校验锁、静态内部类、枚举实现单例。

66. 主要的网络协议?应用层的HTTP,传输层的TCP/UDP,网络层的IP协议。

67. 套接字Socket编程流程?服务器端和客户端通过Socket建立连接,通过输入输出流进行读写操作。

68. InetAddress的常用方法?getLocalHost()、getByName()、getAllByName()等获取IP地址。

69. OSI七层模型?物理层、数据链路层、网络层、传输层、会话层、表示层、应用层。

70. TCP的三次握手?客户端发送SYN报文,服务器端回送SYN ACK报文,最后客户端回送ACK报文。

71. TCP和UDP区别?TCP面向连接,UDP无连接;TCP保证数据完整性,UDP可能丢包。TCP重发 ARQ机制,UDP不重发。

72. GET和POST区别?GET通过URL传参,数据暴露在URL上,POST通过请求体传输参数。GET请求参数有长度限制,POST没有限制。

73. Session和Cookie的区别?Session数据保存在服务器端,Cookie保存在客户端。Session安全性高,默认失效时间也较长。

74. 数据库索引的工作原理及其优缺点?索引通过提高查询效率减少检索的数据量。优点:提高查询效率;缺点:占空间及索引维护成本。

75. 数据库事务的四大特性(ACID)?原子性、一致性、隔离性、持久性。

76. 数据库的三大范式?第一范式字段不可分;第二范式不存在部分依赖;第三范式不存在传递依赖。

77. 数据库优化的思路?通过索引、SQL语句优化、数据库结构优化等方式提高查询效率。

78. 说一说数据库的脏读、幻读、不可重复读?脏读读取未提交数据;幻读新增数据未读到;不可重复读多次读取结果不一致。

79. 简单介绍下数据库连接池?数据库连接池提前创建多个连接,应用从池获取连接再返还连接。避免重复创建销毁,提升系统效率。

80. SQL优化的思路?通过索引优化、SQL语句优化、数据库结构优化等方式提高查询效率。

81. 数据库索引的原理及分类?索引通过提高查询效率减少检索数据量。主要有树形索引、Hash索引、全文索引等。

82. 谈谈你对Spring的认识?Spring是一个开源IOC和AOP容器框架。具有轻量级、控制反转、面向切面编程等特性。

83. Spring的核心组件有哪些?IOC容器、AOP模块、JDBC抽象层、DAO支持层等。

84. Spring Bean的生命周期?粗略分为5个阶段:实例化、属性赋值、初始化、使用、销毁。

85. Spring IOC容器初始化的基本过程?定位配置文件、解析配置文件、接管Bean管理、实例化Bean等。

86. Spring AOP实现的原理?通过动态代理技术,在不修改源代码的情况下实现对方法的增强。

87. Spring事务的isolation级别?默认是ISOLATION_DEFAULT,还有READ_UNCOMMITTED等级别。

88. Spring事务的传播行为?REQUIRED(默认)、REQUIRED_NEW、NESTED等级别。

89. Spring的事务管理器?JdbcTransactionManager、HibernateTransactionManager等。

90. SpringMVC的工作流程?分发器将请求交给处理器适配器,适配器再调用具体的处理器执行请求,返回视图。

91. @RestController的作用是什么?将Controller方法返回对象转换为JSON或XML响应。

92. Spring Boot启动原理?通过@EnableAutoConfiguration注解找到META-INF/spring.factories配置自动配置类。

93. Spring Boot的核心注解?@SpringBootApplication是组合注解,包含@Configuration等注解。

94. Spring Boot管理配置文件的顺序?bootstrap.properties、application.properties、application.yml。

95. Spring Boot的定时任务?使用@EnableScheduling注解开启计划任务,用@Scheduled声明需要定时的方法。

96. Spring Boot调用Restful服务通常使用哪个注解?一般使用@RestController注解声明Restful服务。

97. Spring Boot的核心配置文件是?application.properties和application.yml文件。

98. Spring Boot actuator的功能?提供监控和管理生产环境下的Spring Boot应用程序。

99. Spring Boot启动流程?引导应用上下文、创建Environment、打印Banner信息、刷新上下文、应用程序启动完毕。

100. Spring Boot的运行原理?利用了自动配置特性来进行默认配置,并可修改默认值来实现自定义配置。