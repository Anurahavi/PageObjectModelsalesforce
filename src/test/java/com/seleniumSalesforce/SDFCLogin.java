package com.seleniumSalesforce;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.HomePage;
import pageobjects.LoginPage;
import resources.base;

public class SDFCLogin extends base{
              public static Logger log =LogManager.getLogger(base.class.getName());
              @BeforeTest
              public void intialize() throws IOException {
            	  driver=initializedriver();
            	   }
              /*@Test
              public void navigateSDFC() throws InterruptedException {
            	  driver.get(prop.getProperty("url"));
            	  LoginPage l=new LoginPage(driver);
            	  l.getusername().sendKeys(prop.getProperty("username"));
            	  l.getpassword().clear();
            	  l.login().click();
            	  Thread.sleep(3000);
            	  String error=l.getError().getText();
            	  log.info(error);
            	  Assert.assertEquals(error,"Please enter your password.");
              }
              
              @Test
              public void logintoSDFC() throws InterruptedException {
            	  driver.get(prop.getProperty("url"));
            	  LoginPage l=new LoginPage(driver);
            	  l.getusername().sendKeys(prop.getProperty("username"));
            	  l.getpassword().sendKeys(prop.getProperty("password"));
            	  l.login().click();
            	  Thread.sleep(3000);
            	  String title=driver.getTitle();
            	  log.info(title);
            	  Assert.assertEquals(title,"Home Page ~ Salesforce - Developer Edition");
              
              }*/
              
              @Test
              public void rememberUsername() throws InterruptedException {
            	  driver.get(prop.getProperty("url"));
            	  LoginPage l=new LoginPage(driver);
            	  l.getusername().sendKeys(prop.getProperty("username"));
            	  l.getpassword().sendKeys(prop.getProperty("password"));
            	  l.getRemember().click();
            	  l.login().click();
            	  Thread.sleep(3000);
            	 HomePage h=new HomePage(driver);
            	 h.getUser().click();
            	 Thread.sleep(3000);
            	 h.getLogout().click();
            	 String user=l.getUser2().getText();
            	 log.info(user);
            	 Assert.assertEquals(user, prop.getProperty("username"));
            	               
              }
             
              
              @AfterTest
          	public void teardown()
          	{
          		
          		driver.close();
          		driver=null;
          		
          	}
}
