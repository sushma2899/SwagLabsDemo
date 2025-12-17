package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class CheckOutOverViewPage extends BaseTest {
	
	By finishButton=By.id("finish");
	
	public CheckOutOverViewPage(WebDriver driver) {
		this.driver=driver;
	}
 
	
	public void overViewPage() {
		driver.findElement(finishButton).click();
	}
}
