package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLibrary.BasePage;

public class Computers extends BasePage {


	public Computers(WebDriver driver) {
		super(driver);
	}
	@FindBy(partialLinkText = "Desktops")
	private WebElement desktopsPage;
	
	@FindBy(xpath = "//a[text()='Build your own expensive computer']/../../div[3]/div[2]/input")
	private WebElement expensiveComputerCartButton;

	@FindBy(xpath = "//h1[contains(text(),'expensive computer')]/../../div[8]/div/input[2]")
	private WebElement expensiveComputerPageAddToCart;

	public WebElement getDesktopsPage() {
		return desktopsPage;
	}

	public WebElement getExpensiveComputerCartButton() {
		return expensiveComputerCartButton;
	}

	public WebElement getExpensiveComputerPageAddToCart() {
		return expensiveComputerPageAddToCart;
	}

}
