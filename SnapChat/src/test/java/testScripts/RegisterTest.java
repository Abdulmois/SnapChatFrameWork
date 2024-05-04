package testScripts;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.WelcomePage1;

public class RegisterTest {
	@Test
	public void register_001() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WelcomePage1 welcomepage=new WelcomePage1(driver);
		welcomepage.getRegisterlink().click();
		driver.quit();
	}

}
