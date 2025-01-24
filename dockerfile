FROM eclipse-temurin:17-jre-alpine
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} server.jar
ENV SPRING_PROFILES_ACTIVE=main
ENTRYPOINT ["java","-jar", "-Dspring.profiles.active=main", "/server.jar"]
