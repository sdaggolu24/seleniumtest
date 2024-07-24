package POM;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Implicit {
	
	public WebDriver driver;
  @Test
  public void test () throws InterruptedException {
	  
	  
	  driver= new EdgeDriver();
	  
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	 
	 // implicit wait declaration
	 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	  driver.get("https://demo.guru99.com/test/guru99home/");
	  driver.manage().window().maximize();
	  
	wait.until(ExpectedConditions.titleContains("Demo Guru99 Page"));
	  
	  String eTitle=driver.getTitle();
	  
	  System.out.println(eTitle);
	  
WebElement link=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://www.guru99.com/books.html']")));
			  
	link.click();		 
			  
	Thread.sleep(20);
	
	
	//Alert alert=  driver.switchTo().alert();
	
	//alert.dismiss();
	
  }
  
  
  
  @AfterClass
  void tear_down() {
	  if (! driver.equals(null)){
		  driver.quit();
	  }
  }
  
}
