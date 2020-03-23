import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Checkmethodsdemo {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "E:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
System.setProperty("webdriver.gecko.driver","E:\\Jar Files\\geckodriver.exe" );
WebDriver driver=new FirefoxDriver(); 
		driver.navigate().to("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		boolean checkpresence=driver.findElement(By.id("Email")).isDisplayed();
		System.out.println(checkpresence);
	boolean checkenable=driver.findElement(By.id("Email")).isEnabled();
	System.out.println(checkenable);
	
	if(checkpresence && checkenable==true)
	{
		driver.findElement(By.id("Email")).sendKeys("manishjuturu@gmail.com");
	}	
	}
	}
