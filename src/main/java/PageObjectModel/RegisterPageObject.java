package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPageObject {
	public WebDriver driver;

	private By myaccount = By.xpath("//span[contains(text(),'My Account')]");

	private By register = By
			.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/register'])[1]");

	private By firstname = By.xpath("//input[@name='firstname']");

	private By lastname = By.xpath("//input[@name='lastname']");

	private By email = By.xpath("//input[@type='email']");

	private By telephone = By.xpath("//input[@name='telephone']");

	private By password = By.xpath("//input[@name='password']");

	private By confirm = By.xpath("//input[@name='confirm']");
	
	private By submit =By.xpath("//input[@value='Continue']");
	
	private By warning=By.xpath(" //div[contains(text(),' Warning: You must agree to the Privacy Policy!')]");

	public RegisterPageObject(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement accountoption() {
		return driver.findElement(myaccount);

	}

	public WebElement registerfirst() {
		return driver.findElement(register);
	}

	public WebElement enterfirstname() {
		return driver.findElement(firstname);

	}

	public WebElement enterlastname() {
		return driver.findElement(lastname);

	}

	public WebElement registerwithemail() {
		return driver.findElement(email);

	}

	public WebElement attachphonenumber() {
		return driver.findElement(telephone);

	}

	public WebElement userpassword() {
		return driver.findElement(password);

	}

	public WebElement finalconfirm() {
		return driver.findElement(confirm);

	}
	public WebElement register() {
		return driver.findElement(submit);

	}
	public WebElement warningmessage() {
		return driver.findElement(warning);

	}

}
