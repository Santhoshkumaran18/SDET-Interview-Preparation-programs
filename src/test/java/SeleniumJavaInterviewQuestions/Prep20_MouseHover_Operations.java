package SeleniumJavaInterviewQuestions;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prep20_MouseHover_Operations {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//navigate back and refresh and get methods
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightClick=driver.findElement(By.xpath("//span[contains(@class,'context-menu-one btn btn-neutral')]"));
		Actions actions=new Actions(driver);
		actions.contextClick(rightClick).perform();
		
		//double click actions
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		WebElement doubleClick=driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		actions.doubleClick(doubleClick).perform();
		
		//Drag and drop
		WebElement draggable=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement droppable=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		actions.dragAndDrop(draggable, droppable).perform();
		
		//mousehover actions
//		driver.navigate().to("https://demo.opencart.com/");
//		WebElement Desktops=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
//		WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
//		actions.moveToElement(Desktops).moveToElement(mac).click().perform();
		
		//
	}

}