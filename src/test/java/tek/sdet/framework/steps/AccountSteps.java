package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class AccountSteps extends CommonUtility {
	
	
	
	
	POMFactory factory = new POMFactory();
	
	
	
	//------------------------------------------@accountPageScenario1----------------------------
	
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
		waitTillPresence(factory.accountPage().personalUpdateBtn);
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
	
	
	
	//------------------------------------------@accountPageScenario2----------------------------
	
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
	
	
//------------------------------------------@accountPageScenario3---------------------------------------------------------
	
	
	
	
	@And("User click on Add a payment method link")
	public void UserClickOnAddAPaymentMethodLink()
	{
		
		clickElementWithJS(factory.accountPage().addPaymentMethod);
		//click(factory.accountPage().addPaymentLink);
		logger.info("User click on Add Payment link");
	}
	
	@And("User fill Debit or credit card information")
	public void UserFillDebitOrCreditCardInformation(DataTable dataTable)
	{
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().cardNumberInput, data.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOnCardInput,data.get(0).get("nameOnCard"));
		selectByValue(factory.accountPage().expirationMonthInput,data.get(0).get("expirationMonth"));
		selectByValue(factory.accountPage().expirationYearInput,data.get(0).get("expirationYear"));
		sendText(factory.accountPage().securityCodeInput,data.get(0).get("securityCode"));
		logger.info("User put Debit or Credit Card Informations");
	}
	
	@And("User click on Add your card button")
	public void UserClickOnAddYourCardButton()
	{
		click(factory.accountPage().paymentSubmitBtn);
		logger.info("User click on add your card button");
	}
	
	@Then("a message should be displayed ‘Payment Method added successfully’")
	public void MessageShouldBeDisplayedPaymentAddSuccessfully()
	{
		waitTillPresence(factory.accountPage().paymentAddSuccessfully);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentAddSuccessfully));
		logger.info("good to go for updating password");
	}
	
	
	//------------------------------------------@accountPageScenario4----------------------------
	
	
	
	@And("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection()
	{
		waitTillPresence(factory.accountPage().paymentSelectedAccount);							// you have to make sure to chose the correct card change the locator of paymentSelectedAccout
		click(factory.accountPage().paymentSelectedAccount);
		logger.info("User click on existing payment add card");
		click(factory.accountPage().editButtonOfPayment);
		logger.info("User click on edit option of card 'which was missing step from Test Case' ");
	}
	
	@And("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable)
	{
		List<Map<String, String>> data1 = dataTable.asMaps(String.class, String.class);
		clearRow(factory.accountPage().cardNumberInput);
		sendText(factory.accountPage().cardNumberInput,data1.get(0).get("cardNumber"));
		clearRow(factory.accountPage().nameOnCardInput);
		sendText(factory.accountPage().nameOnCardInput,data1.get(0).get("nameOnCard"));
		selectByValue(factory.accountPage().expirationMonthInput,data1.get(0).get("expirationMonth"));
		selectByValue(factory.accountPage().expirationYearInput,data1.get(0).get("expirationYear"));
		clearRow(factory.accountPage().securityCodeInput);
		sendText(factory.accountPage().securityCodeInput,data1.get(0).get("securityCode"));
		logger.info("user updated cardNumber, Name, ExpirationMonth,Year and Securitycode");
	}
	
	@And("user click on Update Your Card button")
	public void userClickOnUpdateYourCardbutton()
	{
		click(factory.accountPage().paymentSubmitBtn);
		logger.info("User click on Update your Card button");
	}
	
	@Then("a message should be displayed 'Payment Method updated Successfully'")
	public void messageDisplayedPaymentUpdatedSuccessfully()
	{
		waitTillPresence(factory.accountPage().paymentUpdatedSuccessfully);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentUpdatedSuccessfully));
		logger.info("Message displayed PaymentMethod Updated Successfully");
		
		
	}
	
	
