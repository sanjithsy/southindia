package org.andrapradesh;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.sun.glass.events.KeyEvent;

import sun.net.ftp.FtpDirEntry.Type;

public class SouthIndia {
 public static void main(String[]args) throws InterruptedException, AWTException, IOException{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjith\\eclipse-workspace\\SouthIndia\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	 driver.get("https://chercher.tech/practice/dropdowns");
	 driver.manage().window().maximize();
	  
	
	    
	    
	 
 } 
}