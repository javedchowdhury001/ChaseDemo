package abc.tt.chase.stepDef;

import abc.tt.chase.pageAction.ChaseCarFinderActions;
import abc.tt.chase.pageAction.ChaseHomepageActions;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class ChaseCarFinderSteps {

	ChaseHomepageActions ChaseHomepageActionsObj = new ChaseHomepageActions();
	ChaseCarFinderActions ChaseCarFinderActionsObj = new ChaseCarFinderActions();
	
@When("^click on auto$")
	public void click_on_auto() throws Throwable {
		System.out.println("click on auto");
		ChaseHomepageActionsObj.SelectAutoButton();
}
@When("^click shop for car$")
	public void click_shop_for_car() throws Throwable {
		System.out.println("click shop for car");
		ChaseHomepageActionsObj.SelectShopCar();
}
@When("^click finance$")
	public void click_finance() throws Throwable {
		System.out.println("click shop now");
		ChaseCarFinderActionsObj.SelectCarFinanceButton();

}
@When("^click Chase dealer network$")
public void click_Chase_dealer_network() throws Throwable {
	ChaseCarFinderActionsObj.SelectCarDealButton();
}
@When("^type in \"([^\"]*)\"$")
	public void type_in(String Carzipcode) throws Throwable {
	System.out.println("Type in zipcode");

		ChaseCarFinderActionsObj.EnterCarZipcode(Carzipcode);
	}

@Then("^verify by \"([^\"]*)\" results$")
public void verify_by(String Carzipcode) throws Throwable {
    System.out.println("verify results with zipcode");
    ChaseCarFinderActionsObj.VerifyCarZipcode(Carzipcode);

}
}