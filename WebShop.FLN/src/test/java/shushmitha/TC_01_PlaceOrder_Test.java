package shushmitha;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ElementRepository.Cart;
import ElementRepository.Computers;
import ElementRepository.Login;
import ElementRepository.Order_Checkout;
import GenericLibrary.BaseClass;

public class TC_01_PlaceOrder_Test extends BaseClass {

	@Test
	public void TC_01_Test(){
		Login lp = new Login(driver);	
		lp.Login_Actions("shushmithagowda2000@gmail.com", "Shushmitha@2029");
		lp.getComputerLink().click();
		Computers computerpage = new Computers(driver);
		computerpage.getDesktopsPage().click();
		computerpage.getExpensiveComputerCartButton().click();
		computerpage.getExpensiveComputerPageAddToCart().click();
		lp.getShoppingCartlink().click();
		Cart cart = new Cart(driver);
		cart.getCheckbox().click();
		cart.getCheckoutButton().click();
		Order_Checkout  checkOutPage = new Order_Checkout(driver);
		Select sel = new Select(checkOutPage.getBillingAddressdropdown());
		sel.selectByVisibleText("New Address");
		checkOutPage.getFirstNameTextBox().clear();
		checkOutPage.getFirstNameTextBox().sendKeys("Shushmitha");
		checkOutPage.getLastNameTextBox().clear();
		checkOutPage.getLastNameTextBox().sendKeys("Gowda");
		checkOutPage.getEmailAddressTextBox().clear();
		checkOutPage.getEmailAddressTextBox().sendKeys("shushmithashush@gmail.com");
		Select sel1 = new Select(checkOutPage.getCountrydropdown());
		sel1.selectByValue("41");
		checkOutPage.getCityTextBox().sendKeys("Bangalore");
		checkOutPage.getAddress1TextBox().sendKeys("Nelamangala");
		checkOutPage.getZipCodeTextBox().sendKeys("562123");
		checkOutPage.getPhoneNumberTextBox().sendKeys("7874559651");
		checkOutPage.getBillingcontinueButton().click();
		checkOutPage.getShippingContinueButton().click();
		checkOutPage.getShippingMethodRadioButton1().click();
		checkOutPage.getShippingMethodContinueButton().click();
		checkOutPage.getPaymentMethodCODRadioButton().click();
		checkOutPage.getPaymentMethodContinueButton().click();
		checkOutPage.getPaymentInfoContinueButton().click();
		checkOutPage.getConfirmButton().click();
		
	}
}
