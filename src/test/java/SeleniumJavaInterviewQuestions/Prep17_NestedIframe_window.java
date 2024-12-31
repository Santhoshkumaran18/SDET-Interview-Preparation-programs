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

public class Prep17_NestedIframe_window {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//navigate back and refresh and get methods
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demo.automationtesting.in/Frames.html");
		
		WebElement outeriFrame=driver.findElement(By.xpath("//div[contains(@class,'container iframes-page-container')]"));
		driver.switchTo().frame(outeriFrame); //here frame is passing as a webelement
		driver.findElement(By.xpath("//li[@class='active']/a[@href='#Multiple']")).click();
		
		System.out.println(driver.findElement(By.xpath("/hts not support iframes.</p>']")).getText());
		
		
	}

}
