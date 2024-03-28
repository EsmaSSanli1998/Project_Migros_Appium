package migros.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import migros.utils.DriverNoApk;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class migrosSanalPages {
    public migrosSanalPages() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverNoApk.getDriverNoApk()), this);
    }
    @AndroidFindBy(id ="com.inomera.sm:id/shapeableBottomMButton")
    public WebElement migrosAnaEkranButton;
    @AndroidFindBy(xpath ="(//android.view.ViewGroup[@resource-id=\"com.inomera.sm:id/serviceSelectionConstraintLayout\"])[1]")
    public WebElement migrosSanalMarketKırılımıButton;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.inomera.sm:id/iv_image\"])[1]")
    public WebElement migrosMacroOnlineKırılımıButton;
    @AndroidFindBy(id ="com.inomera.sm:id/textInputEditText")
    public WebElement migrosSearchButton;
    @AndroidFindBy(xpath ="(//androidx.cardview.widget.CardView[@resource-id=\"com.inomera.sm:id/add_to_cart_button\"])[2]/android.view.ViewGroup/android.widget.ImageView")
    public WebElement migrostozsekerekleButton;
    @AndroidFindBy(xpath ="(//android.widget.ImageView[@resource-id=\"com.inomera.sm:id/iv_image\"])[3]")
    public WebElement migrosmuzusepeteekleButton;
    @AndroidFindBy(id ="com.inomera.sm:id/imageViewProfile")
    public WebElement migrosAccountButton;
    @AndroidFindBy(id ="com.inomera.sm:id/action_cart")
    public WebElement sepeteEkleButton;
    @AndroidFindBy(xpath ="//android.widget.TextView[@resource-id='com.inomera.sm:id/text'' and @text='Üye Ol veya Giriş Yap']")
    public WebElement uyeOlveyagirisyapButton;
    @AndroidFindBy(id ="com.inomera.sm:id/loginButton")
    public WebElement girisyapButton;
    @AndroidFindBy(xpath ="//android.widget.TextView[@resource-id='com.inomera.sm:id/helloTextView']")
    public WebElement telnumButton;
    @AndroidFindBy(xpath ="(//android.view.ViewGroup[@resource-id='com.inomera.sm:id/custom_account_button'])[1]")
    public WebElement girisyap2Button;
    @AndroidFindBy(xpath ="//android.widget.TextView[@resource-id='com.inomera.sm:id/helloTextView'']")
    public WebElement smskoduDogrulamakoduyazButton;
    @AndroidFindBy(xpath ="(//android.view.ViewGroup[@resource-id='com.inomera.sm:id/custom_account_button'])[1]")
    public WebElement smskoduDogrulamaButton;
    @AndroidFindBy(id ="com.inomera.sm:id/storePickSubTitleTextView")
    public WebElement magazadanTeslimAlacagımButton;
    @AndroidFindBy(xpath="//android.widget.TextView[@text='Adresime Gelsin']")
    public WebElement adresimeGelsinButton;
    @AndroidFindBy(id="com.inomera.sm:id/discountFabTextView")
    public WebElement sehirSecIzmirButton;
    @AndroidFindBy(id="")
    public WebElement ılceSecKarsıyakaButton;
    @AndroidFindBy(xpath="(//android.widget.ImageView[@resource-id=\"com.inomera.sm:id/navigation_bar_item_icon_view\"])[4]")
    public WebElement sepeteGitButton;
    @AndroidFindBy(xpath="(//android.widget.TextView[@text=\"Anasayfa\"])[1]")
    public WebElement adresimButton;
    @AndroidFindBy(id="com.inomera.sm:id/shapeableBottomMButton")
    public WebElement sepetimeDevametButton;
    @AndroidFindBy(accessibility="248,09 TL")
    public WebElement sepetiOnaylaButton;
    @AndroidFindBy(id="com.inomera.sm:id/continueButton")
    public WebElement devamEtButton;
    @AndroidFindBy(id="com.inomera.sm:id/useAsInvoiceAddressCheckbox")
    public WebElement faturaAdresiOlaraktaKullanButton;
    @AndroidFindBy(id="com.inomera.sm:id/radioButtonScheduledDeliveryChoice")
    public WebElement randevuluTeslimatButton;
    @AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"com.inomera.sm:id/radio_text\" and @text=\"12:30 - 14:30\"]")
    public WebElement saat12301430Button;
    @AndroidFindBy(id="com.inomera.sm:id/continueButton")
    public WebElement devamEt2Button;
    @AndroidFindBy(id="com.inomera.sm:id/radioButtonOtherPayment")
    public WebElement farklıOdemeYontemıButton;
    @AndroidFindBy(xpath=" (//android.view.ViewGroup[@resource-id=\"com.inomera.sm:id/clMain\"])[3]")
    public WebElement krediBankakartiButton;
    @AndroidFindBy(id="com.inomera.sm:id/btnPaymentContinue")
    public WebElement devamEt3Button;
    @AndroidFindBy(id="com.inomera.sm:id/cbPriorInformationCondition")
    public WebElement onBılgıOnayButton;
    @AndroidFindBy(id="com.inomera.sm:id/cbDistanceSalesAgreement")
    public WebElement mesafeliSatısSozOnayButton;
    @AndroidFindBy(id="com.inomera.sm:id/btnCheckoutButton")
    public WebElement odemeYapButton;




}
