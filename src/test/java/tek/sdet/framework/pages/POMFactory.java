package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory extends BaseSetup 
{
	
    private RetailHomePage homePage;      // declaration of an object
    private RetailSignInPage signInPage;
    private RetailAccountPage accountPage;
    private RetailOrderPage orderPage;
    

    public POMFactory() 
    {
        this.homePage = new RetailHomePage();      // initializing inside the constructor
        this .signInPage = new RetailSignInPage();
        this .accountPage = new RetailAccountPage();
        this.orderPage = new RetailOrderPage();
        
        
       
    }
    
    

    public RetailHomePage homePage()       // access the object of the class
    {
        return this.homePage;
    }
    
    
     
    public RetailSignInPage signInPage()       // access the object of the class
    {
        return this.signInPage;
    }
    
    
    public RetailAccountPage accountPage()       // access the object of the class
    {
        return this.accountPage;
    }

    
    public RetailOrderPage orderPage()       // access the object of the class
    {
        return this.orderPage;
    }
}