package ru.leonchenko.springdata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.leonchenko.springdata.entity.Student;

import java.util.List;

/**
 * @author Igor Leonchenko
 * @version 1.0
 */
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
    List<Student> findByName(String name);
}
