FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} myclient-git.jar
ENTRYPOINT ["java","-jar","/myclient-git.jar"]