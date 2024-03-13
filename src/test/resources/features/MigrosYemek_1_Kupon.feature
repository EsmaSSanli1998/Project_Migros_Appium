@US001_APPIUM_MigrosYemek1
Feature: Migros yemek - Kupon sepette goruntulenebilmesi(alt limit tutuyor) - Indirim kuponu sepette kullanlabilmeli
  @TC001_APPIUM_Failed
  Scenario: TC01 | Indirim kuponu test edilir(60 TL ve 40 TL indirim kuponu goruntulenmeli)
    Given migros uygulamasina giris yapilir
    When insan simgesine tiklanir
    And uye ol veya giris yapilir sekmesine tiklanir
    And giris yap butonuna tiklanir
    When telefon numarasi girilir
    And SMS kodu girilir
    When Pizza Bulls, Fatih (Molla Gurani Mah) Buyuk Boy Pepperoni Pizza, Normal Hamur, Kenar Sos Istemiyorum secilir
    And sepet gidilir
    And sepeti onayla butonuna tiklanir
    Then 60 TL ve 40 TL indirim kuponu goruntulenmeli


  @TC002_APPIUM_Passed
  Scenario: TC02 | Indirim kuponu test edilir(60 TL ve 40 TL indirim kuponu goruntulenmeli)
    Given migros uygulamasina giris yapilir
    When insan simgesine tiklanir
    And uye ol veya giris yapilir sekmesine tiklanir
    And giris yap butonuna tiklanir
    When telefon numarasi girilir
    And SMS kodu girilir
    When Pasa Doner, Fatih (Ali Kuscu Mah.) dukkanindan Ramazan Menusu iki tane siparis edilir
    And sepet gidilir
    And sepeti onayla butonuna tiklanir
    Then 60 TL ve 40 TL indirim kuponu goruntulenmeli




  #given data ve url düzenlemesi, bir data kaydedilecekse, düzenlenecekse, örnegin siteye gidilir
  #eylem kisimlari when ile, tiklanir, secme metin girme
  #and her seyden sonra kullanilabilir, joker eleman
  #then den sonra dogrulama yapilirsa yine and yazilir, when den sonra gorunus acisindan and kullanmak daha güzel durur
  #ayni sayfada isleme devam edilirse when ile devam edilebilir, birbiriyle baglantili isleri tekrar when acarak yapariz
  #then assertionda kullanilir