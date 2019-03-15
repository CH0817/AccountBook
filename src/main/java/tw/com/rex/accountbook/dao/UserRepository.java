package tw.com.rex.accountbook.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import tw.com.rex.accountbook.model.User;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    long countByEmail(String email);

}
