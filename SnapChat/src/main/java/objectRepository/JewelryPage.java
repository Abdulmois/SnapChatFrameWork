package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewelryPage {
	public JewelryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (linkText = "Jewelry")
	private WebElement jewelryLink;
	
	@FindBy(xpath = "(//input[@value='Add to cart'])[2]")
	private WebElement diamondHeartAddToCartButton;

	public WebElement getDiamondHeartAddToCartButton() {
		return diamondHeartAddToCartButton;
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

}
