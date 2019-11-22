FROM openjdk:8-jdk-alpine
MAINTAINER josdev27
ARG JAR_FILE
ADD target/${JAR_FILE} demo.jar
ENTRYPOINT ["java","-jar","/demo.jar"]