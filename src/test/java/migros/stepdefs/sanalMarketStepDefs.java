package migros.stepdefs;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import migros.pages.migrosSanalPages;
import migros.utils.ReusableMethods;


public class sanalMarketStepDefs  {

    migrosSanalPages migrosSanalPages = new migrosSanalPages();
    KeyEvent home = new KeyEvent(AndroidKey.HOME);
    @When("Search butonuna tiklanir")
    public void search_butonuna_tıklanir() {

     migrosSanalPages.migrosSearchButton.click();

        System.out.println("Search butonu göründü");
        ReusableMethods.bekle(2);
    }

    @Then("sayfaya yonlendirildigi dogrulanir")
    public void sayfaya_yonlendirildigi_dogrulanir() {
        if (migrosSanalPages.migrosSearchButton.isDisplayed()) {
            System.out.println("YÖNLENDIRILMEDI");
        }else {
            System.out.println("sayfaya_yonlendirildigi_dogrulanir");
        }
    }
    @Then("indirimli ürün sayfasına gidilir")
    public void indirimli_ürün_sayfasına_gidilir() {
   migrosSanalPages.migrosSearchButton.sendKeys("bor toz seker");
   migrosSanalPages.migrostozsekerekleButton.click();
   migrosSanalPages.migrosSearchButton.sendKeys("muz");
   migrosSanalPages.migrosmuzusepeteekleButton.click();
    }
    @Then("ürünler sepete eklenir")
    public void ürünler_sepete_eklenir() {

      migrosSanalPages.sepeteEkleButton.click();
    }
    @Then("sepete git butonuna tiklanir")
    public void sepete_git_butonuna_tiklanir() {
      migrosSanalPages.sepeteGitButton.click();

    }
    @Then("sepeti onayla butonuna tiklanir2")
    public void sepeti_onayla_butonuna_tıklanir2() {
     migrosSanalPages.sepetimeDevametButton.click();
     migrosSanalPages.sepetiOnaylaButton.click();
    }
    @Then("devam et butonuna tiklanir")
    public void devam_et_butonuna_tiklanir() {
        migrosSanalPages.devamEtButton.click();
    }
    @Then("teslimat saati secilir")
    public void teslimat_saati_secilir() {
    migrosSanalPages.faturaAdresiOlaraktaKullanButton.click();
    migrosSanalPages.randevuluTeslimatButton.click();
    migrosSanalPages.saat12301430Button.click();
    }
    @Then("devam et2 butonuna tiklanir")
    public void devam_et2_butonuna_tiklanir() {
    migrosSanalPages.devamEt2Button.click();
    }
    @Then("ödeme yöntemi belirlenir")
    public void ödeme_yöntemi_belirlenir() {
     migrosSanalPages.farklıOdemeYontemıButton.click();
     migrosSanalPages.krediBankakartiButton.click();
     migrosSanalPages.devamEt3Button.click();
    }
    @Then("koşul ve sözlesmeler onaylanir")
    public void koşul_ve_sözlesmeler_onaylanir() {
    migrosSanalPages.onBılgıOnayButton.click();
    migrosSanalPages.mesafeliSatısSozOnayButton.click();
    }
    @Then("ödeme yap butonuna tiklanir")
    public void ödeme_yap_butonuna_tiklanir() {
        migrosSanalPages.odemeYapButton.click();
    }


    @When("Sanal alisveris sayfasina gidilmeli")
    public void sanalAlisverisSayfasinaGidilmeli() {

        migrosSanalPages.migrosAnaEkranButton.click();
        migrosSanalPages.migrosSanalMarketKırılımıButton.click();
    }
}
