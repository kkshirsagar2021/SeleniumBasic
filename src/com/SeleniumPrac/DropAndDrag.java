package com.SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropAndDrag {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\IMPFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)","");
		WebElement from=driver.findElement(By.xpath("(//*[@class='button button-orange'])[6]"));
		WebElement to=driver.findElement(By.xpath("(//*[@class='placeholder'])[3]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(from, to).build().perform();
		//Thread.sleep(20000);
		//driver.close();
	}

}
