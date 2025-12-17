package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseTest;

public class LoginPage extends BaseTest {
	
	By userName=By.id("user-name");
	By passWord= By.id("password");
	By logIn=By.id("login-button");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;	
		}
	
	public void loginPage(String username,String pwd) {
		driver.findElement(userName).sendKeys(username);
		driver.findElement(passWord).sendKeys(pwd);
		driver.findElement(logIn).click();
	}

}
