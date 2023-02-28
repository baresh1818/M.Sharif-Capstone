package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class AccountSteps extends CommonUtility {
	
	
	
	
	POMFactory factory = new POMFactory();
	
	
	
	
	@When("User click on Account option")
	public void UserClickOnAccountOption()
	{
		click(factory.accountPage().accountOption);
		logger.info("User click on account options");
	}
	
	@And("User update Name {string} and Phone {string}")
	public void UserUpdateNameAndPhone(String nameV, String phoneV )
	{
		clearRow(factory.accountPage().accountNameInput);
		sendText(factory.accountPage().accountNameInput,nameV);
		clearRow(factory.accountPage().phoneInput);
		sendText(factory.accountPage().phoneInput,phoneV);
		logger.info("User enter name and phone number");
	}
	
	@And("User click on Update button")
	
	public void UserClickOnUpdateButton()
	{
		
		click(factory.accountPage().personalUpdateBtn);
		logger.info("User click on update button");
	}
	
	
	
	@Then("User profile information should be updated")
	public void UserProfileInformationShouldBeUpdated()
	{
		waitTillPresence(factory.accountPage().messageUpdated);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().messageUpdated));
		logger.info("good to go");
	}
	
	
	
	
	//------------------------------------------scenario2 of Account Page----------------------------
	
	@And("User enter below information")
	public void UserEnterBelowInformation(DataTable datatable)
	{
		List<Map<String, String>> data = datatable.asMaps(String.class, String.class);
		sendText(factory.accountPage().prePassIn, data.get(0).get("previousPassword"));
		sendText(factory.accountPage().newPassIn, data.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmPassIn, data.get(0).get("confirmPassword"));
		logger.info("User put new Password");
	}
	
	
	@And("User click on Change Password button")
	public void UserClickOnChangePasswordButton()
	{
		waitTillPresence(factory.accountPage().changePasswordBtn);
		click(factory.accountPage().changePasswordBtn);
		logger.info("User click on change Password Button");
	}
	
	
	@Then("a message should be displayed ‘Password Updated Successfully’")
	public void aMessageShouldBeDisplayedPasswordUpdatedSuccessfully() 
	{
		waitTillPresence(factory.accountPage().messageSuccfully);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().messageSuccfully));
		logger.info("good to go for updating password");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
