package tw.com.rex.accountbook.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import tw.com.rex.accountbook.repository.dao.AccountTypeDTO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AccountTypeDTORepositoryTest {

    @Autowired
    private AccountTypeRepository accountTypeRepository;

    @Test
    public void testFindByName() {
        // given
        String name = "銀行";
        // when
        AccountTypeDTO accountType = accountTypeRepository.findByName(name);
        // then
        assertNotNull(accountType);
        assertEquals(name, accountType.getName());
    }

    @Test
    public void testSave() {
        // given
        AccountTypeDTO entity = new AccountTypeDTO("悠遊卡");
        // when
        AccountTypeDTO saved = accountTypeRepository.save(entity);
        // then
        assertNotNull(saved.getId());
        assertEquals(entity.getName(), saved.getName());
    }

}
