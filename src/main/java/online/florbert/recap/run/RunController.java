package online.florbert.recap.run;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class RunController {

    @GetMapping("/hello")
    public String getMethodName() {
        return "Hello Florbert";
    }
    
 
    
}
