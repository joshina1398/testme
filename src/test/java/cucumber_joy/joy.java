package cucumber_joy;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class joy {
	

	@Given("^i have some cakes$")
	public void i_have_some_cakes() throws Throwable {
	   System.out.println("given");
		// Write code here that turns the phrase above into concrete actions

	}

	@When("^i wait for some hour$")
	public void i_wait_for_some_hour() throws Throwable {
		   System.out.println("when");  // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^my cakes will disppear$")
	public void my_cakes_will_disppear() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		   System.out.println("then");
	}



}
