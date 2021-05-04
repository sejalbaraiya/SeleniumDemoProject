package tests;

import org.openqa.selenium.WebDriver;

import pages.SearchPageObjects;

public class TestSearchPageObjects {
	private static WebDriver driver = null;
	static String browserName= "firefox";

	public static void main(String[] args) throws InterruptedException {
			searchTest();
	}


	public static void searchTest() throws InterruptedException {
		
		driver = utilities.DriverFactory.open(browserName);

		SearchPageObjects searchPageObj = new SearchPageObjects(driver);
		
		driver.get("http://google.com");
				
		searchPageObj.setTextinSearchBox("seleniumhq");
		searchPageObj.clickSearchButton();
		
//		Thread.sleep(3000);
		
		driver.close();
	}
}
