package com.example.fizzbuzzspring;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.ArrayList;


@Controller
public class HomeController {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @GetMapping("/")
    public String userInput(Model model)
    {
        model.addAttribute("fizzbuzz", new FizzBuzz());
        return "index";
    }

    @PostMapping("/process" )
    public String processPrint(@Valid @ModelAttribute("fizzbuzz") FizzBuzz fizzBuzz, BindingResult result, Model model)
    {
        if(result.hasErrors())
        {
            return "index";
        }
        ArrayList<String> print = new ArrayList<>();
        print=fizzBuzz.makePrint();
        model.addAttribute("fizzBuzzes",print);
        return "list";
    }
}
