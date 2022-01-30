/**
 * 
 */
package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.LoginPage;
import com.mystore.pageobjects.SearchHotelPage;
import com.mystore.utility.Log;

/**
 * @author 91888
 *
 */
public class LoginPageTest extends BaseClass{
/**
 * 
 */
	public LoginPage loginPage;
	public SearchHotelPage searchHotel;
	@Parameters("browser")
	@BeforeMethod(groups= {"smoke","sanity","regression"})
    public void setUp(String browser) {
	// TODO Auto-generated method stub
    launchApp(browser);
    }
	@Test(groups= {"smoke","sanity","regression"})
	public void loginPageTest() throws InterruptedException {
		// TODO Auto-generated method stub
		Log.startTestCase("login Page Test");
		loginPage=new LoginPage();
        boolean validateLogo = loginPage.validateLogo();
        Assert.assertTrue(validateLogo);
        Log.info("logo validated Sucessfully");
        searchHotel= loginPage.loginIntoPage();
        String urlCheck = searchHotel.urlCheck();
        Assert.assertEquals(urlCheck, getDriver().getCurrentUrl());
        Log.info("login sucessFull");
        Log.endTestCase("login page test");
        
	}
	/**
	 * 
	 */
	@AfterMethod(groups= {"smoke","sanity","regression"})
	private void tearDown() {
		// TODO Auto-generated method stub
     getDriver().quit();
     
	}
}
