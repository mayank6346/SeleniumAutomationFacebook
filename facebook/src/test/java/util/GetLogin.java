package util;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.taskdefs.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class GetLogin {
	
	WebDriver driver = null;

	@BeforeTest
	public void setupTest() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(options);
		
	}
	
	
	
	@Test(dataProvider = "test1data",priority = 1)
	public void login(String username, String password) {
//		System.out.println(username+"|"+ password);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys("Qwerty@123");
		driver.findElement(By.name("login")).sendKeys(Keys.RETURN);
	}
	
	@SuppressWarnings("deprecation")
	@Test(priority = 2)
	public void post() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div/div[1]/div/div[1]/span")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		to write click
		driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div/div/div/div/div/div")).click();

		driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div/div[2]/div/div/div/div")).sendKeys("hello guys");
//      post button
		
		driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div[3]/div[2]/div")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@SuppressWarnings("deprecation")
	@Test(priority = 3,dependsOnMethods = {"post"})
	public void out() {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[2]/div[4]/div[1]/span/div/div[1]/i")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);		
//      logout button
	    driver.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[2]/div[4]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[4]/div/div[1]")).click();

		
	}



	@DataProvider(name = "test1data")
	public Object[][] getData() {
		String ProjectPath = System.getProperty("user.dir");
		Object data[][]=testData(ProjectPath +"/excel/qwe.xlsx", "Sheet1");
		return data;

	}





	@Test
	public  Object[][] testData(String excelpath,String SheetName ) {

		Login excel = new Login(excelpath, "Sheet1");


		int rowCount =excel.getRowCount();
		int colCount =excel.getRowCount();

		Object data[][] = new Object[rowCount-1][colCount];

		for(int i=1;i<rowCount;i++) {
			for (int j = 0; j < colCount; j++) {

				String cellData = excel.userLogin(i, j);
				data[i-1][j]=cellData;


			}
		}

		return data;
	}

}
