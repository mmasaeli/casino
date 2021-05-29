FROM gradle:6.8-jdk11 as build-stg
WORKDIR /app
COPY ./ /app
USER root
RUN chown -R gradle /app
USER gradle
RUN gradle build

FROM openjdk:11-jdk as production-stg
WORKDIR /app
COPY --from=build-stg /app/core/build/libs/core-1.0-SNAPSHOT.jar ./core.jar
COPY --from=build-stg /app/contracts/build/libs/contracts-1.0-SNAPSHOT.jar ./contracts.jar

CMD ["java", "-jar", "./core.jar"]
