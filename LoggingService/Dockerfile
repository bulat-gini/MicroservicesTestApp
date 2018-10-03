FROM openjdk:8-jdk-alpine

ARG JARFILE=./target/logging-service-0.1.jar

ADD ${JARFILE} /app/app.jar

WORKDIR /app

EXPOSE 7999

ENTRYPOINT ["java", "-jar", "app.jar"]
