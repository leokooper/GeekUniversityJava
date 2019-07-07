package ru.leonchenko.springdata.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.leonchenko.springdata.bank.entity.Bank;

/**
 * @author Igor Leonchenko
 * @version 1.0
 */

public interface BankRepository extends JpaRepository<Bank, Long> {
    @Query("select b from Bank b where b.name = :name")
    Bank findByName(@Param("name") String name);

    void delete(long id);
}
