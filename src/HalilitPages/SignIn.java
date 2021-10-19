package HalilitPages;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.PageFactory;

	import HalilitPages.SignUp;


	public class SignIn {
		
		static WebDriver driver;
		static SignUp pom;

		public static void test () {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\veron\\Downloads\\chromedriver32//chromedriver.exe");

			driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.halilit.com/");
			 driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS) ;
				pom = new SignUp();
				pom = PageFactory.initElements(driver, SignUp.class);
				SignUp.login_butn.click();
				driver.findElement(By.className("new_customer blue_link href_checked")).click();

			
			
			
		}
		
}
