package abc.tt.chase.stepDef;

import cucumber.api.java.en.Then;
import abc.tt.chase.pageAction.ChaseCommercialpageActions;
import abc.tt.chase.pageAction.ChaseHomepageActions;
import cucumber.api.java.en.When;


public class ChaseCommercialSeminarSteps {
	
	ChaseHomepageActions ChaseHomepageActionsObj = new ChaseHomepageActions();
	ChaseCommercialpageActions ChaseCommercialpageActionsObj = new ChaseCommercialpageActions();


@When("^click commercial$")
public void click_commercial() throws Throwable {
    System.out.println("click commercial");
    ChaseHomepageActionsObj.SelectCommercial();
}
    @When("^click watch now$")
    public void click_watch_now() throws Throwable {
    	System.out.println("click watch now");
    	ChaseCommercialpageActionsObj.CommWatchNow();    
}
   
    @When("^click <\"([^\"]*)\">$")
	public void click(String CommProceed) throws Throwable {
		System.out.println("click proceed");
		ChaseCommercialpageActionsObj.CommProTest(CommProceed);
}
	@Then("^validate with watch now$")
	public void validate_with_watch_now() throws Throwable {
	   System.out.println("validate with watch now");
	   ChaseCommercialpageActionsObj.CommValidation();
	}	
}