package testScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objectRepository.BooksPage;
import objectRepository.WelcomePage1;

public class BooleanAssertTest {
	
	@Test
	public void booleanAssertTest() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WelcomePage1 welcomepage=new WelcomePage1(driver);
		welcomepage.getBookslink().click();
		BooksPage bookspage=new BooksPage(driver);
		String actualResult=bookspage.getGetPageTitle().getText();
		SoftAssert soft=new SoftAssert();
		//soft.assertEquals(bookspage.getGetPageTitle().isDisplayed(), true);
		//soft.assertTrue(bookspage.getGetPageTitle().isDisplayed());
		soft.assertFalse(bookspage.getGetPageTitle().isDisplayed());
		driver.quit();
		System.out.println("Test Case Completed");
		soft.assertAll();
		
	}

}
