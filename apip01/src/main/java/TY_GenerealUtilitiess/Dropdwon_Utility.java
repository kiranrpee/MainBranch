package TY_GenerealUtilitiess;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * This Class is used to handle DropDown
 * @author Kiran
 *
 */
public class Dropdwon_Utility
{

		
	/**
	 * This method is used check that dropdwon is multiselect ot Single select dropdown
	 * @param elementaddress
	 */
	public void ismultipledropdwon(WebElement elementaddress) 
	{
		Select s=new Select(elementaddress);
		if(s.isMultiple())
		{
			System.out.println("It is Multiplemethod dropdown");
			
		}
		else
		{
		System.out.println("It is Single select drop down");
			
		}
	}
	
		/**
		 * 
		 * @param elementaddress
		 * @param visibletext
		 */
	public void selectbyvisibletext(WebElement elementaddress,String visibletext) 
	{
		Select s=new Select(elementaddress);
		 List<WebElement> opt = s.getOptions();
		 for(WebElement t:opt)
		 {
			 
			 if(t.getText().equalsIgnoreCase(visibletext))
					 {
				 s.selectByVisibleText(visibletext);
					 }
		 }
	
	}
	
	public void selectByValue(WebElement elementaddress,String value)
	{
		Select s=new Select(elementaddress);
		 List<WebElement> opt = s.getOptions();
		 for(WebElement t:opt)
		 {
			 
			 if(t.getText().equalsIgnoreCase(value))
					 {
				 s.selectByValue(value);					 }
		 }
	
			}
	
	/**
	 * This method is used deselect the option in dropdown by using value and we need to pass the value of the element
	 * @param value
	 */
	public void deselectByValue(WebElement elementaddress,String value)
	{
		Select s=new Select(elementaddress);

		s.deselectByValue(value);
	}
	/**
	 * This method is used deselect the option in dropdown by visible text and we need to pass the visible textof the element
	 * @param text
	 */
	public void deselectByvisibletext(WebElement elementaddress,String text)
	{
		Select s=new Select(elementaddress);

		s.deselectByVisibleText(text);
	}
	/**
	 * This method is used deselect the option in dropdown by giving idex value and we need to pass the index value of the element
	 * @param index
	 */
	public void deselecByIndex(WebElement elementaddress,int index )
	{
		Select s=new Select(elementaddress);
		s.deselectByIndex(index);
	}
	/**
	 * This method is used deselect the all the option in dropdown  
	 */
	public void deselectAll(WebElement elementaddress)
	{
		
		Select s=new Select(elementaddress);
		s.deselectAll();
	}

	public void getOptions(WebElement elementaddress)
	{
		Select s=new Select(elementaddress);
		s.getOptions();
	}
		
	
}
