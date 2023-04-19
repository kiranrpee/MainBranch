package TY_GenerealUtilitiess;

/** 
 * This class is uses if loop for validation
 * @author Kiran
 *
 */

public class Validation_IFcondition_Utility 
{

	/**
	 * this method takes two argument actual,expected and it compares by using contains methos
	 * @param actual
	 * @param expected
	 */
	public void validate(String actual,String expected)
	{
	
		if(actual.contains(expected))
		{
			System.out.println("valaidation sucecess full "+expected+" wegot "+actual);
		}
		else
		{
			System.out.println("validation fail because expected "+expected+"but got"+actual);
		
		}
		
	}
	
	
	
	
	
}
