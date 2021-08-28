package org.example;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;

public class DefaultSuiteTest {
  static {
  System.setProperty("webdriver.chrome.driver", "C://Java//Andersen_AQA_2021//AndersenAQA2021Maven//chromedriver.exe");}
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
  public void autorization() {
    driver.get("https://github.com/");
    driver.manage().window().setSize(new Dimension(654, 984));
    driver.findElement(By.linkText("Sign up")).click();
    driver.findElement(By.linkText("Sign in →")).click();
    driver.findElement(By.id("js-pjax-container")).click();
    driver.findElement(By.id("login_field")).sendKeys("TesterAndersen");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("AutomationTesting2021");
    driver.findElement(By.name("commit")).click();
    assertThat(driver.findElement(By.xpath("//*[@id=\"dashboard\"]/div/h2")).getText(), is("All activity"));
  }
}
