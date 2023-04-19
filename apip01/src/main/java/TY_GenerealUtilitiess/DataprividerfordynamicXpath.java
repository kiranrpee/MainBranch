package TY_GenerealUtilitiess;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataprividerfordynamicXpath 
{

	@DataProvider(name="signup")
	public Object[][] storedynamicxpath()
	{
		
		Object[][] store=new Object[6][2];

		store[0][0]="firstname xapth";
		store[0][1]="firstname";
		
		store[1][0]="lastname xapth";
		store[1][1]="lastname";
		
		store[2][0]="username xapth";
		store[2][1]="username";
		
		store[3][0]="Repeatusername xapth";
		store[3][1]="username2";
		
		store[4][0]="mobilenumber xpath";
		store[4][1]="number";
		
		store[5][0]	="email  address";
		store[5][1]	="email";
		
		store[6][0]	="repeat email address";
		store[6][1]="password2";
		
		return store;
	}
	
	@Test(dataProvider = "signup")
	public Object[] getdatafromDataprovider(String key,String dxpath)
	{
		
		Object[] dynamicxpath= {key,dxpath};
		return dynamicxpath;
		
	}
	
}
