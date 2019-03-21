package tw.com.rex.accountbook.integration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class AccountTypeIntegrationTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void accountTypeIntegrationTest() throws Exception {
        String name = "銀行";

        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/accountType/find/name/" + name)//
                .contentType(MediaType.APPLICATION_JSON);

        mvc.perform(request)//
                .andExpect(status().isOk())//
                .andExpect(jsonPath("$.name", is(name)));
    }

}
