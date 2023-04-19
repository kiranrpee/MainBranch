package EndtoEnd;

import java.security.Signer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom_class.Signinpage;

public class guitesting 
{
signinp
	@Test
	public void gui()
	{
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		
		 Signinpage s=new Signinpage(driver);
		
		 
		  
	}
	
}
