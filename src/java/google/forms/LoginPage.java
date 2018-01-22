package google.forms;

import framework.elements.InputBox;
import framework.elements.Label;
import org.openqa.selenium.By;

public class LoginPage {

  private String pathToNext = "//div[contains(@id , 'Next')]";

  public void printLogin(String login) {
    new InputBox(By.xpath("//input[contains(@id, 'iden')]")).sendKey(login);
    new Label(By.xpath(pathToNext)).click();
  }

  public void printPassword(String password) {
    new InputBox(By.xpath("//input[contains(@name, 'password')]")).sendKey(password);
    new Label(By.xpath(pathToNext)).click();
  }
}
