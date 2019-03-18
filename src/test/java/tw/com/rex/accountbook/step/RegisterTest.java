package tw.com.rex.accountbook.step;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import tw.com.rex.accountbook.dao.UserRepository;
import tw.com.rex.accountbook.model.User;
import tw.com.rex.accountbook.util.TestUtils;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class RegisterTest {

    @Autowired
    private MockMvc mvc;
    @Autowired
    private UserRepository userRepository;
    private User requestUser;
    private User responseUser;

    @Given("user on the register page")
    public void userOnTheRegisterPage() throws Exception {
        this.mvc.perform(get("/user/page/register"))//
                .andExpect(status().isOk())//
                .andExpect(view().name("register"))//
                .andDo(print());
    }


    @When("user enter {string} and {string} to register")
    public void userEnterAndToRegister(String email, String password) {
        requestUser = User.of(email, password);
    }

    @Then("forward to main page")
    public void forwardToMainPage() throws Exception {
        MockHttpServletRequestBuilder request = TestUtils.createJsonPostRequest("/user/register", requestUser);
        String registerResponse = this.mvc.perform(request)//
                .andExpect(status().isOk()).andReturn().getResponse().getContentAsString();
        // Long id = TestUtils.jsonToObject(registerResponse, Long.class);
    }

}
