package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	public static WebDriver driver;
	public Properties prop;
	public WebDriver initializedriver() throws IOException {
		prop=new Properties();
		String projectpath =System.getProperty("user.dir");
		FileInputStream fis=new FileInputStream(projectpath+"\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		if(browserName.equals("chrome")) {

			 System.setProperty("webdriver.chrome.driver", projectpath+"\\driver\\chromedriver\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

}
