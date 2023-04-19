package TY_GenerealUtilitiess;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import BIOBOOK_sociaMedia_objectrepository.HomePompage;
import BIOBOOK_sociaMedia_objectrepository.LoginPomClass;
import BIOBOOK_sociaMedia_objectrepository.ProfilePomClass;

public class BASE_CLASS extends Intilaizationof_Variables
{

	@Parameters(value="browser")
	@BeforeClass(alwaysRun = true)
	public void configurationSetup(@Optional String browser)
	{
	
		
		sft=new SoftAssert();
		prop = new Propertyfile_GetdataStoredata_Utility("./src/test/resources/property/commondata.properties");
		val=new Validation_IFcondition_Utility();
		dropdwon=new Dropdwon_Utility();
		fde=new FetchingDatafromExcell_Utility(prop.getdataPropertyFile(Enumkey.EXCELPATH));
		sshot=new Screenshot_generic_Utility();

		date1=new DateGeneric_Utility();

		rnd=new Randomnumber_Utility();

		encrypt=new EncryptDecrypt_Utility();

		encryptString = encrypt.encrypt(prop.getdataPropertyFile("email"));

		prop.storedataPropertfFile("encryptedemial", encryptString);

		bowser=new Webdrivermanager_Utility();
		

		data = fde.fetchSingledata("sheet5","Firstname","lastname");
		
	if(browser!=null)
	{
		driver = bowser.launchingBrowsewr(browser);
		}
	else
	{
		driver = bowser.launchingBrowsewr("firefox");
	}
	homepom=new HomePompage(driver);

		
	//	driver=bowser.launchingBrowsewr("firefox");
		
		Actionsclass_Utility act=new Actionsclass_Utility(driver);

		logpom=new LoginPomClass(driver);
		propom=new ProfilePomClass(driver);
		scr=new Scrolling(driver);

		driver.get(prop.getdataPropertyFile(Enumkey.URL));
		String LoginTittle=driver.getTitle();
		val.validate(LoginTittle,"Sin");

		logpom.loginbuttonclick();
		logpom.loginintoBioBOOK(prop.getdataPropertyFile(Enumkey.EMAIL),prop.getdataPropertyFile(Enumkey.PASSWORD));
		String loginText=driver.getTitle();
		val.validate(LoginTittle,loginText);


	}
	
	@AfterMethod(alwaysRun = true)
	public void closeallTeardown()
	{
		driver.close();
		sft.assertAll();
		
	
	}
}



