package fb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calender {


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.redbus.in");
driver.findElement(By.cssSelector("input#txtOnwardCalendar")).click();
Thread.sleep(2000);
List<WebElement> dates=driver.findElements(By.xpath("//*[@id='rbcal_txtOnwardCalendar']/table[1]//td"));

int n =dates.size();
for (int i = 0; i < n; i++) {
String str =dates.get(i).getText();
	if (str.equalsIgnoreCase("31"))
	{
		dates.get(i).click();
		break;
	}
	
}
	}

}
