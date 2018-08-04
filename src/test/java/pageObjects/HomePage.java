package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helpers.Log;

public class HomePage extends BasePage {

	@FindBy(css = "a.login")
	private WebElement singInButton;

	public HomePage(WebDriver driver) {
		BasePage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnLoginButton() {
		click(singInButton);
		Log.info("My Account link element found");
	}

}
