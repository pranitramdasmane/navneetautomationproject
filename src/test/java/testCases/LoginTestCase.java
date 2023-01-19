package testCases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.Constants;

public class LoginTestCase extends BaseClass {

	@Test(dataProvider = "parameters")
	public void EnterValues(String email, String password) throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		LoginPageObject LOP = new LoginPageObject(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement b = LOP.myaccountoption();

		js.executeScript("arguments[0].click();", b);

		LOP.optionlogin().click();

		LOP.selectemail().sendKeys(email);

		LOP.enterpassword().sendKeys(password);

		LOP.clicksubmit().click();

		Thread.sleep(2000);

	}

	@DataProvider
	public Object[][] parameters() {

		Object[][] data = new Object[3][2];

		// for 1st email and password
		data[0][0] = Constants.firstemail;
		data[0][1] = Constants.firstpassword;

		// for 2nd email and password
		data[1][0] = Constants.secondemail;
		data[1][1] = Constants.secondepassword;

		//for 3rd email and password
		data[2][0] = Constants.thirdemail;
		data[2][1] = Constants.thirdpassword;

		return data;

	}

}
