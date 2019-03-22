package tw.com.rex.accountbook.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import tw.com.rex.accountbook.repository.dao.AccountTypeDTO;
import tw.com.rex.accountbook.service.AccountTypeService;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class AccountTypeDTOControllerTest {

    @Autowired
    private MockMvc mvc;
    @MockBean
    private AccountTypeService accountTypeService;

    @Test
    public void testFindByName() throws Exception {

        AccountTypeDTO entity = new AccountTypeDTO("銀行");

        given(accountTypeService.findByName(entity.getName())).willReturn(entity);

        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get(
                "/accountType/find/name/" + entity.getName())//
                .contentType(MediaType.APPLICATION_JSON);

        mvc.perform(request)//
                .andExpect(status().isOk())//
                .andExpect(jsonPath("$.name", is(entity.getName())));
    }

}
