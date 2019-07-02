package ru.leonchenko.hibernate;

import javax.persistence.*;
import java.util.List;

/**
 * @author Igor Leonchenko
 * @version 1.0
 */

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToMany
    @JoinTable (
            name = "students_courses",
            joinColumns = @JoinColumn(name = "students_id"),
            inverseJoinColumns = @JoinColumn(name = "courses_id")
    )
    private List<Course> courseList;

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

    public Student() {

    }

    @Override
    public String toString(){
        String allCourses = "";
        for (Course c: courseList) {
            allCourses += c.getCourse_name() + " ";
        }

        return "Students (" + id + " " + name +  " " + allCourses  +")";
    }
}
