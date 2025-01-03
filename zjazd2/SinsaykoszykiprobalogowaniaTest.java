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
public class SinsaykoszykiprobalogowaniaTest {
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
  public void sinsaykoszykiprobalogowania() {
    driver.get("https://www.sinsay.com/pl/pl/");
    driver.manage().window().setSize(new Dimension(1464, 1032));
    {
      WebElement element = driver.findElement(By.linkText("Skorzystaj teraz >>"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".ms__department:nth-child(1) > .ms__department-name"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".active > .ms__department-name")).click();
    driver.findElement(By.cssSelector(".sc-JoojE:nth-child(2) li:nth-child(2) img")).click();
    driver.findElement(By.cssSelector(".sc-JoojE:nth-child(2) svg")).click();
    driver.findElement(By.cssSelector(".qs_button:nth-child(3) > .qs_button-text-container")).click();
    assertThat(driver.findElement(By.cssSelector(".qs_title")).getText(), is("Dodano produkt do koszyka"));
    driver.findElement(By.cssSelector(".qs-modal__icon path:nth-child(2)")).click();
    assertThat(driver.findElement(By.cssSelector(".ds-badge-text")).getText(), is("1"));
    js.executeScript("window.scrollTo(0,302)");
    js.executeScript("window.scrollTo(0,300)");
    driver.findElement(By.cssSelector(".sc-JoojE:nth-child(8) .sc-jtHLbV")).click();
    assertThat(driver.findElement(By.cssSelector(".sc-hYAvtR")).getText(), is("Zaloguj się, aby dodawać produkty do ulubionych i zapisywać je na później."));
    driver.findElement(By.cssSelector(".sc-cvJIAo")).click();
    driver.findElement(By.cssSelector("li:nth-child(17) .sidebar__Url-sc-4xriee-2")).click();
    driver.findElement(By.cssSelector(".sc-gGmKaI")).click();
    driver.findElement(By.cssSelector(".sc-gGmKaI")).click();
    driver.findElement(By.cssSelector(".sc-JoojE:nth-child(5) svg")).click();
    driver.findElement(By.cssSelector(".qs_button-text-container")).click();
    assertThat(driver.findElement(By.cssSelector(".qs_title")).getText(), is("Dodano produkt do koszyka"));
    driver.findElement(By.cssSelector(".qs-modal__overlay")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".ms__department:nth-child(5) > .ms__department-name"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".active > .ms__department-name")).click();
    driver.findElement(By.cssSelector(".sc-JoojE:nth-child(2) li:nth-child(2) img")).click();
    driver.findElement(By.cssSelector(".sc-JoojE:nth-child(2) svg")).click();
    driver.findElement(By.cssSelector(".qs_button-text-container > .qs_text-dark")).click();
    assertThat(driver.findElement(By.cssSelector(".qs_title")).getText(), is("Dodano produkt do koszyka"));
    driver.findElement(By.cssSelector(".qs_text-m:nth-child(1)")).click();
    assertThat(driver.findElement(By.cssSelector(".badge__BadgeComponent-kyo77g-0")).getText(), is("3 ART."));
    assertThat(driver.findElement(By.cssSelector(".cart-summary__FinalPrice-w03iv1-11")).getText(), is("68,97 PLN"));
    driver.findElement(By.id("couponCode")).click();
    driver.findElement(By.id("couponCode")).sendKeys("testkupon");
    driver.findElement(By.cssSelector(".ds-input-field-button")).click();
    assertThat(driver.findElement(By.cssSelector(".ds-input-field-additional")).getText(), is("Kod kuponu testkupon jest niepoprawny"));
    driver.findElement(By.cssSelector(".row__Row-sc-1d4xdwk-0:nth-child(1) .product-list__RemoveIcon-mh8fks-6")).click();
    assertThat(driver.findElement(By.cssSelector(".badge__BadgeComponent-kyo77g-0")).getText(), is("2 ART."));
    driver.findElement(By.cssSelector(".kkEEuj > .cart-summary__Price-w03iv1-9")).click();
    assertThat(driver.findElement(By.cssSelector(".cart-summary__FinalPrice-w03iv1-11")).getText(), is("55,98 PLN"));
    driver.findElement(By.cssSelector(".primary__PrimaryButtonComponent-sc-1pct4vx-0")).click();
    driver.findElement(By.cssSelector(".button__ButtonPrimary-zerqf2-0")).click();
    driver.findElement(By.id("email_id")).sendKeys("test");
    driver.findElement(By.cssSelector(".sc-gyUflj > .sc-hjWSTT")).click();
    assertThat(driver.findElement(By.cssSelector(".text-field__ErrorMessage-sc-1vll61a-5")).getText(), is("Wprowadź poprawne znaki"));
    driver.findElement(By.cssSelector(".sc-gyUflj > .sc-hjWSTT")).click();
    driver.findElement(By.id("email_id")).sendKeys("abc@abc.pl");
    driver.findElement(By.cssSelector(".primary__PrimaryButtonComponent-sc-1pct4vx-0")).click();
    assertThat(driver.findElement(By.cssSelector(".text-field__TextWrapper-sc-1vll61a-4:nth-child(2) > .text-field__ErrorMessage-sc-1vll61a-5")).getText(), is("To pole jest wymagane"));
    assertThat(driver.findElement(By.cssSelector(".checkbox-field__CheckboxWrapper-odr2no-0 > .text-field__ErrorMessage-sc-1vll61a-5")).getText(), is("Akceptacja regulaminu jest wymagana"));
    driver.findElement(By.cssSelector(".button__ButtonPrimary-zerqf2-0")).click();
    driver.findElement(By.id("login[username]_id")).click();
    driver.findElement(By.id("login[username]_id")).sendKeys("abc@abc.pl");
    driver.findElement(By.id("login[password]_id")).click();
    driver.findElement(By.cssSelector(".sc-fHYyUA > .sc-hjWSTT")).click();
    driver.findElement(By.cssSelector(".primary__PrimaryButtonComponent-sc-1pct4vx-0")).click();
    assertThat(driver.findElement(By.cssSelector(".text-field__ErrorMessage-sc-1vll61a-5")).getText(), is("To pole jest wymagane"));
  }
}
