package utilities;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Helper {

	// scroll down/up by pixel
	public static void scrollDownByPixel(int h, int v, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");

	}

	public static void srollUpByPixel(int h, int v, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(h,-v)", "");

	}

	// scroll down/up by the visibility of an element
	public static void scrollDownByVisibilityOfElement(By element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(element));
	}

	// scroll down to the bottom of the page
	public static void scrollDownToTheBottomOfthePage(WebDriver driver) {

	}

	// scroll horizontally to the end of the page
	public static void scrollToEndHorizontally(WebDriver driver) {

	}

	public static void waitForTheElementToBeVisible(WebDriver driver, WebElement el) {
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOf(el));
		wait.ignoring(NoSuchElementException.class);
	}

}
