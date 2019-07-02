package ru.leonchenko.spring.part1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.leonchenko.spring.part1.entities.Summator;
import ru.leonchenko.spring.part1.service.SummatorService;

/**
 * @author Igor Leonchenko
 * @version 1.0
 */

//1. Two values summation
@Controller
@RequestMapping("/actions")
public class SummatorController {
    private SummatorService summatorService;

    @Autowired
    public void setSummatorService(SummatorService summatorService) {
        this.summatorService = summatorService;
    }

    //2.1 With fixed values
    @RequestMapping("/showResultFixed")
    public String showResultFixed (Model uiModel, @ModelAttribute("summator") Summator summator){
        summator = summatorService.getSumOfTwoInts(10, 20);
        uiModel.addAttribute("summator", summator);
        return "summation";
    }
    //2.2 With variableы
    @RequestMapping(path = "/showResultNotFixed", method = RequestMethod.GET)
    @ResponseBody
    public Summator showResultNotFixed (Model uiModel, @RequestParam int a, @RequestParam int b){
        Summator summator = summatorService.getSumOfTwoInts(a, b);
        uiModel.addAttribute("summator", summator);
        return summator;
    }
}
