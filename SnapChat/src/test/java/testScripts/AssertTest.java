package testScripts;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objectRepository.BooksPage;
import objectRepository.WelcomePage1;

public class AssertTest {
	@Test
	public void books_01() {
	 
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WelcomePage1 welcomepage=new WelcomePage1(driver);
			BooksPage bookspage=new BooksPage(driver);
			welcomepage.getBookslink().click();
			String actualresult=bookspage.getGetPageTitle().getText();
			//org.testng.Assert.assertEquals(actualresult, "Computers");
			SoftAssert soft=new SoftAssert();
			soft.assertEquals(actualresult, "Computers");
			driver.quit();
			soft.assertAll();
			}
	
}
