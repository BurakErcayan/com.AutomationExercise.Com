package java.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.utilities.Driver;

public class TestCasesPage {
    public TestCasesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@href='/test_cases'])[1]")
    public WebElement testCasesButton;

    @FindBy(xpath = "(//h2)[1]")
    public WebElement testCasesText;
}
