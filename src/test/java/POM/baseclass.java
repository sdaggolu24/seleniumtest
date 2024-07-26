//create base.java file for common  actions
package POM;
import java.time.Duration;


import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;


public class baseclass{
	
	public static  WebDriver driver;
	
	public static String url="https://demo.guru99.com/test/guru99home/";
	
	
	
	@BeforeClass
	public  void setup() {
				
		driver= new ChromeDriver();
		
		 // implicit wait declaration
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.manage().window().maximize();		
		  
		  driver.get(url);
				
		  System.out.println("Base class");		
		
	}	
	
	

    @AfterClass
	public void tear_down() {
		// TODO Auto-generated method stub
		
		  if (! driver.equals(null)){
			  driver.quit();
		  }
		
	}
	  
	

	
}