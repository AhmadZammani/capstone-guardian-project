package tek.capstone.guardians.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHeadless implements Browser {

	@Override
	public WebDriver openBrowser(String url) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions Options= new ChromeOptions();
	     Options.addArguments("--headless");
		WebDriver driver=new ChromeDriver(Options);
		driver.get(url);
		return driver;
	}

}
