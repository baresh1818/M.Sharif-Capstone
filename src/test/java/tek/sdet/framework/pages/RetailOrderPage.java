package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	
	
	
	
	  public RetailOrderPage() 
	  {     
	    	
	    	PageFactory.initElements(getDriver(), this);
	  }
	  
	  
	  @FindBy(xpath="//a[@id='orderLink']")
	    public WebElement orderLinkBtn;
	  
	  @FindBy(xpath="//p[normalize-space()='Show Details']")
	    public WebElement showDetailOrder;
	  
	  @FindBy(xpath="//button[@id='cancelBtn']")
	    public WebElement cancelOrderBtn;
	  
	  @FindBy(xpath="//select[@id='reasonInput']")
	    public WebElement cancelReasonDropDown;
	  
	  @FindBy(xpath="//button[@id='orderSubmitBtn']")
	    public WebElement cancelOrderSubmitBtn;
	  
	  @FindBy(xpath="//p[normalize-space()='Your Order Has Been Cancelled']")
	    public WebElement messageOrderCancelled;
	  
	  @FindBy(xpath="//button[@id='returnBtn']")
	  public WebElement returnItemBtn;
	  
	  @FindBy(xpath="//select[@id='reasonInput']")
	  public WebElement reseaonReturnDropDown;
	  
	  @FindBy(xpath="//select[@id='dropOffInput']")
	  public WebElement dropOffOptDropDown;
	  
	  @FindBy(xpath="//button[@id='orderSubmitBtn']")
	  public WebElement returnOrderSubmitBtn;
	  
	  @FindBy(xpath="//div[@class='return__confirm-message']")
	  public WebElement messageReturnSuccessfully;
	  
	  @FindBy(xpath="//button[@id='reviewBtn']")
	  public WebElement reviewButton;
	  
	  @FindBy(xpath="//input[@id='headlineInput']")
	  public WebElement reviewHeadlineInput;
	  
	  @FindBy(xpath="//textarea[@id='descriptionInput']")
	  public WebElement reviewDescriptions;
	  
	  @FindBy(xpath="//button[@id='reviewSubmitBtn']")
	  public WebElement addReviewButton;
	  
	  @FindBy(xpath="//div[contains(text(),'Your review was added successfully')]")
	  public WebElement messageReviewAddSuccessfully;
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
