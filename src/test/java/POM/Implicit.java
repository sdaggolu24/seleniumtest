package POM;

import org.testng.annotations.Test;

public  class Implicit  extends baseclass{
	
	
		
		// TODO Auto-generated constructor stub
//	}

//public WebDriver driver;
@Test
  public void test () throws InterruptedException {
	  
	
	 // driver= new ChromeDriver();
	  
	  driver.get(url);
	//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	 
	 // implicit wait declaration
	 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
	 // driver.get("https://demo.guru99.com/test/guru99home/");
	 // driver.manage().window().maximize();
	  
	//wait.until(ExpectedConditions.titleContains("Demo Guru99 Page"));
	  
	  String eTitle=super.driver.getTitle();
	  
	  System.out.println(eTitle);
	  
	//  WebElement link=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://www.guru99.com/books.html']")));
			  
	//link.click();		 
			  
	Thread.sleep(20);
	
	
	//Alert alert=  driver.switchTo().alert();
	
	//alert.dismiss();

  } 
   
}
