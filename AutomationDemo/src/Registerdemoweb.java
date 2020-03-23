
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registerdemoweb {


public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\Jar files\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://demowebshop.tricentis.com/register");
driver.findElement(By.id("FirstName")).sendKeys("manish");
driver.findElement(By.id("LastName")).sendKeys("juturu");
driver.findElement(By.id("Email")).sendKeys("manishjuturu@gmail.com");
driver.findElement(By.name("Password")).sendKeys("manish");
driver.findElement(By.name("ConfirmPassword")).sendKeys("manish");
driver.findElement(By.id("gender-male")).click();
driver.findElement(By.id("register-button")).click();

driver.findElement(By.xpath("//a[@class='ico-login']")).click();



driver.get("http://demowebshop.tricentis.com/registerresult/1");
driver.findElement(By.xpath("//input[@class='button-1 register-continue-button']")).click();



}

}

