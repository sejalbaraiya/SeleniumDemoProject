package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchPageObjects {

	WebDriver driver = null;

	By search_box = By.id("lst-ib");

	By button_search =By.name("btnK");
	
	public SearchPageObjects(WebDriver driver) {
		this.driver= driver;
	}

	public void setTextinSearchBox(String text) {
		driver.findElement(search_box).sendKeys(text);
	}

	public void clickSearchButton() {
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}
}
