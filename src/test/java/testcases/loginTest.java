package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.baseTest;
import pages.loginPage;
import utils.ExcelUtils;

public class loginTest extends baseTest {

    @Test(groups="login")
    public void testLogin() throws InterruptedException, IOException {
        // Read credentials from Excel
        String username = ExcelUtils.getCellData("Login Details", 1, 0);
        String password = ExcelUtils.getCellData("Login Details", 1, 1);

        // Pass driver from baseTest to loginPage constructor
        loginPage login = new loginPage(driver);

        login.enterUsername(username);
        Thread.sleep(1000);
        login.enterPassword(password);
        Thread.sleep(1000);
        login.clickLogin();
        Thread.sleep(1000);

        System.out.println("Login successful");
    }
}
