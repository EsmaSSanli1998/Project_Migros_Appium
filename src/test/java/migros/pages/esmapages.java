package migros.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import migros.utils.DriverNoApk;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class esmapages {


    public esmapages() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverNoApk.getDriverNoApk()), this);
    }

    @AndroidFindBy(id = "//android.widget.TextView[@content-desc='Migros']")
    private WebElement migrosUygulamae;

    @AndroidFindBy(id = "com.inomera.sm:id/imageViewProfile")
    private WebElement kullaniciAdam;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@resource-id='com.inomera.sm:id/custom_account_button'])[1]")
    private WebElement uyeOlveyaGirisYape;

    @AndroidFindBy(id = "com.inomera.sm:id/loginButton")
    private WebElement girisYapButonue;

    @AndroidFindBy(id = "com.inomera.sm:id/helloTextView")
    private WebElement telefonNumarasiKutusu;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@resource-id='com.inomera.sm:id/custom_account_button'])[1]")
    private WebElement telefonGirisYapE;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.inomera.sm:id/helloTextView']")
    private WebElement smsDogrlKutusu;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@resource-id='com.inomera.sm:id/custom_account_button'])[1]")
    private WebElement dogrulaButonue;

    @AndroidFindBy(id = "")
    private WebElement m;

    @AndroidFindBy(id = "")
    private WebElement k;

    @AndroidFindBy(xpath = "")
    private WebElement u;

    @AndroidFindBy(id = "")
    private WebElement g;

    @AndroidFindBy(id = "c")
    private WebElement t;

    @AndroidFindBy(xpath = "")
    private WebElement t4;

    @AndroidFindBy(xpath = "")
    private WebElement sm;

    @AndroidFindBy(xpath = "")
    private WebElement d;

    @AndroidFindBy(id = "")
    private WebElement md;

    @AndroidFindBy(id = "")
    private WebElement kf;

    @AndroidFindBy(xpath = "")
    private WebElement uf;

    @AndroidFindBy(id = "")
    private WebElement gf;

    @AndroidFindBy(id = "c")
    private WebElement tf;

    @AndroidFindBy(xpath = "")
    private WebElement t4f;

    @AndroidFindBy(xpath = "")
    private WebElement smf;

    @AndroidFindBy(xpath = "")
    private WebElement df;

























}
