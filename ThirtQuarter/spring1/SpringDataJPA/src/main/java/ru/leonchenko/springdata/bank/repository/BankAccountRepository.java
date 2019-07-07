package ru.leonchenko.springdata.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.leonchenko.springdata.bank.entity.BankAccount;

/**
 * @author Igor Leonchenko
 * @version 1.0
 */

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
}
