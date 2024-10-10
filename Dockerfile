FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY build/libs/Li7ScheduleApi-1.0-SNAPSHOT.jar /app/Li7ScheduleApi.jar
CMD ["java", "-jar", "/app/Li7ScheduleApi.jar"]
