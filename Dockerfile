#syntax=docker/dockerfile:1

FROM maven:3.9.1-amazoncorretto-19-debian-bullseye

WORKDIR /rest_api

COPY pom.xml ./

COPY src ./src

RUN mvn clean install

CMD ["java", "-jar", "target/rest_api-1.0-SNAPSHOT.jar"]