package Pageobject;

import Setup.Setups;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Setups {
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
      this.driver = driver;
    }
    //Locate the popup Message and verify.
    private By PopupImage =By.xpath("/html/body/div[6]/div[2]");
    public void verifyPopupImage(){
        driver.findElement(PopupImage).isDisplayed();

    }
//Using By as a Locator to identify Elements on the Login field
    private By LagosButton =By.xpath("/html/body/div[6]/div[2]/div[1]/form/label[2]");
    private By MyAccount =By.xpath("//*[@id=\"nav-menu-item-20267\"]/a");
    private By username =By.id("username");
    private By password=By.id("password");
    private By Login = By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[4]/button");



    public void clickLagosButton(){
        driver.findElement(LagosButton).click();
    }
    //locate login Element MyAccount Using By

    public void clickMyAccount(){
        driver.findElement(MyAccount).click();

    }
    //using By locate username field and enter username

    public void enterUsername(String uName){
        //find and enter Username
        driver.findElement(username).sendKeys(uName);
    }

    public void enterPassword(String pwd){
//locate password element and enter Password
        driver.findElement(password).sendKeys(pwd);
    }

    public DashboardPage clickLogin () {
    driver.findElement(Login).click();
    return new DashboardPage(driver);
    }

}
