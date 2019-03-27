FROM anapsix/alpine-java:latest

ADD target/middle-tier-client-0.0.1-SNAPSHOT.jar /opt/middle-tier.jar

ENV SPRING_DATASOURCE_URL=jdbc:mysql://rand-gen-database/rand_numbers

ENV SPRING_DATASOURCE_USERNAME=random_user

ENV SPRING_DATASOURCE_PASSWORD=random_password

ENV RANDOM_GENERATOR_URL=rand-gen-app

CMD java -jar /opt/middle-tier.jar

