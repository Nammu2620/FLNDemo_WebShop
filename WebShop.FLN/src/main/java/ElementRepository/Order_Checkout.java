package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLibrary.BasePage;

public class Order_Checkout extends BasePage{

	public Order_Checkout(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "BillingNewAddress_FirstName")
	private WebElement firstNameTextBox;
	
	@FindBy(id = "BillingNewAddress_LastName")
	private WebElement lastNameTextBox;
	
	@FindBy(id = "BillingNewAddress_Email")
	private WebElement emailAddressTextBox;
	
	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement countrydropdown;
	
	@FindBy(id = "BillingNewAddress_City")
	private WebElement cityTextBox;
	
	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement address1TextBox;
	
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement zipCodeTextBox;
	
	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement phoneNumberTextBox;
	
	@FindBy(xpath = "//div[@id='billing-buttons-container']/input")
	private WebElement billingcontinueButton;

	@FindBy(id = "billing-address-select")
	private WebElement billingAddressdropdown;

	@FindBy(xpath = "//div[@id='shipping-buttons-container']/input")
	private WebElement shippingContinueButton;
	
	@FindBy(id = "shippingoption_0")
	private WebElement shippingMethodRadioButton1;
	
	@FindBy(id = "shippingoption_1")
	private WebElement shippingMethodRadioButton2;
	
	@FindBy(id = "shippingoption_2")
	private WebElement shippingMethodRadioButton3;
	
	@FindBy(xpath = "//input[@class='button-1 shipping-method-next-step-button']")
	private WebElement shippingMethodContinueButton;
	
	@FindBy(id = "paymentmethod_0")
	private WebElement paymentMethodCODRadioButton;
	
	@FindBy(id = "paymentmethod_1")
	private WebElement paymentMethodMoneyOrderRadioButton;
	
	@FindBy(id = "paymentmethod_2")
	private WebElement paymentMethodCreditCardRadioButton;
	
	@FindBy(id = "paymentmethod_3")
	private WebElement paymentMethodPurchaseOrderRadioButton;
	
	@FindBy(xpath = "//input[@class='button-1 payment-method-next-step-button']")
	private WebElement paymentMethodContinueButton;
	
	@FindBy(xpath = "//input[@class='button-1 payment-info-next-step-button']")
	private WebElement paymentInfoContinueButton;
	
	@FindBy(xpath = "//input[@class='button-1 confirm-order-next-step-button']")
	private WebElement confirmButton;

	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}

	public WebElement getLastNameTextBox() {
		return lastNameTextBox;
	}

	public WebElement getEmailAddressTextBox() {
		return emailAddressTextBox;
	}

	public WebElement getCountrydropdown() {
		return countrydropdown;
	}

	public WebElement getCityTextBox() {
		return cityTextBox;
	}

	public WebElement getAddress1TextBox() {
		return address1TextBox;
	}

	public WebElement getZipCodeTextBox() {
		return zipCodeTextBox;
	}

	public WebElement getPhoneNumberTextBox() {
		return phoneNumberTextBox;
	}

	public WebElement getBillingcontinueButton() {
		return billingcontinueButton;
	}

	public WebElement getBillingAddressdropdown() {
		return billingAddressdropdown;
	}

	public WebElement getShippingContinueButton() {
		return shippingContinueButton;
	}

	public WebElement getShippingMethodRadioButton1() {
		return shippingMethodRadioButton1;
	}

	public WebElement getShippingMethodRadioButton2() {
		return shippingMethodRadioButton2;
	}

	public WebElement getShippingMethodRadioButton3() {
		return shippingMethodRadioButton3;
	}

	public WebElement getShippingMethodContinueButton() {
		return shippingMethodContinueButton;
	}

	public WebElement getPaymentMethodCODRadioButton() {
		return paymentMethodCODRadioButton;
	}

	public WebElement getPaymentMethodMoneyOrderRadioButton() {
		return paymentMethodMoneyOrderRadioButton;
	}

	public WebElement getPaymentMethodCreditCardRadioButton() {
		return paymentMethodCreditCardRadioButton;
	}

	public WebElement getPaymentMethodPurchaseOrderRadioButton() {
		return paymentMethodPurchaseOrderRadioButton;
	}

	public WebElement getPaymentMethodContinueButton() {
		return paymentMethodContinueButton;
	}

	public WebElement getPaymentInfoContinueButton() {
		return paymentInfoContinueButton;
	}

	public WebElement getConfirmButton() {
		return confirmButton;
	}

}
