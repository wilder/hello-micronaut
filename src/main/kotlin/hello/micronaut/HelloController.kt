package hello.micronaut

import hello.micronaut.service.Greeter
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/")
class HelloController(val greeter: Greeter) {

    @Get("/hello/{name}")
    fun hello(name: String): String {
        return greeter.greet(name)
    }

}