package com.Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTesting {
	
		WebDriver driver;
		@BeforeClass
		public void startBrowser() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		}
		
		@Test(priority = '1')
		public void login() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//email
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("mukilnithin@gmail.com");
		Thread.sleep(2000);
		//continue
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		Thread.sleep(3000);
		//password
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("**********");
		Thread.sleep(2000);
		//signin
		WebElement e4 = driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]"));
		Thread.sleep(5000);
		e4.click();
		}

		@Test(priority = '2')
		public void search() throws InterruptedException {
		//searchbar
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone 13");
		Thread.sleep(2000);
		
		//search
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		Thread.sleep(3000);
		
		
		//
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		Thread.sleep(5000);
		}

		@Test(priority = '3')
		public void cartdetails() throws InterruptedException {
		//add to cart
		driver.findElement(By.xpath("//*[@id=\"nav-cart-count-container\"]")).click();
		Thread.sleep(2000);
		}

}
		
