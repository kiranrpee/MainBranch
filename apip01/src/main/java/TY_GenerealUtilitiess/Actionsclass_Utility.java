package TY_GenerealUtilitiess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass_Utility
{
/**
 * class to handle actions of mouse
 */
	Actions act;
	
	/** constructor to create object for action class
	 * which take applicatio address as argument
	 * 
	 * @param driver
	 */
public	Actionsclass_Utility(WebDriver driver)
	{
		act=new Actions(driver);


	}
	
	
	
	/**
	 * to handle mousehover action
	 * @param driver
	 * @param target
	 */
	public void mouseover(WebElement target)
	{
		act.moveToElement(target).perform();
		
	
	}
	
	/**
	 * to handle doubleclick action of mouse
	 * @param driver
	 * @param target
	 */
	public void doubleclick(WebElement target)
	{
	
		
		act.doubleClick(target).perform();
		
	
	}
	

	/**
	 * to handle drag and drop function
	 * @param driver
	 * @param src
	 * @param dst
	 */
	public void dragandDrop(WebElement src,WebElement dst)
	{
	
		
		act.dragAndDrop(src, dst).perform();
	}
	
	/**
	 * to handle rightclick action pf mouse
	 * @param driver
	 * @param rclick
	 */
	public void right(WebElement rclick)
	{
	

		act.contextClick(rclick).perform();
	}
	
	
	
	
	
}
