package ru.leonchenko.springdata.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank(message = "Поле обязательно для заполнения")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "Поле обязательно для заполнения")
    @Column(name = "score")
    private int score;

    public Student() {

    }

    public Student(String name,  int score) {
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}