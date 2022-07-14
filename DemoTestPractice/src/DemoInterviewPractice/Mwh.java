package DemoInterviewPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mwh {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","G:\\SeleniumSoftware\\exefile 103\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		WebElement fdr =driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
		List<WebElement> frd1=fdr.findElements(By.tagName("a"));
		int count=frd1.size();
		System.out.println(count);
		
		
		for(int i=1 ; i<count ;i++)
		{
			
		 String s= Keys.chord(Keys.CONTROL,Keys.ENTER);
			
		 frd1.get(i).sendKeys(s);
		
		}
	Set<String> key=driver.getWindowHandles();
	List<String> al=new ArrayList<String>(key);
	Iterator<String> itr=al.iterator();
	while(itr.hasNext())
	{
		driver.switchTo().window(itr.next());
		String t=driver.getTitle();
		System.out.println(t);
	
		if(! t.equalsIgnoreCase("REST API"))
		{
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/ul/ul/li[1]/a")).click();
		}
		
		
	}

}
}
