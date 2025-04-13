package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.AutomationPractice;
import utils.DriverManager;
import utils.GlobalReader;

public class AutomationPracticeStepDef {

    private WebDriver driver = DriverManager.getDriver();
    private AutomationPractice automationPractice = new AutomationPractice();

    @Given("user is on the login page and launch a browser")
    public void user_is_on_the_login_page() {
        driver.get(GlobalReader.getProperty("PRACTICE_AUTOMATION_SITE_URL")+"/practice-test-login/");
    }

    @When("user enters valid username {string} and password {string}")
    public void user_enters_valid_username_and_password(String username, String password) {
        automationPractice.enterUsername(username);
        automationPractice.enterPassword(password);
    }

    @Then("user should see message {string}")
    public void user_should_see_message(String expectedMessage) {
        automationPractice.userSeeLoginSuccessful();
    }

    @When("user enters invalid username {string} or password {string}")
    public void user_enters_invalid_username_or_password(String username, String password) {
        automationPractice.enterUsername(username);
        automationPractice.enterPassword(password);
    }

    @Then("user should see error message {string}")
    public void user_should_see_error_message(String expectedError) {
        automationPractice.userSeeLoginUnsuccessful();
    }

}
