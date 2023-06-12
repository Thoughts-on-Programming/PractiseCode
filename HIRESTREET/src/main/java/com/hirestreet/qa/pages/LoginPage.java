package com.hirestreet.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hirestreet.qa.base.TestBase;

public class LoginPage extends TestBase {




	@FindBy(xpath="//a[@class='profile-icon']")
	WebElement profile_Icon;

	@FindBy(xpath="//button[@class ='needsclick klaviyo-close-form kl-private-reset-css-Xuajs1']")
	WebElement popUp_Close;

	@FindBy(xpath="//a[@class='btn-accept-all  btn btn-primary']")
	WebElement cookie_Accept;

	@FindBy(id ="userSigninLogin")
	WebElement Email;	

	@FindBy(id="userSigninPassword")
	WebElement password;

	@FindBy(xpath="span[normalize-space()='Sign In']")
	WebElement SignIn;

	public LoginPage()
	{

		PageFactory.initElements(driver, this);
	}

	public void ToU()
	{

		cookie_Accept.click();
	}
	
	
	public void popUp()
	{
		if (popUp_Close.isDisplayed())
		{
			popUp_Close.click();

		}
		
		
	}

}
