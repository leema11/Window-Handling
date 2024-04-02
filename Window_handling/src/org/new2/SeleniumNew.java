package org.new2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumNew {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("IPHONE 15");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//div[@class='rush-component s-featured-result-item ']//span[@class='a-size-medium a-color-base a-text-normal'][normalize-space()='Apple iPhone 15 (128 GB) - Black']")).click();
		
		
		Set<String> parent = driver.getWindowHandles();
		
		for(String child:parent)
		{
			
	      driver.switchTo().window(child);
		}
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone 15");
//		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//		driver.findElement(By.xpath("//div[@class='rush-component s-featured-result-item ']//span[@class='a-size-medium a-color-base a-text-normal'][normalize-space()='Apple iPhone 15 (128 GB) - Black']")).click();
//		
//		Set<String> parent = driver.getWindowHandles();
//		
//		for(String nextwindow:parent)
//		{
//			WebDriver secondwindow = driver.switchTo().window(nextwindow);
//					
//		}
//		
		
		
		
		
//		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']")).click();
//		
//				
//		Set<String> s = driver.getWindowHandles();
//		 	
//		for(String i : s)
//		{
//			String t = driver.switchTo().window(i).getTitle();
//			System.out.println(t);
//		}
//	
//		driver.quit();
//		 	
	}

	
}
