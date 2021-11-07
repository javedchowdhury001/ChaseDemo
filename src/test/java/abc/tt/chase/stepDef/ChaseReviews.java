package abc.tt.chase.stepDef;

import abc.tt.chase.pageAction.ChaseActions;
import abc.tt.chase.pageAction.ChaseHomepageActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChaseReviews {
	
	 ChaseHomepageActions ChaseHomepageActionsObj = new ChaseHomepageActions();
	 ChaseActions ChaseActionsObj = new ChaseActions();
	 
	 @When("^Select on Credit Cards$")
	 public void select_on_Credit_Cards() throws Throwable {
	     ChaseActionsObj.selectCC();
	 }
	 
	 @When("^Select view all rewards$")
	 public void select_view_all_rewards() throws Throwable {
	     ChaseActionsObj.selectView();
	 }

	 @When("^Select reviews$")
	 public void select_reviews() throws Throwable {
	    ChaseActionsObj.selectReviews();
	 }

	 @Then("^Validate by clicking close$")
	 public void validate_by_clicking_close() throws Throwable {
	    ChaseActionsObj.selectClose();
	 }
	 
}