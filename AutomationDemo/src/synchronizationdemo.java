import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class synchronizationdemo {

	public static void main(String[] args) {
					System.setProperty("webdriver.chrome.driver", "E:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//Implicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //Implicit wait
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.name("Submit")).click();
	
	WebDriverWait Mywait=new WebDriverWait(driver,10); //explicit wait
	Mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));
	driver.findElement(By.xpath("//a[@id='welcome']")).click();
	WebDriverWait Mywait1=new WebDriverWait(driver,10); //explicitwait
	Mywait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[contains(text(),'Logout')]")));
	
	driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	driver.close();
	

	}

}
