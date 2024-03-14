package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserFactory {
	
	public static WebDriver setBrowser(String browserName) {
		WebDriver driver;
		switch (browserName.toLowerCase()) {
		case "chrome":
			// Set ChromeDriver path
			//System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
			driver = new ChromeDriver();
			break;
		case "firefox":
			// Set GeckoDriver path
			//System.setProperty("webdriver.gecko.driver", "path_to_geckodriver");
			driver = new FirefoxDriver();
			break;
		case "edge":
			// Set EdgeDriver path
			//System.setProperty("webdriver.edge.driver", "path_to_edgedriver");
			driver = new EdgeDriver();
			break;
		default:
			throw new IllegalArgumentException("Invalid browser name: " + browserName);
		}
	return driver;
		
	}
}
