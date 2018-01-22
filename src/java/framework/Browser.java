package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Browser {

  private static WebDriver driver;
  private static Browser instance = null;

  public static Browser getInstance() {
    if (instance == null) {
      instance = new Browser();
      driver = getDriver();
    }
    return instance;
  }

  private static WebDriver getDriver() {
    System.setProperty("webdriver.chrome.driver", "src\\resources\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(new PropertiesReader().getWaits(), TimeUnit.SECONDS);
    driver.manage().window().maximize();
    return driver;
  }

  public static WebDriver returnDriver() {
    return driver;
  }

  public static void closeDriver() {
    driver.quit();
  }

  public void navigateURL(String url) {
    driver.get(url);
  }
}
