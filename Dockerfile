FROM java:openjdk-8u111-alpine
RUN apk --no-cache add curl
COPY build/libs/*-all.jar hello-micronaut.jar
CMD java ${JAVA_OPTS} -jar hello-micronaut.jar