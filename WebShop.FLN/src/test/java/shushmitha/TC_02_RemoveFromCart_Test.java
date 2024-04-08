package shushmitha;

import org.testng.annotations.Test;

import ElementRepository.Books;
import ElementRepository.Cart;
import ElementRepository.Login;
import GenericLibrary.BaseClass;

public class TC_02_RemoveFromCart_Test extends BaseClass{

	@Test
	
	public void TC_02_Test() {
		Login lp = new Login(driver);	
		lp.Login_Actions("shushmithagowda2000@gmail.com", "Shushmitha@2029");
		lp.getBooksLink().click();
		Books book = new Books(driver);
		book.getClickOnAddtocartButton().click();
		lp.getShoppingCartlink().click();
		Cart cart = new Cart(driver);
		cart.getRemoveCheckBox().click();
		cart.getUpdateShoppingCart().click();
	}
}
