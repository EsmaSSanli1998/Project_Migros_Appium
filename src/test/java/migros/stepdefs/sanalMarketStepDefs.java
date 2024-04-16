package migros.stepdefs;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import migros.pages.MigrosSanalPages;
import migros.utils.ConfigReader;
import migros.utils.DriverAfra;
import migros.utils.ReusableMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;


public class sanalMarketStepDefs  {

    MigrosSanalPages migros_Sanal_Pages = new MigrosSanalPages();
    KeyEvent home = new KeyEvent(AndroidKey.HOME);
    Actions actions;
    KeyEvent back = new KeyEvent(AndroidKey.BACK);
    @When("Search butonuna tiklanir")
    public void search_butonuna_tıklanir() {

        migros_Sanal_Pages.migrosSearchButton.click();

        System.out.println("Search butonu göründü");
        ReusableMethods.bekle(2);
    }

    @Then("sayfaya yonlendirildigi dogrulanir2")
    public void sayfaya_yonlendirildigi_dogrulanir2() {

        if (migros_Sanal_Pages.migrosSearchButton.isDisplayed()) {
            System.out.println("YÖNLENDIRILMEDI");
        }else {
            System.out.println("sayfaya_yonlendirildigi_dogrulanir");
        }
    }
    @Then("indirimli ürün sayfasına gidilir")
    public void indirimli_ürün_sayfasına_gidilir() {

        migros_Sanal_Pages.migrosSearchButton.sendKeys("Le petit");
        migros_Sanal_Pages.migrosLePetitMarseıllasDusJelisepeteekleButton.click();
        migros_Sanal_Pages.migrosLePetitMarseıllasDusJelisepeteekleButton.click();
    }
    @Then("ürünler sepete eklenir")
    public void ürünler_sepete_eklenir() {
        MigrosSanalPages migros_Sanal_Pages = new MigrosSanalPages();
        migros_Sanal_Pages.sepeteEkleButton.click();
    }
    @Then("sepete git butonuna tiklanir")
    public void sepete_git_butonuna_tiklanir() {

        migros_Sanal_Pages.sepeteGitButton.click();

    }
    @Then("sepeti onayla butonuna tiklanir2")
    public void sepeti_onayla_butonuna_tıklanir2() {

        migros_Sanal_Pages.sepetimeDevametButton.click();
        migros_Sanal_Pages.sepetiOnaylaButton.click();
    }
    @Then("devam et butonuna tiklanir")
    public void devam_et_butonuna_tiklanir() {

        migros_Sanal_Pages.devamEtButton.click();
    }

    @Then("devam et2 butonuna tiklanir")
    public void devam_et2_butonuna_tiklanir() {

        migros_Sanal_Pages.devamEt2Button.click();
    }
    @Then("ödeme yöntemi belirlenir")
    public void ödeme_yöntemi_belirlenir() {

        migros_Sanal_Pages.farklıOdemeYontemıButton.click();
        migros_Sanal_Pages.krediBankakartiButton.click();
        migros_Sanal_Pages.devamEt3Button.click();
    }
    @Then("koşul ve sözlesmeler onaylanir")
    public void koşul_ve_sözlesmeler_onaylanir() {

        migros_Sanal_Pages.onBılgıOnayButton.click();
        migros_Sanal_Pages.mesafeliSatısSozOnayButton.click();
    }
    @Then("ödeme yap butonuna tiklanir")
    public void ödeme_yap_butonuna_tiklanir() {

        migros_Sanal_Pages.odemeYapButton.click();
    }


    @When("Sanal alisveris sayfasina gidilmeli")
    public void sanalAlisverisSayfasinaGidilmeli() {

        migros_Sanal_Pages.migrosAnaEkranButton.click();
        migros_Sanal_Pages.migrosSanalMarketKırılımıButton.click();
    }

    @Given("migros uygulamasina giris yapilir2")
    public void migrosUygulamasinaGirisYapilir2() {

       // DriverAfra.getDriver_Afra();
        System.out.println("Uygulamaya giris Yapildi");
        ReusableMethods.bekle(2);

    }
    @And("uye olmadan devam et sekmesine tiklanir{int}")
    public void uyeOlmadanDevamEtSekmesineTiklanir(int arg0) {

        migros_Sanal_Pages.migrosSanaluyeOlmadanDevvamEtButton.click();
    }

