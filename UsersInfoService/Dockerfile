FROM openjdk:8-jdk-alpine

ARG JARFILE=./target/usersinfo-0.1.jar

ADD ${JARFILE} /app/app.jar

WORKDIR /app

ENTRYPOINT ["java", "-jar", "app.jar"]