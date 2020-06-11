package com.stepDefintions;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageobjects.AccountsPage;
import pageobjects.HomePage;
import pageobjects.MySettingsPage;
import resources.base;

public class stepDefinitions2 extends base {
	
	WebDriverWait wait;
	@Then("^Click on Usermenu dropdown and select MySettings$")
	public void click_on_Usermenu_dropdown_and_select_MySettings() throws Throwable {
	
		 HomePage h= new HomePage(driver);
         h.getUser().click();
         h.getSettings().click();
	}
	
	
	@Then("^Click on personal link and download login history$")
	public void click_on_personal_link_and_download_login_history() throws Throwable {
	    MySettingsPage s= new MySettingsPage(driver);
	    wait = new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.visibilityOf(s.getPersonal()));
	    s.getPersonal().click();
	    s.getloginHis().click();
	    wait.until(ExpectedConditions.visibilityOf(s.getdownHis()));
	    s.getdownHis().click();
	    System.out.println("Login history downloaded succesfully");
	}
	
	@Then("^Click on Display & Layout link and customize tabs$")
	public void click_on_Display_Layout_link_and_customize_tabs() throws Throwable {
		MySettingsPage s= new MySettingsPage(driver);
		wait = new WebDriverWait(driver,30);
	    wait.until(ExpectedConditions.visibilityOf(s.getPersonal()));
	    s.getPersonal().click();
	    s.getDisplay().click();
	    s.getCustomize().click();
	    Select sel = new Select(s.getcustomdd());
		sel.selectByVisibleText("Salesforce Chatter");
		wait.until(ExpectedConditions.visibilityOf(s.getAvailable()));
		Select sel1 = new Select(s.getAvailable());
		sel1.selectByValue("report");
		s.getrightArrow().click();
		s.getSave().click();
		Assert.assertEquals(s.getReport().getText(),"Reports");
	}
	
	@Then("^Click on Email link and click on my email settings link under that$")
	public void click_on_Email_link_and_click_on_my_email_settings_link_under_that() throws Throwable {
		MySettingsPage s= new MySettingsPage(driver);
		s.getEmail().click();
		s.getEmailset().click();
		s.getuser1().clear();
		s.getuser1().sendKeys("Anu Jayanthi Shan");
		s.getemail1().clear();
		s.getemail1().sendKeys("rahavianu@gmail.com");
		 wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf(s.getSave1()));
		 s.getSave1().click();		
		
	}
	
	@And("^Click on Calendar & Remainders and click preview remainder$")
	public void click_on_Calendar_Remainders_and_click_preview_remainder() throws Throwable {
		MySettingsPage s= new MySettingsPage(driver);
		wait = new WebDriverWait(driver,30);
		 wait.until(ExpectedConditions.visibilityOf(s.getCalendar()));
		 s.getCalendar().click();
		 s.getRemainder().click();
		 s.getTest().click();
		 Thread.sleep(5000);
		Set<String> getAllWindows = driver.getWindowHandles();
		String[] getWindow = getAllWindows.toArray(new String[getAllWindows.size()]);
		System.out.println("No of windows:" + getAllWindows.size());
		driver.switchTo().window(getWindow[1]);
		s.getDismiss().click();
		System.out.println("PopUp is handled");
		driver.quit();
	}
	
	@Then("^Click on Usermenu dropdown and select DeveloperConsole$")
	public void click_on_Usermenu_dropdown_and_select_DeveloperConsole() throws Throwable {
		HomePage h= new HomePage(driver);
        h.getUser().click();
	    h.getDeveloper().click();
	}

	@And("^Close developer console window$")
	public void close_developer_console_window() throws Throwable {
		Set<String> getAllWindows = driver.getWindowHandles();
		String[] getWindow = getAllWindows.toArray(new String[getAllWindows.size()]);
		driver.switchTo().window(getWindow[1]);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		System.out.println("Developer console window is opened");
		driver.manage().window().maximize();
		driver.close();
		System.out.println("Window is closed");
		driver.switchTo().window(getWindow[0]);
		driver.quit();
	}
	
	@Then("^Click on Usermenu dropdown and select Logout$")
	public void click_on_Usermenu_dropdown_and_select_Logout() throws Throwable {
		HomePage h= new HomePage(driver);
        h.getUser().click();
        h.getLogout().click();
	}

	@And("^LoginPage is displayed$")
	public void loginpage_is_displayed() throws Throwable {
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		System.out.println("Navigated to login page");
		driver.quit();
	    
	}
	
	@Then("^Click Account page and click on new account$")
	public void click_Account_page_and_click_on_new_account() throws Throwable {
              AccountsPage a = new AccountsPage(driver);
              a.getaccounts().click();
              a.getAccount().click();
             
      	                   
   }
	
	@Then("^Enter account name, priority and other details$")
	public void enter_account_name_priority_and_other_details() throws Throwable {
		 AccountsPage a = new AccountsPage(driver);
		 wait = new WebDriverWait(driver,30);
 	      wait.until(ExpectedConditions.visibilityOf(a.getaccname()));
 	      a.getaccname().sendKeys("Test Cucumber");
 	     Select sl = new Select(a.getType());
 	    sl.selectByValue("Technology Partner");
 	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", a.getPriority());
		Select sl1 = new Select(a.getPriority());
		sl1.selectByValue("High");
				 
	}
	
	@And("^Click on save$")
	public void click_on_save() throws Throwable {
		AccountsPage a = new AccountsPage(driver);
		a.getSave().click();
		wait.until(ExpectedConditions.visibilityOf(a.getAccountDetail()));
		Assert.assertEquals(a.getAccountDetail().getText(), "Account Detail");
		driver.quit();
	}

}