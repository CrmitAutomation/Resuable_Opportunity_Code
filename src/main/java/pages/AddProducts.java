package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProducts {
WebDriver driver;
	
	// Constructor to initialize driver
    public AddProducts(WebDriver driver) {
        this.driver = driver;
    }
    
    //Locators
    public By ClickOnProductsButton = By.xpath("//span[@title='Products'][contains(.,'Products')]");
    public By ClickonAddProductsButton = By.xpath("//div[@title='Add Products'][contains(.,'Add Products')]");
    //public By ClickonSearchBox = By.xpath("//input[contains(@id,'2703:0')]");
    public By AdditionProductName = By.xpath("//input[contains(@placeholder,'Search Products...')]");
    public By ClickProductCheckBox = By.xpath("(//span[contains(@class,'slds-checkbox--faux slds-checkbox_faux')])[2]");
    public By ClickNextButton = By.xpath("//span[@dir='ltr'][contains(.,'Next')]");
    public By AddQuantityClick = By.xpath("(//span[@class='triggerContainer']/following::button)[1]");
  
    public By AddQuantity = By.xpath("//label[text()='Quantity']/following::input[1]");
    public By SaveButton = By.xpath("(//button[@title='Save'])[2]");
    public By ReturnToOppPage = By.xpath("//div[@class=\"slds-media__body slds-align-middle\"]//nav//ol//li[2]//a");
    public By Clickdropdown = By.xpath("(//li[@class=\"slds-dropdown-trigger slds-dropdown-trigger_click slds-button_last overflow\"]");
    public By ClickEditButton = By.xpath("//div[@class=\"slds-dropdown slds-dropdown_right\"]//runtime_platform_actions-action-renderer[@title=\"Edit\"]");
    
    
    
 // Actions
    public void clickProduct() throws InterruptedException {
        driver.findElement(ClickOnProductsButton).click();
        Thread.sleep(2000);
    }
    public void ClickAddProductButton() throws InterruptedException {
    	driver.findElement(ClickonAddProductsButton).click();
    	Thread.sleep(2000);
    }
    /*public void ClickSearchBox() throws InterruptedException {
    	driver.findElement(ClickonSearchBox).click();
    	Thread.sleep(2000);
    }*/
    public void AddProductName(String Product_Name) throws InterruptedException {
        WebElement productSearchBox = driver.findElement(AdditionProductName);
        productSearchBox.sendKeys(Product_Name);
        productSearchBox.sendKeys(Keys.ENTER);
        //((WebElement) AdditionProductName).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
    }
    public void ClickCheckBox() throws InterruptedException {
    	driver.findElement(ClickProductCheckBox).click();
    	Thread.sleep(3000);
    }
    public void ClickNext() throws InterruptedException 
    {
    	driver.findElement(ClickNextButton).click();
    	Thread.sleep(6000);
    }
    public void AddQuan(String Quantity) throws InterruptedException {
    	driver.findElement(AddQuantityClick).click();
    	Thread.sleep(3000);
    	//driver.findElement(AddQuantityClick).sendKeys("2");
    	driver.findElement(AddQuantity).sendKeys(Quantity);
    }
    
    
    public void SaveProduct() throws InterruptedException {
    	driver.findElement(SaveButton).click();
    	Thread.sleep(2000);
    }
    
    public void RetunOpp() throws InterruptedException {
    	driver.findElement(ReturnToOppPage).click();
    	Thread.sleep(2000);
    }
    
    public void DropDown() throws InterruptedException {
    	driver.findElement(Clickdropdown).click();
    }
    
    public void ClickEdit() throws InterruptedException {
    	driver.findElement(ClickEditButton).click();
    }
	
    
    /*
	 * public void AddQuan(String Quantity) throws InterruptedException {
	 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 * 
	 * // Wait until quantity field is visible and clickable WebElement
	 * quantityField =
	 * wait.until(ExpectedConditions.elementToBeClickable(AddQuantityClick));
	 * 
	 * quantityField.click(); // click to activate input Thread.sleep(1000); //
	 * short pause to stabilize UI
	 * 
	 * // Optional: Clear any previous value quantityField.clear();
	 * 
	 * // Send the quantity value from Excel quantityField.sendKeys("2"); }
	 */
    
    
    
    
}
