import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.sbi.co.in");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[@class='nav-link active']")).click();
		
		//driver.switchTo().window(String )
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "2");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//div/div/a[@href='https://retail.onlinesbi.com/retail/login.htm']/span[@class='classicTxt']")).click();
		
		

	}

}
