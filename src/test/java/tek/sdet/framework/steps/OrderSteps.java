package tek.sdet.framework.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class OrderSteps extends CommonUtility {
	
	
	POMFactory factory = new POMFactory();
	
	
//------------------------------------------------orderPageScenario1---------------------------------------------------------------------------------------
	
	
	@And("User click on Orders section")
	public void userClickOnOrdersSection() 
	{
		click(factory.orderPage().orderLinkBtn);
		logger.info("user click on orders section");
	}
	
	@And("User click on first order in list")
	public void userClickOnFirstOrderInList() 
	{
		click(factory.orderPage().showDetailOrder);
		logger.info("user click on first order in List");
	}
	
	@And("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() 
	{
		click(factory.orderPage().cancelOrderBtn);
		logger.info("user click on cancel the order button");
	}
	
	@And("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReasonBoughtWrongItem(String value) 
	{
		selectByVisibleText(factory.orderPage().cancelReasonDropDown,value);
		logger.info("user select the cancelation reason");
	}
	
	@And("User click on Cancel Order button")
	public void userClickOnCancelOrderButton()
	{
		click(factory.orderPage().cancelOrderSubmitBtn);
		logger.info("user click on cancel order button");
	}
	
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled(String value) 
	{
	   waitTillPresence(factory.orderPage().messageOrderCancelled);
	   Assert.assertTrue(isElementDisplayed(factory.orderPage().messageOrderCancelled));			// we have to import the Assert from junit     (import org.junit.Assert;)
		String actualMessage= factory.orderPage().messageOrderCancelled.getText();
		String expectedMessage= "Your Order Has Been Cancelled";
		Assert.assertEquals(expectedMessage, actualMessage);
		logger.info("cancelation message should be displayed");
	}
	
	
	
//------------------------------------------------orderPageScenario2---------------------------------------------------------------------------------------
	
	
	@And("User click on Return Items button")
	public void userClickOnReturnItemButton() throws InterruptedException
	{
		//Thread.sleep(2000);
		click(factory.orderPage().returnItemBtn);
		logger.info("user click on Retrun Item button");
	}
	
	@And("User select the Return Reason {string}")
	public void userSelectTheReturnReasonItemDamaged(String value)
	{
		selectByVisibleText(factory.orderPage().reseaonReturnDropDown, value);
		logger.info("User select the Return Reason 'Item damaged");
	}
	
	@And("User select the drop off service {string}")
	public void userSelectTheDropOffServiceFedex(String value)
	{
		selectByVisibleText(factory.orderPage().dropOffOptDropDown,value);
		logger.info("User select the drop off service 'FedEx'");
	}
	
	@And("User click on Return Order button")
	public void userClickOnReturnOrderButton()
	{
		click(factory.orderPage().returnOrderSubmitBtn);
		logger.info("User click on Return Order button");
	}
	
	@And("a return message should be displayed {string}")
	public void returnMessageShouldBeDisplayed(String value)
	{
		waitTillPresence(factory.orderPage().messageReturnSuccessfully);
		Assert.assertTrue(isElementDisplayed(factory.orderPage().messageReturnSuccessfully));		
		String actualMessage= factory.orderPage().messageReturnSuccessfully.getText();
		String expectedMessage= value;
		Assert.assertEquals(expectedMessage, actualMessage);
		logger.info("a cancelation message should be displayed 'Return was successful'");
	}
	
	
//------------------------------------------------orderPageScenario3---------------------------------------------------------------------------------------
	
	
	@And("User click on Review button")
	public void userClickOnReviewButton()
	{
		click(factory.orderPage().reviewButton);
		logger.info("user Click on review button");
	}
	
	@And("User write Review headline {string} and {string}")
	public void userWriteReviewHealineAndReviewText(String value, String value1)
	{
		waitTillPresence(factory.orderPage().reviewHeadlineInput);
		sendText(factory.orderPage().reviewHeadlineInput,value);
		waitTillPresence(factory.orderPage().reviewDescriptions);
		sendText(factory.orderPage().reviewDescriptions,value1);
		logger.info("User Write review message");
	}
	
	@And("User click Add your Review button")
	public void userClickAddYourReviewButton()
	{
		click(factory.orderPage().addReviewButton);
		logger.info("User click Add your Review Button");
	}
	
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShoudBeDisplayed(String value) throws InterruptedException
	{
		Thread.sleep(5000);
		boolean str1 = isElementDisplayed(factory.orderPage().messageReviewAddSuccessfully);
		String actual = factory.orderPage().messageReviewAddSuccessfully.getText();
		String expected = value;
		Assert.assertEquals(expected, actual);
		logger.info("A review Message Should be Displayed your review was added successfully");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
