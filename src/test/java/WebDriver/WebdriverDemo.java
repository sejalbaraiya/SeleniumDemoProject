package WebDriver;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/* This is how to set property for Firefox via geckoDriver example 
				String projectPath = System.getProperty("user.dir");
				System.out.println(projectPath);

				System.setProperty("webdriver.gecko.driver", projectPath + "\\drivers\\geckodriver\\geckodriver.exe");
				/
				* System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
				System.setProperty("webdriver.gecko.driver", "/path/to/geckodriver");
				System.setProperty("webdriver.edge.driver", "/path/to/msedgedriver.exe");
				System.setProperty("webdriver.opera.driver", "/path/to/operadriver");
				System.setProperty("phantomjs.binary.path", "/path/to/phantomjs");
				System.setProperty("webdriver.ie.driver", "C:/path/to/IEDriverServer.exe");  //


				WebDriver firefoxDriver = new FirefoxDriver();
				firefoxDriver.get("http://seleniumhq.org/"); 
				*/
				// Now this is new way for webdriver manager instead of set property

				WebDriverManager.chromedriver().setup();
				/* Same way we can call any browser
				*WebDriverManager.firefoxdriver().setup();
				WebDriverManager.edgedriver().setup();
				WebDriverManager.operadriver().setup();
				WebDriverManager.phantomjs().setup();
				WebDriverManager.iedriver().setup();
				WebDriverManager.chromiumdriver().setup();
				 */
				WebDriver driver = new ChromeDriver();

				driver.get("http://google.com/");
				
				WebElement searchBox= driver.findElement(By.name("q"));
				searchBox.sendKeys("Seleniumhq");
				
				List<WebElement> listofInputElements = driver.findElements(By.xpath("//input"));
				int count = listofInputElements.size();
				
				System.out.println("Count of elements" +count);
				Thread.sleep(3000);
				driver.close();
	}



}
