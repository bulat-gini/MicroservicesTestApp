FROM openjdk:8-jdk-alpine

ARG JARFILE=./target/serviceregistry-0.1.jar

ADD ${JARFILE} /app/app.jar

WORKDIR /app

EXPOSE 9000

ENTRYPOINT ["java", "-jar", "app.jar"]
