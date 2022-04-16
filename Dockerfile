FROM openjdk:11
ADD target/customer-service-v1.jar customer-service-v1.jar
EXPOSE 9050
ENTRYPOINT ["java", "-jar", "customer-service-v1.jar"]