package com.AP.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AP.testBase.Driver;

public class indexPageElements {

	@FindBy(id = "search_query_top")
	public WebElement searchtbox;

	@FindBy(xpath = "//*[@id=\"searchbox\"]/button")
	public WebElement searchBtn;

	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
	public WebElement hoverOver;

	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]")
	public WebElement addToCart;
//			
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	public WebElement proceedCheckout;

	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
	public WebElement proceedCheckoutGreen;

///  		Below this line is SendToFriendTest2

	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[2]")
	public WebElement MoreBtn;

	@FindBy(id = "send_friend_button")
	public WebElement SendToFriend;

	@FindBy(id = "friend_name")
	public WebElement FriendName;

	@FindBy(id = "friend_email")
	public WebElement FriendEmail;

	@FindBy(id = "sendEmail")
	public WebElement sendEmail;

	@FindBy(xpath = "//*[@id=\"product\"]/div[2]/div/div/div/p[2]/input")
	public WebElement OKBtn;

	@FindBy(xpath = "//*[@id=\"product\"]/div[2]/div/div/div/p[1]")
	public WebElement EmailText;

	public indexPageElements() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

}
