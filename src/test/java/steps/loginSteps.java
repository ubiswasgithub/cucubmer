package steps;

import actions.LoginPage;

import static org.junit.Assert.assertTrue;

import actions.HomePage;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {

	private String loginUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	LoginPage login;
	HomePage home;

	@Given("Admin is on the login page")
	public void admin_is_on_the_login_page() {
		Base.goToLoginPage(loginUrl);
		login = new LoginPage(Base.getDriver());

	}

	@When("Admin enter valid {string} and {string}")
	public void admin_enter_valid_and(String username, String pass) {
		login.enterUsername(username);
		login.enterPassword(pass);
		login.clickLogin();
	}

	@Then("Home page is displayed for the admin")
	public void home_page_is_displayed_for_the_admin() {
		HomePage home = new HomePage(Base.getDriver());
		Assert.isTrue(home.isHomePageIsDisplayed(), "Home page is not displayed");
	}

}
