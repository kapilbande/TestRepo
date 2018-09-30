package testPackage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class CreateProjectUsingTemplate {
	
	
	public WebDriver driver;
	//public ExtentReports extent;
	//public ExtentTest extentTest;

	
	@BeforeTest
	public void setup(){
		
		System.setProperty("webdriver.chrome.driver", "D:/Jars/chromedriver.exe");	
		//System.setProperty("webdriver.gecko.driver", "E:/JARS/geckodriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.oracle.com/partners/en/partner-with-oracle/cloud-business-builder/refer-resell/demo-environments/index.html");
		
	}
	
	
	
	@Test
	public void TitleTest(){
		//extentTest = extent.startTest("freeCrmTitleTest");
		String title = driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals(title,"#1 Free CRM for Any Business: Online Customer Relationship Software123");
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
