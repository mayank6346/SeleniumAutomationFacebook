package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Home {

	WebDriver driver = null;
	By username_text=By.id("email");
	By password_text= By.id("pass");
	By Login_btn=By.name("login");
	
	
	public  Home(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	
	public void setUsername(String text)
	{
		driver.findElement(username_text).sendKeys(text);
	}
	
	public void setPassword(String text)
	{
		driver.findElement(password_text).sendKeys(text);
	}
	
	public void clkbutton()
	{
		driver.findElement(Login_btn).sendKeys(Keys.RETURN);
	}
	
	

}
