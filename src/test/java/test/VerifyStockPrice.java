package test;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.QuotePage;

public class VerifyStockPrice extends BaseTest
{
	@Test
	public void verifyTheStockPrice()
	{
		setup();
		HomePage.enterCompanyName("TSLA"); 
		setImplicitWait(driver, 1);
		HomePage.verifyAutoSuggest();
		setImplicitWait(driver, 3);
		HomePage.clickOnFirstElement();
		setImplicitWait(driver, 3);
		QuotePage.verifyStockPrice();
		QuotePage.capturePreviousCloseAndVolume();
		teardown();
		
	}

}
