FROM openjdk:8

ARG JAR_FILE_PATH

RUN mkdir /opt/app

RUN mkdir /opt/app/services

COPY $(JAR_FILE_PATH) /opt/app/services/student.jar

VOLUME /opt/app/services/ 

ENTRYPOINT java -Dserver.port=8000 -jar /opt/app/services/student.jar

EXPOSE 8000  