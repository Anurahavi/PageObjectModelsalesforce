package com.stepDefintions;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.forgotPasswordPage;
import resources.base;

public class stepDefinitions extends base {
	
	WebDriverWait wait;
	
	@Given("^Launch the browser$")
	public void launch_the_browser() throws Throwable {
             driver=initializedriver();
             wait = new WebDriverWait(driver,30);
             driver.manage().window().maximize();
	}

	@When("^Get the \"([^\"]*)\" URL$")
	public void get_the_URL(String arg1) throws Throwable {
	    driver.get(arg1);
	}

	@Then("^Enter \"([^\"]*)\",\"([^\"]*)\" and click login$")
	public void enter_and_click_login(String arg1, String arg2) throws Throwable {
		 LoginPage l=new LoginPage(driver);
   	     l.getusername().sendKeys(arg1);
   	     l.getpassword().sendKeys(arg2);
   	     l.login().click();	     
	   
	}

	
	@And("^Error message is dsiplayed$")
	public void error_message_is_dsiplayed() throws Throwable {
		LoginPage l=new LoginPage(driver);
		wait.until(ExpectedConditions.visibilityOf(l.getError()));
		String error=l.getError().getText();
  	    Assert.assertEquals(error,"Please enter your password.");
  	    driver.quit();
	}
	
	@And("^HomePage is displayed$")
	public void homepage_is_displayed() throws Throwable {
		Thread.sleep(3000);
		String title=driver.getTitle();
  	    Assert.assertEquals(title,"Home Page ~ Salesforce - Developer Edition");
  	    driver.quit();

	}
	
	@And("^Enter \"([^\"]*)\",\"([^\"]*)\",check RememberMe and click login$")
	public void enter_check_RememberMe_and_click_login(String arg1, String arg2) throws Throwable {
		LoginPage l=new LoginPage(driver);
  	     l.getusername().sendKeys(arg1);
  	     l.getpassword().sendKeys(arg2);
  	     l.getRemember().click();
  	     l.login().click();
  	    
	}
	
	@Then("^LogOut from the Salesforce application$")
	public void logout_from_the_Salesforce_application() throws Throwable {
		HomePage h=new HomePage(driver);
   	    h.getUser().click();
   	    wait.until(ExpectedConditions.visibilityOf(h.getLogout()));
   	    h.getLogout().click();
   	 
	}
	
	@And("^Check username is displayed$")
	public void check_username_is_displayed() throws Throwable {
		LoginPage l=new LoginPage(driver);
		String user=l.getUser2().getText();
   	    Assert.assertEquals(user, prop.getProperty("username"));
   	    driver.quit();
	}
	
	@Then("^Error message is displayed(\\d+)$")
	public void error_message_is_displayed(int arg1) throws Throwable {
		LoginPage l=new LoginPage(driver);
		wait.until(ExpectedConditions.visibilityOf(l.getError()));
		String error=l.getError().getText();
  	    Assert.assertEquals(error,"Please check your username and password. If you still can't log in, contact your Salesforce administrator.");
  	    driver.quit();
	}
	
	@When("^Click on forgot password$")
	public void click_on_forgot_password() throws Throwable {
		LoginPage l=new LoginPage(driver);
	    l.getforgotPassword().click();
	}

	@Then("^Password reset Email to registered the user is sent$")
	public void password_reset_Email_to_registered_the_user_is_sent() throws Throwable {
		forgotPasswordPage fg=new forgotPasswordPage(driver);
		wait.until(ExpectedConditions.visibilityOf(fg.getUser()));
		fg.getUser().sendKeys(prop.getProperty("username"));
		fg.getCont().click();
		wait.until(ExpectedConditions.visibilityOf(fg.getMessage()));
		String actual=fg.getMessage().getText();
		Assert.assertEquals(actual,"We’ve sent you an email with a link to finish resetting your password.");
	}
	

     @Then("^Click on Usermenu dropdown$")
     public void click_on_Usermenu_dropdown() throws Throwable {
         HomePage h= new HomePage(driver);
         h.getUser().click();
         String menu= h.getMenu().getText();
         String[] expected = { "My Profile", "My Settings", "Developer Console", "Switch to Lightning Experience",
			"Logout" };
        String[] menu1 = menu.split("\n");
 		for (int i = 0; i < menu1.length; i++) {
			Assert.assertEquals(menu1[i],expected[i]);
				}
 		driver.quit();
    
      }
	
	

}
