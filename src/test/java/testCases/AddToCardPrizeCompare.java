package testCases;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import PageObjectModel.AddToCardPrizeComparePageObject;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.Constants;

public class AddToCardPrizeCompare extends BaseClass {

	@Test
	public void Addtocard() throws IOException, InterruptedException {

		AddToCardPrizeComparePageObject ADD = new AddToCardPrizeComparePageObject(driver);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		ADD.searchproduct().sendKeys(Constants.product1); // search for iphone

		ADD.clickonsearch().click(); // click on search

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// add iphone to card
		WebElement element = ADD.iphoneadd();

		js.executeScript("arguments[0].click();", element);

		// iphone cost print

		String price1 = ADD.iphonecost().getText();
		double d1 = CommonMethods.ProductCostHandel(price1);

		ADD.searchproduct().clear(); // clear searchbox

		ADD.searchproduct().sendKeys(Constants.product2); // search for samsung

		ADD.clickonsearch().click();

		List<WebElement> name = ADD.printtitle();

		for (WebElement list : name) {
			if (list.getText().equalsIgnoreCase(Constants.title)) {

				JavascriptExecutor js2 = (JavascriptExecutor) driver;

				WebElement element2 = ADD.samsungadd();

				js2.executeScript("arguments[0].click();", element2);

			}

		}

		// samsung cost print
		String price2 = ADD.samsungcost().getText();
		double d2 = CommonMethods.ProductCostHandel(price2);

		double finalvalue = d1 + d2;

		System.out.println(finalvalue); // 365.19

		String ItemAddedPrize = ("$" + finalvalue);

		System.out.println("additon of two product prize :" + ItemAddedPrize);

		ADD.itemaddedtobag().click(); // total item click

		String AddedTobagPrice = ADD.itemaddedtobagprize().getText();

		System.out.println(AddedTobagPrice); // $365.19

		if (ItemAddedPrize.equals(AddedTobagPrice)) {

			System.out.println("Amount matching successfully");
		}

		else {

			System.out.println("Amount not matching ");
		}

	}
}
