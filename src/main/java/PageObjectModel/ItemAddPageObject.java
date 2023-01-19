package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemAddPageObject {

	public WebDriver driver;

	private By addtocard = By.xpath("(//button[@type='button'])[13]");

	private By radiobox = By.xpath("(//input[@name='option[218]'])[1]");

	private By chekbox = By.xpath("(//input[@type='checkbox'])[2]");

	private By text = By.xpath("//input[@placeholder='Text']");

	private By selectoption3 = By.xpath("//select[@id='input-option217']");

	private By customtext = By.xpath("//textarea[@placeholder='Textarea']");

	private By date = By.xpath("//input[@data-date-format='YYYY-MM-DD']");

	private By time = By.xpath("//input[@data-date-format='HH:mm']");

	private By dateANDtime = By.xpath("//input[@data-date-format='YYYY-MM-DD HH:mm']");

	private By quanityt = By.xpath("//input[@name='quantity']");

	private By additem = By.xpath("//button[@id='button-cart']");
	
	private By suggesstion=By.xpath("//div[@class='alert alert-info']");

	public ItemAddPageObject(WebDriver driver2) {
     
		this.driver=driver2;
 	}

	public WebElement shoppingcard() {

		return driver.findElement(addtocard);
	}

	public WebElement radiooption() {

		return driver.findElement(radiobox);
	}

	public WebElement chekboxoption() {

		return driver.findElement(chekbox);
	}

	public WebElement entertext() {

		return driver.findElement(text);
	}

	public WebElement optionselect() {

		return driver.findElement(selectoption3);
	}

	public WebElement adddiscriptin() {

		return driver.findElement(customtext);
	}

	public WebElement enterdate() {

		return driver.findElement(date);
	}

	public WebElement entertime() {

		return driver.findElement(time);
	}

	public WebElement enterdateandtime() {

		return driver.findElement(dateANDtime);
	}

	public WebElement selectquantity() {

		return driver.findElement(quanityt);
	}

	public WebElement clickonaddtocard() {

		return driver.findElement(additem);
	}
	public WebElement massageaboutquantity() {

		return driver.findElement(suggesstion);
	}

}
