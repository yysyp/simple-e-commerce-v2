# simple-e-commerce-v2
This is a simple e-commerce demo based on springboot framework in Java 11
This application uses H2 memory database, and provide Restful APIs to show
a simple e-commerce scenarios including:
1. adding product to cart.
2. removing product from cart.
3. getting the cart detail.
4. placing an order.

### Build prerequisites:
- JDK: OpenJDK 11 installed
- Maven: 3.6.3 installed
- Set JAVA_HOME, MAVEN_HOME environment variables and add OpenJDK and Maven path to system environment variable, make sure java and mvn commands are working

### Build steps:
1. Git download this repository and in folder "simple-e-commerce-v2" run command: ```mvnw clean package```
2. Run command to go to "target" folder: ```cd target```
3. start up application: ```java -jar simple-e-commerce-v2-1.0.0.jar```
4. Application started when you see "ps.demo.WebServerApplication - Started WebServerApplication" message.
5. Open your browser and navigate to the swagger doc page: http://localhost:8080/springdoc/index.html
6. On the swagger doc page, for each API you can click "Try it out" to call the API.
7. The seed data has been initiated in H2 database, so you can use below parameters: 
- userId: 1 to 3
- cartId: 1
- productId: 1 to 17

### Other URLs for reference: 
- API swagger doc: http://localhost:8080/springdoc/index.html
- OpenAPI in JSON format: http://localhost:8080/springdoc/api-docs
- OpenAPI in YAML format: http://localhost:8080/springdoc/api-docs.yaml
- H2 database console: http://localhost:8080/h2-console

### This application is based on memory H2 database, follow below steps to login to H2 database:
1. In browser open URL: http://localhost:8080/h2-console
2. Saved Settings set to: Generic H2 (Embedded)
3. Driver Class set to: org.h2.Driver
4. JDBC URL set to: jdbc:h2:mem:ecommercedb
5. User Name set to: sa
6. No password so, "Password" leave it empty.
7. Click "Connect" button.
8. You will be able to see the tables in left, and you can run SQL on the right panel.

### This is just a simple demo, there are still a lot can be improved, for now just, I will just stop here:
1. http to https
2. user authentication & authorization
3. data query logic & database sql to optimize
4. Use constructor injection instead of using @Autowired. Unit testing. etc.
