package sheridan.teixerya.hellosheridan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/Hello6")
    public String hello(@RequestParam(defaultValue = "Sheridan") String name, Model model){

        model.addAttribute("name", name);
        return "Hello6";
    }


    @GetMapping("/Hello6/{name}")
    public String hello2(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        return "Hello6";
    }

    @GetMapping("/Input")
    public String input(){
        return "Input";
    }

    @GetMapping("/Output")
    public String output(){
        return "Output";
    }

}
