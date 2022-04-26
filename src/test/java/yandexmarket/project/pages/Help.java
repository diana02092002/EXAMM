package yandexmarket.project.pages;

import org.openqa.selenium.By;
import yandexmarket.Utils.ConfigFileReader;
import yandexmarket.framework.browser.element.Text;
import yandexmarket.framework.browser.Browser;

public class Help {
    private static ConfigFileReader config = ConfigFileReader.configFileReader;
    private Text clickToHelp = new Text(By.xpath("//button[@class='button button--solid button--blue help-form__send-to-bottom-button']"), "clickToHelp");
    private Browser browser = Browser.BROWSER;
    private  Text hiddenForm = new Text (By.xpath("//div[@class='help-form is-hidden']"), "hiddenForm");

   public void clickToHelp(){
       clickToHelp.click();
   }
}
