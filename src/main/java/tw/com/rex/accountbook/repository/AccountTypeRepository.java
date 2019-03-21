package tw.com.rex.accountbook.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import tw.com.rex.accountbook.repository.dao.AccountType;

@Repository
public interface AccountTypeRepository extends PagingAndSortingRepository<AccountType, Long> {

    AccountType findByName(String name);

}
