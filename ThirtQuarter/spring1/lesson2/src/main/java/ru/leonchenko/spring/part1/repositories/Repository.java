package ru.leonchenko.spring.part1.repositories;

import org.springframework.stereotype.Component;
import ru.leonchenko.spring.part1.entities.Summator;

/**
 * @author Igor Leonchenko
 * @version 1.0
 */

@Component
public class Repository {
    public Summator sumOfTwoInts(int a, int b){
        Summator summator = new Summator();
        summator.setResult(a + b);
        return summator;
    }

    public class Human{

    }
}
