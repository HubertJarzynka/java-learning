package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_COOKIES = "//*[@data-cookiebanner=\"accept_only_essential_button\"]";
    public static final String XPATH_CREATE_ACCOUNT = "//*[@data-testid=\"open-registration-form-button\"]";
    public static final String XPATH_DAY = "//*[@id=\"day\"]";
    public static final String XPATH_Month = "//*[@id=\"month\"]";
    public static final String XPATH_Year = "//*[@id=\"year\"]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_COOKIES)).isDisplayed()) ;
        driver.findElement(By.xpath(XPATH_COOKIES)).click();
        driver.findElement(By.xpath(XPATH_CREATE_ACCOUNT)).click();

        Thread.sleep(2000);

        WebElement dayElement = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(dayElement);
        selectDay.selectByIndex(10);

        WebElement monthElement = driver.findElement(By.xpath(XPATH_Month));
        Select selectMonth = new Select(monthElement);
        selectMonth.selectByIndex(2);

        WebElement yearElement = driver.findElement(By.xpath(XPATH_Year));
        Select selectYear = new Select(yearElement);
        selectYear.selectByIndex(25);
    }
}