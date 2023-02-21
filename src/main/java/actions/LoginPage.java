package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private static WebDriver driver = null;

	static By username = By.name("username");
	static By password = By.name("password");

	static By loginBtn = By.xpath("//div/button");

	public LoginPage(WebDriver driver) {
		LoginPage.driver = driver;
	}

	public void enterUsername(String user) {
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys(user);
		;
	}

	public void enterPassword(String pass) {
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(pass);
		;
	}

	public void clickLogin() {
		driver.findElement(loginBtn).click();
	}

	public boolean isLogInbuttonPresent() {
		// TODO Auto-generated method stub
		return driver.findElement(loginBtn).isDisplayed();
	}

}
