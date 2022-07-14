package DemoInterviewPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class JavaScript
{
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "G:\\SeleniumSoftware\\exefile 103\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.redbus.in/");


WebElement from=driver.findElement(By.cssSelector("input[id='src']"));
from.sendKeys("mumb");

JavascriptExecutor jv=(JavascriptExecutor)driver;
String value="return document.getElementById(\"src\").value;";
String city=(String)jv.executeScript(value);
System.out.println(city);

Thread.sleep(2000);
while(! city.equalsIgnoreCase("Borivali, Mumbai"))
{
 from.sendKeys(Keys.DOWN);
 value="return document.getElementById(\"src\").value;";
 city=(String)jv.executeScript(value);
}
from.sendKeys(Keys.ENTER);

//Destination 
WebElement dest=driver.findElement(By.cssSelector("input[id='dest']"));
dest.sendKeys("nash");

JavascriptExecutor jv1=(JavascriptExecutor)driver;
String value1="return document.getElementById(\"dest\").value;";
String city1=(String)jv1.executeScript(value1);
System.out.println(city);
Thread.sleep(2000);
while(! city1.equalsIgnoreCase("Mumbai Naka, Nashik"))
{
	dest.sendKeys(Keys.DOWN);
	value1="return document.getElementById(\"dest\").value;";
    city1=(String)jv1.executeScript(value1);

}
dest.sendKeys(Keys.ENTER);

WebElement d=driver.findElement(By.cssSelector("input[id='onward_cal']"));
d.click();

 driver.findElement(By.cssSelector("[class=\"rb-calendar\"] [class=\"monthTitle\"]")).getText().contains("July 2022");
 List<WebElement> day=driver.findElements(By.cssSelector("td[class='wd day']"));
	int countd=day.size();
	System.out.println(countd);
	Thread.sleep(2000);
	for(WebElement days : day)
	{
   		String val=days.getText();
   		Thread.sleep(2000);
   		if(val.equalsIgnoreCase("20"))
   		{
   			days.click();
   		}

	
	


}


}
	
	
}
