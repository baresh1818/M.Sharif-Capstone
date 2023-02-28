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
	
	
	
	
	
	
	
	
	
	
	

}
