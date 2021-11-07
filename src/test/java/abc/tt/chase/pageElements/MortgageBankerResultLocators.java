package abc.tt.chase.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class MortgageBankerResultLocators {
	
	//Mortgage
	@FindBy(xpath="//a[contains(text(),'Learning Center')]")
		public WebElement mPage;

	//Home Lending Advisor
	@FindBy(xpath="//a[contains(text(),'Chase Home Lending Advisor')]")
		public WebElement laPage;
	
	//Searchbar 
	@FindBy(xpath="//input[@id='q']")
	public WebElement sbPage;
	
	//Searchbutton
	@FindBy(xpath="//button[@type='submit']")
	public WebElement sbbPage;		
	
	
	//Item page should have a Home Lending Advisor
	@FindBy(xpath="//div[contains(text(),'NMLS ID:')]")
	public WebElement verifymaPage;
	
}