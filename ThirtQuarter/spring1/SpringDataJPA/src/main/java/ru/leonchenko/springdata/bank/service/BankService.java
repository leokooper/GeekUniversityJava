package ru.leonchenko.springdata.bank.service;

import ru.leonchenko.springdata.bank.entity.Bank;

import java.util.List;

/**
 * @author Igor Leonchenko
 * @version 1.0
 */

public interface BankService {
    Bank addBank(Bank bank);
    void delete(long id);
    Bank getByName(String name);
    Bank editBank(Bank bank);
    List<Bank> getAll();
}
