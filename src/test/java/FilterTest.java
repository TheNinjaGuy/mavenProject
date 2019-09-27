import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FilterTest {
	@Test
	  public void f1() {
		  System.out.println("f1");
		  //Create Driver Object
		  System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		  //Actions on browser
		  driver.get("https://www.google.com");
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		  //Close browser
		  driver.close();
	  }
	  @Test
	  public void f2() {
		  System.out.println("f2");
		//Create Driver Object
		  System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		  //Actions on browser
		  driver.get("https://www.google.com");
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		  //Close browser
		  driver.close();
	  }
	  @Test
	  public void f3() {
		  System.out.println("f3");
		//Create Driver Object
		  System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		  //Actions on browser
		  driver.get("https://www.google.com");
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		  //Close browser
		  driver.close();
	  }
	  @Test
	  public void f4() {
		  System.out.println("f4");
		//Create Driver Object
		  System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		  //Actions on browser
		  driver.get("https://www.google.com");
		  System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		  //Close browser
		  driver.close();
	  }
}
