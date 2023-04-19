package pom_class;
import static org.openqa.selenium.WebDriver.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signinpage
{
	

	@FindBy(xpath = "//label[.='Username']")
	private WebElement username;

	@FindBy(xpath = "//label[.='Password']")
	private WebElement password;

	@FindBy(xpath = "//button[.='Sign in']")
	private WebElement signin;
	
	
	public Signinpage(WebDriver driver) 
	{
	
		PageFactory.initElements(driver,this);
		
	}
	
	
	public void signinClick(String user,String pass )
	{
		username.sendKeys(user);
		password.sendKeys(pass);
		signin.click();
	}

	
	
}
