package fRAMEWORKS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A1Swablabloginpage
{
	//step1: declaration
	@FindBy(xpath="//input[@placeholder='Username']")private WebElement UN;
	@FindBy(xpath="//input[@placeholder='Password']")private WebElement PWD;
    @FindBy(xpath="//input[@name='login-button']")private WebElement login;
    
    //step: initialization
    
    public A1Swablabloginpage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);   //classname.methodname(webdriver object,thiskeyword)
    }
    
    //setp3: usage
    public void enterUN()
    {
    	UN.sendKeys("standard_user");
    }
    
    public void enterPWD()
    {
    	PWD.sendKeys("secret_sauce");
    }
    
    public void clickonlogin()
    {
    	login.click();
    }
    
    
    

}
