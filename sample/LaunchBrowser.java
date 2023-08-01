package sample;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	
	driver.close();
	
	System.out.println("hello");
}
}
