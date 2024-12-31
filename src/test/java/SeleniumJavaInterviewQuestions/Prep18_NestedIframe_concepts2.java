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

public class Prep18_NestedIframe_concepts2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//navigate back and refresh and get methods
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.w3schools.com/Html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		driver.switchTo().frame("iframeResult");
		System.out.println(driver.findElement(By.xpath("//body[@contenteditable='false']/h2")).getText());
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Iframe Example']")));
		
		//driver.switchTo().frame(0); -->capture using the index value
		System.out.println(driver.findElement(By.xpath("//body[@style='background-color:powderblue']/h1")).getText());
		
		driver.switchTo().parentFrame();// -->outerframe
		
		System.out.println(driver.findElement(By.xpath("//body[@contenteditable='false']/p")).getText());
		
	}

}