//------------------------------------------@accountPageScenario5-----------------------------------------------------------------

	
	@And("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() throws InterruptedException
	{
		waitTillPresence(factory.accountPage().paymentSelectedAccount);
		click(factory.accountPage().paymentSelectedAccount);
		waitTillPresence(factory.accountPage().removePaymentbutton);													// if you run this test case the Credit Card will remove
		click(factory.accountPage().removePaymentbutton);																// I have problem how to validate when a card is removed
		logger.info("user Click on remove option ");
	}
	
	@Then("payment details should be removed")
	public void paymentdetailsShouldBeRemoved() throws InterruptedException
	{
		Thread.sleep(3000);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentSelectedAccount));
		logger.info("payment details should be removed");
	}
	
	
	
	//------------------------------------------@accountPageScenario6----------------------------
	
	
	
	
	@And("User click on Add address option")
	public void userClickOnAddAddressOption()
	{
		click(factory.accountPage().addNewAddressButton);
		logger.info("");
	}
	
	@And("user fill new address form with below information")
	public void userFillNewAddressFormWithBleowInformation(DataTable dataTable)
	{
		List<Map<String, String>> data2	= dataTable.asMaps(String.class, String.class);
		selectByValue(factory.accountPage().countryDropdown,data2.get(0).get("country"));
		doubleClick(factory.accountPage().fullNameInput);
		ctrlA(factory.accountPage().fullNameInput);
		sendText(factory.accountPage().fullNameInput,data2.get(0).get("fullName"));
	
		doubleClick(factory.accountPage().phoneNumberInput);	// I create a method  'doubleClick' on common utitlity
		ctrlA(factory.accountPage().phoneNumberInput);
		sendText(factory.accountPage().phoneNumberInput,data2.get(0).get("phoneNumber"));
		
		doubleClick(factory.accountPage().streetAddressInput);
		ctrlA(factory.accountPage().streetAddressInput);
		sendText(factory.accountPage().streetAddressInput,data2.get(0).get("streetAddress"));
		
		doubleClick(factory.accountPage().apartmentInput);
		ctrlA(factory.accountPage().apartmentInput);
		sendText(factory.accountPage().apartmentInput,data2.get(0).get("apt"));
		
		doubleClick(factory.accountPage().cityInput);
		ctrlA(factory.accountPage().cityInput);
		sendText(factory.accountPage().cityInput,data2.get(0).get("city"));
		
		selectByValue(factory.accountPage().stateOptions,data2.get(0).get("state"));
		
		doubleClick(factory.accountPage().zipcodeInput);
		ctrlA(factory.accountPage().fullNameInput);
		sendText(factory.accountPage().zipcodeInput,data2.get(0).get("zipCode"));
		
		logger.info("User fill new addres form with above information");
	}
	
	@And("User click Add Your Address button")
	public void userClickAddYourAddressButton()
	{
		click(factory.accountPage().addYourAddressBtn);
		logger.info("");
	}
	
	@Then("a message should be displayed ‘Address Added Successfully’")
	public void messageShouldBeDisplayedAddressAddedSuccessfully() throws InterruptedException
	{
		//Thread.sleep(3000);
		waitTillPresence(factory.accountPage().messageAddressAddedSuccess);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().messageAddressAddedSuccess));
		logger.info("");
	}
	
	
	//------------------------------------------@accountPageScenario7----------------------------
	
	
	
	
	
	
	@And("User click on edit address option")
	public void userClickOnEditAddressOption()
	{
		click(factory.accountPage().editAddressBtn);
		logger.info("User click on edit address option");
	}
	
	@And("User click update Your Address button")
	public void userClickUpdateYourAddButton()
	{
		click(factory.accountPage().updateAddressBtn);
		logger.info("User click update your Address button");
	}
	
	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void messageShouldBeDisplayedAddUpdatedSuccessfully() throws InterruptedException
	{
		//Thread.sleep(3000);
		waitTillPresence(factory.accountPage().addressUpdatedSuccessfully);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addressUpdatedSuccessfully));
		logger.info("message displyed address updated successfully");
	}
	
	
	//------------------------------------------@accountPageScenario8----------------------------
	
	// if you run this case make sure you pointing the existing address
	
	@And("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() 
	{
		click(factory.accountPage().removeAddressBtn);
		logger.info("User click on remove option of Address section");          
	}
	
	
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() 
	{
		Assert.assertTrue(isElementDisplayed(factory.accountPage().editAddressBtn));
		logger.info("Address details should be removed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
