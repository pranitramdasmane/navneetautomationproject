package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

	public WebDriver driver;

	private By myaccount = By.xpath("//span[contains(text(),'My Account')]");

	private By login = By.xpath("(//a[contains(text(),'Login')])[1]");

	private By email = By.xpath("//input[@id='input-email']");

	private By password = By.xpath("//input[@type='password']");

	private By submit = By.xpath("//input[@type='submit']");

	public LoginPageObject(WebDriver driver2) {

		this.driver = driver2;
	}

	public WebElement myaccountoption() {

		return driver.findElement(myaccount);

	}

	public WebElement optionlogin() {

		return driver.findElement(login);

	}

	public WebElement selectemail() {

		return driver.findElement(email);

	}

	public WebElement enterpassword() {

		return driver.findElement(password);

	}

	public WebElement clicksubmit() {

		return driver.findElement(submit);

	}

}
