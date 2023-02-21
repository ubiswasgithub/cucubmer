
package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Helper;

public class Contact {
	static By firstname = By.id("Name");
	static By lastname = By.id("et_pb_contact_last_0");
	static By email = By.id("Email");
	static By message = By.id("Message");
	static By sendBtn = By.id("fcf-button");
	static By validationmessage = By.id("fcf-status");
	private static WebDriver driver;

	public Contact(WebDriver driver) {
		this.driver = driver;
	}

	public static void enterFirstname(String fname) {
		driver.findElement(firstname).clear();
		driver.findElement(firstname).sendKeys(fname);
	}

	public static void enterLastname(String lname) {
		driver.findElement(lastname).clear();
		driver.findElement(lastname).sendKeys(lname);
	}

	public static void enterEmail(String em) {
		driver.findElement(email).clear();
		driver.findElement(email).sendKeys(em);
	}

	public static void enterMessage(String mes) {
		driver.findElement(message).clear();
		driver.findElement(message).sendKeys(mes);
	}

	public static void clickSendButton() {
		driver.findElement(sendBtn).click();
	}

	public static String returnValidationErrorText() {
//		Helper.waitForTheElementToBeVisible(driver,driver.findElement(validationmessage) );
		return driver.findElement(validationmessage).getText();
	}
}
