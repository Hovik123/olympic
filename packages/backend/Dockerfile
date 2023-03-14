FROM openjdk:11-jdk-slim
RUN mkdir -p /app && mkdir -p /app/conf
COPY . /app

WORKDIR /app

RUN mvn clean install

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/backend*.jar"]
