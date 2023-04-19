package TY_GenerealUtilitiess;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scrolling 
{

	public JavascriptExecutor js;

	public Scrolling (WebDriver driver) 
	{

		js=(JavascriptExecutor) driver;
	}

	public void scrolldown(int x,int y)
	{


		js.executeScript("window.scrollBy("+x+","+y+")");

	}



	public void scrolltoEnd()
	{

		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}


	public void scrollbacktoTop()
	{
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");


	}

	public void scrolltillElement(WebElement element) 
	{
		js.executeScript("argument[0].scrollIntoView()",element);

	}
	
	public void click(WebElement element) 
	{
		js.executeScript("argument[0].click()",element);
	}

	public void sendkeys(WebElement element, String data) 
	{
	
		js.executeScript("argument[0].value=arguments[1]",element,data);
	}

	
	public void sendkeys(String url) 
	{
	
		js.executeScript("window.location=arguments[0]",url);
	}

	public void highlight()
	{
	
		
	}
	
}
