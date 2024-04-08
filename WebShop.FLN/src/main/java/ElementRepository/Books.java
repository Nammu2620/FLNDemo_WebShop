package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLibrary.BasePage;

public class Books extends BasePage {

	public Books(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[text()=\"Computing and Internet\"]/../../../..//input")
	private WebElement clickOnAddtocartButton;

		public WebElement getClickOnAddtocartButton() {
		return clickOnAddtocartButton;
	}

}
