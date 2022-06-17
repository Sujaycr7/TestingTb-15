package DemoSikuliMt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class DemoFb 
{

	 public static WebDriver driver;
		public static void main(String[] args) throws FindFailed 
		{
		

			 System.out.println("this is chrome browser Before Suit"); 
			 System.setProperty("webdriver.chrome.driver", "G:\\SeleniumSoftware\\exefile 102\\chromeDriver.exe");
			 driver=new ChromeDriver();
			
			 driver.get("https://www.facebook.com/login/");
			 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			
			
			Screen sc=new Screen();
			
			Pattern username=new Pattern("G:\\SnippingToolSikuli\\fbuid.PNG");
			sc.type(username,"Amolshelke4954@gmail.com");
			Pattern passwword=new Pattern("G:\\SnippingToolSikuli\\fbpass.PNG");
			sc.type(passwword,"amolsh@28");
			Pattern submit=new Pattern("G:\\SnippingToolSikuli\\fblogin.PNG");
			
			sc.click(submit);
		}			
}
