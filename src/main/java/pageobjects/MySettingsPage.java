package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MySettingsPage {
           
	public WebDriver driver;
	By personal=By.xpath("//div[@id='PersonalInfo']//a[@class='header setupFolder']");
	By loginHis=By.xpath("//span[@id='LoginHistory_font']");
	By downHist= By.xpath("//a[contains(text(),'Download login history for last six months, includ')]");
	By display=By.xpath("//span[@id='DisplayAndLayout_font']");
	By CustomizeTabs =By.xpath("//span[@id='CustomizeTabs_font']");
	By customdd= By.name("p4");
	By available = By.xpath("//select[@id='duel_select_0']");
	By rightArrow = By.xpath("//img[@class='rightArrowIcon']");
	By save = By.name("save");
	By reports= By.xpath("//a[contains(text(),'Reports')]");
	By email = By.xpath("//div[@id='EmailSetup']//a[@class='header setupFolder']");
	By emailset= By.xpath("//a[@id='EmailSettings_font']");
	By user1= By.id("sender_name");
	By emailid = By.id("sender_email");
	By save1 = By.xpath("//input[@name='save']");
	By calendar= By.xpath("//div[@id='CalendarAndReminders']//a[@class='header setupFolder']");
	By remainder = By.xpath("//a[@id='Reminders_font']");
	By test=By.xpath("//input[@id='testbtn']");
	By dismiss = By.name("dismiss_all");
	
	public MySettingsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getPersonal() {
		return driver.findElement(personal);
	}
	
	public WebElement getloginHis() {
		return driver.findElement(loginHis);
	}
	
	public WebElement getdownHis() {
		return driver.findElement(downHist);
	}
	
	public WebElement getDisplay() {
		return driver.findElement(display);
	}
	
	public WebElement getCustomize() {
		return driver.findElement(CustomizeTabs);
	}
	
	public WebElement getcustomdd() {
		return driver.findElement(customdd);
	}
	
	public WebElement getAvailable() {
		return driver.findElement(available);
	}
	
	public WebElement getrightArrow() {
		return driver.findElement(rightArrow);
	}
	
	public WebElement getSave() {
		return driver.findElement(save);
	}
	
	public WebElement getReport() {
		return driver.findElement(reports);
	}
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getEmailset() {
		return driver.findElement(emailset);
	}
	
	public WebElement getuser1() {
		return driver.findElement(user1);
	}
	
	public WebElement getemail1() {
		return driver.findElement(emailid);
	}
	
	public WebElement getSave1() {
		return driver.findElement(save1);
	} 
	
	public WebElement getCalendar() {
		return driver.findElement(calendar);
	} 
	
	public WebElement getRemainder() {
		return driver.findElement(remainder);
	} 
	
	public WebElement getTest() {
		return driver.findElement(test);
	} 
	
	public WebElement getDismiss() {
		return driver.findElement(dismiss);
	} 
	
	
	

	
}
