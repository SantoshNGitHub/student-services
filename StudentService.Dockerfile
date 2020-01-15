FROM openjdk:8

ARG JAR_FILE_PATH

RUN mkdir /opt/app

RUN mkdir /opt/app/services

COPY $(JAR_FILE_PATH) /opt/app/service/student.jar

VOLUME /opt/app/service/ 

ENTRYPOINT java -Dserver.port=8000 -jar /opt/app/service/student.jar

EXPOSE 8000  