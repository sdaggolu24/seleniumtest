package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FDCalcenq {
  
  
  	WebDriver driver;
	FileInputStream file;	
	Properties   propobj;
	 FDCalPage FDcal;

	String congigfile=System.getProperty("User.dir")+"\\TestData\\config.prperties";
	
			
	
@BeforeClass
public void Setup() throws FileNotFoundException {
	  file= new FileInputStream(System.getProperty("user.dir")+"\\TestData\\config.properties");
	  System.out.println (file);
	  
	  driver= new ChromeDriver();
	  
	 FDcal=new FDCalPage(driver);
	 	   
	  propobj=new Properties();
	  try {
		propobj.load(file);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  driver.get(propobj.getProperty("url"));
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
		  
	  
	  
}

@Test
public void f() throws InterruptedException {
	
	  String fdvalu=propobj.getProperty("Damount");
	  String length=propobj.getProperty("time");
	  String Interest=propobj.getProperty("Interest");
	 // String Compound=propobj.getProperty("Compound");
	  
	  FDcal.setFDamount(fdvalu);
	  FDcal.setTimme(length);	  
	  FDcal.setinterest(Interest);
	  FDcal.clickonsubmit();
	  
	  Thread.sleep(30);
	
	  
	  
	  
}

	@AfterClass
	void teardown() throws IOException {
	FDcal=null;
	file.close();
	propobj.clear();
	driver.quit();
	}


  
}
