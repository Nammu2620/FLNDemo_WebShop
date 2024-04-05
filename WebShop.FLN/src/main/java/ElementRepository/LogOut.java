package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLibrary.BasePage;

public class LogOut extends BasePage{
	
	public LogOut(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "Computing and Internet")
	private WebElement computingAndInternetBook;

	public WebElement getComputingAndInternetBook() {
		return computingAndInternetBook;
	}
	
	@FindBy(xpath = "//input[contains(@id,'add-to-cart-button')]")
	private WebElement addToCartButton;

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}
	
	@FindBy(xpath = "//input[@name='removefromcart']")
	private WebElement RemoveCheckBox;
	
	public WebElement getRemoveCheckBox() {
		return RemoveCheckBox;
	}
	
	@FindBy(xpath = "//input[@name='updatecart']")
	private WebElement updateShoppingCart;
	
	public WebElement getUpdateShoppingCart() {
		return updateShoppingCart;
	}
}
