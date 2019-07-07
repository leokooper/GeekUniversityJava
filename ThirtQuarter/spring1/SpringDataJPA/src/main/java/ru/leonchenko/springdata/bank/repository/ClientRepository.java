package ru.leonchenko.springdata.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.leonchenko.springdata.bank.entity.Client;

/**
 * @author Igor Leonchenko
 * @version 1.0
 */

public interface ClientRepository extends JpaRepository<Client, Long> {
}
