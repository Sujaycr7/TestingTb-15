package DemoABasicllProgram;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class DemoAbhiBus
{
public static void main(String[] args)
{
	
	WebDriver driver;
System.setProperty("webdriver.chrome.driver", "G:\\SeleniumSoftware\\exefile 102\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https://www.abhibus.com/?utm_source=google&utm_medium=cpc&utm_campaign=Abhibus_Brand&utm_term=abhibus&utm_content=Brand&gclid=Cj0KCQjwwJuVBhCAARIsAOPwGAQ9Pu3h04sR1hD649LE_Hi6qZ6JUVREsclnguvJbbKDJCeXLxAlOGcaAmgdEALw_wcB");
	
	
	WebElement fromcity=driver.findElement(By.xpath("/html/body/header/section/div/div/div/div/div/div[1]/form/div/div[1]/a/div/div/div[2]/div/input[1]"));
	fromcity.sendKeys("pun");

	JavascriptExecutor jv=(JavascriptExecutor)driver;
	String value ="return document.getElementById(\"source\").value;";
	String city=(String)jv.executeScript(value);
	
	System.out.println(city);
	
	
	while(! city.equalsIgnoreCase("Pune Airport"))
	{
		fromcity.sendKeys(Keys.DOWN);
		 value ="return document.getElementById(\"source\").value;";
		 city=(String)jv.executeScript(value);
	}
	fromcity.sendKeys(Keys.ENTER);
	
   WebElement going=driver.findElement(By.xpath("/html/body/header/section/div/div/div/div/div/div[1]/form/div/div[3]/a/div/div/div[2]/div/input[2]"));	
   going.sendKeys("mum");
	JavascriptExecutor jv1=(JavascriptExecutor)driver;
	String val="return document.getElementById(\"destination\").value;";
	String cit=(String)jv1.executeScript(val);
	System.out.println(cit);
	
	while(! cit.equalsIgnoreCase("Mumbai International Airport"))
	{
		going.sendKeys(Keys.DOWN);
		val="return document.getElementById(\"destination\").value;";
	    cit=(String)jv1.executeScript(val);
	}
	going.sendKeys(Keys.ENTER);
	
WebElement wb=driver.findElement(By.xpath("/html/body/header/section/div/div/div/div/div/div[1]/form/div/div[4]/a/div/div/div[2]/div/input"));
	    wb.click();
	    
	    while(! driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all ui-datepicker-multi ui-datepicker-multi-2'] [class=\"ui-datepicker-month\"]")).getText().contains("August"))
	    {
	    	driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all ui-datepicker-multi ui-datepicker-multi-2'] [class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
	    }
	    
	    List<WebElement> days=driver.findElements(By.cssSelector("td[data-handler='selectDay']"));
	    int count=days.size();
	    System.out.println(count);
	    
	    for(WebElement day : days )
	    {
               String v=day.getText();
               System.out.println(v);
               
               if(v.equals("13"))
               {
            	   day.click();
               }
	    }
	    
}
}
