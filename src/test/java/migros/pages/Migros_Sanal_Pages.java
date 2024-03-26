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
    @AndroidFindBy(id ="com.inomera.sm:id/shapeableBottomMButton")
    private WebElement migrosAnaEkranButton;
    @AndroidFindBy(xpath ="(//android.view.ViewGroup[@resource-id=\"com.inomera.sm:id/serviceSelectionConstraintLayout\"])[1]")
    private WebElement migrosSanalMarketKırılımıButton;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.inomera.sm:id/iv_image\"])[1]")
    private WebElement migrosMacroOnlineKırılımıButton;
    @AndroidFindBy(id ="com.inomera.sm:id/textInputEditText")
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
    @AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id=\"com.inomera.sm:id/navigation_bar_item_icon_view\"])[4]")
    private WebElement sepeteGitButton;
    @AndroidFindBy(xpath="(//android.widget.TextView[@text=\"Anasayfa\"])[1]")
    private WebElement adresimButton;
    @AndroidFindBy(id="com.inomera.sm:id/shapeableBottomMButton")
    private WebElement sepetimeDevametButton;
    @AndroidFindBy(accessibility="248,09 TL")
    private WebElement sepetiOnaylaButton;
    @AndroidFindBy(id="com.inomera.sm:id/continueButton")
    private WebElement devamEtButton;
    @AndroidFindBy(id="com.inomera.sm:id/useAsInvoiceAddressCheckbox")
    private WebElement faturaAdresiOlaraktaKullanButton;
    @AndroidFindBy(id="com.inomera.sm:id/radioButtonScheduledDeliveryChoice")
    private WebElement randevuluTeslimatButton;
    @AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"com.inomera.sm:id/radio_text\" and @text=\"12:30 - 14:30\"]")
    private WebElement saat12301430Button;
    @AndroidFindBy(id="com.inomera.sm:id/continueButton")
    private WebElement devamEt2Button;
    @AndroidFindBy(id="com.inomera.sm:id/radioButtonOtherPayment")
    private WebElement farklıOdemeYontemıButton;
    @AndroidFindBy(xpath=" (//android.view.ViewGroup[@resource-id=\"com.inomera.sm:id/clMain\"])[3]")
    private WebElement krediBankakartiButton;
    @AndroidFindBy(id="com.inomera.sm:id/btnPaymentContinue")
    private WebElement devamEt3Button;
    @AndroidFindBy(id="com.inomera.sm:id/cbPriorInformationCondition")
    private WebElement onBılgıOnayButton;
    @AndroidFindBy(id="com.inomera.sm:id/cbDistanceSalesAgreement")
    private WebElement mesafeliSatısSozOnayButton;
    @AndroidFindBy(id="com.inomera.sm:id/btnCheckoutButton")
    private WebElement odemeYapButton;




}
