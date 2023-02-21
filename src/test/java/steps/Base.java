package steps;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Base {

	public static WebDriver driver = null;

	@Before()
	public void openBrowser() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void goToLoginPage(String loginUrl) {
		driver.get(loginUrl);

	}

	@After()
	public void tearDownBrowser() {
		driver.quit();
	}

	@AfterStep()
	public void takeScreenShot(Scenario scenario) {
//		only for the failed scenario to capture
//	if(scenario.isFailed()) {
//		final byte[] ss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//		scenario.attach(ss, "image/png", "image");
//		}
//	caputre all steps 
		final byte[] ss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(ss, "image/png", "image");
	}

}
