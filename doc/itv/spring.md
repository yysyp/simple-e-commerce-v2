--spring   
100道Spring和Spring Boot相关的面试题,由易到难,并包含答案:

1. 什么是Spring框架?Spring是轻量级的开源Java EE框架,可以解决企业应用开发的复杂性。

2. Spring有哪些主要模块?核心容器、AOP、数据访问/集成、Web、测试等模块。

3. Spring的核心容器模块包含哪些? Beans、Core、Context、Expression Language等。

4. Spring支持哪些容器?BeanFactory和ApplicationContext,后者增加了更多企业功能。

5. 什么是Spring IOC容器?Spring IOC容器负责实例化、定位和管理Bean。

6. 什么是依赖注入及其方式?依赖注入(DI)是IOC的一个实现,包括构造器注入、Setter方法注入、接口注入等。

7. Spring Bean的生命周期?包含定义、初始化、使用和销毁四个阶段。

8. 如何定义Spring Bean?可以用XML或注解@Bean、@Component等定义Bean。

9. 什么是Spring配置文件?Spring配置文件包含定义Bean、配置信息等内容,通常为XML文件。

10. 解释Spring Bean自动装配?Spring可以根据属性名或Bean名称自动装配Bean之间的依赖关系。

11. Spring AOP实现的方式?使用动态代理,主要有JDK动态代理和CGLIB字节码生成技术。

12. 什么是切面(Aspect)?切面包含切点、通知(增强处理)、引入(声明添加功能)。

13. Spring AOP支持哪些通知类型? before、after returning、after throwing、after、around等。

14. 什么是织入(Weaving)?织入是把切面应用到目标对象并创建新的代理对象的过程。

15. 如何实现基于XML的AOP切面配置?使用<aop:aspect>定义切面,<aop:before>等定义通知。

16. Spring事务的特点?将业务操作封装为服务,通过声明式事务管理使其具有事务语义。

17. Spring的事务隔离级别?默认值是 ISOLATION_DEFAULT,可设置为READ_UNCOMMITTED等其他隔离级别。

18. Spring事务的传播行为有哪些?REQUIRED、 REQUIRES_NEW、NESTED等级别。

19. Spring事务的回滚规则?发生 RuntimeException 及其子类会回滚,Checked Exception不会。

20. @Transactional的常用参数有哪些?propagation、isolation、timeout、rollbackFor、noRollbackFor等。

21. Spring有几种事务管理器?JDBC、Hibernate、JPA、JTA等。

22. 什么是Spring MVC?Spring MVC是Spring的Web框架,使用MVC设计模式。

23. DispatcherServlet的作用?作为Spring MVC的核心分发器,负责路由并调度请求。

24. @Controller和@RestController的区别?@RestController将返回值直接作为响应,@Controller还需要写@ResponseBody。

25. @RequestMapping的常用属性?value映射请求路径,method指定请求方法类型。

26. Springboot starters有哪些?web、data-jpa、security、actuator等。

27. Spring Boot自动配置的原理?SpringBoot启动时加载自动配置类,根据jar依赖 Configuration条件装配。

28. Spring Boot有哪些方式定制配置?使用application.properties、编写配置类加@Configuration等。

29. 如何修改Spring Boot的默认端口号和上下文路径?通过 server.port和server.servlet.context-path属性。

30. Spring Boot支持哪些内嵌容器?Tomcat、Jetty、Undertow等,默认Tomcat。

31. 如何解决Spring Boot应用404无法映射资源?使用Spring MVC配置addResourceHandlers实现。

32. Spring Boot的多环境配置是怎样实现的?通过使用application-prod.properties指定活动环境。

33. 什么是actuator?Spring Boot Actuator提供了对生产环境应用程序的监控和管理能力。

34. JdbcTemplate和JdbcDaoSupport的区别? JdbcTemplate更加简洁,可以不依赖于spring的框架类。

35. 如何监控Spring Boot应用的运行状态?可以使用Actuator暴露应用运行时的监控接口数据。

36. Spring Boot Starter的工作原理?Starter会依据classpath里的jar包导入自动配置,减少手动配置。

37. 如何在Spring Boot中进行集成测试?使用@SpringBootTest进行启动类测试,使用@MockBean创建mock对象。

38. Spring Boot的条件化配置有哪两种方式?使用@Profile和@Conditional注解。

39. 如何实现Spring Boot的热更新?使用spring-boot-devtools,实现classloader层面热部署。

40. Spring Boot Scheduler的常用注解有哪些?@Scheduled、@EnableScheduling等。

41. 如何在Spring Boot中使用Filter?通过@Bean注册Filter,或者添加@ServletComponentScan启用扫描。

42. 如何在Spring Boot中添加拦截器?实现WebMvcConfigurer接口添加拦截器并设置addInterceptors。

43. Spring Boot支持哪些日志框架?JUL、Log4j2、Logback等,默认Logback。

44. 如何切换Spring Boot日志框架?去除默认日志依赖,添加对应日志依赖,配置loggers为对应框架即可。

45. Spring Boot日志文件配置在哪个配置文件中?在application.properties中使用logging.file或logging.path配置。

46. Spring Boot中如何配置日志级别?使用logging.level.<logger-name>=<level>设置级别。

47. 如何跟踪Spring Boot应用的日志?使用logging.level.root=trace,或通过--debug启动。

48. @SpringBootApplication注解包含哪些功能?包含了@Configuration、@EnableAutoConfiguration、@ComponentScan。

49. 如何在Spring Boot中配置数据源?在application.properties中配置spring.datasource.*属性。

50. Spring Boot访问数据库有哪些方式?JdbcTemplate、JPA、JdbcDaoSupport、MyBatis等。

