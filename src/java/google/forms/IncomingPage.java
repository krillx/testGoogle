package google.forms;

import framework.elements.Label;
import org.openqa.selenium.By;

public class IncomingPage  {

  public Boolean isMessageCome() {
    return new Label(By.xpath("//tr[contains (@class, 'zE')]")).isEnabled();
  }

  public void navigateMesseage() {
    Label lblTestMessage = new Label(By.xpath("//div[@class = 'Cp']//tr[1]"));
    lblTestMessage.click();
  }
}
