package com.AP.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.AP.pages.indexPageElements;
import com.AP.testBase.ConfigsReader;
import com.AP.testBase.Driver;

public class SendToFriendTest2 {

	indexPageElements objectElement = new indexPageElements();

	Actions act = new Actions(Driver.getDriver());

	@BeforeMethod
	public void beforeTest() {

		Driver.getDriver().get(ConfigsReader.getProperty("url"));
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

	}

	@Test
	public void TestCase1() throws InterruptedException {

		objectElement.searchtbox.sendKeys(ConfigsReader.getProperty("searchItem1"));
		act.moveToElement(objectElement.searchBtn).click().perform();
		act.moveToElement(objectElement.hoverOver);
		act.moveToElement(objectElement.MoreBtn).click().perform();

		Thread.sleep(3000);

		act.moveToElement(objectElement.SendToFriend).click().perform();

		objectElement.FriendName.sendKeys(ConfigsReader.getProperty("friendName"));
		objectElement.FriendEmail.sendKeys(ConfigsReader.getProperty("friendEmail"));
		act.moveToElement(objectElement.sendEmail).click().perform();
		Thread.sleep(3000);

		Assert.assertEquals(objectElement.EmailText.getText(), "Your e-mail has been sent successfully");
		String emailText = objectElement.EmailText.getText();

		System.out.println(emailText);

		act.moveToElement(objectElement.OKBtn).click().perform();
		Thread.sleep(3000);

	}

	@AfterTest(alwaysRun = true)
	public void CloseTest() {

		Driver.getDriver().close();
	}

}
