package com.SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectMultipleCheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\IMPFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com//test//radio.html");
		driver.findElement(By.id("vfb-6-0")).click();
		driver.findElement(By.id("vfb-6-1")).click();
		Thread.sleep(1000);
		//driver.close();

	}

}
