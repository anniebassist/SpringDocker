FROM openjdk:8
Expose 8080
Add target/SP.jar SP.jar
ENTRYPOINT ["java","-jar","/SP.jar"]