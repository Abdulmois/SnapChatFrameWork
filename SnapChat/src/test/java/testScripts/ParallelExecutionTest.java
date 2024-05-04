package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecutionTest {
	@Test(invocationCount = 5,threadPoolSize = -2)
	public void register() {
		WebDriver driver=new ChromeDriver();
		System.out.println("Register ===>regression");
		driver.quit();
	}
	@Test(enabled = false)
	public void login() {
		WebDriver driver=new ChromeDriver();
		System.out.println("Login");
		driver.quit();
	}

}
