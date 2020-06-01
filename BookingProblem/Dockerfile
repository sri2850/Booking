#Build jar or war for app
FROM maven:3.6.3-jdk-8-slim AS build
WORKDIR /home/app
COPY . /home/app
RUN mvn clean package

FROM openjdk:8-jdk-alpine AS runtime
EXPOSE 8080
COPY --from=build /home/app/target/BookingProblem-0.0.1-SNAPSHOT.war BookingProblem-0.0.1-SNAPSHOT.war
ENTRYPOINT ["sh", "-c", "java -jar /BookingProblem-0.0.1-SNAPSHOT.war"]

