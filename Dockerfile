FROM openjdk:17
EXPOSE 8080
ADD target/spring-azure.jar spring-azure.jar
ENTRYPOINT ["java","-jar","/spring-azure.jar"]