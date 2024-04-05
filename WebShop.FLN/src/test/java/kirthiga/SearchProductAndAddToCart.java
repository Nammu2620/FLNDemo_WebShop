package kirthiga;

import org.testng.annotations.Test;

import ElementRepository.Login;
import ElementRepository.SearchProduct_Addtocart;
import GenericLibrary.BaseClass;

public class SearchProductAndAddToCart extends BaseClass {

	@Test
	public void searchAndAdd() {
	Login lg=new Login(driver);
	lg.Login_Actions("kirthigagnanasekar2001@gmail.com","Keerthika@2505");
	
	SearchProduct_Addtocart sa=new SearchProduct_Addtocart(driver);
	sa.getSearchBar().sendKeys("laptop");
	sa.getSearchButton().click();
	
	sa.getLap_AddToCart().click();
	sa.getShoppingCartlink().click();
	
	sa.getQuantityTB().clear();
	sa.getQuantityTB().sendKeys("2");
	
	sa.getUpdateCartButton().click();
	
	sa.getRemoveLap().click();
	sa.getUpdateCartButton().click();
}
}

