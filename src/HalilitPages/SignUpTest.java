package HalilitPages;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.NullArgumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class SignUpTest {

	static WebDriver driver;
	static SignUp pom;
	
	@BeforeTest
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\veron\\Downloads\\chromedriver32//chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.halilit.com/");
		//	driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS) ;
			pom = new SignUp();
			pom = PageFactory.initElements(driver, SignUp.class);
	}
			
			
			public void test1() throws NullArgumentException{
				SignUp.login_butn.click();
				driver.findElement(By.className("new_customer blue_link href_checked")).click();
				
				
			}
			}
			
			
			
			
		
		
	

