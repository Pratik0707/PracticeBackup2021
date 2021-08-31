import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Form {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Pratik 2020\\\\Userstories\\\\Selenium\\\\setup\\\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		dr.get("https://www.seleniumeasy.com/test/");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wt = new WebDriverWait(dr,10);
		WebElement drpDwn = wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Input Forms')]/b")));
		drpDwn.click();
		
		

	}

}
