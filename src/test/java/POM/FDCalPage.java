package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FDCalPage {
	
	public static WebDriver driver;
	
	public FDCalPage(WebDriver driver) {
		
		FDCalPage.driver=driver;
	
		PageFactory.initElements(driver, this);
					
	}
	
	@FindBy(xpath="//input[@id='mat-input-0']")
	WebElement FDamounttxtbox;
	
	@FindBy(xpath="//input[@id='mat-input-1']")
	WebElement timmetxtbox;
	
	@FindBy(xpath="//input[@id='mat-input-2']")
	WebElement Interesttxtbox;
	
	@FindBy(xpath="//button[@id='CIT-chart-submit']//div[@class='mdc-button__ripple']")	
	WebElement submiybutton;
	
	public void setFDamount(String amount){
		FDamounttxtbox.clear();
		FDamounttxtbox.sendKeys(amount);	
		
}
	
	public void setTimme(String timme){
		this.timmetxtbox.clear();
		this.timmetxtbox.sendKeys(timme);				
		
}
	
	
	public void setinterest( String interest) {
		Interesttxtbox.clear();
		Interesttxtbox.sendKeys(interest);
		
	}
	
	public void clickonsubmit() {
		submiybutton.click();
		
	}
	
	
}


