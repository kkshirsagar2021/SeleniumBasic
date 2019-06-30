package com.SeleniumPrac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\IMPFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/selenium/deprecated.html");
		List<WebElement> lks=driver.findElements(By.tagName("a"));
		System.out.println(lks);

	}

}
