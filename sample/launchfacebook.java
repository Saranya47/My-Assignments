package sample;

import org.openqa.selenium.chrome.ChromeDriver;

public class launchfacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login");
		driver.manage().window().maximize();
		//driver.close();

	}

}
