import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Pratik 2020\\Userstories\\Selenium\\setup\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		dr.get("https://www.seleniumeasy.com/test/");
		dr.findElement(By.xpath("//a[contains(text(),'Input Forms')]")).click();
		WebDriverWait wt = new WebDriverWait(dr, 10);
		WebElement formDemo = wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Simple Form Demo')]")));
		formDemo.click(); 
		dr.findElement(By.id("user-message")).sendKeys("Hello All");
		dr.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();
		SoftAssert sfasrt = new SofyAsser();
		Assert.as
	}

}
