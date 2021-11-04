import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tab_window {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Pratik 2020\\Personal\\selenium\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		dr.get("https://opensource-demo.orangehrmlive.com/");
		dr.manage().window().maximize();
		Thread.sleep(4000);
		WebElement uname = dr.findElement(By.id("txtUsername"));
		String handel_curent =dr.getWindowHandle();
		Actions act = new Actions(dr);
		JavascriptExecutor js = (JavascriptExecutor)dr;
		js.executeScript("window.open()");

//		WebElement body = dr.findElement(By.tagName("body"));
//	    body.sendKeys(Keys.chord(Keys.CONTROL, "n"));
//		uname.sendKeys(Keys.CONTROL +"t");
//		dr.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		System.out.println("switched to tab");
		Thread.sleep(3000);
		dr.switchTo().window(handel_curent);
		System.out.println("1");
	     Actions action = new Actions(dr);
	     action.sendKeys(Keys.chord(Keys.CONTROL, "N")).build().perform();
	 	System.out.println("2");
		
	}

}
