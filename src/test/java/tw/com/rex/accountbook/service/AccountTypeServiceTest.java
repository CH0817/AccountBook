package tw.com.rex.accountbook.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import tw.com.rex.accountbook.repository.AccountTypeRepository;
import tw.com.rex.accountbook.repository.dao.AccountType;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class AccountTypeServiceTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private AccountTypeService accountTypeService;
    @MockBean
    private AccountTypeRepository accountTypeRepository;

    @Before
    public void setUp() {
        AccountType alex = AccountType.of("銀行");
        when(accountTypeRepository.findByName(alex.getName())).thenReturn(alex);
    }

    @Test
    public void testFindByName() {
        // FIXME 為什麼永遠相同？
        // given
        AccountType entity = AccountType.of("銀行");
        // when
        when(accountTypeRepository.findByName(anyString())).thenReturn(entity);
        AccountType accountType = accountTypeService.findByName(entity.getName());
        // then
        assertEquals(accountType.getName(), entity.getName());
    }

}
