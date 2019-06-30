package com.SeleniumPrac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\IMPFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(1000);
		//driver.get("https://www.google.com/");
		//Thread.sleep(1000);
		driver.navigate().refresh();//Refresh the current page
		driver.navigate().back();//move back to one page on browser history
		//driver.navigate().forward();//move to one next page on browser history
		driver.close();
		

	}

}
