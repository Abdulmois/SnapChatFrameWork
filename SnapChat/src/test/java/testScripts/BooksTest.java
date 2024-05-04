package testScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.BooksPage;
import objectRepository.WelcomePage1;

public class BooksTest {
	@Test
	public void bookTest() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WelcomePage1 welcomepage=new WelcomePage1(driver);
		welcomepage.getBookslink().click();
		BooksPage bookspage=new BooksPage(driver);
		if(bookspage.getGetPageTitle().getText().equals("Books")) {
			System.out.println("Test case Pass");
		}else {
			System.out.println("Test case fail");
		}
		driver.quit();
		
	}
}


