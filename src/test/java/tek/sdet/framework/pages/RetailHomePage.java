package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	
	
	
    public RetailHomePage() 
    {
    	PageFactory.initElements(getDriver(), this);
    }
    
    
    @FindBy(linkText = "TEKSCHOOL")  
    public WebElement tekschoolLogo;
    
    @FindBy(id = "searchInput")
    public WebElement searchBarInput;
    
    @FindBy(id = "searchBtn")
    public WebElement searchButton;
    
    @FindBy(id ="signinLink") 
    public WebElement signInOption;
    
    @FindBy(xpath ="//img[contains(@alt,'Pokemon')]")
    public WebElement pokemonImage;
    
    @FindBy(xpath ="//a[text()='Account']")
    public WebElement accountOption;
    
    @FindBy(xpath="//div[@class='sidebar_content-item']//span")     
    public List<WebElement> allSectionItems;						
    
    @FindBy(xpath="//select[@id='search']")
    public WebElement allDepartmentDropDown;
    
    @FindBy(xpath="//input[@id='searchInput']")
    public WebElement searchInput;
    
    @FindBy(xpath="//button[@id='searchBtn']")
    public WebElement searchBtn;
    
    @FindBy(xpath="//img[@alt='Kasa Outdoor Smart Plug']")
    public WebElement Item;
    
    @FindBy(xpath="//select[@class='product__select']")
    public WebElement quantitySelction;
    
    @FindBy(xpath="//span[normalize-space()='Add to Cart']")
    public WebElement addToCart;
    
    @FindBy(xpath="//span[@id='cartQuantity']")
    public WebElement cartQuantity;
    
    @FindBy(xpath="//p[normalize-space()='Cart']")
    public WebElement cart;
    
    @FindBy(xpath="//button[@id='proceedBtn']")
    public WebElement proceedCheckOutBtn;
    
    @FindBy(xpath="//button[@id='addAddressBtn']")
    public WebElement addAddressOnCheckout;
    
    @FindBy(xpath="//select[@id='countryDropdown']")
    public WebElement countryDropDown;
    
    @FindBy(xpath="//input[@id='fullNameInput']")
    public WebElement fullNameInput;
    
    @FindBy(xpath="//input[@id='phoneNumberInput']")
    public WebElement phoneNumberInput;
    
    @FindBy(xpath="//input[@id='streetInput']")
    public WebElement streetInput;
    
    @FindBy(xpath="//input[@id='apartmentInput']")
    public WebElement apartmentInput;
    
    @FindBy(xpath="//input[@id='cityInput']")
    public WebElement cityInput;
    
    @FindBy(xpath="//select[@name='state']")
    public WebElement stateDropDown;
    
    @FindBy(xpath="//input[@id='zipCodeInput']")
    public WebElement zipCodeInput;
    
    @FindBy(xpath="//button[@id='addressBtn']")
    public WebElement AddAddresFinal;
    
    @FindBy(xpath="//button[@id='addPaymentBtn']")
    public WebElement addDebitCredit;
    
    @FindBy(xpath="//button[@id='placeOrderBtn']")
    public WebElement placeOrderBtn;
    
    @FindBy(xpath="//div[contains(text(),'Order Placed Successfully')]")
    public WebElement messageOrderPlacedSuccessfully;
    
   @FindBy(xpath="//img[@alt='Apex Legends - 1,000 Apex Coins']")
   public WebElement AppexCoinsItem;
   
   @FindBy(xpath="//div[@class='sidebar__content']//span")					
   public List<WebElement> allDepartment;
   
   @FindBy(xpath="//span[normalize-space()='All']")
   public WebElement allsectionHumburgerBtn;
   
   
    
  
 
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}