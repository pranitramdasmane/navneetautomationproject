package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeviceAvailibilityPageobject {

	public WebDriver driver;

	private By deviceschek = By.xpath("//a[contains(text(),'Phones & PDAs')]");

	private By sortbyprize = By.xpath("(//select[@class='form-control'])[1]");

	private By showquantity = By.xpath("(//select[@class='form-control'])[2]");

	private By mousover = By.xpath("(//a[@class='dropdown-toggle'])[5]");

	public DeviceAvailibilityPageobject(WebDriver driver2) {
	
		this.driver=driver2;
	}

	public WebElement chekdevice() {

		return driver.findElement(deviceschek);
	}

	public WebElement selectcriteria() {

		return driver.findElement(sortbyprize);
	}

	public WebElement selectquantity() {

		return driver.findElement(showquantity);
	}

	public WebElement movetoelement() {

		return driver.findElement(mousover);
	}
	

}
