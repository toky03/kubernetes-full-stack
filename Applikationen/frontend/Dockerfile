FROM node:10-alpine as frontbuilder

WORKDIR /app

COPY . .

RUN npm install

RUN npm run ng build -- --prod

FROM maven:3.5-jdk-8 AS builder

COPY --from=frontbuilder /pom.xml /app/pom.xml

COPY --from=frontbuilder /src /app/src

RUN mvn -f /app/pom.xml  package -DskipTests

FROM anapsix/alpine-java:latest

COPY --from=builder /app/target/middletier-0.0.1-SNAPSHOT.jar /opt/middle-tier.jar

ENV SPRING_DATASOURCE_URL=jdbc:mysql://rand-gen-database/rand_numbers

ENV SPRING_DATASOURCE_USERNAME=random_user

ENV SPRING_DATASOURCE_PASSWORD=random_password

ENV RANDOM_GENERATOR_URL=rand-gen-app

CMD java -jar /opt/middle-tier.jar

