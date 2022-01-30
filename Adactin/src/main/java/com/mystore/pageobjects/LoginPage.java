/**
 * 
 */
package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

/**
 * @author 91888
 *
 */
public class LoginPage extends BaseClass{

	Action a = new Action();
	@FindBy(id ="username")
	private WebElement userNameButton;
	@FindBy(id="password")
	private WebElement passwordBtn;
	@FindBy(id="login")
	private WebElement LoginBtn;
	@FindBy(xpath="//img[@alt='AdactIn Group']")
	private WebElement logoImg;
	
	public LoginPage()
	{
		PageFactory.initElements(getDriver(), this);
	}
	public SearchHotelPage loginIntoPage() {
		a.type(userNameButton, prop.getProperty("username"));
		a.type(passwordBtn, prop.getProperty("password"));
		a.click(getDriver(), LoginBtn);
		return new SearchHotelPage();
	}

	public boolean validateLogo() {
		// TODO Auto-generated method stub
         return a.isDisplayed(getDriver(), logoImg);
	}
	
	
	
}
