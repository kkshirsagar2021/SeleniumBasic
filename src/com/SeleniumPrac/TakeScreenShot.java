package com.SeleniumPrac;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\IMPFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		 File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 try {
			 // now copy the  screenshot to desired location using copyFile //method
			FileUtils.copyFile(src, new File("C:/selenium/error.png"));
			}
			 
			catch (IOException e)
			 {
			  System.out.println(e.getMessage());
			 
			 }
		Thread.sleep(3000);
		driver.close();

	}

}
