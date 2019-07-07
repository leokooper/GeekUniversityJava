package ru.leonchenko.springdata.bank.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.leonchenko.springdata.bank.entity.Bank;
import ru.leonchenko.springdata.bank.repository.BankRepository;
import ru.leonchenko.springdata.bank.service.BankService;

import java.util.List;

/**
 * @author Igor Leonchenko
 * @version 1.0
 */

@Service
public class BankServiceImpl implements BankService {

    @Autowired
    private BankRepository bankRepository;

    @Override
    public Bank addBank(Bank bank) {
        Bank savedBank = bankRepository.saveAndFlush(bank);

        return savedBank;
    }

    @Override
    public void delete(long id) {
        bankRepository.delete(id);
    }

    @Override
    public Bank getByName(String name) {
        return bankRepository.findByName(name);
    }

    @Override
    public Bank editBank(Bank bank) {
        return bankRepository.saveAndFlush(bank);
    }

    @Override
    public List<Bank> getAll(){
        return bankRepository.findAll();
    }
}
