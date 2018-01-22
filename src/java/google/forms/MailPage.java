package google.forms;

import framework.elements.Button;
import framework.elements.InputBox;
import org.openqa.selenium.By;

public class MailPage {
  private Button btnWrite = new Button(By.xpath("//div[contains(@class, 'aic')]"));
  private InputBox inbAdress = new InputBox(By.xpath("//textarea[@name ='to']"));
  private InputBox inbText = new InputBox(By.xpath("//div[contains(@class, 'edit')]"));
  private Button btnSend = new Button(By.xpath("//td[contains(@class, 'Up')]"));
  private Button btbIncoming = new Button(By.xpath("//span[contains(@class, 'nU')]//a[contains(@href, 'inbox')]"));

  public void navigateWrite() {
    btnWrite.click();
  }

  public void sendMessage(String adress, String text) {
    inbAdress.sendKey(adress);
    inbText.sendKey(text);
    btnSend.click();
  }

  public void navigateIncomingPage() {
    btbIncoming.click();
  }
}
