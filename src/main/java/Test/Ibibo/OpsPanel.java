package main.java.Test.Ibibo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpsPanel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishan.Gaur\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("http://staging2.api.ibiboryde.com/admin/sign_in");
			Thread.sleep(5000);
			// driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			Thread.sleep(5000);

			driver.findElement(By.xpath("//*[@id=\'wrap\']/div/div/a")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\'identifierId\']")).sendKeys("krishan.gaur@go-mmt.com");
			driver.findElement(By.xpath("//*[@id=\'identifierNext\']/content/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\'password\']/div[1]/div/div[1]/input")).sendKeys("Dixit@123_krishan");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\'passwordNext\']/content/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\'view_container\']/form/div[2]/div/div/div[3]/div/div")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\'view_container\']/form/div[2]/div/div/div/ul/li[3]/div/div[2]")).click();
			Thread.sleep(4000);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//driver.close();
		}
	}

}
