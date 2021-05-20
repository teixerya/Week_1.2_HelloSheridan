package sheridan.teixerya.hellosheridan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/Hello6")
    public String hello(){

        return "Hello6";
    }

}
