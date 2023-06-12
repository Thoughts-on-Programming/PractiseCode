package com.hirestreet.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.hirestreet.qa.util.TestUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;


	public TestBase() 
	{
		prop=new Properties();
		try {
			FileInputStream 
			ip = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/com/hirestreet/qa/config/config.properties");
			prop.load(ip);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	@Test
	public static void initialization()

	{
		String browserName=prop.getProperty("browser");
		switch(browserName) 
		{
		case "chrome":

			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			break;
		case "fireFox":

			WebDriverManager.firefoxdriver().setup();
			driver= new ChromeDriver();
			break;

		default:
			System.err.println("incorrect browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.pageLoadTimeOut,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.implecitWait,TimeUnit.SECONDS);
		
		
		driver.get(prop.getProperty("url"));
	}

}






