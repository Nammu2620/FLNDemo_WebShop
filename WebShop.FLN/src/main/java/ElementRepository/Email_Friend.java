package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLibrary.BasePage;

public class Email_Friend extends BasePage{

	public Email_Friend(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(linkText="Fiction")
	private WebElement loc_product;
	
	@FindBy(xpath="//input[@value='Email a friend']")
	private WebElement emailButton;
	
	@FindBy(id="FriendEmail")
	private WebElement friendEmailTextBox;
	
	@FindBy(id="YourEmailAddress")
	private WebElement yourEmailTextBox;
	
	@FindBy(name="send-email")
	private WebElement sendEmailButton;

	public WebElement getLoc_product() {
		return loc_product;
	}

	public WebElement getEmailButton() {
		return emailButton;
	}

	public WebElement getFriendEmailTextBox() {
		return friendEmailTextBox;
	}

	public WebElement getYourEmailTextBox() {
		return yourEmailTextBox;
	}

	public WebElement getSendEmailButton() {
		return sendEmailButton;
	}

}
