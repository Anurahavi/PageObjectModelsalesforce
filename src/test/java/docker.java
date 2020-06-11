import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class docker {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
	
	RemoteWebDriver driver;
	String baseUrl,nodeUrl;
	
	String projectpath =System.getProperty("user.dir");
	
	baseUrl ="https://www.selenium.dev/";
	
	nodeUrl="http://192.168.99.100:4444/wd/hub";
	System.setProperty("webdriver.chrome.driver",projectpath+"\\driver\\chromedriver\\chromedriver.exe");
	DesiredCapabilities dc= DesiredCapabilities.chrome();
	dc.setBrowserName("chrome");
	driver= new RemoteWebDriver(new URL(nodeUrl),dc);
	driver.get(baseUrl);
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//a[contains(text(),'Downloads')]")).click();
	driver.quit();
	
	}

}
