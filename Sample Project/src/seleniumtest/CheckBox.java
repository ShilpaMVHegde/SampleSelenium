package seleniumtest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		/*Questions for this assignment
Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked*/
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
		//to uncheck
		driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).isSelected());
		/*2.How to get the Count of number of check boxes present in the page*/
				driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
		
	}
}
