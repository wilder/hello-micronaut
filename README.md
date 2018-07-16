# hello-micronaut
Application built to learn the features of [Micronaut](http://micronaut.io/), a modern, JVM-based, full stack microservices framework designed for building modular, easily testable microservice applications.

# Running the application

The application can be started by running the jar or by ```./gradlew run```

The application has a Endpoint that returns a greeting for the name passed as argument.

```
/hello/{name}
```

The main controller demostrates Micronaut's Inversion of Control/Dependency Injection by injecting a bean of the "```Greeter```" interface.

