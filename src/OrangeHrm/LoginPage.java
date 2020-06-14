package OrangeHrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "c:/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,10000);
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.manage().window().maximize();
		
		System.out.println("Title of the Page is :"+driver.getTitle());
		String username=driver.findElement(By.xpath("//a[@id='welcome']")).getText();
		if (username.contains("Admin"))
		{
			System.out.println("Validation Sucess");
		}
		else
		{
			System.out.println("Validation Fail");
		}
		Actions act=new Actions(driver);
		WebElement admin_link=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
		WebElement usermgmt_link=driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"));
		WebElement users=driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]"));
		act.moveToElement(admin_link).moveToElement(usermgmt_link).moveToElement(users).click().build().perform();
		//driver.findElement(By.xpath("//a[@id='welcome']")).click();
		
		//WebElement logout=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
		//logout.click();
		
		//driver.findElement(By.linkText("Logout")).click();
	
		
		//driver.close();
		
	}

}
