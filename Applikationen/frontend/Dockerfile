FROM node:10-alpine as frontbuilder

WORKDIR /app

COPY . .

RUN npm install

RUN npm run ng build -- --prod

FROM maven:3.5-jdk-8 AS builder

COPY --from=frontbuilder app/pom.xml /app/pom.xml

COPY --from=frontbuilder app/src /app/src

RUN mvn -f /app/pom.xml  package -DskipTests

FROM anapsix/alpine-java:latest

COPY --from=builder /app/target/middletier-0.0.1-SNAPSHOT.jar /opt/middle-tier.jar


ENV STAT_URL=http://stat-tier:8080/

ENV RAND_NUM_URL=http://middle-tier:8080/

ENV HISTORY_URL=http://stat-tier:8080/history

CMD java -jar /opt/middle-tier.jar

