package tw.com.rex.accountbook.service;

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
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class AccountTypeServiceTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private AccountTypeService accountTypeService;
    @MockBean
    private AccountTypeRepository accountTypeRepository;

    @Test
    public void testFindByName() {
        // given
        AccountType entity = AccountType.of("銀行");
        // when
        when(accountTypeRepository.findByName(anyString())).thenReturn(entity);
        AccountType accountType = accountTypeService.findByName(entity.getName());
        // then
        verify(accountTypeRepository, atLeastOnce()).findByName(anyString());
        assertEquals("銀行", accountType.getName());
    }

}
