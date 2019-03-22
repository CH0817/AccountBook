package tw.com.rex.accountbook.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tw.com.rex.accountbook.repository.AccountTypeRepository;
import tw.com.rex.accountbook.repository.dao.AccountTypeDAO;
import tw.com.rex.accountbook.service.AccountTypeService;

@Service
public class AccountTypeServiceImpl implements AccountTypeService {

    private AccountTypeRepository accountTypeRepository;

    public AccountTypeServiceImpl() {
    }

    @Autowired
    public AccountTypeServiceImpl(AccountTypeRepository accountTypeRepository) {
        this.accountTypeRepository = accountTypeRepository;
    }

    @Override
    public AccountTypeDAO findByName(String name) {
        return accountTypeRepository.findByName(name);
    }

}
