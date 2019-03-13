package tw.com.rex.accountbook;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)//指定使用 Spring test
@SpringBootTest //必添加，否則無法注入 bean
@ContextConfiguration //必添加，否則無法注入 bean
@AutoConfigureMockMvc //自動注入 MockMvc
public class CucumberTest {

    @Autowired
    private MockMvc mockMvc;

}
