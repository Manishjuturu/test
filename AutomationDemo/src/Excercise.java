import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Excercise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Jar Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
				driver.get("http://demowebshop.tricentis.com/login");
String actualresult=driver.getTitle();
System.out.println(actualresult);
System.out.println((actualresult).length());
String expectedresult=("http://demowebshop.tricentis.com/login");
	String actualresult1=driver.getCurrentUrl();
	System.out.println(actualresult);
	
	if(expectedresult.equals(actualresult1))
	{
		System.out.println("success");
	}
	else
	{	System.out.println("fail");
	}
	
	String A2= driver.getPageSource();
	System.out.println(A2);
	System.out.println(A2.length());
	driver.close();
	
	
	
	
	}

}
