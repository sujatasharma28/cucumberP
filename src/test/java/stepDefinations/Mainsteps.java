package stepDefinations;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Mainsteps {
	@Given("User is on Netbanking landing page")
	public void user_is_on_netbanking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User landed on netbanking page");
	}
	
	@Given("User is on practice landing page")
	public void user_is_on_practice_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("User is on practice page");
	}
	
	@When("User login into application")
	public void user_login_into_application(List<String> data) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(data.get(0));
	    System.out.println(data.get(1));
	    System.out.println(data.get(2));
	    System.out.println(data.get(3));
	    
	}

//	@When("User login into application with {string} and password {string}")
//		public void user_login_into_application_with_and_password(String username, String password) {
//		    // Write code here that turns the phrase above into concrete actions
//		System.out.println("User login into the application :"+ username + " and the password:"+ password);
//		}
	
	@When("^User login into application with (.+) and password (.+)$")
	public void user_login_into_application_with_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	System.out.println("User login into the application :"+ username + " and the password:"+ password);
	}
	
	@Then("Home page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("home page is displayed");
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cards are displayed");
	}

	@Given("setup the enteries in the database")
	public void setupEnteries() {
		System.out.println("******************************************");
		System.out.println("setup the enteries in the database");
	}
	
	@When("launch the browser from config variable")
    public void browserConfig() {
		System.out.println("launch the browser from config variable");
	}
	@Then("hit the homepage url of banking site")
    public void homepageURL() {
		System.out.println("hit the homepage url of banking site");
	}
	
	
}
