package abc.tt.chase.stepDef;
import abc.tt.chase.pageAction.ChaseHomepageActions;
import abc.tt.chase.pageAction.MortgageBankerResultActions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MortgageBankerSteps {

	ChaseHomepageActions ChaseHomepageActionsObj = new ChaseHomepageActions();
	MortgageBankerResultActions MortgageBankerResultActionsObj = new MortgageBankerResultActions();

	@When("^Search for Mortgage$")
	public void search_for_Mortgage() throws Throwable {
		System.out.println("Search for Mortgage");
		MortgageBankerResultActionsObj.mPage();
	}

	@When("^Select Find a Home Lending Advisor$")
	public void select_Find_a_Home_Lending_Advisor() throws Throwable {
		System.out.println("Select Find a Home Lending Advisor");
		MortgageBankerResultActionsObj.laPage();
	}

	@When("^Select \"([^\"]*)\"$")
	public void Select_Searchbar(String HLAzipcode) throws Throwable {
		System.out.println("Select Searchbar");
		MortgageBankerResultActionsObj.HLAzipcodePage(HLAzipcode);
	}
	
	@Then("^Typin in \"([^\"]*)\"$")
	public void type_in(String HLAzipcode) throws Throwable {
		System.out.println("Select Searchbar");
		MortgageBankerResultActionsObj.HLAzipcodePage(HLAzipcode);
		


	}

}
