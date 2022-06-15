package DemoABasicllProgram;

import java.util.List;

import org.omg.CORBA.portable.ValueBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCalenderjqury
{
 public static void main(String[] args)
 {
	
	 System.setProperty("webdriver.chrome.driver", "G:\\\\SeleniumSoftware\\\\exefile 102\\\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 
	driver.get("https://jqueryui.com/datepicker/"); 
	
	driver.switchTo().frame(0);
	
	driver.findElement(By.cssSelector("input[id='datepicker']")).click();
	 
while(! driver.findElement(By.cssSelector("[class=\"ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all\"] [class=\"ui-datepicker-year\"]")).getText().contains("2021"))
		{
	     
	     driver.findElement(By.cssSelector("[class=\"ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all\"] [class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();
		}
	 
	 
	List<WebElement> date=driver.findElements(By.cssSelector("td[data-handler=\"selectDay\"]")) ;
	
	for(WebElement dates : date)
	{
		
		String value=dates.getText();
	
	if(value.equals("25"))
	{
		dates.click();
	}
		
		
	}
}
	

}
