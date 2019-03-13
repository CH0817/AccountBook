package tw.com.rex.accountbook;

import cucumber.api.java.en.Given;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@RunWith(SpringRunner.class)//指定使用 Spring test
@SpringBootTest //必添加，否則無法注入 bean
@ContextConfiguration //必添加，否則無法注入 bean
@AutoConfigureMockMvc //自動注入 MockMvc
public class CucumberTest {

    @Autowired
    private MockMvc mockMvc;

    @Given("user on the register page")
    public void userOnTheRegisterPage() throws Exception {
        this.mockMvc.perform(get("/user/register"))//
                .andExpect(status().isOk())//
                .andExpect(view().name("register"))//
                .andDo(print());
    }

}
