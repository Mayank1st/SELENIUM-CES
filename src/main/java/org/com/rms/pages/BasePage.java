package org.com.rms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.com.rms.constants.APIUrls;
import org.openqa.selenium.WebElement;
import org.com.rms.pages.LoginPage;

public class BasePage {
     WebDriver driver;
    public BasePage() {
        driver = new ChromeDriver();
        navigateToUrl();
        clickCesButtonOfHomepage();
        loginToCES("raginip@regenesys.net","Ragini@reg123");
    }

    public void navigateToUrl(){
        driver.get(APIUrls.BASE_URL);
    }

    public void clickCesButtonOfHomepage(){
        WebElement element = driver.findElement(By.xpath("//a[contains(@href,'" + APIUrls.LOGIN_URL + "')]"));
        element.click();
    }

    public void loginToCES(String username,String password){
        LoginPage lp = new LoginPage(driver);
        lp.loginBtnClick();
        System.out.println("Clicked on Login button");
    }
}
