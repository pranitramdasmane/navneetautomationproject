package testCases;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import PageObjectModel.RegisterPageObject;
import org.openqa.selenium.WebElement;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.Constants;

public class RegisterTestcase extends BaseClass {

	@Test
	public void register() throws IOException, InterruptedException {

		Thread.sleep(2000);

		RegisterPageObject ROP = new RegisterPageObject(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement b = ROP.accountoption();
		js.executeScript("arguments[0].click();", b);

		ROP.registerfirst().click();

		ROP.enterfirstname().sendKeys(Constants.firstname);

		ROP.enterlastname().sendKeys(Constants.lastname);

		ROP.registerwithemail().sendKeys(Constants.useremail);

		ROP.attachphonenumber().sendKeys(Constants.phonenumber);

		ROP.userpassword().sendKeys(Constants.password2);

		ROP.finalconfirm().sendKeys(Constants.confrimpassword);

		ROP.register().click();

		CommonMethods.handelAssertion(ROP.warningmessage().getText(), Constants.warning);

	}

}
