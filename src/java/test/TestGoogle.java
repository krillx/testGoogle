package test;

import framework.Browser;
import framework.PropertiesReader;
import google.forms.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestGoogle {

  @BeforeTest
    public void startBrowser() {
    PropertiesReader reader = new PropertiesReader();
    Browser.getInstance().navigateURL(reader.readUrl());
  }

  @Parameters({"login", "password", "text"})
  @Test
    public void testGoogle(String login, String password, String text) throws Exception {
    MainPage mainPage = new MainPage();
    mainPage.navigateGMail();
    LoginPage loginPage = new LoginPage();
    loginPage.printLogin(login);
    loginPage.printPassword(password);
    MailPage mailPage = new MailPage();
    mailPage.navigateWrite();
    mailPage.sendMessage(login, text);
    mailPage.navigateIncomingPage();
    Thread.sleep(3000);
    IncomingPage incomingPage = new IncomingPage();
    Assert.assertTrue(incomingPage.isMessageCome());
    incomingPage.navigateMesseage();
    MessagePage messagePage = new MessagePage();
    Assert.assertTrue(messagePage.getBody().contains(text));
  }

  @AfterClass
        public void closeBrowser() {
    Browser.closeDriver();
  }


}


