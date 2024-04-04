package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLibrary.BasePage;

public class Register extends BasePage{

	public Register(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
/*========Finding Login Page elements using FindBy annotations===========*/
	
	@FindBy(id = "gender-female")
	private WebElement genderRadioButton;
	
	@FindBy(id = "FirstName")
	private WebElement firstNameTextBox;
	
	@FindBy(id = "LastName")
	private WebElement lastNameTextBox;
	
	@FindBy(id = "Email")
	private WebElement emailTextBox;
	
	@FindBy(id = "Password")
	private WebElement passwordTextBox;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPasswordTextBox;
	
	@FindBy(id = "register-button")
	private WebElement registerButton;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	
/*=========Giving Getters Methods for Located Elements=====================*/

	public WebElement getGenderRadioButton() {
		return genderRadioButton;
	}

	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}

	public WebElement getLastNameTextBox() {
		return lastNameTextBox;
	}

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}

	public WebElement getConfirmPasswordTextBox() {
		return confirmPasswordTextBox;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}
	
}
