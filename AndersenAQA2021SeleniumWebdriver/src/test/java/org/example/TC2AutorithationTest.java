package org.example;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TC2AutorithationTest {
    static{
        System.setProperty("webdriver.chrome.driver", "C://Java//Andersen_AQA_2021//AndersenAQA2021Maven//chromedriver.exe");
    }
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void tC2Autorithation() {
        driver.get("https://diary.ru/");
        driver.manage().window().setSize(new Dimension(968, 1020));
        driver.findElement(By.linkText("Вход")).click();
        driver.findElement(By.id("loginform-username")).click();
        driver.findElement(By.id("loginform-username")).sendKeys("User12345678");
        driver.findElement(By.id("loginform-password")).click();
        driver.findElement(By.id("loginform-password")).sendKeys("User12345678");
        driver.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();
        driver.switchTo().defaultContent();
        driver.findElement(By.id("login_btn")).click();
        assertThat(driver.findElement(By.cssSelector(".username>a")).getText(), is("User12345678"));
    }
}
