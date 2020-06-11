package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {
	
	public WebDriver driver;
	
	By editProfile = By.xpath("//a[@class='contactInfoLaunch editLink']//img");
	By contact = By.xpath("//a[contains(text(),'Contact')]");
	By About= By.xpath("//a[contains(text(),'About')]");
	By lastName = By.id("lastName");
	By newUser = By.xpath("//span[@id='tailBreadcrumbNode']");
	By SaveAll = By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']");
	By post = By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]");
	By postBody = By.xpath("/html[1]/body[1]");
	By publishPost =By.name("publishersharebutton");
	By file = By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'File')]");
	By uploadFile = By.xpath("//a[@id='chatterUploadFileAction']");
	By Linkfile=By.xpath("//input[@id='chatterFile']");
	By shareFile = By.xpath("//input[@id='publishersharebutton']");
	By photoLink=By.xpath("//a[@id='uploadLink']");
	By uploadPhoto=By.xpath("//input[@id='j_id0:uploadFileForm:uploadInputFile']");
	By photolink2=By.id("j_id0:uploadFileForm:uploadBtn");	
	By fileSuccess = By.xpath("//span[contains(text(),'posted a file.')]");
	By crop = By.xpath("//div[contains(@class,'imgCrop_marqueeVert imgCrop_marqueeWest')]");
	By photoSave = By.id("j_id0:j_id7:save");
	
	public ProfilePage(WebDriver driver) {
		this.driver=driver;
	}
	

	public WebElement getEdit() {
		return driver.findElement(editProfile);
	}
	
	public WebElement getContact() {
		return driver.findElement(contact);
	}
	
	public WebElement getAbout() {
		return driver.findElement(About);
	}
    
	public WebElement getlastName() {
		return driver.findElement(lastName);
	}
	
	public WebElement getnewUser() {
		return driver.findElement(newUser);
	}
	
	public WebElement getPost() {
		return driver.findElement(post);
	}
	
	public WebElement getSaveAll() {
		return driver.findElement(SaveAll);
	}
	
	public WebElement getpostBody() {
		return driver.findElement(postBody);
	}
	
	public WebElement getpublish() {
		return driver.findElement(publishPost);
	}
	
	public WebElement getFile() {
		return driver.findElement(file);
	}
	
	public WebElement getuploadFile() {
		return driver.findElement(uploadFile);
	}
	
	public WebElement getfileLink() {
		return driver.findElement(Linkfile);
	}
	
	public WebElement getsharefile() {
		return driver.findElement(shareFile);
	}
	
	public WebElement getfileSuccess() {
		return driver.findElement(fileSuccess);
	}
	
	public WebElement getphotoLink() {
		return driver.findElement(photoLink);
	}
	
	public WebElement getuploadphoto() {
		return driver.findElement(uploadPhoto);
	}
	
	public WebElement getphotoLink2() {
		return driver.findElement(photolink2);
	}
	
	public WebElement getcrop() {
		return driver.findElement(crop);
	}
	
	public WebElement getSave() {
		return driver.findElement(photoSave);
	}
}
