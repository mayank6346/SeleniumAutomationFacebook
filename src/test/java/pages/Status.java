package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Status {
	
	
	
	WebDriver driver = null;
	By clickOnstatus=By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div/div[1]/div/div[1]/span");
	By clickToWrite=By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div/div/div/div/div/div");
	By WriteStatus =By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div/div[2]/div/div/div/div");
	By PostBtn=By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div[3]/div[2]/div");

	
	
	public Status(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void clickStatus() {
		driver.findElement(clickOnstatus).click();
		
	}
	
	public void clickWrite() {
		driver.findElement(clickToWrite).click();
		
	}
	
	public void Write(String text) {
		driver.findElement(WriteStatus).sendKeys(text);
		
	}
	
	public void btnPost() {
		driver.findElement(PostBtn).click();
		
	}
	
	
	

}
