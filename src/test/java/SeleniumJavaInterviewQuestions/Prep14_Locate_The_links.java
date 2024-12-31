package SeleniumJavaInterviewQuestions;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prep14_Locate_The_links {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//navigate back and refresh and get methods
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.amazon.in/");
		
//		List<WebElement> links=driver.findElements(By.tagName("a"));
//		System.out.println("Total links in the page is: " + links.size());
//		
//		driver.findElement(By.linkText("Today's Deals")).click(); //When the link is present correctly we have to mention that
//		Thread.sleep(4000);
//		driver.findElement(By.partialLinkText("Customer")).click();
		List<WebElement> links=driver.findElements(By.tagName("a"));
	
		System.out.println(links.size());
		//BrokenLink program
		for(WebElement totallinks:links) {
			String url=totallinks.getDomAttribute("href");
			System.out.println(url);
//			brokenLinkscheck(url);
		}
	

	}
	
	public static void brokenLinkscheck(String inputurl) {
		try {
			URL url=new URL(inputurl);
			HttpURLConnection httpURLConnection=(HttpURLConnection) url.openConnection();
			httpURLConnection.setConnectTimeout(4000);
			httpURLConnection.connect();
			
			if(httpURLConnection.getResponseCode()>=400) {
				System.out.println(inputurl + " is a broken link " + httpURLConnection.getResponseMessage());
			}else {
				System.out.println(inputurl + " is not a broken link " + httpURLConnection.getResponseMessage());
			}
		} catch (Exception e) {
			
		}
	}

}
