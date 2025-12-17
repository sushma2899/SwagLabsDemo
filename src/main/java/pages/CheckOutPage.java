package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class CheckOutPage extends BaseTest{
	By checkOutButton=By.id("checkout");
	
	public CheckOutPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnCheckOut() {
		driver.findElement(checkOutButton).click();
	}

}
