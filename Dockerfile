FROM 3.8.7-eclipse-temurin-19 AS build 
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:19 
COPY --from=build /target/spring_api-0.0.1-SNAPSHOT.jar spring_api.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","spring_api.jar"]
