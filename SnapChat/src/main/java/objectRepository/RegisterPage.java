package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "gender-male")
	private

}
