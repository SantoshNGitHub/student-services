docker build --build-arg JAR_FILE_PATH=./target/student-services-0.0.1-SNAPSHOT.jar -f StudentService.Dockerfile -t student-app . 
docker build -f MongoDB.Dockerfile -t student-mongo .

docker run -itd -u 0 --name student-mongo -p 6380:27017 --network student-network -e MONGO_PORT='27017' -v /opt/app/mongo:/opt/mongo/ student-mongo