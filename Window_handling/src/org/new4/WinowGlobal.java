package org.new4;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinowGlobal {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		driver.findElement(By.id("Open New Window")).click();
		driver.findElement(By.xpath("(//a[@class='button e.g. button_hilite button_pale small_button'])[2]")).click();
		
		   Set<String> a = driver.getWindowHandles();
		   
		   for(String c:a)
		   {
			   driver.switchTo().window(c);
		   }
		
	}
}
