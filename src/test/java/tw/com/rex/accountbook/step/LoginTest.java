package tw.com.rex.accountbook.step;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import tw.com.rex.accountbook.step.base.BaseTest;

public class LoginTest extends BaseTest {

    @Autowired
    private MockMvc mvc;

    @Given("^user is on the login page$")
    public void userIsOnTheLoginPage() {
    }

    @When("^user enter current username and password$")
    public void userEnterCurrentUsernameAndPassword() {
    }

    @When("^user enter error username or password$")
    public void userEnterErrorUsernameOrPassword() {

    }
}
