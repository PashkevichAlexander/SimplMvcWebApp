package main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello-world")
    public String pageHello(HttpServletRequest request) {
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");

        System.out.println("hello" + "   " + name + "        " + surname);

        return "first/hello_world";
    }

    @GetMapping("/goodbye-world")
    public String pageGoodbye(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "name", required = false) String surname,
                              Model model) {

        model.addAttribute("message", "hello" + "   " + name + "        " + surname);

        System.out.println("hello" + "   " + name + "        " + surname);

        return "first/goodbye_world";
    }

    @GetMapping("/calculator")
    public String pageCulc(@RequestParam("a") int a,
                           @RequestParam("b") int b,
                           @RequestParam("action") String action,
                           Model model){

        double result;
        switch (action) {
            case ("multiplication") -> result = a * b;
            case ("addition") -> result = a + b;
            case ("division") -> result = a / (double) b;
            case ("subtraction") -> result = a - b;
            default -> result = 0;
        }

        model.addAttribute("result", result);

        return "first/calculator";
    }
}
