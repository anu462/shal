package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(id="email")
	private WebElement Emailtxtbox;
	
	@FindBy(id="pass")
	private WebElement pwdtxtbox;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement Loginbtn;

	public  Login(WebDriver  driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setemail(String un)
	{
		Emailtxtbox.sendKeys(un);
	}
	public void setpwd(String pwd)
	{
		pwdtxtbox.sendKeys(pwd);
	}
	public void clicklogin()
	{
		Loginbtn.click();
	}
}
