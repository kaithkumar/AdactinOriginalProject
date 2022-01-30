/**
 * 
 */
package com.mystore.testcases;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.mystore.base.BaseClass;
import com.mystore.dataprovider.DataProviders;
import com.mystore.pageobjects.LoginPage;
import com.mystore.pageobjects.SearchHotelPage;
import com.mystore.utility.Log;

/**
 * @author 91888
 *
 */
public class SearchHotelsPageTest extends BaseClass{

	/**
	 * 
	 */
	public LoginPage loginPage;
	public SearchHotelPage searchHotel;
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String browser) {
		// TODO Auto-generated method stub
        launchApp(browser);
	}
	@Test(groups= {"smoke", "sanity", "regression"},dataProvider="Adactin", dataProviderClass= DataProviders.class)
	public void searchHotelPageTest(HashMap<String, String> hm) {
		// TODO Auto-generated method stub
        Log.startTestCase("search hotel page");
        loginPage = new LoginPage();
        searchHotel = loginPage.loginIntoPage();
        Log.info("login page completed");
        searchHotel.selectingRooms(hm.get("location"), hm.get("Hotels"), hm.get("Rommtype"), hm.get("No of rooms"), hm.get("Adults"), hm.get("child"));
        Log.info("Search Hotel Page Click Done");
        Log.endTestCase("Search hotel Page");
        Assert.assertTrue(false);
	}
	
	@AfterMethod(groups = {"smoke", "sanity", "regression"})
	private void tearDown() {
		// TODO Auto-generated method stub
     getDriver().quit();
	}
}
