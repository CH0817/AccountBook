package tw.com.rex.accountbook.service;

import tw.com.rex.accountbook.repository.dao.AccountTypeDTO;

public interface AccountTypeService {

    AccountTypeDTO findByName(String name);

}
