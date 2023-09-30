package com.hrms.LIB;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hrms.objects.ObjectsInfo;

public class General extends ObjectsInfo {
	
//	to open browser and url
	   public void setUp(){
		   System.setProperty("webdriver.chrome.driver","./drivers//chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
	   }
	   
//	   to close window
	   public void tear(){
		   
		   driver.close();
		   System.out.println("window closed");
		   
	   }
	   
//	   to perform login operation
	   public void loginn() throws InterruptedException{
		   driver.findElement(By.name(userid)).sendKeys(uid);
		   driver.findElement(By.name(userpwd)).sendKeys(pwd);
           driver.findElement(By.xpath(userlogin)).click();
           Thread.sleep(5000);
           System.out.println("Login successfull");

	   }

//	   to perform logout operation
	   public void logoutt() throws InterruptedException{
		   driver.findElement(By.xpath(profileBtn)).click();
		   Thread.sleep(4000);
		   driver.findElement(By.linkText(userlogout)).click();
		   System.out.println("logout is successful");
		   Thread.sleep(4000);

	   }
	   

}
