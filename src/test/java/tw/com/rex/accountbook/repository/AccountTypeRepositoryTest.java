package tw.com.rex.accountbook.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import tw.com.rex.accountbook.repository.dao.AccountTypeDAO;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AccountTypeRepositoryTest {

    @Autowired
    private AccountTypeRepository accountTypeRepository;

    @Test
    public void testFindByName() {
        // given
        String name = "銀行";
        // when
        AccountTypeDAO accountType = accountTypeRepository.findByName(name);
        // then
        assertNotNull(accountType);
        assertEquals(name, accountType.getName());
    }

    @Test
    public void testSave() {
        // given
        LocalDate now = LocalDate.now();
        AccountTypeDAO entity = new AccountTypeDAO("悠遊卡");
        entity.setName("悠遊卡");
        entity.setCreateDate(now);
        entity.setUpdateDate(now);
        // when
        AccountTypeDAO saved = accountTypeRepository.save(entity);
        // then
        assertNotNull(saved.getId());
        assertEquals(entity.getName(), saved.getName());
    }

}
