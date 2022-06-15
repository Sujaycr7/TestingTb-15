package DemoABasicllProgram;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCrickzDemo
{
public static void main(String[] args)
{

	 System.setProperty("webdriver.chrome.driver", "G:\\SeleniumSoftware\\exefile 102\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
	int sum=0;
	WebElement table=driver.findElement(By.cssSelector("div[id=\"innings_1\"] div[class=\"cb-col cb-col-100 cb-ltst-wgt-hdr\"]"));
	
	List<WebElement> inning1=table.findElements(By.cssSelector("div[class=\"cb-col cb-col-100 cb-scrd-itms\"]"));
	int count=inning1.size();
	System.out.println(count);
	
	for(int i=0 ; i<count-2 ; i++)
	{
		String s=driver.findElements(By.cssSelector("div[class=\"cb-col cb-col-100 cb-scrd-itms\"] :nth-child(3)")).get(i).getText();
		int aa=Integer.parseInt(s);
		
		sum=sum+aa;
		
	}
	System.out.println(sum);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
}
