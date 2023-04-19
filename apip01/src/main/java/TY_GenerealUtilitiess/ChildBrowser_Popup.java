package TY_GenerealUtilitiess;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class ChildBrowser_Popup
{

	/**
	 * This method is used to fetch the parent browser id
	 * @param driver
	 * @param parentid
	 * @return
	 */
	public String getParentBrowserId(WebDriver driver,String parentid)
	{
		return driver.getWindowHandle();
		

	}
	/**
	 * This method will return both parent and child browser id
	 * @param driver
	 * @param id
	 * @return
	 */
	public Set<String> getParentAndChildBrowserId(WebDriver driver,String id)
	{
		return driver.getWindowHandles();
		

	}


}
