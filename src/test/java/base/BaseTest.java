package base;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeOptions;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--guest");
		driver=WebDriverManager.chromedriver().capabilities(options).create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.saucedemo.com/");
		
		
		
	}
	
	@AfterMethod
	public void tearUp() {
		driver.close();
	}
	

}
