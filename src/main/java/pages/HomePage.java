package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class HomePage extends BaseTest {
	
	public static WebElement searchBox = driver.findElement(By.id("ybar-sbq"));
	public static WebElement autoSuggest = driver.findElement(By.xpath("//div[contains(@class, 'modules-module_greenSrchRslt__Iemde')]"));
	public static WebElement firstsuggestion = driver.findElement(By.xpath("//div[contains(@class, 'modules-module_BoxShadow')]//ul[1]//li[1]"));
	
	public static void enterCompanyName(String company)
	{
		searchBox.sendKeys(company);
	}
	
	public static void verifyAutoSuggest()
	{
		if (autoSuggest.isDisplayed()){
            System.out.println("The autoSuggest is displayed.");
        } else {
            System.out.println("The autoSuggest is NOT displayed.");
            return;
        }
	}
	
	public static void clickOnFirstElement()
	{
		String Title = firstsuggestion.getText();
        if(Title.contains("Tesla, Inc."))
        {
        	System.out.println("The first autosuggested entry is TESLA Inc");
        	firstsuggestion.click();
        } else {
            System.out.println("The first autosuggested entry is NOT TESLA Inc");
            return;
        }
	}

}