    @And("magazadan teslim alacagim butonuna tiklanir")
    public void magazadanTeslimAlacagimButonunaTiklanir() {

        migros_Sanal_Pages.magazadanTeslimAlacagımButton.click();
    }

    @When("Sehir ılce mahalle ve magaza secilir")
    public void sehirIlceMahalleVeMagazaSecilir() {

        ReusableMethods.scroll(migros_Sanal_Pages.sehirSecIzmirButton);
        ReusableMethods.click(migros_Sanal_Pages.sehirSecIzmirButton);
        ReusableMethods.scroll(migros_Sanal_Pages.ilceSecKarsiyakaButton);
        ReusableMethods.click(migros_Sanal_Pages.ilceSecKarsiyakaButton);
        migros_Sanal_Pages.alaybeyMagazasiButton.click();

    }
    @And("bildirimleri kapatA")
    public void bildirimleriKapatA() {

        migros_Sanal_Pages.bildirimtercihiniBelirleAButton.click();
        migros_Sanal_Pages.bildirimeIzinVerAButton.click();
        migros_Sanal_Pages.migrosAllowOnlyAButton.click();
        migros_Sanal_Pages.konumizniErisimiAButton.click();
    }
    @And("adres ayarları duzenlenir")
    public void adresAyarlarıDuzenlenir() {

        migros_Sanal_Pages.mahalleSokakCaddeAraButtonA.click();
        migros_Sanal_Pages.mahalleSokakCaddeAraButtonA.sendKeys("izmir");
        ReusableMethods.bekle(2);
        ReusableMethods.clickGestureKonum(DriverAfra.getDriver_Afra(),234,289);
        ReusableMethods.bekle(2);
        migros_Sanal_Pages.isaretledigimKonumuEkleButtonA.click();
        //karsıyakasecımı
        // ReusableMethods.swipeGestureKoordinat(DriverAfra.getDriver_Afra(),500,500,500,500,"up",3,500);
       // ReusableMethods.clickGestureKonum(DriverAfra.getDriver_Afra(),179,327);

        ReusableMethods.click(migros_Sanal_Pages.adresbilgisiilSecimiButtonA);
        actions.sendKeys(migros_Sanal_Pages.adresbilgisiilSecimiButtonA, ConfigReader.getProperty("il"), Keys.ENTER).perform();
        ReusableMethods.click(migros_Sanal_Pages.adresbilgisiSemtSecimiButtonA);
        actions.sendKeys(migros_Sanal_Pages.adresbilgisiSemtSecimiButtonA, ConfigReader.getProperty("ilce"), Keys.ENTER).perform();
        ReusableMethods.click(migros_Sanal_Pages.adresbilgisiMahalleSecimiButtonA);
        actions.sendKeys(migros_Sanal_Pages.adresbilgisiMahalleSecimiButtonA, ConfigReader.getProperty("mahalle"), Keys.ENTER).perform();
        migros_Sanal_Pages.caddeSokakBilgisiGirButtonA.sendKeys("1870");
        migros_Sanal_Pages.binaNoGirButtonA.sendKeys("16");
        migros_Sanal_Pages.binaNoGirButtonA.sendKeys("16");
        migros_Sanal_Pages.katNoGirButtonA.sendKeys("1");
        migros_Sanal_Pages.daireNoGirButtonA.sendKeys("1");
        migros_Sanal_Pages.adresTarifiGirButtonA.sendKeys("");
        DriverAfra.getDriver_Afra().pressKey(back);
        migros_Sanal_Pages.adresBasligiGirButtonA.sendKeys("Ev");
        DriverAfra.getDriver_Afra().pressKey(back);
        migros_Sanal_Pages.kisiselBilgiGirAdButtonA.sendKeys("Afra");
        migros_Sanal_Pages.kisiselBilgiGirSoyadGirButtonA.sendKeys("Kasman");
        migros_Sanal_Pages.kisiselBilgileriKaydetButtonA.click();
        migros_Sanal_Pages.evetAdresimDogruButtonA.click();
    }

   // @And("tekrar sepete gidilirA")
    //public void tekrarSepeteGidilirA() {


   // }

   // @And("eposta ve diger kisisel bilgiler girilirA")
   // public void epostaVeDigerKisiselBilgilerGirilirA() {



   /// }

}
