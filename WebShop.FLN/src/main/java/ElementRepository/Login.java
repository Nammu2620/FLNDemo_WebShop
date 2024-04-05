package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLibrary.BasePage;

public class Login extends BasePage {

	public Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

/*========Finding Login Page elements using FindBy annotations===========*/
	
	@FindBy(id = "Email")
	private WebElement emailTextBox;
	
	@FindBy(id = "Password")
	private WebElement passwordTextBox;
	
	@FindBy(id = "RememberMe")
	private WebElement rememberMeCheckBox;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;

/*=========Giving Getters Methods for Located Elements=====================*/
	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}

	public WebElement getRememberMeCheckBox() {
		return rememberMeCheckBox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

/*=========Business Logic============*/
	
	public void Login_Actions(String username, String password) {

		getLoginlink().click();
		emailTextBox.sendKeys(username);
		passwordTextBox.sendKeys(password);
		getLoginButton().click();

	}

}
