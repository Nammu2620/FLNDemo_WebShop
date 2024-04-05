package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLibrary.BasePage;

public class GiftCards extends BasePage{
	public GiftCards(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="products-orderby")
	private WebElement proOrder;
	
	@FindBy(id="products-pagesize")
	private WebElement proSize;
	
	@FindBy(id="products-viewmode")
	private WebElement proView;
	
	@FindBy(xpath  ="//input[contains(@id,'RecipientName')]")
	private WebElement proName;
	
	@FindBy(xpath=" //input[contains(@id,'RecipientEmail')]")
	private WebElement proEmail;
	
	@FindBy(xpath="//input[contains(@id,'SenderName')]")
	private WebElement sName;
	
	@FindBy(xpath="SenderEmail")
	private WebElement sEmail;
	
	@FindBy(xpath ="//textarea[contains(@id,'Message')]")
	private WebElement msg;
	
	@FindBy(xpath = "//input[contains(@id,'Quantity')]")
	private WebElement qty;
	
	@FindBy(xpath = "//input[@value='Add to cart']")
	private WebElement addToCart;
	
	@FindBy(xpath ="//input[contains(@value,'wishlist')]")
	private WebElement wishlist;
	
	@FindBy(xpath = "//input[contains(@value,'friend')]")
	private WebElement emailFriend;
	
	@FindBy(xpath="//input[contains(@value,'compare')]")
	private WebElement compareList;

	public WebElement getProOrder() {
		return proOrder;
	}

	public WebElement getProSize() {
		return proSize;
	}

	public WebElement getProView() {
		return proView;
	}

	public WebElement getProName() {
		return proName;
	}

	public WebElement getProEmail() {
		return proEmail;
	}

	public WebElement getsName() {
		return sName;
	}

	public WebElement getsEmail() {
		return sEmail;
	}

	public WebElement getMsg() {
		return msg;
	}

	public WebElement getQty() {
		return qty;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getWishlist() {
		return wishlist;
	}

	public WebElement getEmailFriend() {
		return emailFriend;
	}

	public WebElement getCompareList() {
		return compareList;
	}
}
