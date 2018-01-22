package framework.elements;

import framework.BaseElement;
import org.openqa.selenium.By;

public class InputBox extends BaseElement {

  public InputBox(By locator) {
        super(locator);
  }

  public void sendKey(String text) {
    waitForEnabled();
    getElement().sendKeys(text);
  }
}
