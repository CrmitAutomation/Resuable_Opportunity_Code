package testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import base.baseTest;
import pages.AddProducts;
import pages.OppCreation;
import utils.ExcelUtils;

public class oppTest extends baseTest {

    @Test(dependsOnGroups="login")
    public void testOpportunityCreation() throws IOException, InterruptedException {	
    	
    	// Read credentials from Excel
        String Opportunity_Name = ExcelUtils.getCellData("Opportunity", 1, 0);
        String Amount = ExcelUtils.getCellData("Opportunity", 1, 1);
        //String Close_Date = ExcelUtils.getCellData("Opportunity", 1, 2);
        //String Account_Name = ExcelUtils.getCellData("Opportunity", 1, 3);
        String Product_Name = ExcelUtils.getCellData("Products", 1, 0);
        String Quantity = ExcelUtils.getCellData("Products", 1, 1);
        System.out.println(">>> In Opportunity Test <<<");
        
      //Driver initialize for Opportunity Creation Page
        OppCreation Opportunity = new OppCreation(driver);
        
        //Actions
        Opportunity.clickAppLauncher();
        Opportunity.CreateOpportunity();
        Thread.sleep(1000);
        Opportunity.OpportunityName(Opportunity_Name);
        Opportunity.EnterAmount(Amount);
        //Opportunity.EnterCloseDate(Close_Date);
        //Opportunity.EnterAccountName(Account_Name);
        Opportunity.CloseDate();
        Opportunity.EnterStage();
        Opportunity.SaveButton();
        
      //Driver initialize for Product Addition Page
        AddProducts ProductPage = new AddProducts(driver);
        
        //Action
        ProductPage.clickProduct();
        ProductPage.ClickAddProductButton();
        ProductPage.AddProductName(Product_Name);
        ProductPage.ClickCheckBox();
        ProductPage.ClickNext();
        ProductPage.AddQuan(Quantity);
        ProductPage.SaveProduct();
        ProductPage.RetunOpp();
        ProductPage.DropDown();
        ProductPage.ClickEdit();
        
        
        
        
        
    }
}
