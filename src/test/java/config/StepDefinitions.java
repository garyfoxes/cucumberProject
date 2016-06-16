package config;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


/**
 * Created by gfox on 15/06/2016.
 */
public class StepDefinitions {
    @Before
    public void before() {
        System.out.println("In Before Cucumber Api");
    }

    @Given("^I work in latenights$")
    public void latenights() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hello There");
    }

    @When("^I meet \"([^\"]*)\"$")
    public void meetWatchMen(String name) {
        System.out.println("In When Step with name " + name);
    }

    @Then("^he drives his car$")
    public void he_drives_his_car() {
        System.out.println("In Then Step");
    }
}
