package abc.tt.chase.stepDef;
import abc.tt.chase.pageAction.ChaseHomepageActions;
import abc.tt.chase.pageAction.ChaseLockUnlockHelpActions;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class ChaseLockUnlockHelpSteps {

	ChaseHomepageActions ChaseHomepageActionsObj = new ChaseHomepageActions();
	ChaseLockUnlockHelpActions ChaseLockUnlockHelpActionsObj = new ChaseLockUnlockHelpActions();
	



@When("^click videos to help you bank$")
public void click_videos_to_help_you_bank() throws Throwable {
    System.out.println();
    ChaseLockUnlockHelpActionsObj.PersonalBankHelp();
}

@When("^click personal banking link$")
public void click_personal_banking_link() throws Throwable {
	System.out.println();
    ChaseLockUnlockHelpActionsObj.PersonalBankHelp();
}

@When("^click desktop help link$")
public void click_desktop_help_link() throws Throwable {
	System.out.println();
    ChaseLockUnlockHelpActionsObj.DesktopHelp();
}

@When("^click lock and unlock your debit card$")
public void click_lock_and_unlock_your_debit_card() throws Throwable {
	System.out.println();
    ChaseLockUnlockHelpActionsObj.LockUnlockHelp();
}

@Then("^validate by x button$")
public void validate_by_x_button() throws Throwable {
	System.out.println();
    ChaseLockUnlockHelpActionsObj.LockUnlockHelpX();
}
}