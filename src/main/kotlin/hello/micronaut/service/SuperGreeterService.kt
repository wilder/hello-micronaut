package hello.micronaut.service

import io.micronaut.context.annotation.Primary
import javax.inject.Singleton

@Primary
@Singleton
class SuperGreeterService : Greeter {
    override fun greet(name: String): String =
            "Hello, $name! How are you!?"
}