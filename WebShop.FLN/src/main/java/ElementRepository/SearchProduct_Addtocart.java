package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLibrary.BasePage;

public class SearchProduct_Addtocart extends BasePage{

	public SearchProduct_Addtocart(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "small-searchterms")
	private WebElement searchBar;
	
	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getUpdateCartButton() {
		return updateCartButton;
	}

	public WebElement getRemoveLap() {
		return RemoveLap;
	}

	@FindBy(name="updatecart")
	private WebElement updateCartButton;
	
	@FindBy(xpath="//a[text()='14.1-inch Laptop']/../..//input[@name='removefromcart']")
	private WebElement RemoveLap;
	
	@FindBy(xpath="//a[text()='14.1-inch Laptop']/../..//input[@value='Add to cart']")
	private WebElement Lap_AddToCart;

	public WebElement getLap_AddToCart() {
		return Lap_AddToCart;
	}
	
	@FindBy(xpath="//a[text()='14.1-inch Laptop']/../..//input[@class='qty-input']")
	private WebElement quantityTB;

	public WebElement getQuantityTB() {
		return quantityTB;
	}
	

}
