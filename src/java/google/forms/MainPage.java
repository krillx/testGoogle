package google.forms;

import framework.BaseForm;
import framework.elements.Label;
import org.openqa.selenium.By;

public class MainPage extends BaseForm {
  private Label lblMail = new Label(By.xpath("//div[@id ='gbw']//a[contains(@href, 'mail')][contains(@class,'P')]"));

  public MainPage() {
        super((("//input[@id = 'lst-ib']")));
  }

  public void navigateGMail() {
    lblMail.click();
  }

}

