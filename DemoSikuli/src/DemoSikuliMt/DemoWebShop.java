package DemoSikuliMt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class DemoWebShop 
{
	
	WebDriver driver;
	
	
	@BeforeSuite
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "G:\\SeleniumSoftware\\exefile 102\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	
	@BeforeTest
	public void openurl()
	{
		driver.get("http://demowebshop.tricentis.com/register");
	}
	
	
	@BeforeClass
	public void pagemaximize()
	{
		
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void pagewait()
	{
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void alldetails() throws FindFailed
	{
		
		Screen sc=new Screen();
		Pattern gen=new Pattern("G:\\SnippingToolSikuli\\wbshopgender.PNG");
		sc.click();
		
		Pattern fn=new Pattern("G:\\SnippingToolSikuli\\weshopfirst.PNG");
		sc.type(fn, "Amol");
		
		Pattern ln=new Pattern("G:\\SnippingToolSikuli\\webshoplast.PNG");
		sc.type(ln, "Shelke");
		
		Pattern eml=new Pattern("G:\\SnippingToolSikuli\\webshopemail.PNG");
		sc.type(eml, "amolshelke86999@gmail.com");
		
		Pattern ps=new Pattern("G:\\SnippingToolSikuli\\webshoppassword.PNG");
		sc.type(ps, "amol125");
		
		Pattern cps=new Pattern("G:\\SnippingToolSikuli\\webshopcpass.PNG");
		sc.type(cps, "amol125");
		
		Pattern sbmt=new Pattern("G:\\SnippingToolSikuli\\webshopregi.PNG");
		sc.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
