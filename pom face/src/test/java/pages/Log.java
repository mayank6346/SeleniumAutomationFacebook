package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Log {
	
	WebDriver driver = null;

	By dropLog=By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[2]/div[4]/div[1]/span/div/div[1]/i");

    By clkLogout =By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[2]/div[4]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[4]/div/div[1]");

	

    public  Log(WebDriver driver) {
		this.driver=driver;
		
	}
    
    
    
    public void logDrop() {
		driver.findElement(dropLog).click();
		
	}
	
    public void logOutbtn() {
		driver.findElement(clkLogout).click();
		
	}
}
