package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OppCreation {
	WebDriver driver;
	
	// Constructor to initialize driver
    public OppCreation(WebDriver driver) {
        this.driver = driver;
    }
    
    //Locators
    public By AppLauncherButton = By.xpath("//div[@class='slds-icon-waffle']");
    public By SearchBox = By.xpath("//input[@placeholder=\"Search apps and items...\"]");
    public By ClickOPP = By.xpath("//div[@class=\"slds-size_small\"]//span//p");
    public By ClickNew = By.xpath("//div[@title='New'][contains(.,'New')]");
    public By EnterOppName = By.xpath("//input[@name=\"Name\"]");
    public By EnterAmount = By.xpath("//input[@name=\"Amount\"]");
    public By EnterCloseDate = By.xpath("(//label[text()='Close Date']/following::input)[1]");
    //public By todayButton = By.xpath("//span[text()='Today']");
    
    //public By EnterAccountName = By.xpath("//input[@placeholder='Search Accounts...']");
    //public By AccountNamePicklist = By.xpath("//div[@class=\"slds-listbox slds-listbox_vertical slds-dropdown slds-dropdown_fluid slds-dropdown_left\"]//ul//li");
    public By EnterStage = By.xpath("//button[@aria-label=\"Stage\"]");
    public By EnterStagePicklist = By.xpath("//lightning-base-combobox-item[@data-value=\"Value Proposition\"]");
    public By SaveButton = By.xpath("//button[@name=\"SaveEdit\"]");
    
    
     
    
    
    
    // Actions
    public void clickAppLauncher() throws InterruptedException {
        driver.findElement(AppLauncherButton).click();
        Thread.sleep(2000);
    }

    
    
    public void CreateOpportunity() throws InterruptedException {
    	driver.findElement(SearchBox).sendKeys("opportunities");
        driver.findElement(ClickOPP).click();
        Thread.sleep(3000);
        driver.findElement(ClickNew).click();
        Thread.sleep(5000);
        
    }
    
    public void OpportunityName(String Opportunity_Name) throws InterruptedException {
        driver.findElement(EnterOppName).sendKeys(Opportunity_Name);
        Thread.sleep(5000);
    }
    
    public void EnterAmount(String Amount) throws InterruptedException {
        driver.findElement(EnterAmount).sendKeys(Amount);  
        Thread.sleep(5000);
    }
    public void CloseDate() throws InterruptedException
    {
    	driver.findElement(EnterCloseDate).click();Thread.sleep(3000);
    	WebElement todayButton = driver.findElement(By.xpath("//button[@name='today']"));
    
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].click();", todayButton);
    	//driver.findElement(EnterCloseDate).click();Thread.sleep(3000);
    	//driver.findElement(EnterCloseDate).sendKeys(Close_Date);
    	
    }
    public void EnterCloseDate(String Close_Date ) throws InterruptedException {
		
		 driver.findElement(EnterCloseDate).click(); Thread.sleep(3000);
		 /* JavascriptExecutor js = (JavascriptExecutor) driver; WebElement todayBtn =
		 * (WebElement) js.executeScript( "return document" +
		 * ".querySelector('lightning-datepicker')" + // outer component
		 * ".shadowRoot.querySelector('lightning-calendar')" +
		 * ".shadowRoot.querySelector('button.slds-button_today')" );
		 */
    	
    	//driver.findElement(By.cssSelector("button[title*='Select a date']")).click();
    	//Thread.sleep(2000);  
    	JavascriptExecutor js = (JavascriptExecutor) driver;

    	WebElement todayBtn = (WebElement) js.executeScript(
    		    "const inputEl = document.querySelector('input[name=\"CloseDate\"]');" +
    		    "if (!inputEl) return null;" +
    		    "const parent = inputEl.closest('lightning-input');" +
    		    "if (!parent) return null;" +
    		    "const datepicker = parent.shadowRoot?.querySelector('lightning-datepicker');" +
    		    "if (!datepicker) return null;" +
    		    "const calendar = datepicker.shadowRoot?.querySelector('lightning-calendar');" +
    		    "if (!calendar) return null;" +
    		    "const todayButton = calendar.shadowRoot?.querySelector('button.slds-button_today');" +
    		    "return todayButton;"
    		);

    	
    	
    	if (todayBtn != null) {
    	    todayBtn.click();
    	} else {
    	    System.out.println("Today button not found - calendar might not be fully loaded.");
    	}
   	 Thread.sleep(3000);
        /*driver.findElement(todayButton).click();
        Thread.sleep(5000);*/
    }
    
    /*public void EnterAccountName(String Account_Name) throws InterruptedException {
        driver.findElement(EnterAccountName).sendKeys(Account_Name);  
        Thread.sleep(5000);
        driver.findElement(AccountNamePicklist).click();
        Thread.sleep(2000);
    }*/
    
    public void EnterStage() throws InterruptedException {
        driver.findElement(EnterStage).click();
        Thread.sleep(5000);
        driver.findElement(EnterStagePicklist).click();
        Thread.sleep(5000);
    }
    
   public void SaveButton() {
	   driver.findElement(SaveButton).click();
   }

}