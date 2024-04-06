package kirthiga;

import org.testng.annotations.Test;

import ElementRepository.Email_Friend;
import ElementRepository.Login;
import GenericLibrary.BaseClass;

public class EmailAFriend extends BaseClass {

	@Test
	public void Emailing() {
		
		//Login
		Login lg=new Login(driver);
		lg.Login_Actions("kirthigagnanasekar2001@gmail.com", "Keerthika@2505");
		
		lg.getBooksLink().click();
		
		Email_Friend ef=new Email_Friend(driver);
		ef.getBooksLink();
		ef.getLoc_product().click();
		ef.getEmailButton().click();
		ef.getFriendEmailTextBox().clear();
		ef.getFriendEmailTextBox().sendKeys("Kirthigag25@gmail.com");
		ef.getYourEmailTextBox().clear();
		ef.getYourEmailTextBox().sendKeys("kirthigagnanasekar2001@gmail.com");
		
	}
}
