package main.controllers;

import org.springframework.stereotype.Controller;
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
    public String pageGoodbye(@RequestParam(value = "name",required = false) String name,
                              @RequestParam(value = "name",required = false) String surname){

        System.out.println("hello" + "   " + name + "        " + surname);

        return "first/goodbye_world";
    }
}
