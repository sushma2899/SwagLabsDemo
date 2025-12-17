package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class AddToCartPage extends BaseTest {
	By addToCart=By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
	By cartIcon=By.className("shopping_cart_link");
	
	public AddToCartPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void addItemsToCart() {
		driver.findElement(addToCart).click();
		driver.findElement(cartIcon).click();
	}

}
