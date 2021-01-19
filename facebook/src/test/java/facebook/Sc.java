package facebook;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sc {



	public static void main(String[] args) {

	
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		Scanner sc = new Scanner(System.in); 
		int i = sc.nextInt(); 

		if (i==1) {
			System.out.println("fir");
			WebDriver driver= new ChromeDriver();


		} 
		else if(i==2){
			System.out.println("ie");
			WebDriver driver= new Firefox();

		}
		else if(i==3)
		{
			System.out.println("chrome");
			WebDriver driver= new iEexplorer();

		}


	}

}
