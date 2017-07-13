FROM maven AS builder

ADD . /build

WORKDIR /build

RUN mvn dependency:resolve verify package

FROM java:8

WORKDIR /app

COPY --from=builder /build/target/healthcheck-jar-with-dependencies.jar /app/run.jar

EXPOSE 4567

CMD ["/usr/lib/jvm/java-8-openjdk-amd64/bin/java", "-jar", "run.jar"]