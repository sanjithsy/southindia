package org.india;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.glass.events.KeyEvent;

public class Details   {
public static void main(String[] args) throws InterruptedException, IOException, AWTException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sanjith\\eclipse-workspace\\SouthIndia\\driver\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
    driver.manage().window().maximize();
    driver.switchTo().frame("frame1");
    WebElement findElement = driver.findElement(By.xpath("//b[text()='Topic :']/following-sibling::input"));
    findElement.sendKeys("finn");
    
    driver.switchTo().frame("frame3");
    WebElement element = driver.findElement(By.id("a"));
    element.click();
    
    driver.switchTo().defaultContent();
    driver.switchTo().frame("frame2");
    WebElement element2 = driver.findElement(By.xpath("//select[@class='col-lg-3']"));
   element2.click();
   Robot r = new Robot();
   for(int i=0;i<4;i++) {
	   r.keyPress(KeyEvent.VK_DOWN);
	   r.keyRelease(KeyEvent.VK_DOWN);
   }
   r.keyPress(KeyEvent.VK_ENTER);
   r.keyRelease(KeyEvent.VK_ENTER);
   
}
}