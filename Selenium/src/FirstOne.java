import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FirstOne {

	@Test(groups = "pp", dependsOnGroups= {"aa","bb"}, alwaysRun = true, priority=2)
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Pratik 2020\\Userstories\\Selenium\\setup\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.google.com/");
		dr.manage().window().maximize();
		dr.get("https://www.amazon.in");
		dr.manage().window().maximize();
		dr.quit();
		WebElement abc = dr.findElement(By.xpath("sdasdasdsa"));
		abc.sendKeys(Keys.CONTROL+"t");
		dr.switchTo().alert().accept();
		//		Runtime.getRuntime().exec("URL");
		SoftAssert sf = new SoftAssert();
		sf.assertAll();
		List<WebElement> ls = dr.findElements(By.xpath(""));
		for(WebElement wb : ls)
		{
			if((wb.getText()).equals("Canada"))
			{
				wb.click();
			}
		}

		Actions act = new Actions(dr);
		act.sendKeys(Keys.CONTROL,"T");

		String curWin = dr.getWindowHandle();

	}
}



















