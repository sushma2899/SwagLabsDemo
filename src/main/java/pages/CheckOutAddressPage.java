package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class CheckOutAddressPage extends BaseTest{
	By firstName=By.id("first-name");
	By lastName=By.id("last-name");
	By postalCode=By.id("postal-code");
	By continueButton=By.id("continue");
	
	public CheckOutAddressPage(WebDriver driver) {
		this.driver=driver;
	}
   
	public void checkOutAddress(String fName,String lName,String pCode) {
		driver.findElement(firstName).sendKeys(fName);
		driver.findElement(lastName).sendKeys(lName);
		driver.findElement(postalCode).sendKeys(pCode);
		driver.findElement(continueButton).click();
		
	}
}
