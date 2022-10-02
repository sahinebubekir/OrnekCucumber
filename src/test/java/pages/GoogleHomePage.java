package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GoogleHomePage {

    public GoogleHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "q")
    public WebElement googleSearchTextBox;

    @FindBy(xpath = "//a[@class='qweqwe']")
    public List<WebElement> qwe;

}
