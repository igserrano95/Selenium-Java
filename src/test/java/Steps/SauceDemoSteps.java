package Steps;

import Pages.LoginPage;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemoSteps {
    LoginPage landingPage = new LoginPage();

    @Given("User is on the login page")
    public void  user_is_on_the_login_page() {
       landingPage.navigateToSauceDemo();
            }

    @When("the user enters a valid username and password")
    public void the_user_enters_a_valid_username_and_password() {
        landingPage.writeUserName();
        landingPage.writePassword();
        landingPage.clickLoginButton();
    }



    @Then("the user should be redirected to the homepage")
    public void the_user_should_be_redirected_to_the_homepage() {
        String title = landingPage.getTitle();
        Assert.assertEquals(title, "Swag Labs");

    }
}
