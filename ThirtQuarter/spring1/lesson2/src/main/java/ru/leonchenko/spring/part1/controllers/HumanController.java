package ru.leonchenko.spring.part1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.leonchenko.spring.part1.entities.Human;
import ru.leonchenko.spring.part1.entities.Summator;
import ru.leonchenko.spring.part1.service.HumanService;
import ru.leonchenko.spring.part1.service.SummatorService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Igor Leonchenko
 * @version 1.0
 */

//2. Human Object
@Controller
@RequestMapping("/actions")
public class HumanController {
    //2.1 With GET method
    @RequestMapping("/showHumanForm")
    public String showHumanForm (Model uiModel){
        Human human = new Human();
        uiModel.addAttribute("human", human);
        return "human-face";
    }

    @RequestMapping("/humanResultForm")
    public String humanResultForm (@ModelAttribute("human") Human human){
        return "human-face-result";
    }
    //2.2 With POST method
    @RequestMapping(path = "/setHuman", method = RequestMethod.POST)
    public void setHuman (@RequestBody Human human){
        System.out.println(human.getAge() + " " + human.getGender());
    }

    //3. Get Human List
    @RequestMapping(path = "/getHumanList", method = RequestMethod.GET)
    public @ResponseBody
    List<Human> human(){
        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();
        List<Human> humanList = new ArrayList<>();
        humanList.add(human1);
        humanList.add(human2);
        humanList.add(human3);
        return humanList;
    }
}
