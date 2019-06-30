package com.SeleniumPrac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAndCheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\IMPFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.navigate().to("http://demo.guru99.com/test/radio.html");
		WebElement bt1=driver.findElement(By.id("vfb-7-1"));
		WebElement bt2=driver.findElement(By.id("vfb-7-2"));
		WebElement bt3=driver.findElement(By.id("vfb-7-3"));
		WebElement ch1=driver.findElement(By.id("vfb-6-0"));
		WebElement ch2=driver.findElement(By.id("vfb-6-1"));
		WebElement ch3=driver.findElement(By.id("vfb-6-2"));
		bt1.click();
		//bt2.click();
		//bt3.click();
		ch1.click();
		ch2.click();
		ch3.click();
		if(bt1.isSelected()){
			System.out.println("Button is Toggled");
		}
		else if(bt2.isSelected()){
			System.out.println("Button is Toggled");
		}
		else if(bt3.isSelected()){
			System.out.println("Button is Toggled");
		}
		else
		{
			System.out.println("Please click on button");
		}
		driver.close();
		

	}

}
