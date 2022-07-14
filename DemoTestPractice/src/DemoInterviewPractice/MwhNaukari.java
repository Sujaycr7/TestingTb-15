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
import org.openqa.selenium.interactions.ClickAction;

public class MwhNaukari 
{
public static void main(String[] args)
{

	System.setProperty("webdriver.chrome.driver", "G:\\SeleniumSoftware\\exefile 103\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.naukri.com/");
	
	WebElement allfdr=driver.findElement(By.cssSelector("div[class='footer anchorList']"));
	List<WebElement> f=allfdr.findElements(By.tagName("a"));
	
	int fd=f.size();
	System.out.println(fd);
	
	WebElement spfdr=driver.findElement(By.xpath("//*[@id=\"Footer\"]/div[1]/div/div/div[2]/ul"));
List<WebElement> ff=spfdr.findElements(By.tagName("a"));
	int count=ff.size();
	System.out.println(count);
	
	for(int i=1 ; i<count ; i++)
	{
		String s=Keys.chord(Keys.CONTROL,Keys.ENTER);
		ff.get(i).sendKeys(s);	
	}
	Set<String> key=driver.getWindowHandles();
	List<String> al=new ArrayList<>(key);
	Iterator<String> itr=al.iterator();
	
while(itr.hasNext())
{
	 driver.switchTo().window(itr.next());
	String title= driver.getTitle();
	System.out.println(title);
	if(title.equalsIgnoreCase("About us"))
			{
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/ul/li[3]/a")).click();
			}
}
	
	
}
}
