package ru.leonchenko.hibernate;
import javax.persistence.*;
import java.util.List;

/**
 * @author Igor Leonchenko
 * @version 1.0
 */

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "course_name")
    private String course_name;

    @OneToOne
    @JoinColumn(name = "marks_id")
    private Marks marks_id;

    @ManyToMany
    @JoinTable (
                name = "students_courses",
                joinColumns = @JoinColumn(name = "courses_id"),
                inverseJoinColumns = @JoinColumn(name = "students_id")
    )

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public Course() {

    }

    public String toString(){

        return "Course (" + id + " " + course_name + " " + marks_id.getLessons_attended() + " " + marks_id.getScore()+ ")";
    }

}
