package abc.tt.chase.pageAction;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import abc.tt.chase.pageElements.MortgageCalcLocators;
import abc.tt.utilities.SetupDrivers;

public class MortgageCalcActions {

	MortgageCalcLocators MortgageCalcLocatorsObj;

	public MortgageCalcActions() {

		this.MortgageCalcLocatorsObj = new MortgageCalcLocators();
		PageFactory.initElements(SetupDrivers.driver, MortgageCalcLocatorsObj);
		SetupDrivers.driver.get("https://www.chase.com/");
	}

	public void ChaseHomepage() {
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		SetupDrivers.driver.manage().window().maximize();
	}

	public void homeLoan() throws Throwable {
		MortgageCalcLocatorsObj.homeLoan.click();
		Thread.sleep(2000);
	}

	public void getStartedBtn() throws Throwable {
		MortgageCalcLocatorsObj.getStartedBtn.click();
		Thread.sleep(2000);

		for (String winHandle : SetupDrivers.driver.getWindowHandles()) {
			SetupDrivers.driver.switchTo().window(winHandle);
		}

		Thread.sleep(2000);
	}

	public void calculatorLink() throws Throwable {
		MortgageCalcLocatorsObj.calculatorLink.click();
		Thread.sleep(2000);

	}

	public void mortCalcImg() throws Throwable {
		MortgageCalcLocatorsObj.mortCalcImg.click();
		Thread.sleep(2000);

	}
}
