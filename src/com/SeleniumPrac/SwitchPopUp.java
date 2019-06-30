package com.SeleniumPrac;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\IMPFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String alertMessage="";
		driver.manage().window().maximize();
		driver.navigate().to("http://jsbin.com/usidix/1");
		driver.findElement(By.xpath("//*[@value='Go!']")).click();
		alertMessage=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		System.out.println(alertMessage);
		Thread.sleep(1000);
		driver.close();

	}

}
