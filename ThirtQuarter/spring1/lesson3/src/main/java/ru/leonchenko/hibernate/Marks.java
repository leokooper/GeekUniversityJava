package ru.leonchenko.hibernate;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.List;

///**
// * @author Igor Leonchenko
// * @version 1.0
// */
//
@Entity
@Table(name = "marks")
public class Marks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "lessons_attended")
    private int lessons_attended;

    @Column(name = "score")
    private int score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getLessons_attended() {
        return lessons_attended;
    }

    public void setLessons_attended(int lessons_attended) {
        this.lessons_attended = lessons_attended;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Marks() {
    }

}
