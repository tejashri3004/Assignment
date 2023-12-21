package myfirstjavaproject;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class firstseltest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Tejashri\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
	WebDriver driver= new ChromeDriver();
	
	
	driver.get("https://www.google.com/");
	
	//driver.navigate().to("https://www.yahoo.com/");
	String my_text1=driver.getTitle();
	System.out.println(my_text1);
	driver.findElement(By.name("q")).sendKeys("java tutorial");
	driver.manage().window().maximize();  //sub method for web page 
	driver.navigate().refresh();
	driver.navigate().back();
	driver.navigate().forward();
	driver.manage().deleteAllCookies();
	 	System.out.println("all cookies deleted successfully");
	 	driver.manage().timeouts();
	 //	pageLoadTimeout(40,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 	
	 	
	 	
	 	
	 //	driver.close();
	 	//driver.quit();
	String my_title=driver.getTitle();
	System.out.println("the title of web page is open" +my_title);
	//driver.findElement(( By.name("q"))).clear();*/
	}
}
