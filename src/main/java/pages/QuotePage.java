package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseTest;

public class QuotePage extends BaseTest{
	
	public static WebElement stockPriceElement = driver.findElement(By.xpath("//section[contains(@data-testid,'quote-price')]//div[1]//section[1]//div[1]//fin-streamer[1]"));
	public static WebElement previousCloseElement = driver.findElement(By.xpath("//span[contains(@title, 'Previous Close')]"));
	public static WebElement volumeElement = driver.findElement(By.xpath("//span[contains(@title, 'Volume')]"));
    
    public static void verifyStockPrice()
    {
    	String stockPriceText = stockPriceElement.getText().replace(",", "");
        System.out.println("Stock price " + stockPriceText);
        
        double stockPrice = Double.parseDouble(stockPriceText);
        if (stockPrice > 200) {
            System.out.println("Stock price is greater than $200: " + stockPrice);
        } else {
            System.out.println("Stock price is below $200: " + stockPrice);
            return;
        }
    }
    
    public static void capturePreviousCloseAndVolume()
    {
    	 System.out.println("Additional Data:");
         System.out.println("Previous Close: " + previousCloseElement.getText());
         System.out.println("Volume: " + volumeElement.getText());
    }
    
}
