package com.stepDefintions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageobjects.HomePage;
import pageobjects.ProfilePage;
import resources.base;

public class stepDefinitions1 extends base {
	
	WebDriverWait wait;
	
	@Then("^Click on Usermenu dropdown and select MyProfile$")
	public void click_on_Usermenu_dropdown_and_select_MyProfile() throws Throwable {
		 HomePage h= new HomePage(driver);
         h.getUser().click();
         h.getMyProfile().click();
         
	}
	
	@Then("^Click on edit profile button to edit contact information$")
	public void click_on_edit_profile_button_to_edit_contact_information() throws Throwable {
	    ProfilePage p= new ProfilePage(driver);
	    //wait = new WebDriverWait(driver,30);
	   // wait.until(ExpectedConditions.visibilityOf(p.getEdit()));
	    Thread.sleep(2000);
	    p.getEdit().click();
	    driver.switchTo().frame("contactInfoContentId");
	    Assert.assertEquals(p.getContact().getText(),"Contact");
	    	    
	}
	
	@Then("^Click on About tabs and update lastname$")
	public void click_on_About_tabs_and_update_lastname() throws Throwable {
		ProfilePage p= new ProfilePage(driver);
		wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(p.getAbout()));
	    p.getAbout().click();
	    p.getlastName().clear();
	    p.getlastName().sendKeys("Jayanthi");
	    p.getSaveAll().click();
	    Assert.assertEquals(p.getnewUser().getText(),"Anu Jayanthi ");
	}
	
	@Then("^CLick on post and share a post$")
	public void click_on_post_and_share_a_post() throws Throwable {
		ProfilePage p= new ProfilePage(driver);
		wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(p.getPost()));
		p.getPost().click();
		driver.switchTo().frame(0);
		p.getpostBody().sendKeys("My First Post");
		driver.switchTo().parentFrame();
		wait.until(ExpectedConditions.visibilityOf(p.getpostBody()));
		p.getpostBody().click();
	}
	
	@Then("^Click on file and post a file$")
	public void click_on_file_and_post_a_file() throws Throwable {
		ProfilePage p= new ProfilePage(driver);
		wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(p.getFile()));
		p.getFile().click();
		p.getuploadFile().click();
		p.getfileLink().sendKeys("C://Users//mahes//Desktop//Anucodes//Ans1.docx");
		wait.until(ExpectedConditions.visibilityOf(p.getsharefile()));
		p.getsharefile().click();
		System.out.println(p.getfileSuccess().getText());
		
		}
	
	@And("^Click on photo and upload a photo$")
	public void click_on_photo_and_upload_a_file() throws Throwable {
		ProfilePage p= new ProfilePage(driver);
		wait = new WebDriverWait(driver,30);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", p.getphotoLink());
		driver.switchTo().frame("uploadPhotoContentId");
		p.getuploadphoto().sendKeys("C://Users//mahes//Desktop//Anucodes//pics//profile.png");
		executor.executeScript("arguments[0].click();", p.getphotoLink2());
		Actions action=new Actions(driver);
		action.dragAndDropBy(p.getcrop(),30,220).build().perform();
		driver.findElement(By.id("j_id0:j_id7:save")).click();
		Thread.sleep(4000);
		System.out.println("Photo uploaded successfully");
		driver.quit();
	}

}
