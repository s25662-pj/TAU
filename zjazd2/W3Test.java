// Generated by Selenium IDE
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
public class W3Test {
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
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  @Test
  public void w3() {
    driver.get("https://www.w3schools.com/");
    driver.manage().window().setSize(new Dimension(1464, 1032));
    driver.findElement(By.linkText("PHP")).click();
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.linkText("Try it Yourself »")).click();
    vars.put("win6109", waitForWindow(2000));
    driver.switchTo().window(vars.get("win6109").toString());
    assertThat(driver.findElement(By.cssSelector("#iframeResult > div")).getText(), is("My first PHP script!"));
    driver.findElement(By.id("menuButton")).click();
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.linkText("Privacy policy")).click();
    vars.put("win7947", waitForWindow(2000));
    driver.switchTo().window(vars.get("win7947").toString());
    assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("About Privacy"));
    driver.findElement(By.linkText("PHP")).click();
    driver.findElement(By.linkText("PHP If...Else...Elseif")).click();
    driver.findElement(By.id("quizoption0")).click();
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.cssSelector(".ws-btn:nth-child(5)")).click();
    vars.put("win5568", waitForWindow(2000));
    driver.switchTo().window(vars.get("win5568").toString());
    assertThat(driver.findElement(By.cssSelector(".wronganswer > h2")).getText(), is("Wrong Answer!"));
    driver.findElement(By.cssSelector(".wronganswer > .ws-btn")).click();
    driver.findElement(By.cssSelector(".quizoption:nth-child(3)")).click();
    driver.findElement(By.id("answerbutton")).click();
    assertThat(driver.findElement(By.cssSelector(".correctanswer > h2")).getText(), is("Correct Answer!"));
    driver.findElement(By.cssSelector(".correctanswer > .ws-btn")).click();
    driver.findElement(By.cssSelector(".quizoption:nth-child(3)")).click();
    driver.findElement(By.id("answerbutton")).click();
    driver.findElement(By.cssSelector(".correctanswer > .ws-btn")).click();
    driver.findElement(By.cssSelector(".quizoption:nth-child(1)")).click();
    driver.findElement(By.id("answerbutton")).click();
    assertThat(driver.findElement(By.cssSelector("h2:nth-child(2)")).getText(), is("Congratulations!"));
    driver.findElement(By.cssSelector(".ws-btn:nth-child(13)")).click();
    driver.switchTo().window(vars.get("win7947").toString());
  }
}
