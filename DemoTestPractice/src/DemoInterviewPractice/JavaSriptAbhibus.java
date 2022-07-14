package DemoInterviewPractice;

import java.util.List;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElements;

public class JavaSriptAbhibus
{
public static void main(String[] args) throws InterruptedException 
{

	System.setProperty("webdriver.chrome.driver", "G:\\SeleniumSoftware\\exefile 103\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.abhibus.com/?utm_source=google&utm_medium=cpc&utm_campaign=Abhibus_Brand&utm_term=abhibus&utm_content=Brand&gclid=EAIaIQobChMIodLJtZL1-AIV1IdLBR3Q_w_lEAAYASAAEgIBLvD_BwE");
	
	WebElement w=driver.findElement(By.cssSelector("input[id='source']"));
	w.sendKeys("pun");
	JavascriptExecutor jv=(JavascriptExecutor)driver;
	String value="return document.getElementById(\"source\").value;";
	String city=(String)jv.executeScript(value);
	System.out.println(city);
	Thread.sleep(2000);
	while(! city.equalsIgnoreCase("Pune Airport"))
	{
		Thread.sleep(2000);
		w.sendKeys(Keys.DOWN);
		value="return document.getElementById(\"source\").value;";
		city=(String)jv.executeScript(value);
	}
	w.sendKeys(Keys.ENTER);
	
	WebElement w2=driver.findElement(By.cssSelector("input[id='destination']"));
	w2.sendKeys("sata");
	
	JavascriptExecutor jv1=(JavascriptExecutor)driver;
	String value1="return document.getElementById(\"destination\").value;";
	String city1=(String)jv1.executeScript(value1);
	System.out.println(city1);
	Thread.sleep(2000);
	while(! city1.equalsIgnoreCase("Satadhar"))
	{
		w2.sendKeys(Keys.DOWN);
		value1="return document.getElementById(\"destination\").value;";
		city1=(String)jv1.executeScript(value1);
	}
	w2.sendKeys(Keys.ENTER);
	//datepicker
	WebElement d=driver.findElement(By.cssSelector("input[id=\"datepicker1\"]"));
	d.click();
	
	while(driver.findElement(By.cssSelector("[class=\"ui-datepicker-group ui-datepicker-group-last\"] [class=\"ui-datepicker-month\"]")).getText().contains("September"))
	{
		driver.findElement(By.cssSelector("[class=\"ui-datepicker-group ui-datepicker-group-last\"] [class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
	}
	//{
	List<WebElement> dt=driver.findElements(By.cssSelector("td[data-handler=\"selectDay\"]"));
   int count=dt.size();
   System.out.println(count);
	
   for(WebElement date: dt)
   {
	   String from=date.getText();
	   
	   if(from.equalsIgnoreCase("13"))
	   {
		   date.click();
	   }
   }
	   

   
   
   
   
   
}	
	
}
