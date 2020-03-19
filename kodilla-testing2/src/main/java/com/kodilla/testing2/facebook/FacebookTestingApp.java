package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_MON = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(selectCombo);
        selectDay.selectByIndex(17);

        selectCombo = driver.findElement(By.xpath(XPATH_MON));
        Select selectMon = new Select(selectCombo);
        selectMon.selectByIndex(7);

        selectCombo = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(selectCombo);
        selectYear.selectByIndex(37);
    }
}
