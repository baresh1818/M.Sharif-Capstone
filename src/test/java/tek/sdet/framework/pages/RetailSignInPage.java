package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
	
	
	
	
	public RetailSignInPage() 
    {
    	PageFactory.initElements(getDriver(), this);
    }
	
	
	
	
	
	@FindBy(id="signinLink")
	public WebElement signInButton;
	
	
	@FindBy(id="email")
	public WebElement emailInput;
	
	
	@FindBy(id="password")
	public WebElement passwordInput;
	
	@FindBy(id="loginBtn")
	public WebElement loginButton;
	
	@FindBy(xpath="//a[@id='newAccountBtn']")
	public WebElement CreateNewAccountBtn;
	
	@FindBy(id="nameInput")
	public WebElement nameInput;
	
	
	@FindBy(id="emailInput")
	public WebElement emailIn;
	
	
	@FindBy(id="passwordInput")
	public WebElement passwordIn;
	
	
	@FindBy(id="confirmPasswordInput")
	public WebElement confpassInput;
	
	
	@FindBy(id="signupBtn")
	public WebElement signUpButton;
	
	
	@FindBy(xpath="//a[@id='accountLink']")
	public WebElement accountLink;
	
	
	
	

}
