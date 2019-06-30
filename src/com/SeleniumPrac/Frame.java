package com.SeleniumPrac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver","D:\\IMPFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.navigate().to("https://www.toolsqa.com/iframe-practice-page/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)","");
		WebElement frame=driver.findElement(By.xpath("(//*[@class='wpb_column vc_column_container vc_col-sm-12'])[2]"));
		driver.switchTo().frame(frame);
		driver.findElement(By.cssSelector("#page > div.masthead.classic-header.center.bg-behind-menu.logo-center.widgets.full-width.sur;
		
		
	}
}
