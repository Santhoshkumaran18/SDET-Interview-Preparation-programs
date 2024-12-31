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

public class Prep21_Screenshot_of_A_page {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//navigate back and refresh and get methods
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://text-compare.com/");
		WebElement text1=driver.findElement(By.xpath("//textarea[@name='text1']"));
		//Screesnshot of a full page
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File Destination=new File(System.getProperty("user.dir")+ "\\test.png");
		FileUtils.copyFile(src, Destination);
		
		//Screenshot of particular portion
		File element=text1.getScreenshotAs(OutputType.FILE);
		File elementscreenshot=new File(System.getProperty("user.dir")+ "\\test1.png");
		FileUtils.copyFile(element, elementscreenshot);
		
		
		
	}
}