package TY_GenerealUtilitiess;

import java.util.Scanner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * This class allow u to choose which browser you want to launch
 * @author Kiran
 *
 */
public class Webdrivermanager_Utility
{

	/**
	 * this method is used to lauch the browser depending on user dynamic input
	 * @return
	 */
	public  WebDriver launchingBrowsewr(String browser) 
	{

		WebDriver driver;
		//System.out.println("enter for 1-firefoxbroser , 2-chromebrowser ,3-internetexplorer,4-edge");
		//try (Scanner sc = new Scanner(System.in)) {
			//int ch = sc.nextInt();

		//ChromeOptions chrome;
			switch (browser)
			{

			case "firefox":WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
			break;

			case "chrome":WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;

			case "internetexplorer":WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			break;

			case "edgedriver":WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
			
			default :WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			 
			break;
			}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		return driver;
	

	}

	public void Maximize(WebDriver driver) 
	{
		driver.manage().window().maximize();
	}


}



