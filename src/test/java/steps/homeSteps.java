package steps;

import actions.HomePage;
import actions.LoginPage;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class homeSteps {

	HomePage home;
	LoginPage login;

	@Given("user at the home page")
	public void user_at_the_home_page() {
		home = new HomePage(Base.getDriver());
	}

	@When("user click on the logout option")
	public void user_click_on_the_logout_option() {
		home.logoutFromHome();
	}

	@Then("Login page is displayed")
	public void login_page_is_displayed() {
		login = new LoginPage(Base.getDriver());
		Assert.isTrue(login.isLogInbuttonPresent(), "Login page is not displayed");
	}
}
