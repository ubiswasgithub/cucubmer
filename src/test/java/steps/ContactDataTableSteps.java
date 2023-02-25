package steps;

import java.util.List;
import java.util.Map;

import actions.Contact;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Excel;

public class ContactDataTableSteps {
	List<List<String>> userinfo;
	Contact contact;

	@Given("user has the below information to send")
	public void user_has_the_below_information_to_send(DataTable dataTable) {
//		userinfo = dataTable.asLists();
//		contact = new Contact(Base.getDriver());
//
//		contact.enterFirstname(userinfo.get(0).get(0));
//		contact.enterEmail(userinfo.get(0).get(1));
//		contact.enterMessage(userinfo.get(0).get(0));
		
		// using maps 
		List<Map<String, String>>data = Excel.getTestData("loginInfo");
//				dataTable.asMaps();
		
		for( int i =0; i <data.size(); i++){
			System.out.println(data.get(i).get("user"));
			System.out.println(data.get(i).get("email"));
			System.out.println(data.get(i).get("message"));
			System.out.println();
		}
		

	}

	@When("user click on the send button")
	public void user_click_on_the_send_button() {
		contact.clickSendButton();
	}

	@Then("message is sent successfully")
	public void message_is_sent_successfully() {

	}

}
