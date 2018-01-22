package google.forms;

import framework.elements.Label;
import org.openqa.selenium.By;

public class MessagePage {

  private Label lblMessageBody = new Label(By.xpath("//div[@class = 'gs']//div[@dir = 'ltr']"));

  public String getBody() {
    return lblMessageBody.getText();
  }
}
