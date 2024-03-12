package migros.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import migros.utils.DriverNoApk;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class EsmaPages {

/*
accessibility: accessibilityID
class: classname
id: resource-id
xpath-->en son secenek
 */

    public EsmaPages() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverNoApk.getDriverNoApk()), this);
    }


    @AndroidFindBy(xpath = "")
    private WebElement kaydet;

    @AndroidFindBy(id = "")
    private WebElement a;

    @AndroidFindBy(id = "")
    private WebElement s;

    @AndroidFindBy(id = "")
    private WebElement d;

    @AndroidFindBy(id = "")
    private WebElement f;

    @AndroidFindBy(xpath = "")
    private WebElement g;

    @AndroidFindBy(xpath = "")
    private WebElement gh;

    @AndroidFindBy(xpath = "")
    private WebElement h;

    @AndroidFindBy(id = "")
    private WebElement j;

    @AndroidFindBy(id = "")
    private WebElement k;

    @AndroidFindBy(xpath = "")
    private WebElement l;

    @AndroidFindBy(id = "")
    private WebElement p;

    @AndroidFindBy(id = "")
    private WebElement o;

    @AndroidFindBy(xpath = "")
    private WebElement w;

    @AndroidFindBy(xpath = "")
    private WebElement e;

    @AndroidFindBy(xpath = "")
    private WebElement r;




}
