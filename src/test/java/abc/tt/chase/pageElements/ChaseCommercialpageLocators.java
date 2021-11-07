package abc.tt.chase.pageElements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ChaseCommercialpageLocators {

	
	@FindBy(xpath="//a[@name='btn_proceed']")  
	public WebElement commProcBtn;
	
	@FindBy(xpath="//a[contains(text(),'Watch now')]")
	public WebElement commWatchNow;
	
	@FindBy(xpath="//a[@name='btn_cancel']")
	public WebElement commCancBtn;

}