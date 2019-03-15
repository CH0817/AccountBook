package tw.com.rex.accountbook.step;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import tw.com.rex.accountbook.model.User;
import tw.com.rex.accountbook.step.base.BaseTest;

import java.util.List;

public class RegisterTest extends BaseTest {

    @Autowired
    private MockMvc mvc;

    @Given("^user on the register page$")
    public void userOnTheRegisterPage() {
        System.out.println("mvc: " + mvc);
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

    @When("^a user enter a not registered email and length (\\d+) to (\\d+) password$")
    public void aUserEnterANotRegisteredEmailAndLengthToPassword(int arg0, int arg1, List<User> users) {
        users.forEach(System.out::println);
    }
}
