package sample;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
    @RequestMapping("/")
    public String home() {
        return "Hello, Spring Boot Sample Application!";
    }
    
    @RequestMapping("/java")
    public String helloJava() {
        return "Hello, Java!";
    }
}