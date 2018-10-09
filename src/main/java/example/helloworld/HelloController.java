package example.helloworld;

import io.micronaut.http.annotation.*;

@Controller("/hello") 
public class HelloController {
    @Get 
    public String index() {
        return "Hello World"; 
    }
}