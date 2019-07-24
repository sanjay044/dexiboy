package selenium;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

	@FindBy(xpath="//div/ul/li[2]/a[text()='Dresses']")
	private WebElement Dresses;
	

	@FindBy(xpath ="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement Tshirts;

	@FindBy(xpath="//div/ul/li[1]/a[text()='Women']")
	private WebElement Women;
	@FindBy(xpath="//span[@class='cat-name']")
	private WebElement casualdresses1;
	
	public WebElement getcasualdresses() {
		return casualdresses1;
}
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getdressesFromPanel() {
		return Dresses;
	}
		public WebElement clickDress(){
		Dresses.click();
		return Dresses;
		
		}
		public WebElement clickdress1(){
		casualdresses.click();
		return casualdresses;
		}
		@FindBy(xpath="//div/ul/li/a[contains(@title,'You are looking for a dress')]")
		private WebElement casualdresses;
		
		
		public WebElement gettshirtsFromPanel() {
			
			return Tshirts;
		}
			public WebElement getwomenFromPanel() {
				return Women;
			}

	

	


}
