package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class forgotPasswordPage {
	
	public WebDriver driver;
	
	By user = By.id("un");
	By cont = By.id("continue");
	By message = By.xpath("//div[@class='message']//p[1]");
	
	
	public forgotPasswordPage(WebDriver driver) {
		this.driver= driver;
	}
    
	public WebElement getUser() {
		return driver.findElement(user);
	}
	
	public WebElement getCont() {
		return driver.findElement(cont);
	}
	
	public WebElement getMessage() {
		return driver.findElement(message);
	}
	
}
