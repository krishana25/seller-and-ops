package main.java.Test.Ibibo;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SellerPanel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Krishan.Gaur\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("http://staging1.api.ibiboryde.com/seller");
			Thread.sleep(5000);
			// driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			Thread.sleep(5000);

			//driver.findElement(By.xpath("//*[@id=\'wrap\']/div/div/a")).click();
			//Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[1]/form/div[1]/input")).sendKeys("apple@gmail.com");
			//driver.findElement(By.xpath("//*[@id=\'identifierNext\']/content/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[1]/form/div[2]/input")).sendKeys("ibibo@");
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div[2]/div[1]/form/div[3]/button")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div/a[3]/div/span/div/div/span[2]")).click();
			Thread.sleep(4000);
			//driver.findElement(By.xpath("//*[@id=\'app\']/div/div[2]/div/a[4]/div/span/div/div/span[2]")).click();
			Thread.sleep(4000);
			WebElement field=driver.findElement(By.cssSelector("input"));
			String currentwindow=driver.getWindowHandle();
			field.clear();
			field.sendKeys("Gurgaon");	
			Thread.sleep(2000);
//			field.sendKeys(Keys.DOWN);
//			Thread.sleep(500);
//
//			field.sendKeys(Keys.DOWN);
//
//			field.sendKeys(Keys.ENTER);
		//	List<WebElement> list=driver.findElements(By.cssSelector("div"));
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			driver.switchTo().window(currentwindow);
			driver.findElement(By.cssSelector("span._3zszBJAwXLcWgf_VmtJMoq")).click();
			
			//driver.click();
			//driver.switchTo().parentFrame();
				List<WebElement> plusList=driver.findElements(By.cssSelector("div.rc-table-body span[class='rc-table-row-expand-icon rc-table-row-collapsed']"));
				plusList.get(0).click();
			
			//driver.findElement(By.xpath("//*[@id='app']/div/div[3]/div/div[2]/div/div/div/div/div/span/div/table/tbody/tr[1]/td[1]/span")).click();
			//Thread.sleep(8000);
			
		//	List<WebElement> lists=list.get(list.size()-1).findElements(By.cssSelector("span"));
			//System.out.println(lists.size());
			//System.out.println(list.get(list.size()-1).getAttribute("innerHTML"));
			//System.out.println(list.get(list.size()-1).getAttribute("outerHTML"));
			//String contents = (String)((JavascriptExecutor)driver).executeScript("return arguments[0].innerHTML;", list.get(list.size()-1));
			
			//list.get(list.size()-1).sendKeys(Keys.DOWN);
//			field.sendKeys(Keys.ENTER);

			

			//driver.findElement(By.xpath("")).sendKeys("ibibo@");
			//Thread.sleep(4000);
			//driver.findElement(By.xpath("")).click();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//driver.close();
		}
	}

}
