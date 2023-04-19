package TY_GenerealUtilitiess;

import java.io.File;

import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Screenshot_generic_Utility 
{
	WebDriver driver;
	public void capture(WebDriver driver,String screenshotpath)
	{
		 try {
		Date d=new Date();
		String d1=d.toString();
		d1=d1. replaceAll(":", "-");
		System.out.println(d1);
		TakesScreenshot ts=(TakesScreenshot)driver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 File dst = new File(screenshotpath+d1+".pdf");
		
			org.openqa.selenium.io.FileHandler.copy(src,dst);
		} catch (IOException e) {			
		 e.printStackTrace();
		}
		 
	}
	
	public void capture(WebDriver driver,String screenshotpath,Date date)
	{
		String date1=date.toString();
		date1=date1.replaceAll(":","-");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 File dst = new File(screenshotpath+date1+".jpeg");
		try
		{
			org.openqa.selenium.io.FileHandler.copy(src,dst);
		} 
	catch (IOException e)
		{			
		 e.printStackTrace();
		}
		 
	}
	
	
	public void capture(WebElement element,String path)
	{
		
		File src = element.getScreenshotAs(OutputType.FILE);
		 File dst = new File(path);
		 try {
			org.openqa.selenium.io.FileHandler.copy(src, dst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public String getScreenShot() 
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		return ts.getScreenshotAs(OutputType.BASE64);
		
	}

	
	

}
