package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCardPrizeComparePageObject {
	public WebDriver driver;

	private By searchbox = By.xpath("//input[@name='search']");

	private By serach = By.xpath("(//button[@type='button'])[4]");

	private By iphoneprize = By.xpath("//p[@class='price']");

	private By AddToCard = By.xpath("//span[contains(text(),'Add to Cart')]");

	private By title = By.xpath(
			"//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=product/product&product_id=49&search=samsung']");

	private By samsungprize = By.xpath("(//p[@class='price'])[2]");

	private By samsungaddtocard = By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[8]");

	private By addtobag = By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']");

	private By shoppingcardprize = By.xpath("(//td[@class='text-right'])[12]");

	public AddToCardPrizeComparePageObject(WebDriver driver2) {

		this.driver = driver2;

	}

	public WebElement searchproduct() {
		return driver.findElement(searchbox);
	}

	public WebElement clickonsearch() {
		return driver.findElement(serach);
	}

	public WebElement iphonecost() {
		return driver.findElement(iphoneprize);
	}

	public WebElement iphoneadd() {
		return driver.findElement(AddToCard);
	}

	public List<WebElement> printtitle() {
		return driver.findElements(title);
	}

	public WebElement samsungcost() {
		return driver.findElement(samsungprize);
	}

	public WebElement samsungadd() {
		return driver.findElement(samsungaddtocard);
	}

	public WebElement itemaddedtobag() {
		return driver.findElement(addtobag);
	}

	public WebElement itemaddedtobagprize() {
		return driver.findElement(shoppingcardprize);
	}

}
