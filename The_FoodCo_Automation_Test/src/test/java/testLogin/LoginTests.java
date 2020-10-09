package testLogin;

import Pageobject.DashboardPage;
import Pageobject.HouseHoldPage;
import Pageobject.LoginPage;
import Setup.Setups;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTests extends Setups {
@Test(priority = 1)
    public void PopupImage(){
        String PopImage = driver.findElement(By.className("wh_flybox_popup_content")).getText();
        System.out.println(PopImage);



    }
//included are subclasses from Both DashboardPage   and The Household page to be Executed
    @Test(priority = 1)
            public void init() throws InterruptedException {
    //driver.get(https://Foodco.ng/)
    LoginPage loginPage=PageFactory.initElements(driver,LoginPage.class);
        loginPage.clickLagosButton();
        loginPage.clickMyAccount();
        loginPage.enterUsername("mtes7272");
        loginPage.enterPassword("MOUNTAIN12test");
        loginPage.clickLogin();
 //The Dashboard is put into execution at this phase
        DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
            Thread.sleep(1000);
            dashboardPage.clickHOUSEHOLD();
     //The Household is instantiated at this phase
            HouseHoldPage houseHoldPage = PageFactory.initElements(driver, HouseHoldPage.class);
            houseHoldPage.clickBathAndBed();
            houseHoldPage.clickLogout();
            houseHoldPage.clickConfirmAndLogout();

        }



    }
