package Resources;

import java.util.Arrays;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonMethods {

	public static double ProductCostHandel(String price) {

		String cost = price;
		String ch[] = cost.split("\\s+");
		System.out.println(Arrays.toString(ch));

		String a = ch[0];

		System.out.println("ActualCoast:" + ch[0]);

		String removerDoller = a;

		String AfterRemoveDoller = removerDoller.replace("$", "");
		System.out.println("BeforeConvertedIntoDouble:" + AfterRemoveDoller);

		double d = Double.parseDouble(AfterRemoveDoller);

		System.out.println("afterConvertedIntoDouble:" + d);

		return d;

	}

	public static void selectdropdown(WebElement dropdown, int index) {
		Select s = new Select(dropdown);

		s.selectByIndex(index);
	}

	public static void handelAssertion(String actualString, String expectedString) {

		SoftAssert as = new SoftAssert();

		String actual = actualString;

		String expected = expectedString;

		as.assertEquals(actual, expected);

		as.assertAll();
	}

}
