package genericlibrary;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import objectRepository.WelcomePage;


public class BaseClass extends UtilityMethods {
	public WebDriver driver;
	public static ExtentReports reports;
	public static ExtentTest test;
	@BeforeSuite
	public void beforeSuite() {
		report=new ExtentReports("./Reports/report.html");
		System.out.println("Before suite");
		System.out.println("Before Suite");
	}
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void launchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void login(Method method) {
		String methodName=method.getName();
		test=report.startTest(methodName);
		WelcomePage welcomepage=new WelcomePage(driver);
		welcomepage.getLoginlink().click();
		welcomepage.getEmailtfbutton().sendKeys("abdmois@gmail.com");
		welcomepage.getPasswordtfbutton().sendKeys("Password@123");
		welcomepage.getLoginbutton().click();
		System.out.println("BeforeMethod");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
		System.out.println("After Class");
	}
	@AfterMethod
	public void logout() {
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getLogoutlink().click();
		System.out.println("After Method");
	}
		
		@Test
		public void log() {
			System.out.println("f");
		}
		
	
		
		
		
	}


