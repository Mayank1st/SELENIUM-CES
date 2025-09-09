package org.com.rms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.com.rms.constants.APIUrls;
import org.openqa.selenium.WebElement;

public class BasePage {
     WebDriver driver;
    public BasePage() {
        driver = new ChromeDriver();
        navigateToUrl();
        clickCesButtonOfHomepage();
        loginToCES("mayankk@regenesys.net","abc123");
    }

    public void navigateToUrl(){
        driver.get(APIUrls.BASE_URL);
    }

    public void clickCesButtonOfHomepage(){
        WebElement element = driver.findElement(By.xpath("//a[contains(@href,'https://dev-rms-code-crafters.regenesys.digital/corporate/login')]"));
        element.click();
    }

    public void loginToCES(String username,String password){

    }
}
