package testCases;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import PageObjectModel.DeviceAvailibilityPageobject;
import Resources.BaseClass;
import Resources.CommonMethods;

public class DevicesAvaibilityChek extends BaseClass {

	@Test
	public void devicechek() throws IOException, InterruptedException {

		DeviceAvailibilityPageobject DEVCHEK = new DeviceAvailibilityPageobject(driver);

		DEVCHEK.chekdevice().click();

		Thread.sleep(2000);

		CommonMethods.selectdropdown(DEVCHEK.selectcriteria(), 4);

		Thread.sleep(2000);

		CommonMethods.selectdropdown(DEVCHEK.selectquantity(), 3);

		Thread.sleep(2000);

		Actions a = new Actions(driver);

		WebElement src = DEVCHEK.movetoelement();

		a.moveToElement(src).perform();

	}

}
