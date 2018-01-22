package framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

  private FileInputStream fis;
  private Properties property = new Properties();

  public PropertiesReader() {
    try {
      fis = new FileInputStream("src/resources/config.properties");
      property.load(fis);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public String readUrl() {
    return property.getProperty("Url");
  }

  public int getWaits() {
    return Integer.parseInt(property.getProperty("Waits"));
  }

  public int getWaitsForElemetns() {
    return Integer.parseInt(property.getProperty("WaitsForElemetns"));
  }

}
