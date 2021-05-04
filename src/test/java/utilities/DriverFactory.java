package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public static WebDriver open(String browserName ) {

		if(browserName.equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();

		}else if(browserName.equals("ie")) {

			WebDriverManager.iedriver().setup();
			return new InternetExplorerDriver();

		}else if(browserName.equals("edge")) {

			WebDriverManager.edgedriver().setup();
			return new EdgeDriver();
		}else {
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver();
		}

	}
}
