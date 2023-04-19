package TY_GenerealUtilitiess;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import BIOBOOK_sociaMedia_objectrepository.HomePompage;
import BIOBOOK_sociaMedia_objectrepository.LoginPomClass;
import BIOBOOK_sociaMedia_objectrepository.ProfilePomClass;

public class Intilaizationof_Variables
{

	//public HomePompage home;
	public	Propertyfile_GetdataStoredata_Utility prop;
	public	Validation_IFcondition_Utility val;
	protected Dropdwon_Utility dropdwon;
	protected	FetchingDatafromExcell_Utility fde;
	protected	Screenshot_generic_Utility sshot;
	protected	DateGeneric_Utility date1;
	protected Randomnumber_Utility rnd;
	protected	EncryptDecrypt_Utility encrypt;
	protected String encryptString;
	protected 	Webdrivermanager_Utility bowser;
	protected	WebDriver driver;
	public HomePompage homepom;
	protected LoginPomClass  logpom;
	protected ProfilePomClass propom;
	protected 	Scrolling scr;
	public String[] data;
	protected SoftAssert sft;
	
	
}
