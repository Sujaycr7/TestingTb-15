package DemoABasicllProgram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoJavaScriptRedBus
{

	public static void main(String[] args) throws Exception
	{
    System.setProperty("webdriver.chrome.driver", "G:\\SeleniumSoftware\\exefile 102\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	
	
	WebElement fromcity=driver.findElement(By.cssSelector("input[onclick=\"selectText('src')\"]"));
		       fromcity.sendKeys("Sinnar");
		
		
   JavascriptExecutor jv=(JavascriptExecutor)driver;
   String value="return document.getElementById(\"src\").value;";
   String city=(String)jv.executeScript(value);
   System.out.println(city);
   
   while(! city.equalsIgnoreCase("Pangri (Sinnar)"))
   {
	   fromcity.sendKeys(Keys.DOWN);
	   value="return document.getElementById(\"src\").value;";
	    city=(String)jv.executeScript(value);  
   }
		
	fromcity.sendKeys(Keys.ENTER);	
			
	//Destination
	WebElement destination=driver.findElement(By.cssSelector("input[onclick=\"selectText('dest')\"]"));
	destination.sendKeys("Nashik");
	
	JavascriptExecutor jv1=(JavascriptExecutor)driver;
	String val1="return document.getElementById(\"dest\").value;";
	String city1=(String)jv1.executeScript(val1);
	System.out.println(city1);
	
	while(! city1.equalsIgnoreCase("Nashik Phata, Pune"))
	{
		destination.sendKeys(Keys.DOWN);
		val1="return document.getElementById(\"dest\").value;";
		city1=(String)jv1.executeScript(val1); 
	}
	destination.sendKeys(Keys.ENTER);
	}

}
