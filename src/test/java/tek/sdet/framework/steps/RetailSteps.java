package tek.sdet.framework.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.*;                                           // import assertion import file
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailSteps extends CommonUtility {
	
	
	POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")      // the value should exactly match with Retail feature file
	public void userIsOnRetailWebsite()       // name of method is not important
	{
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle); 
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekschoolLogo));
		logger.info("user is on retail website");
	}
	
	
	
	
	@When ("User search for {string} item")     // in here instead of 'Pokemon' we use String
	public void userSearchForItem(String value)
	{
		sendText(factory.homePage().searchBarInput,value);
		click(factory.homePage().searchButton);
		logger.info("User searched for " + value+ "item");
		
		
	}
	
	
	@Then ("Product should be displayed")
	public void productShouldBeDisplayed()
	{
		Assert.assertTrue(isElementDisplayed(factory.homePage().pokemonImage));
		logger.info("Product is displayed");
	}
	
	
	
	
	
	
	
	
	
	

}
