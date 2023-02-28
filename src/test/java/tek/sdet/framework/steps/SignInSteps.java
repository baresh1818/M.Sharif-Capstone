package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.base.BaseSetup;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {
	
	
	POMFactory factory = new POMFactory();
	
	

	@When("User click on Sign in option")
	public void UserClickOnSignInOption()
	{
		click(factory.signInPage().signInButton);
		logger.info("User Signed In");
	}
	
	@And ("User enter email {string} and password {string}")
	public void UserEnterEmailAndPassword(String emailValue, String passwordValue)
	{
	
		sendText(factory.signInPage().emailInput,emailValue);
		sendText(factory.signInPage().passwordInput,passwordValue);
		logger.info("User enter email and Password");
	}
	
	@And("User click on login button")
	public void UserClickOnLoginButton()
	{
		click(factory.signInPage().loginButton);
		logger.info("User log In into Accoutn");
	}
	
	@Then("User should be logged in into Account")
	public void UserShouldBeLoggedInIntoAccount()
	{
		Assert.assertTrue(isElementDisplayed(factory.signInPage().accountLink));
		logger.info("User confimed on account page");
	}
	
//------------------------------------------------------Scenario 2---------------------------------------------------------------------------
	
	
	
	@And ("User click on Create New Account button")
	public void UserClickOnCreateNewAccountButton()
	{
		click(factory.signInPage().CreateNewAccountBtn);
		logger.info("User click on create new Account button");
	}
	
	@And ("User fill the signUp information with below data")
	public void UserFillTheSignUpInformationWithBelowData(DataTable datatable)
	{
		
		List<Map<String, String>> data = datatable.asMaps(String.class, String.class);
		
		sendText(factory.signInPage().nameInput, data.get(0).get("name"));
		sendText(factory.signInPage().emailIn, data.get(0).get("email"));
		sendText(factory.signInPage().passwordIn, data.get(0).get("password"));
		sendText(factory.signInPage().confpassInput, data.get(0).get("confirmPassword"));
		logger.info("User enter name, email, password, confirmpassword");
		
		
	}
	
	@And ("User click on SignUp button")
	public void UserClickOnSignUpButton()
	{
		click(factory.signInPage().signUpButton);
		logger.info("User Click on sign Up Button");;
	}
	
	@Then ("User should be logged into account page")
	public void UserShouldBeLoggedIntoAccountPage()
	{
		Assert.assertTrue(isElementDisplayed(factory.signInPage().accountLink));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
