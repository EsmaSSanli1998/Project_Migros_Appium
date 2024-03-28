package migros.stepdefs;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import migros.pages.migrosSanalPages;
import migros.utils.ReusableMethods;


public class sanalMarketStepDefs  {

    migrosSanalPages migros_Sanal_Pages = new migrosSanalPages();
    KeyEvent home = new KeyEvent(AndroidKey.HOME);
    @When("Search butonuna tıklanir")
    public void search_butonuna_tıklanir() {
     migros_Sanal_Pages.migrosSanalMarketKırılımıButton.click();
     migros_Sanal_Pages.migrosSearchButton.click();

        System.out.println("Search butonu göründü");
        ReusableMethods.bekle(2);
    }

    @Then("sayfaya yonlendirildigi dogrulanir")
    public void sayfaya_yonlendirildigi_dogrulanir() {
        if (migros_Sanal_Pages.migrosSearchButton.isDisplayed()) {
            System.out.println("YÖNLENDIRILMEDI");
        }else {
            System.out.println("sayfaya_yonlendirildigi_dogrulanir");
        }
    }
    @Then("indirimli ürün sayfasına gidilir")
    public void indirimli_ürün_sayfasına_gidilir() {
   migros_Sanal_Pages.migrosSearchButton.sendKeys("bor toz seker");
   migros_Sanal_Pages.migrostozsekerekleButton.click();
   migros_Sanal_Pages.migrosSearchButton.sendKeys("muz");
   migros_Sanal_Pages.migrosmuzusepeteekleButton.click();
    }
    @Then("ürünler sepete eklenir")
    public void ürünler_sepete_eklenir() {

       // migros_Sanal_Pages.sepeteEkleButton.click();
    }
    @Then("sepete git butonuna tiklanır")
    public void sepete_git_butonuna_tiklanır() {
      migros_Sanal_Pages.sepeteGitButton.click();

    }
    @Then("sepeti onayla butonuna tıklanir")
    public void sepeti_onayla_butonuna_tıklanir() {
     migros_Sanal_Pages.sepetimeDevametButton.click();
     migros_Sanal_Pages.sepetiOnaylaButton.click();
    }
    @Then("devam et butonuna tiklanir")
    public void devam_et_butonuna_tiklanir() {
        migros_Sanal_Pages.devamEtButton.click();
    }
    @Then("teslimat saati secilir")
    public void teslimat_saati_secilir() {
    migros_Sanal_Pages.faturaAdresiOlaraktaKullanButton.click();
    migros_Sanal_Pages.randevuluTeslimatButton.click();
    migros_Sanal_Pages.saat12301430Button.click();
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




}
