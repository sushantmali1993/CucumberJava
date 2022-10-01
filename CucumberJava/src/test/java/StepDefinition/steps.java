package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {

	@Given("I am on Login page")
	public void i_am_on_login_page() {
		System.out.println("Hello");
	}

	@When("I enters valid credentials")
	public void i_enters_valid_credentials() {

	}

	@And("I click on login button")
	public void i_click_on_login_button() {

	}

	@Then("I am logged in successfull")
	public void i_am_logged_in_successfull() {

	}

}
