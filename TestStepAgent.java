package stepDefinitionAgent;

import AutomatedTest.Calculate;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStepAgent {
	String answer;
	Double a, b, c, d, e, f;
	
	@Given("^I have a and b$")
	public void i_have_a_and_b() throws Throwable {
		a = 2.0; 
		b = 3.0;
	}

	@When("^I add two valid numbers$")
	public void i_add_two_valid_numbers() throws Throwable {
		Calculate calc = new Calculate();
		answer = calc.addStringParamGet(a, b);
	}

	@Then("^I should get positive answer$")
	public void i_should_get_positive_answer() throws Throwable {
		System.out.println("Answer =   " + answer);
	}
	
	@Given("^I have c and d$")
	public void i_have_c_and_d() throws Throwable {
		 c = 1.5; 
		 d = 1.5;
	}	
	@When("^I add two parameters$")
	public void i_add_two_parameters() throws Throwable {
		Calculate calc = new Calculate();
		answer = calc.addStringParamGet(c, d);
	}

	@Then("^I should get the correct answer$")
	public void i_should_get_the_correct_answer() throws Throwable {
		System.out.println("Answer =   " + answer);

	}

	@Given("^I have e and f$")
	public void i_have_e_and_f() throws Throwable {
		e = -2.0; 
	    f = -3.0;
	}	
	
	@When("^I add two negative numbers$")
	public void i_add_two_negative_numbers() throws Throwable {
		Calculate calc = new Calculate();
		answer = calc.addStringParamGet(e, f);
	}

	@Then("^I should get negative answer$")
	public void i_should_get_negative_answer() throws Throwable {
		System.out.println("Answer =   " + answer);

	}
	
}
