import org.springframework.web.bind.annotation.GetMapping;
public class ApiController {
 @GetMapping("/welcome")  
public String Welcome()
{
    return "Welcome String Boot!";
}
}
