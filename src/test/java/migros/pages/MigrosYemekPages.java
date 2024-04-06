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

    //BILDIRIMLER
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.inomera.sm:id/permissionButton\"]")
    public WebElement bildirimleriEtkinlestir;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"android:id/button2\"]")
    public WebElement izinVerme;

    @AndroidFindBy(id = "com.inomera.sm:id/buttonAllowLocationPermission")
    public WebElement konumErisimIzni;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    public WebElement uygulamayiKullanirken;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.inomera.sm:id/navigation_bar_item_icon_view\"])[3]")
    public WebElement cizgilerMigrosYemekIcin;

    @AndroidFindBy(xpath = "(//android.widget.FrameLayout[@resource-id=\"com.inomera.sm:id/serviceSelectionFrameLayout\"])[3]")
    public WebElement migrosYemekSekmesi;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Mesajlar\"]")
    public WebElement mesajlar;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.google.android.apps.messaging:id/conversation_name\" and @text=\"MIGROS\"]")
    public WebElement migrosMesajinaTikla;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.google.android.apps.messaging:id/message_text\" and @text=\"012695 dogrulama kodu ile islem yapabilirsiniz.\n" +
            "\n" +
            "Migros Yemek\n" +
            "Mersis: 0622052951300016 B002\"]")
    public WebElement gelenMesaj;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Migros\"]")
    public WebElement migrosUygulamasiUygulamalarda;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Migros\"]")
    public WebElement migrosUygulamasiArkaPlan;


    //US01_TC01


    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id=\"com.inomera.sm:id/imageViewProfile\"]")
    public WebElement kullaniciAdam;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.inomera.sm:id/text\" and @text=\"Üye Ol veya Giriş Yap\"]")
    public WebElement uyeOlGirisYapB;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.inomera.sm:id/loginButton\"]")
    public WebElement girisYapSekmesi;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.inomera.sm:id/phoneNumberEditText\"]")
    public WebElement telefonNumB;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.inomera.sm:id/loginButton\"]")
    public WebElement girisYapB;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"0(5__) ___-____\"]")
    public WebElement telefonNumB2;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Giriş Yap\"]")
    public WebElement girisYapB2;

    @AndroidFindBy(xpath = "(//android.widget.RelativeLayout[@resource-id=\"com.google.android.apps.messaging:id/conversation_text_content\"])[1]")
    public WebElement mesajaGirmek;

    @AndroidFindBy(xpath = "(//android.widget.LinearLayout[@resource-id=\"com.google.android.apps.messaging:id/message_text_and_info\"])[7]")
    public WebElement mesajlocatei;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.inomera.sm:id/otpNumberTextInputEditText\"]")
    public WebElement smsDogrulamaBoxy;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.inomera.sm:id/verifyButton\"]")
    public WebElement smsDogrulaB;

    @AndroidFindBy(xpath = "//android.widget.EditText")
    public WebElement smsDogrulamaBoxy2;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Doğrula\"]")
    public WebElement smsDogrulaB2;

    @AndroidFindBy(xpath = "(//android.widget.TextView[contains(@text, 'dogrulama kodu ile islem yapabilirsiniz.')])[last()]")
    public WebElement sonMesaj;


    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.inomera.sm:id/textInputEditText\"]")
    public WebElement aramaKutusuy;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.inomera.sm:id/editTextSearchBar\"]")
    public WebElement aramaKutusuIkinciy;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.inomera.sm:id/recyclerViewRestaurantsResult\"]/android.view.ViewGroup")
    public WebElement pizzaBulls;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.inomera.sm:id/tvMenuTitle\" and @text=\"Büyük Boy Pepperoni Pizza\"]")
    public WebElement buyukBoyPepperoniPizza;

    @AndroidFindBy(xpath = "(//android.widget.RadioButton[@resource-id=\"com.inomera.sm:id/radioButtonOption\"])[1]")
    public WebElement normalHamur;

    @AndroidFindBy(xpath = "(//android.widget.RadioButton[@resource-id=\"com.inomera.sm:id/radioButtonOption\"])[6]")
    public WebElement kenarSosIstemiyorum;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.inomera.sm:id/buttonAddCart\"]")
    public WebElement sepeteEkleButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.inomera.sm:id/navigation_bar_item_small_label_view\" and @text=\"289,90 TL\"]")
    public WebElement sepetimy;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.inomera.sm:id/buttonApproveCart\"]")
    public WebElement sepetiOnaylabir;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.inomera.sm:id/discountPrice\"]")
    public WebElement altmisTLindirimdogrula;




    //US01_TC02

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.inomera.sm:id/materialTextViewAllRestaurantsShrinkedItemRestaurantName\"]")
    public WebElement RoyalDessert;

    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"com.inomera.sm:id/iconAdd\"])[4]")
    public WebElement tatlininArtisi;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.inomera.sm:id/buttonAddCart\"]")
    public WebElement sepeteEkleB;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.inomera.sm:id/navigation_bar_item_small_label_view\" and @text=\"389,70 TL\"]")
    public WebElement sepeteGitB;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.inomera.sm:id/buttonApproveCart\"]")
    public WebElement sepetiOnaylaB;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.inomera.sm:id/discountName\" and @text=\"40 TL İndirim\"]")
    public WebElement kirkTLIndirimD;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.inomera.sm:id/discountName\" and @text=\"60 TL İndirim\"]")
    public WebElement altmisTLIndirimD;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id=\"com.inomera.sm:id/imgClose\"]")
    public WebElement reklam;



    //US02_TC01

    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id=\"com.inomera.sm:id/arrowLocationPickerFood\"]")
    public WebElement teslimatAdresiniBelirle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.inomera.sm:id/logoutContinueButton\"]")
    public WebElement uyeOlmadanDevamEt;

    @AndroidFindBy(id = "com.inomera.sm:id/btnSave")
    public WebElement isaretledigimKonumuEkleB;

    @AndroidFindBy(xpath = "(//android.widget.ImageButton[@content-desc=\"Açılır menüyü göster\"])[1]")
    public WebElement il;

    @AndroidFindBy(xpath = "(//android.widget.ImageButton[@content-desc=\"Açılır menüyü göster\"])[2]")
    public WebElement ilce;

    @AndroidFindBy(xpath = "(//android.widget.ImageButton[@content-desc=\"Açılır menüyü göster\"])[3]")
    public WebElement mahalle;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.inomera.sm:id/editTextStreet\"]")
    public WebElement cadde;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.inomera.sm:id/buildingNoEditText\"]")
    public WebElement bina;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.inomera.sm:id/floorEditText\"]")
    public WebElement kat;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.inomera.sm:id/doorNumberEditText\"]")
    public WebElement daire;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.inomera.sm:id/addressDirectionEditText\"]")
    public WebElement adresTarifi;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.inomera.sm:id/addressNameEditText\"]")
    public WebElement adresBasligi;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.inomera.sm:id/firstNameEditText\"]")
    public WebElement ad;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.inomera.sm:id/lastNameEditText\"]")
    public WebElement soyad;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.inomera.sm:id/lastNameEditText\"]")
    public WebElement kaydetButonu;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.inomera.sm:id/buttonConfirm\"]")
    public WebElement evetAdresimDogru;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id=\"com.inomera.sm:id/shapeableBottomMButton\"]")
    public WebElement migrosDolasimMenusuCizgiliOlan;

    @AndroidFindBy(xpath = "(//android.widget.FrameLayout[@resource-id=\"com.inomera.sm:id/serviceSelectionFrameLayout\"])[3]")
    public WebElement migrosYemekSekmessiB;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Başka Bir Adres Seç\"]")
    public WebElement baskaBirAdresSecYazisiDogrula;



}
