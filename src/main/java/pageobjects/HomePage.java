package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	
	By userprofile =By.id("userNavLabel");
	By logout=By.xpath("//a[@title='Logout']");
	By menuOptions = By.id("userNav-menuItems");
	By myProfile= By.xpath("//a[contains(text(),'My Profile')]");
	By developer = By.xpath("//a[@class='debugLogLink menuButtonMenuLink']");
	By settings= By.xpath("//a[contains(text(),'My Settings')]");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getUser() {
		return driver.findElement(userprofile);
	}
	
	public WebElement getLogout() {
		return driver.findElement(logout);
	}
	
	public WebElement getMenu() {
		return driver.findElement(menuOptions);
	}
	
	public WebElement getMyProfile() {
		return driver.findElement(myProfile);
	}
	
	public WebElement getDeveloper() {
		return driver.findElement(developer);
	}

	public WebElement getSettings() {
		
		return driver.findElement(settings);
	}
	
	

}
