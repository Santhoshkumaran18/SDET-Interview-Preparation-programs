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
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prep25_sizeofWebElement {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//navigate back and refresh and get methods
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		//Open link in new tab
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		
		WebElement logo=driver.findElement(By.xpath("//img[contains(@alt,'nopCommerce demo store')]"));
		System.out.println("Location(x,y)"+ logo.getLocation());
		System.out.println("Location(x)"+ logo.getLocation().getX());
		System.out.println("Location(y)"+ logo.getLocation().getY());
		
		//Rectangle method to capture the size
		System.out.println("x: " + logo.getRect().getX());
		System.out.println("y: " + logo.getRect().getY());
		
		//size of the element -Method 1
		System.out.println("Size: " + logo.getSize());
		System.out.println("Height: " + logo.getSize().getHeight());
		System.out.println("Width: " + logo.getSize().getWidth());
		
		//size of the element -Method 1
		System.out.println("Height: " + logo.getRect().getDimension().getHeight());
		System.out.println("Width: " + logo.getRect().getDimension().getWidth());
	}
}