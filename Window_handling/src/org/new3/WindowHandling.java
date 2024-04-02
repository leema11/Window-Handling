package org.new3;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("IPHONE 15");

		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("(//span[text()='Apple iPhone 15 (128 GB) - Black'])[1]")).click();

		Set<String> parent = driver.getWindowHandles();
		for (String child : parent) {
			driver.switchTo().window(child);
		}

	}

}
