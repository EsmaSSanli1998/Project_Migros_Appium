package migros.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import migros.utils.DriverNoApk;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Migros_Sanal_Pages {
    public Migros_Sanal_Pages() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverNoApk.getDriverNoApk()), this);
    }
    @AndroidFindBy(id =" com.inomera.sm:id/text_input_start_icon")
    private WebElement migrosSearchButton;
    @AndroidFindBy(id ="com.inomera.sm:id/imageViewProfile")
    private WebElement migrosAccountButton;
    @AndroidFindBy(id ="com.inomera.sm:id/action_cart")
    private WebElement sepeteEkleButton;
    @AndroidFindBy(xpath ="//android.widget.TextView[@resource-id='com.inomera.sm:id/text'' and @text='Üye Ol veya Giriş Yap']")
    private WebElement uyeOlveyagirisyapButton;
    @AndroidFindBy(id ="com.inomera.sm:id/loginButton")
    private WebElement girisyapButton;
    @AndroidFindBy(xpath ="//android.widget.TextView[@resource-id='com.inomera.sm:id/helloTextView']")
    private WebElement telnumButton;
    @AndroidFindBy(xpath ="(//android.view.ViewGroup[@resource-id='com.inomera.sm:id/custom_account_button'])[1]")
    private WebElement girisyap2Button;
    @AndroidFindBy(xpath ="//android.widget.TextView[@resource-id='com.inomera.sm:id/helloTextView'']")
    private WebElement smskoduDogrulamakoduyazButton;
    @AndroidFindBy(xpath ="(//android.view.ViewGroup[@resource-id='com.inomera.sm:id/custom_account_button'])[1]")
    private WebElement smskoduDogrulamaButton;
    @AndroidFindBy(id ="com.inomera.sm:id/storePickSubTitleTextView")
    private WebElement magazadanTeslimAlacagımButton;
    @AndroidFindBy(xpath="//android.widget.TextView[@text='Adresime Gelsin']")
    private WebElement adresimeGelsinButton;
    @AndroidFindBy(id="com.inomera.sm:id/discountFabTextView")
    private WebElement sehirSecIzmirButton;
    @AndroidFindBy(id="")
    private WebElement ılceSecKarsıyakaButton;





}
