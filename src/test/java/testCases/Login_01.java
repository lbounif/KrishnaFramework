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
	public void loginTest1() {
		Log.startLog("Started Logging");
		launchBrowser();
		driver.get(getMAINURL());
		Log.info("Rdirected to site");
		hp = new HomePage(driver);
		hp.clickOnLoginButton();
		Log.info("Clicked on the login button");
		Assert.assertEquals("", "", "FAIL:Fail to login");

	}

	@Test(description="Login test")
	public void loginTest2() {
		sp = new SignInPage(driver);
		sp.proceedToLogin(getEMAIL(), getPASSWORD());
		Log.endLog("Log END");

	}

}
