package com.seleniumnew.headlesschrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


        public class testing {
        	@Test
		public static void sampletest()
		
		{ 
				System.out.println("^&&&");
				System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
				
				ChromeOptions options = new ChromeOptions();
		        options.addArguments("headless");
				
		        WebDriver driver = new ChromeDriver(options);
				driver.get("https://www.google.com");
	    		 boolean title = driver.getTitle().contains("Google");

				    if(title)

				        System.out.println("I am working correctly");

				    else if(!title)

				        System.out.println("I am broken!");
	}
}
