FROM openjdk:17
EXPOSE 8080
ADD /form-0.0.1-SNAPSHOT.jar form-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/form-0.0.1-SNAPSHOT.jar"]
