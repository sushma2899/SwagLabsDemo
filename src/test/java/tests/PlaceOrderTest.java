package tests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;


import base.BaseTest;
import pages.*;

public class PlaceOrderTest extends BaseTest{
	
	@Test
	public void placeOrder() {
		LoginPage lg=new LoginPage(driver);
		lg.loginPage("standard_user", "secret_sauce");
		
		//Add items to cart
		AddToCartPage ap=new AddToCartPage(driver);
		ap.addItemsToCart();
		
		//check out page
		CheckOutPage cp=new CheckOutPage(driver);
		cp.clickOnCheckOut();
		
		//address info
		
		CheckOutAddressPage ca=new CheckOutAddressPage(driver);
		ca.checkOutAddress("Sushma", "Siddu", "560066");
		
		//overivew page
		CheckOutOverViewPage cvp=new CheckOutOverViewPage(driver);
		cvp.overViewPage();
		
		
		//assertions
	
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Thank you for your order!");
		
		
		
		
	}

}
