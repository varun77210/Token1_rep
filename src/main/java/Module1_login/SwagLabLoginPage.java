package Module1_login;
//POM class 1

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage 
{
	//step1: declaration 
	@FindBy(xpath = "//input[@id='user-name']")	private WebElement UN;  // -->  //private WebElement UN =driver.finElement(By.xpath(""))
	@FindBy(xpath = "//input[@id='password']")	private WebElement PWD;     //private WebElement PWD =driver.finElement(By.xpath(""))
	@FindBy(xpath = "//input[@id='login-button']")	private WebElement login;   //private WebElement login =driver.finElement(By.xpath(""))
	
	//step2: initialization
	public SwagLabLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);          //className.methodName("webDriverObject",this)
	}
	
	
	//step3: usage
	public void inpSwagLabLoginPageUN(String username)
	{
		UN.sendKeys(username);
	}
	
	public void inpSwagLabLoginPagePWD(String passowrd) 
	{
		PWD.sendKeys(passowrd);
	}
	
	public void clickSwagLabLoginPageLoginBtn() 
	{
		login.click();
	}
	
}
