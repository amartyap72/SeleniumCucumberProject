package skeletons;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class ShoutStepDefination {
	Person saun = new Person();

@Given("Saun is {int} meter away from Lucia")
public void saun_is_meter_away_from_Lucia(Integer int1) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
saun.setDistance(int1);	
}

@When("Saun Shouts {string}")
public void saun_Shouts(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
saun.setMessage(string);
}

@Then("Lucia Listens to the message")
public void lucia_Listens_to_the_message() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	String message = saun.getMessage();
	org.junit.Assert.assertEquals("Free Coffee", message);
	

}



}
