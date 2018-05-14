package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;


public class Test {
	
	
	public static void main(String[] args){
	
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QAP29\\Downloads\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		
		
		
	}

}
