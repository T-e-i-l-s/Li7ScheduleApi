# 1. Используем базовый образ с JDK 17 (или другой нужной версии)
FROM eclipse-temurin:17-jdk-alpine

# 2. Устанавливаем рабочую директорию внутри контейнера
WORKDIR /app

# 3. Копируем собранный JAR-файл в контейнер
COPY build/libs/Li7ScheduleApi-1.0-SNAPSHOT.jar /app/Li7ScheduleApi.jar

# 4. Определяем команду для запуска Spring Boot приложения
CMD ["java", "-jar", "/app/Li7ScheduleApi.jar"]
