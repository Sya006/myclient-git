FROM openjdk14:alpine-jre
# Refer to Maven build -> finalName
ARG JAR_FILE=target/*.jar
# cd /opt/app
WORKDIR /opt/app
# cp target/spring-boot-web.jar /opt/app/app.jar
COPY ${JAR_FILE} myclient-git.jar
# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","myclient-git.jar"]