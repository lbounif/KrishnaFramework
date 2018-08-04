package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import helpers.Log;
import pageObjects.BasePage;
import pageObjects.HomePage;
import pageObjects.SignInPage;

public class Login_01 extends BasePage {
	HomePage hp;
	SignInPage sp;

	@Test(description="navigation test")
	public void navigateToSite() {
		Log.startLog("Started Logging test");
		launchBrowser();
		driver.get(getMAINURL());
		Log.info("Rdirected to site");
		hp = new HomePage(driver);
		hp.clickOnLoginButton();
		Log.info("Clicked on the login button");

	}

	@Test(description="Login test")
	public void loginTest() {
		sp = new SignInPage(driver);
		sp.proceedToLogin(getEMAIL(), getPASSWORD());
		Log.endLog("Log END");

	}

}
