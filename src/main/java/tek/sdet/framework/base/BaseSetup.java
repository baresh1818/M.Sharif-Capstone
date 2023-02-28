package tek.sdet.framework.base;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

//import dev.failsafe.internal.util.Durations;
import tek.sdet.framework.config.Browser;
import tek.sdet.framework.config.ChromeBrowser;
import tek.sdet.framework.config.ChromeHeadless;
import tek.sdet.framework.config.EdgeBrowser;
import tek.sdet.framework.config.FirefoxBrowser;
import tek.sdet.framework.utilities.ReadYamlFiles;

public class BaseSetup 
{
	private static WebDriver webDriver;
	private final ReadYamlFiles environmentVariables;
	public static Logger logger;
	
	
	
	public BaseSetup()
	{
		String filePath = System.getProperty("user.dir") + "/src/main/resources/env_confiq.yml";
		String log4JPath = System.getProperty("user.dir") + "/src/main/resources/log4j.properties"; 
		
		try  
		{
			environmentVariables = ReadYamlFiles.getInstance(filePath);
		} catch (FileNotFoundException e) 
		{
			System.out.println("FAiled for load environment context. check  possible file path errors");
			throw new RuntimeException("Failed for environment context with message"+ e.getMessage());
		}
		logger = logger.getLogger("logger_File");               // org.apache.log4j.Logger;
		PropertyConfigurator.configure(log4JPath);
	}
	
		
	
	
	public WebDriver getDriver()
	{
		return webDriver;
	}
	
	
	
	public void setupBrowser()
	{
		HashMap uiProperties = environmentVariables.getYamlProperty("ui");
		System.out.println(uiProperties);
		String url = uiProperties.get("url").toString();
		Browser browser;     //  import tek-sdet-framework-config the one you create it 
		switch(uiProperties.get("browser").toString().toLowerCase())
		{
		case "chrome":
			if ((boolean) uiProperties.get("headless"))      // casting give u true or false
			{
				browser = new ChromeHeadless();
			}else 
			{
				browser = new ChromeBrowser();
			}
			webDriver = browser.OpenBrowser(url);
			break;
		case "firefox":
			browser = new FirefoxBrowser();
			webDriver = browser.OpenBrowser(url);
			break;
		case "edge":
			browser = new EdgeBrowser();
			webDriver = browser.OpenBrowser(url);
			break;
			default:
				throw new RuntimeException("unknown Browser check engvironemtn properties");
		}
		
		webDriver.manage().window().maximize();
		webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));	
	}
	
	
	
	
	public void quitBrowser()
	{
		if(webDriver != null)
			webDriver.quit();
	}
	
	
	
	

}
