package migros.pages;

import migros.utils.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class MigrosPagesOrnek {


    public MigrosPagesOrnek() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(id = "")
    private WebElement a;
    @AndroidFindBy(id = "")
    private WebElement s;
    @AndroidFindBy(id = "")
    private WebElement d;
    @AndroidFindBy(id = "")
    private WebElement f;
    @AndroidFindBy(id = "")
    private WebElement g;
    @AndroidFindBy(id = "")
    private WebElement h;
    @AndroidFindBy(xpath = "")
    private WebElement j;


}
