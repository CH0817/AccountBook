package tw.com.rex.accountbook.step;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import tw.com.rex.accountbook.model.User;
import tw.com.rex.accountbook.service.UserService;
import tw.com.rex.accountbook.step.base.BaseTest;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class RegisterTest extends BaseTest {

    @Autowired
    private MockMvc mvc;
    @Autowired
    private UserService userService;

    @Given("^user on the register page$")
    public void userOnTheRegisterPage() throws Exception {
        this.mvc.perform(get("/user/register"))//
                .andExpect(status().isOk())//
                .andExpect(view().name("register"))//
                .andDo(print());
    }

    @When("^a user enter a not registered email and length (\\d+) to (\\d+) password$")
    public void aUserEnterANotRegisteredEmailAndLengthToPassword(int min, int max, List<User> users) throws Exception {
        for (User user : users) {
            user = userService.register(user);
            assertNotNull(user.getId());
        }
    }

    @Then("^show \"([^\"]*)\" to user$")
    public void showToUser(String message) {
        assertEquals(message, "註冊成功");
    }

    @Then("^show message to user$")
    public void showMessageToUser() {
    }

    @And("^store user information$")
    public void storeUserInformation() {
    }

    @And("^forward to main page$")
    public void forwardToMainPage() {

    }

    @When("^a user enters registered email$")
    public void aUserEntersRegisteredEmail() {

    }

    @When("^a user enters a length of the password outside of (\\d+) to (\\d+)$")
    public void aUserEntersALengthOfThePasswordOutsideOfTo(int arg0, int arg1) {

    }

    @After("@register")
    public void cleanTestData() {
        // TODO 清除測試資料
    }

}
