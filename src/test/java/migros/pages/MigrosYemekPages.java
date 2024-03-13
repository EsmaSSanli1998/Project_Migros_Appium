package migros.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import migros.utils.DriverNoApk;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MigrosYemekPages {

/*
accessibility: accessibilityID
class: classname
id: resource-id
xpath-->en son secenek
 */

    public MigrosYemekPages() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverNoApk.getDriverNoApk()), this);
    }

    //US01_TC01

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Migros\"]")
    private WebElement migrosUygulama;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@resource-id=\"com.inomera.sm:id/serviceSelectionConstraintLayout\"])[3]")
    private WebElement migrosYemekSekmesi;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id=\"com.inomera.sm:id/imageViewProfile\"]")
    private WebElement kullaniciAdam;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.inomera.sm:id/text\" and @text=\"Üye Ol veya Giriş Yap\"]")
    private WebElement uyeOlGirisYapB;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.inomera.sm:id/loginButton\"]")
    private WebElement girisYapSekmesi;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.inomera.sm:id/phoneNumberEditText\"]")
    private WebElement telefonNumB;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.inomera.sm:id/loginButton\"]")
    private WebElement girisYapB;

    @AndroidFindBy(id = "android:id/message_text")
    private WebElement bildirimPanelindekiMesajText;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.inomera.sm:id/otpNumberTextInputEditText\"]")
    private WebElement smsDogrulamaBoxy;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.inomera.sm:id/verifyButton\"]")
    private WebElement smsDogrulaB;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.inomera.sm:id/materialTextViewCampaignRestaurantsItemRestaurantName\" and @text=\"Pizza Bulls, Fatih (Molla Gürani Mah.)\"]")
    private WebElement pizzaBulls;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.inomera.sm:id/iconAdd\"])[2]")
    private WebElement buyukBoyPepperoniPizza;

    @AndroidFindBy(xpath = "(//android.widget.RadioButton[@resource-id=\"com.inomera.sm:id/radioButtonOption\"])[1]")
    private WebElement normalHamur;

    @AndroidFindBy(xpath = "(//android.widget.RadioButton[@resource-id=\"com.inomera.sm:id/radioButtonOption\"])[6]")
    private WebElement kenarSosIstemiyorum;

    @AndroidFindBy(xpath = "")
    private WebElement aa;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.inomera.sm:id/buttonAddCart\"]")
    private WebElement sepeteEkleButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.inomera.sm:id/navigation_bar_item_small_label_view\" and @text=\"289,90 TL\"]")
    private WebElement sepetimy;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.inomera.sm:id/buttonApproveCart\"]")
    private WebElement sepetiOnaylabir;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.inomera.sm:id/discountPrice\"]")
    private WebElement altmisTLindirimdogrula;


    //US01_TC02

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.inomera.sm:id/materialTextViewCampaignRestaurantsItemRestaurantName\" and @text=\"Paşa Döner, Fatih (Ali Kuşçu Mah.)\"]")
    private WebElement pasaDoner;

    @AndroidFindBy(xpath = "")
    private WebElement ramazanMenusu;

    @AndroidFindBy(xpath = "")
    private WebElement og;

    @AndroidFindBy(xpath = "")
    private WebElement wg;

    @AndroidFindBy(xpath = "")
    private WebElement eg;

    @AndroidFindBy(xpath = "")
    private WebElement rg;

    @AndroidFindBy(xpath = "")
    private WebElement hg;

    @AndroidFindBy(xpath = "")
    private WebElement jg;

    @AndroidFindBy(xpath = "")
    private WebElement kg;

    @AndroidFindBy(xpath = "")
    private WebElement ld;

    @AndroidFindBy(xpath = "")
    private WebElement pgd;

    @AndroidFindBy(xpath = "")
    private WebElement od;

    @AndroidFindBy(xpath = "")
    private WebElement wgg;

    @AndroidFindBy(xpath = "")
    private WebElement ed;

    @AndroidFindBy(xpath = "")
    private WebElement rdg;





    //US02_TC01

    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id=\"com.inomera.sm:id/arrowLocationPickerFood\"]")
    private WebElement teslimatAdresiniBelirle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.inomera.sm:id/logoutContinueButton\"]")
    private WebElement uyeOlmadanDevamEt;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.inomera.sm:id/btnSave\"]")
    private WebElement isaretledigimKonumuEkleB;

    @AndroidFindBy(xpath = "(//android.widget.ImageButton[@content-desc=\"Açılır menüyü göster\"])[1]")
    private WebElement il;

    @AndroidFindBy(xpath = "")
    private WebElement rdga;

    @AndroidFindBy(xpath = "(//android.widget.ImageButton[@content-desc=\"Açılır menüyü göster\"])[2]")
    private WebElement ilce;

    @AndroidFindBy(xpath = "")
    private WebElement rdgaa;

    @AndroidFindBy(xpath = "(//android.widget.ImageButton[@content-desc=\"Açılır menüyü göster\"])[3]")
    private WebElement mahalle;

    @AndroidFindBy(xpath = "")
    private WebElement rdgaabbb;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.inomera.sm:id/editTextStreet\"]")
    private WebElement cadde;

    @AndroidFindBy(xpath = "")
    private WebElement rdgaf;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.inomera.sm:id/buildingNoEditText\"]")
    private WebElement bina;

    @AndroidFindBy(xpath = "")
    private WebElement rdgafx;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.inomera.sm:id/floorEditText\"]")
    private WebElement kat;

    @AndroidFindBy(xpath = "")
    private WebElement rdgafff;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.inomera.sm:id/doorNumberEditText\"]")
    private WebElement daire;

    @AndroidFindBy(xpath = "")
    private WebElement rdgafffff;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.inomera.sm:id/addressDirectionEditText\"]")
    private WebElement adresTarifi;

    @AndroidFindBy(xpath = "")
    private WebElement rdgaeee;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.inomera.sm:id/addressNameEditText\"]")
    private WebElement adresBasligi;

    @AndroidFindBy(xpath = "")
    private WebElement rdgarr;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.inomera.sm:id/firstNameEditText\"]")
    private WebElement ad;

    @AndroidFindBy(xpath = "")
    private WebElement rdgasss;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.inomera.sm:id/lastNameEditText\"]")
    private WebElement soyad;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.inomera.sm:id/lastNameEditText\"]")
    private WebElement kaydetButonu;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.inomera.sm:id/buttonConfirm\"]")
    private WebElement evetAdresimDogru;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id=\"com.inomera.sm:id/shapeableBottomMButton\"]")
    private WebElement migrosDolasimMenusuCizgiliOlan;

    @AndroidFindBy(xpath = "(//android.widget.FrameLayout[@resource-id=\"com.inomera.sm:id/serviceSelectionFrameLayout\"])[3]")
    private WebElement migrosYemekSekmessiB;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Başka Bir Adres Seç\"]")
    private WebElement baskaBirAdresSecYazisiDogrula;

    @AndroidFindBy(xpath = "")
    private WebElement s;

}
