package SeleniumJavaInterviewQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prep13_Browser_Window_handling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//navigate back and refresh and get methods
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
//		String parentWindow=driver.getWindowHandle();
//		System.out.println(parentWindow);
//		System.out.println(driver.getTitle());
		WebElement newWindowClick=driver.findElement(By.xpath("//button[@id='newWindowBtn']"));
//		newWindowClick.click();
		WebElement newTabClick=driver.findElement(By.xpath("//button[@id='newTabBtn']"));
		newTabClick.click();
		
		Set<String> windows=driver.getWindowHandles();
//		for(String window:windows) {
//			System.out.println(driver.switchTo().window(window).getTitle());
//		}
		
//		Iterator<String> it=windows.iterator();
//		String parentid=it.next();
//		String childid=it.next();
//		
//		System.out.println(parentid);
//		System.out.println(childid);
		
		//using Arraylist and converting the set into the list
		
//		List<String> windowids=new ArrayList(windows);
//		String parid=windowids.get(0);
//		String chiId=windowids.get(1);
//		System.out.println(parid);
//		System.out.println(chiId);
		
		
		String parentWindow=driver.getWindowHandle();
		Set<String> windowstab=driver.getWindowHandles();
		Iterator<String> wintab=windowstab.iterator();
		String partab=wintab.next();
		String chitab=wintab.next();
		System.out.println("Parent Window Title:" + driver.switchTo().window(partab).getTitle());
		System.out.println("Child Window Title:" + driver.switchTo().window(chitab).getTitle());
		
		
		
		
		
		
		
	

	}

}
