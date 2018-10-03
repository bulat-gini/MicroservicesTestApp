FROM openjdk:8-jdk-alpine

ARG JARFILE=./target/gateway-service-0.1.jar

ADD ${JARFILE} /app/app.jar

WORKDIR /app

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
