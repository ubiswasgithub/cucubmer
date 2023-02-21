package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	By profile = By.cssSelector("img.oxd-userdropdown-img");
	By userDropdown = By.cssSelector("i.oxd-icon.bi-caret-down-fill.oxd-userdropdown-icon");
	By logoutOption = By.linkText("Logout");
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isHomePageIsDisplayed() {
		return driver.findElement(profile).isDisplayed();
	}

	public void logoutFromHome() {
		driver.findElement(userDropdown).click();
		driver.findElement(logoutOption).click();

	}

}
