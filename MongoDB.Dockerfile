FROM mongo:4.0.6

ENV MONGO_PORT = ''

VOLUME /opt/mongo/

EXPOSE 27017

WORKDIR /opt/mongo/

CMD mongod --bind_ip 0.0.0.0