package SeleniumJavaInterviewQuestions;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prep22_Handling_cookies {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//navigate back and refresh and get methods
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		Set<Cookie> cookie=driver.manage().getCookies();
		System.out.println(cookie.size());
		for(Cookie c:cookie) {
			System.out.println(c.getName() + " " + c.getValue());
		}
		
		//How to add the cookie to the webpage
		Cookie cookieobj=new Cookie("Mycookie", "123456");
		driver.manage().addCookie(cookieobj);
		
		Set<Cookie> cookies=driver.manage().getCookies();
		System.out.println(cookies.size());
		
		//how to delete a cookie
		driver.manage().deleteCookie(cookieobj);
		
		Set<Cookie> cookies1=driver.manage().getCookies();
		System.out.println(cookies1.size());
		
		
		driver.manage().deleteAllCookies();
		Set<Cookie> cookies12=driver.manage().getCookies();
		System.out.println(cookies12.size());
		
		
	}
}