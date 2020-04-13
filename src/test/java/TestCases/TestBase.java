package TestCases;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import Utilities.Configuration;
import Utilities.Driver;
import Utilities.Methods; 



public class TestBase {
	
	protected static WebDriver driver;
	protected static Logger log;
	static String url; 
	
	@BeforeTest
	public static void BeforeTest() { 
		log = (Logger) LogManager.getLogger(); 
		System.out.println("CONF: " + Configuration.getPropertyClient("urlMainPage")); 
		url = Configuration.getPropertyClient("urlMainPage"); 
		Methods.startExtentReports(); 		
		driver = Driver.getDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();  
		driver.get(url);
	}
	@BeforeMethod
	public static void BeforeTestMethod() {
		              
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}  		
	}
	
	@AfterMethod
	public static void AfterTestMethod() {  

	}
	
	@AfterTest
	public static void AfterTest() {		
		Methods.endAndCreateReport();
	}
	
	
}
