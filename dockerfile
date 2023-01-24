FROM openjdk:8-jdk-alpine
EXPOSE 3434
ADD target\DeepLearning-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]