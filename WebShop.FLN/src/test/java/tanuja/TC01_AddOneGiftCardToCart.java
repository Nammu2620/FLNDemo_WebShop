package tanuja;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ElementRepository.GiftCards;
import ElementRepository.Login;
import GenericLibrary.BaseClass;

public class TC01_AddOneGiftCardToCart extends BaseClass{
	@Test
	public void addGCToCart() {
		Login login=new Login(driver);
		login.getLoginlink().click();
		login.getEmailTextBox().sendKeys("sonawaletanuja55@gmail.com");
		login.getPasswordTextBox().sendKeys("Tanuja@0803");
		login.getLoginButton().click();
		login.getGiftcards().click();
		
		GiftCards gc=new GiftCards(driver);
		Select s1=new Select(gc.getProOrder());
		s1.selectByIndex(1);
		Select s2=new Select(gc.getProSize());
		s2.selectByVisibleText("8");
		
		driver.findElement(By.linkText("$5 Virtual Gift Card")).click();
		gc.getProName().sendKeys("Sayali");
		gc.getProEmail().sendKeys("sayali12@gmail.com");
		gc.getsName().clear();
		gc.getsName().sendKeys("Saloni");
//		gc.getsEmail().clear();
//		gc.getsEmail().sendKeys("saloniD123@gmail.com");
		gc.getMsg().sendKeys("With love");
		gc.getAddToCart().click();
	}
	
}
