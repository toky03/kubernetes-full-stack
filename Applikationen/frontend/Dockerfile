FROM node:10-alpine as frontbuilder

WORKDIR /app

COPY . .

RUN npm install

RUN npm run build

FROM maven:3.5-jdk-8 AS builder

COPY --from=frontbuilder app/ /app/

RUN mvn -f /app/pom.xml  package -DskipTests

FROM anapsix/alpine-java:latest

COPY --from=builder /app/target/frontend-0.0.1-SNAPSHOT.jar /opt/front-tier.jar


ENV STAT_URL=http://rand-stat-tier:8080/

ENV RAND_NUM_URL=http://rand-middle-tier:7070/

ENV HISTORY_URL=http://rand-stat-tier:8080/history

ENTRYPOINT ["java"]

CMD ["-jar", "/opt/front-tier.jar"]


