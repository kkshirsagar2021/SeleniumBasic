package com.SeleniumPrac;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

import org.openqa.selenium.TakesScreenshot;

public class DynamicDropDown {

	//private static final String TakesScreenshot = null;
	public static void takeSnapShot(WebDriver driver) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File("D:\\IMPFiles");

                //Copy file at destination

                Files.copy(SrcFile, DestFile);

    }
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\IMPFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.navigate().to("https://amazon.in");
		DynamicDropDown.takeSnapShot(driver);
		WebElement shopby=driver.findElement(By.xpath("//*[@id='nav-shop']"));
		WebElement echo=driver.findElement(By.xpath("//*[@aria-label='Echo & Alexa']"));
		Actions act=new Actions(driver);
		act.moveToElement(shopby).build().perform();
		//Actions act1=new Actions(driver);
		act.moveToElement(echo).build().perform();
		driver.findElement(By.xpath("(//*[@class='nav-text'])[26]")).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)","");
		WebElement wb=driver.findElement(By.xpath("(//*[@id='a-autoid-25'])[3]"));
		act.moveToElement(wb).build().perform();
		
		//driver.close();
	}

}
