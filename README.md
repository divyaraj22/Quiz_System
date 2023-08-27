# Quiz_System
SpringBoot Project

Using Maven:

1.Open your terminal/command prompt.

2.Navigate to the root directory of your Spring Boot project where your pom.xml file is located.

3.Run the following command to build and run your Spring Boot application:
mvn spring-boot:run

Using Gradle:

1.Open your terminal/command prompt.

2.Navigate to the root directory of your Spring Boot project where your build.gradle file is located.

3.Run the following command to build and run your Spring Boot application:
./gradlew bootRun

If you're on Windows, use gradlew.bat instead of ./gradlew.

Both of these commands will compile your project, resolve dependencies, and start your Spring Boot application. The Spring Boot Maven Plugin or Gradle Plugin will automatically start an embedded web server and deploy your application.

After running the command, you should see log messages indicating that your Spring Boot application is starting. Once the application is running, you can access it by opening a web browser and navigating to the URL specified in your application (usually http://localhost:8080 by default).

Remember that you need to have either Maven or Gradle installed on your system to use the respective commands. Also, make sure that your project's build configuration (pom.xml for Maven or build.gradle for Gradle) is correctly set up with the Spring Boot dependencies and configurations.

