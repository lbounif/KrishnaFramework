package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage {

	@FindBy(css = "#email")
	private WebElement emailTextBox;
	@FindBy(css = "#passwd")
	private WebElement passwordTextBox;
	@FindBy(css = "#SubmitLogin > span")
	private WebElement signInButton;

	public SignInPage(WebDriver driver) {
		BasePage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void proceedToLogin(String email, String password) {
		typeText(emailTextBox, "abcd@gmail.com");
		passwordTextBox.sendKeys(password);
		signInButton.click();
		waitForElement(signInButton, 10);
	}

}
