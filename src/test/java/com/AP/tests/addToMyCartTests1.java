package com.AP.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AP.pages.indexPageElements;
import com.AP.testBase.ConfigsReader;
import com.AP.testBase.Driver;

public class addToMyCartTests1 {

	indexPageElements objectElement = new indexPageElements();

	Actions act = new Actions(Driver.getDriver());

	@BeforeMethod
	public void beforeTest() {

		Driver.getDriver().get(ConfigsReader.getProperty("url"));
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

 
	
	@Test
	public void TestCase1() throws InterruptedException {

		objectElement.searchtbox.sendKeys(ConfigsReader.getProperty("searchItem1"));
//		objectElement.searchBtn.click(); this line is the same as the bottom line
		act.moveToElement(objectElement.searchBtn).click().perform(); // action classs
		act.moveToElement(objectElement.hoverOver);
		act.moveToElement(objectElement.addToCart).click().perform();
		
		Thread.sleep(3000);
		act.moveToElement(objectElement.proceedCheckout).click().perform();
		act.moveToElement(objectElement.proceedCheckoutGreen).click().perform();
		
		
		
		
		
		

	}

//	Navegate to website
//	Type in seach box           			 ->    Faded Short Sleeve T-shirts
//	Click on Seach Button  
//	"Click on Faded Short Sleeve
//	T-Shirt"
//	"Click on ""Send to a Friend"" 
//	Button"
//	Enter name of your friend     			-> 	susi 
//	"Enter email address of your    		->	susi@gmail.com
//	friend"
//	Click on "Send" Button
//	"If message ""Your e-mail has
//	been sent successfully"" 
//	appears click ""OK"" button

//	@Test
//	public void TestCase2 () {
//		
//		
//		
//		
//	}

}
