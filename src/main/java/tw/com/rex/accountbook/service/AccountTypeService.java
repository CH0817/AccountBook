package tw.com.rex.accountbook.service;

import tw.com.rex.accountbook.repository.dao.AccountType;

public interface AccountTypeService {

    AccountType findByName(String name);

}
