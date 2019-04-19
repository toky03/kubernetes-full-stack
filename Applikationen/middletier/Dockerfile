FROM maven:3.5-jdk-8 AS builder

COPY ./pom.xml /app/pom.xml

COPY ./src /app/src

RUN mvn -f /app/pom.xml  package -DskipTests

FROM anapsix/alpine-java:latest

COPY --from=builder /app/target/middletier-0.0.1-SNAPSHOT.jar /opt/middle-tier.jar

# limit memory space

ENV JAVA_OPTS='-Xmx200m'

ENV SPRING_DATASOURCE_URL=jdbc:mysql://rand-gen-database:3306/rand_numbers

ENV SPRING_DATASOURCE_USERNAME=random_user

ENV SPRING_DATASOURCE_PASSWORD=random_password

ENV RANDOM_GENERATOR_URL=http://rand-gen-tier:5050/

ENTRYPOINT ["java"]

CMD ["-jar", "/opt/middle-tier.jar"]

