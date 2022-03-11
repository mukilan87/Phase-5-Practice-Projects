package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Login {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://phptravels.org/login");
		
		//email
		WebElement e1 = driver.findElement(By.xpath("//*[@id=\"inputEmail\"]"));
		Thread.sleep(2000);
		e1.sendKeys("rajnikumar123@gmail.com");
		
		//password
		WebElement e2 = driver.findElement(By.xpath("//*[@id=\"inputPassword\"]"));
		Thread.sleep(2000);
		e2.sendKeys("Rajni@123");
		
		//login
		WebElement e3 = driver.findElement(By.xpath("//*[@id=\"login\"]"));
		Thread.sleep(2000);
		e3.click();
				

	}

}
