package google.forms;

import framework.elements.Label;
import org.openqa.selenium.By;

public class MainPage {
  private Label lblMail = new Label(By.xpath("//div[@id ='gbw']//a[contains(@href, 'mail')][contains(@class,'P')]"));



  public void navigateGMail() {
    lblMail.click();
  }

}

