package hello.micronaut.service

import javax.inject.Singleton

@Singleton
class GreeterService : Greeter {
    override fun greet(name: String) = "Hello $name!"
}