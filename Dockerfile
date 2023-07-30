FROM amazoncorretto:17
EXPOSE 8080
COPY target/*.jar app.jar
CMD ["java","-jar","/app.jar"]