package DemoABasicllProgram;

import java.awt.image.TileObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.border.TitledBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.EqualsMethod;

public class DemoMultipleWindowHandling 
{
public static void main(String[] args) 
{

	 System.setProperty("webdriver.chrome.driver", "G:\\SeleniumSoftware\\exefile 102\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
	WebElement table=driver.findElement(By.cssSelector("div[id='gf-BIG'] ul:nth-of-type(1)"));
	List<WebElement> fdr=table.findElements(By.tagName("a"));
	int count=fdr.size();
	System.out.println(count);
	
	for(int i=1; i<count ;i++)
	{
		String s=Keys.chord(Keys.CONTROL,Keys.ENTER);
		fdr.get(i).sendKeys(s);	
	}
	
	Set<String> keys=driver.getWindowHandles();
	ArrayList<String> al=new ArrayList<String>(keys);
	
	Iterator<String> itr=al.iterator();
	while(itr.hasNext())
	{
		driver.switchTo().window(itr.next());
		
		String title=driver.getTitle();
		
		if(! title.equalsIgnoreCase("REST API"))
		{
           driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/ul/ul/li[1]/a"));
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
}
