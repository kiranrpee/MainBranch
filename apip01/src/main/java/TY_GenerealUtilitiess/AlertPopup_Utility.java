package TY_GenerealUtilitiess;

import org.openqa.selenium.WebDriver;

public class AlertPopup_Utility
{

	public void acceptAlert(WebDriver driver)
	{
	
		driver.switchTo().alert().accept();
		
	}
	

	public void dismisstAlert(WebDriver driver)
	{
	
		driver.switchTo().alert().dismiss();
		
	}
	
	public String gettextofAlert(WebDriver driver) 
	{
		return driver.switchTo().alert().getText();
	}
	
	
}
