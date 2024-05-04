package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage1 {
	public WelcomePage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Register")
	private WebElement registerlink;
	
	@FindBy (partialLinkText = "Books")
	private WebElement bookslink;

	public WebElement getRegisterlink() {
		return registerlink;
	}

	public WebElement getBookslink() {
		return bookslink;
	}
	
	

}
