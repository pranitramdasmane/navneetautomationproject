package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;

	public void BrowserInitialization() throws IOException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\data.properties");

		Properties prop = new Properties();

		prop.load(fis);

		String browsername = prop.getProperty("browser");

		if (browsername.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
		}

		else if (browsername.equalsIgnoreCase("fireFox")) {

			// firefox code

		} else {
			System.out.println("please enter valid browser name");
		}

	}

	@BeforeMethod
	public void launch() throws IOException {
		BrowserInitialization();

		driver.get("https://naveenautomationlabs.com/opencart/");

	}

	@AfterMethod
	public void closebrowser() {
		driver.quit();
	}

}
