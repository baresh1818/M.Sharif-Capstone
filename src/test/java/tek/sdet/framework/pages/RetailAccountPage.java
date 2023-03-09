package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	
	
	
	
	
	public RetailAccountPage() 
    {
    	PageFactory.initElements(getDriver(), this);
    }
	
	
	
	@FindBy(id="accountLink")
	public WebElement accountOption;
	
	@FindBy(xpath="//input[@id='nameInput']")
	public WebElement accountNameInput;
	
	
	@FindBy(xpath="//input[@id='personalPhoneInput']")
	public WebElement phoneInput;
	
	@FindBy(xpath="//button[@id='personalUpdateBtn']")
	public WebElement personalUpdateBtn;
	
	@FindBy(xpath="//div[contains(text(),'Personal Information Updated Successfully')]")
	public WebElement messageUpdated;
	
	@FindBy(xpath="//input[@id='previousPasswordInput']")
	public WebElement prePassIn;
	
	@FindBy(xpath="//input[@id='newPasswordInput']")
	public WebElement newPassIn;
	
	@FindBy(xpath="//input[@id='confirmPasswordInput']")
	public WebElement confirmPassIn;
	
	@FindBy(xpath="//button[@id='credentialsSubmitBtn']")
	public WebElement changePasswordBtn;
	
	@FindBy(xpath="//div[contains(text(),'Password Updated Successfully')]")
	public WebElement messageSuccfully;
	
	
	@FindBy(xpath="//p[@class='text-sm text-blue-700 hover:underline hover:text-red-700']")
	public WebElement addPaymentMethod;
	
	@FindBy(xpath="//button[@id='addPaymentBtn']")
	public WebElement addPaymentLink;
	
	@FindBy(xpath="//input[@id='cardNumberInput']")
	public WebElement cardNumberInput;
	
	@FindBy(xpath="//input[@id='nameOnCardInput']")
	public WebElement nameOnCardInput;
	
	@FindBy(xpath="//select[@id='expirationMonthInput']")
	public WebElement expirationMonthInput;
	
	@FindBy(xpath="//select[@id='expirationYearInput']")
	public WebElement expirationYearInput;
	
	@FindBy(xpath="//input[@id='securityCodeInput']")
	public WebElement securityCodeInput;
	
	@FindBy(xpath="//button[@id='paymentSubmitBtn']")
	public WebElement paymentSubmitBtn;
	
	@FindBy(xpath="//div[contains(text(),'Payment Method added sucessfully')]")
	public WebElement paymentAddSuccessfully;
	
	@FindBy(xpath="//p[@class='account__payment__sub-text']")
	public WebElement paymentSelectedAccount;
	
	@FindBy(xpath="//button[normalize-space()='Edit']")
	public WebElement editButtonOfPayment;
	
	@FindBy(xpath=("//div[contains(text(),'Payment Method updated Successfully')]"))
	public WebElement paymentUpdatedSuccessfully;
	
	@FindBy(xpath="//button[normalize-space()='remove']")
	public WebElement removePaymentbutton;
	
	@FindBy(xpath="//div[@class='account__address-new']")
	public WebElement addNewAddressButton;
	
	@FindBy(xpath="//select[@id='countryDropdown']")
	public WebElement countryDropdown;
	
	@FindBy(xpath="//input[@id='fullNameInput']")
	public WebElement fullNameInput;
	
	@FindBy(xpath="//input[@id='phoneNumberInput']")
	public WebElement phoneNumberInput;
	
	@FindBy(xpath="//input[@id='streetInput']")
	public WebElement streetAddressInput;

	@FindBy(xpath="//input[@id='apartmentInput']")
	public WebElement apartmentInput;
	
	@FindBy(xpath="//input[@id='cityInput']")
	public WebElement cityInput;
	
	@FindBy(xpath="//select[@name='state']")
	public WebElement stateOptions;
	
	@FindBy(xpath="//input[@id='zipCodeInput']")
	public WebElement zipcodeInput;
	
	@FindBy(xpath="//button[@id='addressBtn']")
	public WebElement addYourAddressBtn;
	
	//@FindBy(xpath="//div[contains(text(),'Address Added Successfully')]")
	//public WebElement messageAddressAddedSuccess;
	
	@FindBy(xpath="//div[@role='alert']")
	public WebElement messageAddressAddedSuccess;
	
	@FindBy(xpath="//div[@class='account__address-grid']//div[2]//div[2]//button[1]")
	public WebElement editAddressBtn;
	
	@FindBy(xpath="//button[@id='addressBtn']")
	public WebElement updateAddressBtn;
	
	@FindBy(xpath="//div[contains(text(),'Address Updated Successfully')]")
	public WebElement addressUpdatedSuccessfully;
	
	@FindBy(xpath="//div[@class='account__address-grid']//div[2]//div[2]//button[2]")
	public WebElement removeAddressBtn;
	

	
	
	
	

}
