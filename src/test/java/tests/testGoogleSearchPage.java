package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.googleSearchPage;

public class testGoogleSearchPage {
	static WebDriver driver;
	static String Url = "http://google.com";
	static String browserName= "chrome";

	public static void main(String[] args) throws InterruptedException {
		googleSearchTest();
	}


	public static void googleSearchTest() throws InterruptedException {
		driver = utilities.DriverFactory.open(browserName);
		driver.get(Url);

		googleSearchPage.searchBox(driver).sendKeys("Seleniumhq");
		googleSearchPage.btnsearch(driver).sendKeys(Keys.RETURN);

		Thread.sleep(3000);
		driver.close();

		System.out.println("Test Completed syccessfully");
	}

}
