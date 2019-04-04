FROM maven:3.5-jdk-8 AS builder

COPY ./pom.xml /app/pom.xml

COPY ./src /app/src
ADD ~/.m2 /root/.m2 
RUN mvn -f /app/pom.xml  package -DskipTests

FROM anapsix/alpine-java:latest

COPY --from=builder /app/target/statservice-0.0.1-SNAPSHOT.jar /opt/stat-tier.jar

ENV SPRING_DATASOURCE_URL=jdbc:mysql://rand-gen-database/rand_numbers

ENV SPRING_DATASOURCE_USERNAME=random_user

ENV SPRING_DATASOURCE_PASSWORD=random_password

CMD java -jar /opt/stat-tier.jar
