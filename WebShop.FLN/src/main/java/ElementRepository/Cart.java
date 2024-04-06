package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLibrary.BasePage;

public class Cart extends BasePage{
	public Cart(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name="removefromcart")
	private WebElement RemoveCheckBox;
	
	@FindBy(name="updatecart")
	private WebElement UpdateShoppingCart;
	
	@FindBy(name="continueshopping")
	private WebElement ContinueShopping;
	
	@FindBy(name="termsofservice")
	private WebElement checkbox;
	
	@FindBy(id="checkout")
	private WebElement CheckoutButton;

	public WebElement getRemoveCheckBox() {
		return RemoveCheckBox;
	}

	public WebElement getUpdateShoppingCart() {
		return UpdateShoppingCart;
	}

	public WebElement getContinueShopping() {
		return ContinueShopping;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getCheckoutButton() {
		return CheckoutButton;
	}
}
