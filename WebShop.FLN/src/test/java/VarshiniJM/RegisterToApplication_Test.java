package VarshiniJM;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import ElementRepository.Login;
import GenericLibrary.BaseClass;
import ElementRepository.Register;

public class RegisterToApplication_Test extends BaseClass
{
	
	//BasePage obj=new BasePage(driver);
	
	//BaseClass base=new BaseClass();
	
	@Test
	public void Register()
	{
		Login loginObject=new Login(driver);
		loginObject.getRegisterlink().click();
		//loginObject.getLoginlink().click();
		Register regObj=new Register(driver);
		regObj.getGenderRadioButton().click();
		regObj.getFirstNameTextBox().sendKeys("Varshini");
		regObj.getLastNameTextBox().sendKeys("JM");
		regObj.getEmailTextBox().sendKeys("nehal@gmail.com");
		regObj.getPasswordTextBox().sendKeys("nehal@123");
		regObj.getConfirmPasswordTextBox().sendKeys("nehal@123");
		regObj.getRegisterButton().click();
		
		String confirmText = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]")).getText();
		Reporter.log(confirmText,true);
		
	}
}
