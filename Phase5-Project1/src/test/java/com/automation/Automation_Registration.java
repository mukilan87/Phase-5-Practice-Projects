package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_Registration {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.get("https://phptravels.org/register.php");
		
		//firstname
		WebElement e1 = driver.findElement(By.xpath("//*[@id=\"inputFirstName\"]"));
		Thread.sleep(3000);
		e1.sendKeys("Rajni");
		
		//lastname
		WebElement e2 = driver.findElement(By.xpath("//*[@id=\"inputLastName\"]"));
		Thread.sleep(2000);
		e2.sendKeys("Kumar");
		
		//email
		WebElement e3 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div[1]/form/div[1]/div[1]/div[2]/div/div[3]/div/input"));
		Thread.sleep(2000);
		e3.sendKeys("rajnikumar123@gmail.com");
		
		//street Address
		WebElement e4 = driver.findElement(By.xpath("//*[@id=\"inputAddress1\"]"));
		Thread.sleep(2000);
		e4.sendKeys("123");
		
		
		//city
		WebElement e5 = driver.findElement(By.xpath("//*[@id=\"inputCity\"]"));
		Thread.sleep(2000);
		e5.sendKeys("delhi");
		
		//phn number
		WebElement e6 = driver.findElement(By.xpath("//*[@id=\"inputPhone\"]"));
		Thread.sleep(2000);
		e6.sendKeys("987654321");
				
		//country
		WebElement e7 = driver.findElement(By.xpath("//*[@id=\"inputCountry\"]"));
		Thread.sleep(2000);
		Select dd = new Select(e7);
		dd.selectByIndex(2);
		
		//password
		WebElement e8 = driver.findElement(By.xpath("//*[@id='inputNewPassword1']"));
		Thread.sleep(2000);
		e8.sendKeys("Rajni@123");
		
		//confirm password
		WebElement e9 = driver.findElement(By.xpath("//*[@id='recaptcha-anchor']/div[1]"));
		Thread.sleep(2000);
		e9.sendKeys("Rajni@123");
		
		//register
		WebElement e10 = driver.findElement(By.xpath("//*[@id=\"frmCheckout\"]/div[5]/input"));
		Thread.sleep(10000);
		e10.click();
		
	}

}
