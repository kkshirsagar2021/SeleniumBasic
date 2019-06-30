package com.SeleniumPrac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\IMPFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		//String text=driver.getText();
		//String pgsrc=driver.getPageSource();
		System.out.println(title);
		System.out.println(url);
		//System.out.println(pgsrc);
		driver.close();
		
	}

}
