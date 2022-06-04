package main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/people")
public class PeopleController {

    @GetMapping()
    public String index(Model model) {
        // получим всех людей из DAO и отдадим всех людей на отображение в представление
        return null;
    }

    @GetMapping("/${id}")
    public String show(@PathVariable("id") int id,
                       Model model) {
        //получим одного человека по id из DAO и передадим на отображение в представление
        return null;
    }
}