51. 如何实现Spring Boot中的缓存?可以使用@EnableCaching启用缓存,并使用@Cacheable等注解缓存方法。

52. Spring Boot中的监听器有哪些?主要有两种:Spring ApplicationListener和Servlet监听器。

53. Spring Boot中的事件有哪些?主要有Spring ApplicationEvent和Servlet事件。

54. 如何在Spring Boot中使用WebSocket?通过实现WebSocketConfigurer接口注册端点Url。

55. 如何在Spring Boot中做单元测试?使用@SpringBootTest注解加载完整上下文。

56. 如何在Spring Boot中做集成测试?使用@SpringBootTest+MockMVC进行集成测试。

57. 如何在Spring Boot中启动定时任务?使用@EnableScheduling注解开启计划任务功能。

58. 如何在Spring Boot中使用拦截器?实现WebMvcConfigurer接口添加拦截器并设置addInterceptors方法。

59. 在Spring Boot中使用过滤器的步骤?通过@Bean方式注册过滤器,或使用@ServletComponentScan。

60. 如何在Spring Boot中做异步处理?注入AsyncTaskExecutor执行器,使用@Async注解表明需要异步处理。

61. Spring Boot打包应用的方式?可以使用maven或gradle插件生成jar包直接运行,或生成war部署到服务器。

62. Spring Boot Actuator的作用?主要用于生产环境下监控和管理Spring Boot应用。

63. Spring Boot Actuator的端点都有哪些?health、beans、caches、conditions等。

64. 如何在Spring Boot中获取属性配置的值?使用@Value("${property}")注解,或Environment.getProperty方法。

65. Spring Boot中配置文件的加载顺序?bootstrap.properties、application.properties和applicaiton.yml。

66. Spring Boot中如何实现整合Swagger?使用springfox-swagger依赖,并使用@EnableSwagger2注解。

67. Spring Boot中如何实现异常处理?通过@ControllerAdvice和@ExceptionHandler注解实现全局异常处理。

68. Spring Boot中的启动流程?引导上下文加载配置、创建environment、打印banner、刷新context、启动Tomcat等。

69. Spring Boot中如何解决跨域问题?使用@CrossOrigin或WebMvcConfigurer处理跨域问题。

70. 如何实现Spring Boot应用的热部署?引入spring-boot-devtools依赖,实现自动重启应用。

71. Spring Boot中使用过哪些 starters?web、data-jpa、security、actuator等。

72. 如何在Spring Boot中连接池?默认使用HikariCP连接池,可以在配置中指定使用DBCP2或Tomcat连接池。

73. Spring Boot 自动配置原理?根据引入的jar依赖,匹配@\ConditionalOnClass和@\ConditionalOnMissingBean条件。

74. Spring Boot中如何覆盖默认配置?使用@Bean替换默认Bean,或使用@ConditionalOnMissingBean预置条件。

75. 如何在Spring Boot中使用拦截器?实现WebMvcConfigurer接口,重载addInterceptors方法。

76. 如何排除Spring Boot的自动配置类?使用@EnableAutoConfiguration(exclude=类名.class)

77. Spring Boot 中如何实现定时任务?使用@EnableScheduling开启定时任务,用@Scheduled声明需要定时执行的方法。

78. Spring Boot 如何实现异步调用?注入AsyncTaskExecutor执行器,使用@Async注解表明需要异步处理的方法。

79. Spring Boot 如何自定义Banner?通过spring.banner.location或通过Banner接口实现。

80. Spring Boot中如何实现网络分页?继承PagedResourcesAssemblerWrapper对分页结果集进行包装。

81. Spring Boot Admin的功能?管理和监控SpringBoot应用程序。

82. Spring Boot Admin UI界面主要包含什么信息?应用概览、详细信息、日志追踪、JMX管理、指标监控等。

83. Spring Boot Admin 的自动化原理?客户端注册到服务端后发送心跳,服务端维护并检查心跳状态。

84. Spring Boot开发分布式应用的注意事项?配置服务发现、断路器实现容错、使用消息队列、接口幂等设计。

85. Spring Boot Actuator提供哪些监控接口?主要是health, info, metrics等。

86. 如何在Spring Boot中做全局异常处理?使用@ControllerAdvice+@ExceptionHandler捕获全局异常。

87. Spring Boot的starter原理?starter将相关依赖打包,并处理版本兼容问题。@ConditionalOnClass自动配置。

88. 如何在Spring Boot中使用Redis?引入spring-boot-starter-data-redis,通过RedisTemplate使用Redis。

89. Spring Boot 监控接口调用链跟踪?使用spring-cloud-sleuth-zipkin集成zipkin实现调用链跟踪。

90. Spring Boot部署服务器的方式?可以发布成jar包,然后使用java -jar运行;或者发布成war放到servlet容器中。

91. 为什么要使用Spring Boot?Spring Boot简化Spring应用开发,内嵌web服务器,自动配置组件,无代码生成和XML配置。

92. Spring Boot 的核心注解?@SpringBootApplication、@Configuration、@EnableAutoConfiguration、 etc.

93. Spring Boot 端点监控?主要是Actuator提供不同的端点,对应监控应用的不同方面。

94. Spring Boot 核心配置文件?主要是application.properties或application.yml文件。

95. Spring Boot 支持的日志框架?Logback、Log4J2、 Java Util Logging等。

96. 如何修改Spring Boot的默认端口号?在application.properties中配置server.port属性。

97. Spring Boot Web开发常用注解?@Controller、@RestController、@RequestMapping等。

98. Spring Boot 配置数据源的方式?在application.properties配置spring.datasource.*属性。

99. Spring Boot 配置应用上下文路径?使用server.servlet.context-path属性。

100. Spring Boot 常用的启动参数?–debug、–trace、–jmx等参数,用来调试和跟踪应用。
