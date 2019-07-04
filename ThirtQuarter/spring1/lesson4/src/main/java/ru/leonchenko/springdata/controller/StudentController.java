package ru.leonchenko.springdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.leonchenko.springdata.entity.Student;
import ru.leonchenko.springdata.repository.StudentRepository;

import javax.validation.Valid;

/**
 * @author Igor Leonchenko
 * @version 1.0
 */

@Controller
@RequestMapping("/students/")
public class StudentController {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @GetMapping("signup")
    public String showSignUpForm (Student student) {
        return "student-add";
    }

    @GetMapping("list")
    public String showUpdateForm (Model model){
        model.addAttribute("students", studentRepository.findAll());
        return "index";
    }

    @PostMapping("add")
    public String addStudents (@Valid Student student, BindingResult result, Model model){
        if (result.hasErrors()){
            return "student-add";
        }
        studentRepository.save(student);
        return "redirect:list";
    }

    @GetMapping("edit/{id}")
    public String showUpdateForm(@PathVariable("id") int id, Model model){
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Неверный id студента " + id));
        model.addAttribute("student", student);
        return "student-update";
    }

    @PostMapping("update/{id}")
    public String updateStudent(@PathVariable("id") int id, @Valid Student student, BindingResult result, Model model){
        if(result.hasErrors()){
            student.setId(id);
            return "student-update";
        }

        studentRepository.save(student);
        model.addAttribute("students", studentRepository.findAll());
        return "index";
    }

    @GetMapping("delete/{id}")
    public String deleteStudent(@PathVariable("id") int id, Model model){
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Неверный id студента " + id));
        studentRepository.delete(student);
        model.addAttribute("students", studentRepository.findAll());
        return "index";
    }
}
