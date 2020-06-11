package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	 
	By username =By.id("username");
	By password=By.id("password");
	By login = By.id("Login");
	By error= By.xpath("//form[@name='login']/div[1]");
	By rememberMe = By.id("rememberUn");
	By user2=By.id("idcard-identity");
	By forgotPassword = By.id("forgot_password_link");
	
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
	}
	public WebElement getusername() {
		return driver.findElement(username);
	}
	public WebElement getpassword() {
		return driver.findElement(password);
	}
	public WebElement login() {
		return driver.findElement(login);
	}
	public WebElement getError() {
		return driver.findElement(error);
	}
	
	public WebElement getforgotPassword() {
		return driver.findElement(forgotPassword);
	}
	
	public WebElement getRemember() {
		return driver.findElement(rememberMe);
	}
	public WebElement getUser2() {
		return driver.findElement(user2);
	}
}
