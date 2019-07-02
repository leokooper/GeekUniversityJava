package ru.leonchenko.spring.part1.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.leonchenko.spring.part1.repositories.Repository;

/**
 * @author Igor Leonchenko
 * @version 1.0
 */

public class HumanService {
    private Repository humanRepository;

    @Autowired
    public void setHumanRepository(Repository humanRepository) {
        this.humanRepository = humanRepository;
    }


    public HumanService(){

    }
}
