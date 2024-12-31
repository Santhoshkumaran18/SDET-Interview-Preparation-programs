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

public class Prep15_JavaScriptAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//navigate back and refresh and get methods
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();
		
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement jsAlertok=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		jsAlertok.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(4));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='result']")));
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());

		WebElement jsAlertokAndConfirm=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		jsAlertokAndConfirm.click();
		System.out.println(alert.getText());
		alert.dismiss();
		
		WebElement jsAlertentervalues=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		jsAlertentervalues.click();
		
		String value="I am Santhosh Kumaran S";
		alert.sendKeys(value);
		alert.accept();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='result']")));
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
		
		driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		String textvalue=driver.findElement(By.xpath("//div[@class='example']/p")).getText();
		System.out.println(textvalue);
		
		
		
	}

}
