FROM openjdk:8-jdk-alpine
RUN mkdir -p /app && mkdir -p /app/conf
COPY target/*.jar /app/backend.jar
COPY src/main/resources/*.properties /app/conf/

WORKDIR /app

EXPOSE 8080
ENV LOG_PATH "/app/log"

ENTRYPOINT ["java", "-jar", "/app/backend.jar"]
