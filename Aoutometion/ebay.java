package retur_journy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ebay {
	WebDriver driver;
	public ebay(WebDriver driver) {
		this.driver=driver;
	}
	
	//locater
	By search = By.xpath("(//input[@id='gh-ac'])[1]");
	
	By searchButton = By.xpath("//button[@id='gh-search-btn']");
	
	By verify = By.xpath("//img[@alt=\"UMIDIGI G9T 8GB+128GB 6.75'' Octa Core Android 14 Dual SIM Unlocked Smartphone\"]");
	
	//
	public void Search(String product) {
		driver.findElement(search).sendKeys(product);
	}
	
	public void button() {
		driver.findElement(searchButton).click();
	}
	
	
	public void productVerify() {
		WebElement Verify = driver.findElement(verify);
		if(Verify.isDisplayed()) {
			System.out.println("Search Fanctionality Work");
		}else {
			System.out.println("Search Fanctionality Not Work");
		}
	}
}

