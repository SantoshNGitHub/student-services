FROM openjdk:8

COPY ./target/student-services-0.0.1-SNAPSHOT.jar /user/src/app/

WORKDIR /user/src/app/

RUN sh -c 'touch student-services-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","student-services-0.0.1-SNAPSHOT.jar"]

EXPOSE 8000  