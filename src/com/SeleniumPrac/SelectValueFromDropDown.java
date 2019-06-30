package com.SeleniumPrac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectValueFromDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\IMPFiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.navigate().to("http://demo.guru99.com/test/newtours/register.php");
		js.executeScript("window.scrollBy(0,550)","");
		WebElement fname=driver.findElement(By.name("firstName"));
		WebElement lname=driver.findElement(By.name("lastName"));
		WebElement phone=driver.findElement(By.name("phone"));
		WebElement email=driver.findElement(By.name("userName"));
		WebElement address=driver.findElement(By.name("address1"));
		WebElement city=driver.findElement(By.name("city"));
		WebElement state=driver.findElement(By.name("state"));
		WebElement postalcode=driver.findElement(By.name("postalCode"));
		WebElement usr=driver.findElement(By.name("email"));
		WebElement password=driver.findElement(By.name("password"));
		WebElement confPassword=driver.findElement(By.name("confirmPassword"));
		fname.sendKeys("xyz");
		lname.sendKeys("abc");
		phone.sendKeys("1234567890");
		email.sendKeys("anc@gmail.com");
		address.sendKeys("pune");
		city.sendKeys("pune");
		state.sendKeys("MH");
		postalcode.sendKeys("413304");
		Select country=new Select(driver.findElement(By.name("country")));
		country.selectByValue("INDIA");
		usr.sendKeys("anc@gmail.com");
		password.sendKeys("qwertyuiop");
		confPassword.sendKeys("qwertyuiop");
		driver.findElement(By.name("submit")).click();
		driver.navigate().back();
		driver.close();
		

	}

	private static JavascriptExecutor driver() {
		// TODO Auto-generated method stub
		return null;
	}

}
