package tw.com.rex.accountbook.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import tw.com.rex.accountbook.repository.dao.AccountTypeDAO;

@Repository
public interface AccountTypeRepository extends PagingAndSortingRepository<AccountTypeDAO, Long> {

    AccountTypeDAO findByName(String name);

}
