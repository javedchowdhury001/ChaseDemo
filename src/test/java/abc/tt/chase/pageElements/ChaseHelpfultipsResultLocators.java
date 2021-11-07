package abc.tt.chase.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class ChaseHelpfultipsResultLocators {
	//Customer Service
	@FindBy(xpath="//a[contains(text(),'Chase customer service')]")
		public WebElement cssPage;

	//Helpful tips videos
	@FindBy(xpath="//a[contains(text(),'More helpful tips vi')]")
		public WebElement htvPage;
	
	//Personal Banking
	@FindBy(xpath="//b[contains(text(),'Personal banking')]")
		public WebElement pbPage;
	
	//Replace your debit card
	@FindBy(xpath="//a[@data-video-details='card-replacement']")
		public WebElement rdcPage;
	
	//Verify
	@FindBy(xpath="//a[@id='cancel']")
	public WebElement verifyrdcPage;
	}
