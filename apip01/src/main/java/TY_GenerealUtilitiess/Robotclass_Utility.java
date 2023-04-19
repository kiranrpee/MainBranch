package TY_GenerealUtilitiess;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Robotclass_Utility
{
	Robot rbt;

	public void robotClass()
	{
		
		try {
			rbt=new Robot();
		} 
		catch (AWTException e)
		{
			e.printStackTrace();
		}
	}

    
	/**
	 * To minimize window
	 */
	public void minimizeWindow() 
	{   
		Robot rbt = null;
		try {
			 rbt=new Robot();
		} catch (AWTException e) {
		
			e.printStackTrace();
		}
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_SPACE);
		rbt.keyPress(KeyEvent.VK_N);
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		rbt.keyRelease(KeyEvent.VK_SPACE);
		rbt.keyRelease(KeyEvent.VK_N);
	}
    



}
