package tanuja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ElementRepository.Cart;
import ElementRepository.GiftCards;
import ElementRepository.Login;
import ElementRepository.Order_Checkout;
import GenericLibrary.BaseClass;

public class TC02_BuyGiftCardProFromCartCOD extends BaseClass{
	@Test
	public void buyGCPro() {
		Login ln=new Login(driver);
		ln.getLoginlink().click();
		ln.getEmailTextBox().clear();
		ln.getEmailTextBox().sendKeys("sonawaletanuja55@gmail.com");
		ln.getPasswordTextBox().clear();
		ln.getPasswordTextBox().sendKeys("Tanuja@0803");
		ln.getLoginButton().click();
		ln.getGiftcards().click();
		
		GiftCards gc=new GiftCards(driver);
		Select s1=new Select(gc.getProOrder());
		s1.selectByIndex(3);
		Select s2=new Select(gc.getProSize());
		s2.selectByVisibleText("12");

		driver.findElement(By.linkText("$5 Virtual Gift Card")).click();
		gc.getProName().sendKeys("Sayali");
		gc.getProEmail().sendKeys("sayali12@gmail.com");
		gc.getsName().clear();
		gc.getsName().sendKeys("Saloni");
		gc.getMsg().sendKeys("With love");
		gc.getAddToCart().click();
		System.out.println("Add to cart");
		gc.getShoppingCartlink().click();
		System.out.println("Shopping cart");
		driver.navigate().refresh();
		
		Cart cart=new Cart(driver);
		cart.getCheckbox().click();
		cart.getCheckoutButton().click();
		
		Order_Checkout order=new Order_Checkout(driver);
		order.getBillingcontinueButton().click();
		order.getPaymentMethodCODRadioButton().click();
		order.getPaymentMethodContinueButton().click();
		order.getPaymentInfoContinueButton().click();
		order.getConfirmButton().click();
		
	}
}
