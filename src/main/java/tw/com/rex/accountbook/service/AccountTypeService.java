package tw.com.rex.accountbook.service;

import tw.com.rex.accountbook.repository.dao.AccountTypeDAO;

public interface AccountTypeService {

    AccountTypeDAO findByName(String name);

}
