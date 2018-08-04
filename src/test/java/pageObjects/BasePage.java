package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import helpers.Constants;

public class BasePage extends Constants {
	public static WebDriver driver;

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		driver = new ChromeDriver();
	}

	public void click(WebElement element) {
		element.click();

	}

	public void typeText(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}

	public void selectValuefromDropDown(WebElement element, int value) {
		Select sel = new Select(element);
		sel.selectByIndex(value);
	}

	public void isElementDisplayed(WebElement element) {
		element.isDisplayed();
		Reporter.log(element + " Element is displayed");
	}

	public void runJavaScript(String command) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(command);
	}

	public void uploadfile(WebElement element, String path) {
		element.sendKeys(path);
	}
	public void waitForElement(WebElement element, int maxTimeout) {
		WebDriverWait wait = new WebDriverWait(driver, maxTimeout);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public void waitForElementforClick(WebElement element, int maxTimeout) {
		WebDriverWait wait = new WebDriverWait(driver, maxTimeout);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public void waitForElementforType(WebElement element, int maxTimeout, String value) {
		WebDriverWait wait = new WebDriverWait(driver, maxTimeout);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys(value);
	}

}
