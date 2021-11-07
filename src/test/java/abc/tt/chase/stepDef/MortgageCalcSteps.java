package abc.tt.chase.stepDef;

import cucumber.api.java.en.When;
import abc.tt.chase.pageAction.ChaseHomepageActions;
import abc.tt.chase.pageAction.MortgageCalcActions;

public class MortgageCalcSteps {

	MortgageCalcActions MortgageCalcActionsObj = new MortgageCalcActions();
	ChaseHomepageActions ChaseHomepageActionsObj = new ChaseHomepageActions();
	


	@When("^User clicks on Home Loans Icon$")
	public void user_clicks_on_Home_Loans_Icon() throws Throwable {
		System.out.println("User clicks on Home Loans Icon");
		MortgageCalcActionsObj.homeLoan();

	}

	@When("^User clicks on Get started button$")
	public void user_clicks_on_Get_started_button() throws Throwable {
		System.out.println("User clicks on Get started button");
		MortgageCalcActionsObj.getStartedBtn();

	}

	@When("^User selects Calculator on navigation bar$")
	public void user_selects_Calculator_on_navigation_bar() throws Throwable {
		System.out.println("User selects Calculator on navigation bar");
		MortgageCalcActionsObj.calculatorLink();

	}
	
	@When("^User selects Mortgage calculator image$")
	public void user_selects_Mortgage_calculator_image() throws Throwable {
		System.out.println("User selects Mortgage calculator image");
		MortgageCalcActionsObj.mortCalcImg();
	}

}