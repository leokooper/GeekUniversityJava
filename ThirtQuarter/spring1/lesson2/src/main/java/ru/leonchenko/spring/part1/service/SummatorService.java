package ru.leonchenko.spring.part1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.leonchenko.spring.part1.entities.Summator;
import ru.leonchenko.spring.part1.repositories.Repository;

/**
 * @author Igor Leonchenko
 * @version 1.0
 */

@Service
public class SummatorService {
    private Repository summatorRepository;

    @Autowired
    public void setSummatorRepository(Repository summatorRepository) {
        this.summatorRepository = summatorRepository;
    }

    public Summator getSumOfTwoInts(int a, int b){
        Summator summator = summatorRepository.sumOfTwoInts(a,b);
        return summator;
    }

    public SummatorService(){

    }




}
