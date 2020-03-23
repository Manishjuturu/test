import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserNavigationDemo {
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "E:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.navigate().to("http://demowebshop.tricentis.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//a[@class='ico-register']")).click();
driver.navigate().back(); 
Thread.sleep(3000);
driver.navigate().forward();
Thread.sleep(3000);
driver.navigate().to("http://demowebshop.tricentis.com/");
Thread.sleep(3000);
driver.navigate().refresh();
Thread.sleep(3000);
driver.close();
}
}
