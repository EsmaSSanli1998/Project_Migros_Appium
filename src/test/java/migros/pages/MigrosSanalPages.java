package migros.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import migros.utils.Driver;
import migros.utils.DriverAfra;
import migros.utils.DriverNoApk;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MigrosSanalPages {
    public MigrosSanalPages() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverNoApk.getDriverNoApk()), this);
    }
    @AndroidFindBy(id ="com.inomera.sm:id/shapeableBottomMButton")
    public WebElement migrosAnaEkranButton;
    @AndroidFindBy(xpath ="//android.widget.ImageView[@resource-id=\"com.inomera.sm:id/shapeableBottomMButton\"]")
    public WebElement konumizniErisimiAButton;
    @AndroidFindBy(id ="com.inomera.sm:id/permissionButton")
    public WebElement bildirimtercihiniBelirleAButton;
    @AndroidFindBy(id ="android:id/button1")
    public WebElement bildirimeIzinVerAButton;
    @AndroidFindBy(id ="com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    public WebElement migrosAllowOnlyAButton;
    @AndroidFindBy(xpath ="(//android.view.ViewGroup[@resource-id=\"com.inomera.sm:id/serviceSelectionConstraintLayout\"])[1]")
    public WebElement migrosSanalMarketKırılımıButton;
    @AndroidFindBy(id ="com.inomera.sm:id/logoutContinueButton")
    public WebElement migrosSanaluyeOlmadanDevvamEtButton;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.inomera.sm:id/iv_image\"])[1]")
    public WebElement migrosMacroOnlineKırılımıButton;
    @AndroidFindBy(id ="com.inomera.sm:id/textInputEditText")
    public WebElement migrosSearchButton;
    @AndroidFindBy(xpath ="(//androidx.cardview.widget.CardView[@resource-id=\"com.inomera.sm:id/add_to_cart_button\"])[2]/android.view.ViewGroup/android.widget.ImageView")
    public WebElement migrostozsekerekleButton;
    @AndroidFindBy(xpath ="(//android.widget.ImageView[@resource-id=\"com.inomera.sm:id/iv_image\"])[3]")
    public WebElement migrosmuzusepeteekleButton;
    @AndroidFindBy(xpath ="(//androidx.cardview.widget.CardView[@resource-id=\"com.inomera.sm:id/add_to_cart_button\"])[1]/android.view.ViewGroup/android.widget.ImageView")
    public WebElement migrosLePetitMarseıllasDusJelisepeteekleButton;
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
    @AndroidFindBy(xpath ="//androidx.cardview.widget.CardView[@resource-id=\"com.inomera.sm:id/storePickCardView\"]/android.view.ViewGroup")
    public WebElement magazadanTeslimAlacagımButton;
    @AndroidFindBy(xpath="//android.widget.TextView[@text='Adresime Gelsin']")
    public WebElement adresimeGelsinButton;
    @AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"com.inomera.sm:id/cityNameTextView\" and @text=\"İzmir\"]")
    public WebElement sehirSecIzmirButton;
    @AndroidFindBy(xpath="(//android.widget.LinearLayout[@resource-id=\"com.inomera.sm:id/main_layout\"])[2]/android.view.ViewGroup[3]/android.view.ViewGroup[2]")
    public WebElement ilceSecKarsiyakaButton;
    @AndroidFindBy(id="com.inomera.sm:id/categories_recycler_view")
    public WebElement alaybeyMagazasiButton;
    @AndroidFindBy(id="com.inomera.sm:id/includeToolbar")
    public WebElement mahalleSokakCaddeAraButtonA;  //sendkeys kullan
    @AndroidFindBy(id="com.inomera.sm:id/special_discounts_title_text_view")
    public WebElement mevcutKonumuKullanButtonA;
    @AndroidFindBy(id="com.inomera.sm:id/shapeableBottomMButton")
    public WebElement isaretledigimKonumuEkleButtonA;
    @AndroidFindBy(id="com.inomera.sm:id/citySpinnerTextLayout")
    public WebElement adresbilgisiilSecimiButtonA;
    @AndroidFindBy(id="com.inomera.sm:id/townSpinnerLayout")
    public WebElement adresbilgisiSemtSecimiButtonA;
    @AndroidFindBy(id="com.inomera.sm:id/districtSpinnerLayout")
    public WebElement adresbilgisiMahalleSecimiButtonA;
    @AndroidFindBy(id="com.inomera.sm:id/editTextStreet")
    public WebElement caddeSokakBilgisiGirButtonA;
    @AndroidFindBy(id="com.inomera.sm:id/editTextStreet")
    public WebElement binaNoGirButtonA;
    @AndroidFindBy(id="com.inomera.sm:id/floorEditTextLayout")
    public WebElement katNoGirButtonA;
    @AndroidFindBy(id="com.inomera.sm:id/doorNumberTextLayout")
    public WebElement daireNoGirButtonA;
    @AndroidFindBy(id="com.inomera.sm:id/textInputLayoutAddNewInvoiceAddressName")
    public WebElement adresBasligiGirButtonA;
    @AndroidFindBy(id="com.inomera.sm:id/firstNameEditTextLayout")
    public WebElement kisiselBilgiGirAdButtonA;
    @AndroidFindBy(id="com.inomera.sm:id/lastNameEditTextLayout")
    public WebElement kisiselBilgiGirSoyadGirButtonA;
    @AndroidFindBy(id="")
    public WebElement kisiselBilgiGirEpostaButtonA;
    @AndroidFindBy(xpath="(//android.widget.TextView[@resource-id=\"com.inomera.sm:id/product_name_text_view\"])[2]")
    public WebElement adresTarifiGirButtonA;
    @AndroidFindBy(id="com.inomera.sm:id/shapeableBottomMButton")
    public WebElement kisiselBilgileriKaydetButtonA;
    @AndroidFindBy(id="com.inomera.sm:id/shapeableBottomMButton")
    public WebElement evetAdresimDogruButtonA;
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
