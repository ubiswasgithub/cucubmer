package steps;

import actions.Contact;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utilities.Helper;

public class contactSteps {

	Contact contact;

	private static String contactpageurl = "http://autopract.com/selenium/form4/";

	@Given("User is at Contact page")
	public void user_is_at_contact_page() {
		Base.goToLoginPage(contactpageurl);
		contact = new Contact(Base.getDriver());

	}

	@When("User enter {string} as first name")
	public void user_enter_as_first_name(String fname) {
		Contact.enterFirstname(fname);
	}

	@When("User enter {string} as last name")
	public void user_enter_as_last_name(String lname) {
		Contact.enterLastname(lname);
	}

	@When("User enter {string} as email")
	public void user_enter_as_email(String em) {
		Contact.enterEmail(em);
	}

	@When("Email as below")
	public void email_as_below(String doc) {
		Contact.enterMessage(doc);
	}

	@Then("Message was submitted successfully")
	public void message_was_submitted_successfully() {

		String status = contact.returnValidationErrorText();
		Assert.isTrue(status.equalsIgnoreCase("Validation Problem"), "Failed");

	}

}
