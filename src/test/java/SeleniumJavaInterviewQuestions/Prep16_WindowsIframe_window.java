package SeleniumJavaInterviewQuestions;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prep16_WindowsIframe_window {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//navigate back and refresh and get methods
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.switchTo().frame("iframe-name");
		
		driver.findElement(By.xpath("//a[contains(@class,'btn btn-theme')]")).click();
		Thread.sleep(4000);
		
		
		driver.navigate().to("https://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
		
		System.out.println(driver.findElement(By.xpath("//body[@id='tinymce']/p")).getText());
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		
	}

}
