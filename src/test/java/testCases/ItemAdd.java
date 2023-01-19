package testCases;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import PageObjectModel.ItemAddPageObject;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.Constants;

public class ItemAdd extends BaseClass {
	@Test
	public void selectspecification() throws IOException, InterruptedException {

		ItemAddPageObject ITM = new ItemAddPageObject(driver);

		ITM.shoppingcard().click();

		Thread.sleep(2000);

		ITM.radiooption().click();

		ITM.chekboxoption().click();

		ITM.entertext().clear();

		ITM.entertext().sendKeys(Constants.text);

		WebElement obj = ITM.optionselect();

		Select s = new Select(obj);

		s.selectByIndex(3);

		ITM.adddiscriptin().sendKeys(Constants.discription);

		ITM.enterdate().clear();

		ITM.enterdate().sendKeys(Constants.date);

		ITM.entertime().clear();

		ITM.entertime().sendKeys(Constants.time);

		ITM.enterdateandtime().clear();

		ITM.enterdateandtime().sendKeys(Constants.dateANDTime);

		ITM.selectquantity().clear();

		ITM.selectquantity().sendKeys(Constants.quantity);

		ITM.clickonaddtocard().click();

		CommonMethods.handelAssertion(ITM.massageaboutquantity().getText(), Constants.suggestedtext);

	}

}
