FROM adoptopenjdk/maven-openjdk11
RUN mkdir -p /app && mkdir -p /app/conf
COPY . /app

WORKDIR /app

RUN mvn install -DskipTests

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/target/backend-1.0.jar"]
