package Testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import POM.Login;

public class Home {
	@Test
	public  void testlogin() {
		
			System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			Login l=new Login(driver);
			l.setemail("parit.pooja123@gmail.com");
			l.setpwd("ganapa555");
			l.clicklogin();
		}
	}

