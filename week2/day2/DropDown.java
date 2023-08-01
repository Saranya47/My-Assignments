package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();
		WebElement crm=driver.findElement(By.linkText("CRM/SFA"));
		crm.click();
		String title = driver.getTitle();// browser level verification
		System.out.println(title);

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select dd=new Select(source);
		
		dd.selectByVisibleText("Existing Customer");
WebElement industry=driver.findElement(By.id("createLeadForm_industryEnumId"));
Select indd=new Select(industry);

indd.selectByValue("IND_GEN_SERVICES");
indd.selectByIndex(6);

WebElement ownership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
Select owndd=new Select(ownership);
owndd.selectByValue("OWN_PROPRIETOR");
owndd.selectByIndex(1);
	}

}
