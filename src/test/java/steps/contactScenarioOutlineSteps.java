package steps;

import actions.Contact;
import io.cucumber.java.en.Given;

public class contactScenarioOutlineSteps {
	Contact contact;

	@Given("user has entered {string},{string} and {string}")
	public void user_has_entered(String user, String mail, String message) {
		contact = new Contact(Base.getDriver());
		contact.enterFirstname(user);
		contact.enterEmail(mail);
		contact.enterMessage(message);
	}

}
