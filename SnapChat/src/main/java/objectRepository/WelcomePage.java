package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLoginlink() {
		return loginlink;
	}

	public WebElement getEmailtfbutton() {
		return emailtfbutton;
	}

	public WebElement getPasswordtfbutton() {
		return passwordtfbutton;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	@FindBy(linkText = "Log in")
	private WebElement loginlink;
	
	@FindBy(id = "Email")
	private WebElement emailtfbutton;
	
	@FindBy(id = "Password")
	private WebElement passwordtfbutton;
	
	@FindBy(css = "[value='Log in']")
	private WebElement loginbutton;
	
	@FindBy(linkText = "Log out")
	private WebElement logoutlink;
	
	@FindBy (linkText = "Jewelry")
	private WebElement jewelryLink;
	
	@FindBy(css = "[value='Register']")
	private WebElement registerLink;
	
	@FindBy(linkText = "Apparel & Shoes")
	private WebElement apparelLink;

	public WebElement getApparelLink() {
		return apparelLink;
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}
	

}
