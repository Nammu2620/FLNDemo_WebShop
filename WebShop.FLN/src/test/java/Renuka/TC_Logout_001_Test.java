package Renuka;

import org.testng.Reporter;
import org.testng.annotations.Test;

import ElementRepository.LogOut;
import ElementRepository.Login;
import GenericLibrary.BaseClass;

public class TC_Logout_001_Test extends BaseClass{
	
	@Test
	public void logoutApp() {
		
		Login log=new Login(driver);
		LogOut lout=new LogOut(driver);
		
		log.Login_Actions("ubalerenuka2001@gmail.com", "abcd@1234");
		Reporter.log("Logged in successfully", true);
		
		log.getBooksLink().click();
		Reporter.log("Clicked on books Category", true);
		
		lout.getComputingAndInternetBook().click();
		Reporter.log("Clicked on product link", true);
		
		lout.getAddToCartButton().click();
		Reporter.log("Clicked on Add to Cart button", true);
		
		log.getShoppingCartlink().click();
		Reporter.log("Clicked on Shopping Cart button", true);
		
		lout.getRemoveCheckBox().click();
		Reporter.log("Clicked on Remove check box", true);
		
		lout.getUpdateShoppingCart().click();
		Reporter.log("Clicked on Update Shopping Cart", true);
		
		log.getLogout().click();
		Reporter.log("Clicked on Logout", true);
		
	}
}
