package TY_GenerealUtilitiess;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	/**
	 * This class is contains reusable methods to wait for element load and to pause the program
	 * @author Kiran
	 *
	 */
	public class Wait_Utility 

	{
		/**
		 * This method is used to pause the program for specified time
		 * @param milisec
		 */
	   public void threadPause(long milisec)
	   {
		   try 
		   {
			Thread.sleep(milisec);
		   } 
		   catch (InterruptedException e)
		   {
			e.printStackTrace();
		   }
	   }
		
	   
	   /**
		 * This method is used to wait for element load to perform the action on the element
		 * @param driver
		 * @param timeout
		 */
	   public void impicitlyWait(WebDriver driver,long timeout)
	   {
		   driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		   
	   }
	  
	   /**
	    * This method is used to wait for the element until the visibility of element and it will perform the action based on the condition
	    * @param driver
	    * @param timeout
	    * @param element
	    */
	 
	   private WebDriverWait wait;
	   
	  public void WaitUtility(WebDriver driver,long timeout)
	   {
		    wait =new WebDriverWait(driver,timeout);
		  
	   }
	   public void explicitWaitclick(WebDriver driver,WebElement ele)
		{
			
			wait.until(ExpectedConditions.visibilityOf(ele)).click();
		}
	   public void explicitWaitsendValue(WebElement ele,String value)
		{
			wait.until(ExpectedConditions.visibilityOf(ele)).sendKeys(value);
		}
	   
	   
	   
	   
	   
		
	}

	

