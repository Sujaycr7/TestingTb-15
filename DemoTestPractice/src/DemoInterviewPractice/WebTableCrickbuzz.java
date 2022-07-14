package DemoInterviewPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableCrickbuzz
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "G:\\SeleniumSoftware\\exefile 103\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.cricbuzz.com/live-cricket-scorecard/48739/3-day-warm-up-match-pakistan-tour-of-sri-lanka-2022");
	
	
	WebElement table=driver.findElement(By.xpath("//div[@id=\"innings_2\"]/child::div[1]"));
	
	List<WebElement> inning2=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));
	int count=inning2.size();
	System.out.println(count);
	
	int sum=0;
	for (int i = 0; i < count-3; i++) 
	{
	String row=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] :nth-child(3)")).get(i).getText();
	int rowval=Integer.parseInt(row);
	sum=sum+rowval;
	}
	System.out.println(sum);

	
	List<WebElement> bl=table.findElements(By.cssSelector("div[class=\"cb-col cb-col-100 cb-scrd-itms\"]"));
	int count1=bl.size();
	System.out.println(count1);
	int sum1=0;
	for(int i=0 ; i<count1-3 ; i++)
	{
		String ball=table.findElements(By.cssSelector("div[class=\"cb-col cb-col-8 text-right\"]")).get(i).getText();
		int bll=Integer.parseInt(ball);
		sum1=sum1+bll;
	}
	System.out.println(sum1);
	
	
}
	
	
	
	
}
