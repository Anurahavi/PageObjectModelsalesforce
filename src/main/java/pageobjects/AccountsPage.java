package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {
	
	public WebDriver driver;
	
	By accounts = By.xpath("//li[@id='Account_Tab']//a[contains(text(),'Accounts')]");
	By newacc=By.name("new");
	By accname = By.xpath("//input[@id='acc2']");
	By type= By.id("acc6");
	By priority = By.id("00N3h000003Stm8");
	By save = By.name("save");
	By AccountDetail = By.xpath("//h2[contains(text(),'Account Detail')]");
	public AccountsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getaccounts() {
		return driver.findElement(accounts);
	}
	
	public WebElement getAccount() {
		return driver.findElement(newacc);
	}
	
	public WebElement getaccname() {
		return driver.findElement(accname);
	}
	
	public WebElement getType() {
		return driver.findElement(type);
	}
	
	public WebElement getPriority() {
		return driver.findElement(priority);
	}
	
	public WebElement getSave() {
		return driver.findElement(save);
	}
	
	public WebElement getAccountDetail() {
		return driver.findElement(AccountDetail);
	}



}
