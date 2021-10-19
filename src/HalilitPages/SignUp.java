package HalilitPages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



import org.openqa.selenium.WebElement;

public class SignUp {


	@FindBy (how = How.ID,using = "customer_full_name")
	static WebElement user ;
	@FindBy (how = How.ID,using = "customer_email")
	static WebElement email ;
	@FindBy (how = How.ID,using = "customer_mobile_phone")
	static WebElement phone ;
	@FindBy (how = How.LINK_TEXT , using ="\u05D4\u05EA\u05D7\u05D1\u05E8\u05D5\u05EA")
	static WebElement login_butn ;
	
	
}
