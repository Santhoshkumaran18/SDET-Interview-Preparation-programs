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
import org.openqa.selenium.JavascriptExecutor;
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

public class Prep26_JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//navigate back and refresh and get methods
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		//We can able to flash an element
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		 
		 //Drawing border and taking screenshot
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		Prep26_JavaScriptExecutorMethod.drawBorder(logo, driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.body.style.zoom='150%'");
		
		 //Getting title of the page
		 
		 //click actions
		 
		 //Generate an alert
		 
		 //Refreshing the page
		 
		 //Scroll up the page
		 
		 //Zoom in and zoom out page
	}
}