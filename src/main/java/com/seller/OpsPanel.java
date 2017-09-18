package main.java.com.seller;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpsPanel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishan.Gaur\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("http://staging2.api.ibiboryde.com/admin/dispatch/bookings/trip");
			Thread.sleep(2000);
			// driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			Thread.sleep(1000);

			//driver.findElement(By.xpath("//*[@id=\'wrap\']/div/div/a")).click();
			//Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@name=\'password\']")).sendKeys("ibibo@");
			driver.findElement(By.xpath("//*[@name=\'username\']")).sendKeys("testingseller14");
			driver.findElement(By.xpath("//*[@name=\'password\']")).sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\'start_time\']")).click();
			driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr[4]/td[4]/a")).click();
			driver.findElement(By.xpath("//*[@id=\'end_time\']")).click();
			driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr[5]/td[3]/a")).click();			
			driver.findElement(By.xpath("//*[@id=\'booking_status\']")).click();
	
			
			driver.findElement(By.xpath("//*[@id=\'side-menu\']/li[2]/ul/li[1]/a")).click();
			driver.findElement(By.xpath("//*[@id=\'dataTables-reports_filter\']/label/input")).sendKeys("5565caa669702d7dec000000");
			driver.findElement(By.xpath("//*[@id=\'dataTables-reports_filter\']/label/input")).clear();
			driver.findElement(By.xpath("//*[@id=\'dataTables-reports_filter\']/label/input")).sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();	
		} finally {
			//driver.close();
		}
	}

}
