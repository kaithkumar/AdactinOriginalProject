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
public class SearchHotelPage extends BaseClass {
    Action a = new Action();
	public SearchHotelPage()
	{
		PageFactory.initElements(getDriver(),this);
	}
	@FindBy(id = "location")
	private WebElement locationBtn;
	
	@FindBy(id = "hotels")
	private WebElement hotelsBtn;
	
	@FindBy(id = "room_type")
	private WebElement roomTypeBtn;
	
	@FindBy(id = "room_nos")
	private WebElement noOfRoomsBtn;
	
	@FindBy(id = "adult_room")
	private WebElement adultsBtn;
	
	@FindBy(id = "child_room")
	private WebElement childsBtn;
	
	@FindBy(id = "Submit")
	private WebElement submitBtn;

	public String urlCheck() {
		// TODO Auto-generated method stub
        return a.getCurrentURL(getDriver());
	}
	
	
	public void selectingRooms(String location,
			String hotels, 
			String roomType, 
			String noOfRooms, 
			String adults, 
			String childs) {
		// TODO Auto-generated method stub
		a.selectByVisibleText(location, locationBtn);
		a.selectByVisibleText(hotels, hotelsBtn);
		a.selectByVisibleText(roomType, roomTypeBtn);
		a.selectByVisibleText(noOfRooms, noOfRoomsBtn);
		a.selectByVisibleText(adults, adultsBtn);
		a.selectByVisibleText(childs, childsBtn);
		a.click(getDriver(), submitBtn);
	}
}
