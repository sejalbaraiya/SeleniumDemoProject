package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class goDaddyTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.godaddy.com/");

		WebElement signin = driver.findElement(By.xpath("//*[@id=\"id-8dddb8e3-5fa3-4a8f-821d-518c486db815\"]/a"));

		signin.click();

		//		WebElement closeBtn = driver.findElement(By.xpath("//*[@id=\"id-8dddb8e3-5fa3-4a8f-821d-518c486db815\"]/div/button"));
		//		closeBtn.click();
		//				
		//		WebElement signinTitle = driver.findElement(By.xpath("//*[@id=\"id-2b16754f-7e10-46d2-bb0b-9b3dc4e4ef8a\"]/div[1]/div[1]"));
		//		signinTitle.isDisplayed();
		//			
		//		
		//		WebElement signInBtn = driver.findElement(By.xpath("//*[@id=\"id-2b16754f-7e10-46d2-bb0b-9b3dc4e4ef8a\"]/div[1]/div[2]/a"));
		//		signInBtn.click();

		//////*[@id="id-2b16754f-7e10-46d2-bb0b-9b3dc4e4ef8a"]/div[2]/div[2]/a"]  and //a[contains(text(),'Create My Account')]
		WebElement createAccount = driver.findElement(By.linkText("Create My Account"));
		createAccount.click();

		Thread.sleep(3000);

		driver.close();

	}

}
