FROM openjdk:17-jdk-slim
LABEL authors="troymcgahey"

WORKDIR /app

COPY target/JavaRestController-0.0.1.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]