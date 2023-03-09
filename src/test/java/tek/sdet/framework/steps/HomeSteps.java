package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {
	
	
	
	POMFactory factory = new POMFactory();
	
	
	
//------------------------------------------------homePageScenario1---------------------------------------------------------------------------------------
	
	@When("User click on All section")
	public void userClickOnAllSecction()
	{
		waitTillPresence(factory.homePage().allsectionHumburgerBtn);
		click(factory.homePage().allsectionHumburgerBtn);
		logger.info("User click on All section");
	}
	
	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable)
	{
		List<List<String>> departmentsection = dataTable.asLists(String.class);			// this line of code has all data list from feature file
		List<WebElement> data = factory.homePage().allSectionItems;		// this line of code has all 5 WebElements  (remember: the WebElements should be stored as List<WebElement> homepage. 
		for(WebElement list:data)
		{
			if(list.getText().equals(departmentsection))
			{
				Assert.assertTrue(list.isDisplayed());
				logger.info("options are present in Shop by Department sidebar");
			}
		}
	}
	
//------------------------------------------------homePageScenario2---------------------------------------------------------------------------------------
	
	@And("User on {string}")
	public void userOnDepartment(String value)
	{
		List<WebElement> department = factory.homePage().allDepartment;				// in here we store all elements which is available in department
		for(WebElement elements:department)											// in here we will go to each department 
		{
			if(elements.getText().equals(value))								// in here we will get the text of each element if that text is equal with the department section
			{
				elements.click();													// then in here we will click on it
				break;
			}
		}
		logger.info("User click on each department");
	}
	
	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable)
	{
		List<List<String>> departmentSection=dataTable.asLists(String.class);      // this is dataTable list 				- which has allDepartments , Option1 and Option2
		List<WebElement> department = factory.homePage().allDepartment;			   //  this is all department     			- it has 5 department elements which is electronic, computer, smart home and etc
		
		for(int i=0; i<departmentSection.get(0).size(); i++)						
		{
			for(WebElement elements:department)									//in here we get the first element of department 	
			{
				if(elements.getText().equals(departmentSection.get(0).get(i)))	// in here we get the text of that element and it should be equal with the 0 row 1st option of dataTable  
				{
					Assert.assertTrue(elements.isDisplayed());					// in here is the above equation is true or false 
					logger.info("below options are present in department");
				}
			}
		}
		
	}
	
//------------------------------------------------homePageScenario3---------------------------------------------------------------------------------------
	
	@And("User change the category to {string}")
	public void userChangeTheCategoryToSmartHome(String department )
	{
		selectByVisibleText(factory.homePage().allDepartmentDropDown, department);
		logger.info("User Change the Category to Department");
	}
	
	@And("User search for an item {string}")
	public void userSearchForAnItemKasaoutDoorSmartPlug(String searchItem)
	{
		click(factory.homePage().searchBarInput);
		sendText(factory.homePage().searchInput,searchItem);
		logger.info("User search for an item");
	}
	
	@And("User click on Search icon")
	public void userClickonSearchIcon()
	{
		click(factory.homePage().searchBtn);
	}
	
	@And("User click on item")
	public void userClickOnItem()
	{
		click(factory.homePage().Item);
		logger.info("User click on item");
	}
	
	@When("User select quantity {string}")
	public void userSelectQuantity(String num)
	{
		selectByVisibleText(factory.homePage().quantitySelction,num);
		logger.info("user select the quantity ");
	}
	
	@And("User click add to Cart button")
	public void userClickToCartButton() 
	{
		click(factory.homePage().addToCart);
		logger.info("user click add to cart buttton ");
	}
	
	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String number) throws InterruptedException 
	{
		//Thread.sleep(3000);
		String str = getElementText(factory.homePage().cartQuantity);
		if(str.equals(number))
		{
			Assert.assertTrue(isElementDisplayed(factory.homePage().cartQuantity));
		}
		
	}
	

//------------------------------------------------homePageScenario4---------------------------------------------------------------------------------------
	
	
	
	@Then("User click on Cart option")
	public void userClickOnCartOption() 
	{
		click(factory.homePage().cart);
		logger.info("User click on Cart Option");
	}
	
	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() 
	{
		click(factory.homePage().proceedCheckOutBtn);
		logger.info("user click on proced to checkout button");
	}
	
	@Then("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() 
	{
		click(factory.homePage().addAddressOnCheckout);
		logger.info("user click add a new address link for shipping address");
	}
	
	@Then("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) throws InterruptedException 
	{   
	List<Map<String, String>> data	= dataTable.asMaps(String.class, String.class);
		selectByValue(factory.homePage().countryDropDown,data.get(0).get("country"));
		doubleClick(factory.homePage().fullNameInput);
		ctrlA(factory.homePage().fullNameInput);
		sendText(factory.homePage().fullNameInput,data.get(0).get("fullName"));
		doubleClick(factory.homePage().phoneNumberInput);																// I create a method  'doubleClick' on common utitlity
		ctrlA(factory.homePage().phoneNumberInput);																		// make sure you should not have any item on your card before you run this test case
		sendText(factory.homePage().phoneNumberInput,data.get(0).get("phoneNumber"));
		doubleClick(factory.homePage().streetInput);
		ctrlA(factory.homePage().streetInput);
		sendText(factory.homePage().streetInput,data.get(0).get("streetAddress"));
		doubleClick(factory.homePage().apartmentInput);
		ctrlA(factory.homePage().apartmentInput);
		sendText(factory.homePage().apartmentInput,data.get(0).get("apt"));
		doubleClick(factory.homePage().cityInput);
		ctrlA(factory.homePage().cityInput);
		sendText(factory.homePage().cityInput,data.get(0).get("city"));
		selectByValue(factory.homePage().stateDropDown,data.get(0).get("state"));
		doubleClick(factory.homePage().zipCodeInput);
		ctrlA(factory.homePage().zipCodeInput);
		sendText(factory.homePage().zipCodeInput,data.get(0).get("zipCode"));
		//Thread.sleep(3000);
		logger.info("user fill new address form with below informations");
	}
	
	@Then("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod()  			// Maybe my Internet is slow but I have to put 8sec time to stop 
	{
		
		waitTillPresence(factory.homePage().addDebitCredit);
		clickElementWithJS(factory.homePage().addDebitCredit);
		//click(factory.homePage().addDebitCredit);															// to run this test case you have to change the card number on feature file
		logger.info("user click add a credit card or debit card for payment method");
	}
	
	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() 
	{
		//Thread.sleep(3000);
		waitTillPresence(factory.homePage().placeOrderBtn);
		clickElementWithJS(factory.homePage().placeOrderBtn);
		//click(factory.homePage().placeOrderBtn);
		logger.info("user click on place your order");
	}
	
	@Then("a message should be displayed 'Order Placed, Thanks'")
	public void aMessageShouldBeDisplayedOrderPlacedThanks() 
	{
		waitTillPresence(factory.homePage().messageOrderPlacedSuccessfully);									// we use explicit Wait
		Assert.assertTrue(isElementDisplayed(factory.homePage().messageOrderPlacedSuccessfully));
		logger.info("message should displayed order placed thanks");
	}
	
	
	
	
	
//------------------------------------------------homePageScenario5---------------------------------------------------------------------------------------
	
	
	
	
	@And("User click on items")
	public void userClickOnItems()
	{
		click(factory.homePage().AppexCoinsItem);			// in this Scenario we only need to create one method the rest of them are already exist
		logger.info("User click on item");
	}
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
