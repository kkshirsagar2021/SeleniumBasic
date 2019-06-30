package com.SeleniumPrac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnImg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\IMPFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com/login/identify?ctx=recover");
		driver.findElement(By.xpath("//*[@class='fb_logo img sp_iICNCrZgHFe sx_240b73']")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
		
	}

}
