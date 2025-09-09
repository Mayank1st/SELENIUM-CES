package org.com.rms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginBtnClick(){
      WebElement btn = driver.findElement(By.xpath("//button[contains(@type,'button')]"));
      btn.click();
    }
}
