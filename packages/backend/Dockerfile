FROM adoptopenjdk/maven-openjdk11 as build
ENV HOME=/usr/app
RUN mkdir -p $HOME
WORKDIR $HOME
ADD pom.xml $HOME
RUN mvn verify --fail-never
ADD . $HOME
RUN mvn package -DskipTests

FROM adoptopenjdk/maven-openjdk11
COPY --from=build /usr/app/target/backend-1.0.jar /app/runner.jar
ENTRYPOINT java -jar /app/runner.jar
