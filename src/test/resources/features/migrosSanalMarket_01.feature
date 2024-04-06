@SanalTest_01
Feature: Migros sanal market - Musteri Uygulama uzerinden kampanya kullanarak siparis olusturabilmeli
  @migrossepet
  Scenario: TC01 | Urunlerde indirim kampanyalari sepette uygulanıyormu test edilir
    Given migros uygulamasina giris yapilir
    And teslimat adresini belirle sekmesine tiklanir
    And uye olmadan devam et sekmesine tiklanir
    And isaretledigim konumu ekle butonuna tiklanir
    When il, ilce, mahalle, cadde, bina, kat, daire, adres tarifi, adres basligi, ad soyad eklenir
    And evet adresim dogru butonuna tiklanir
    When Sanal alisveris sayfasina gidilmeli
    And Search butonuna tiklanir
    Then sayfaya yonlendirildigi dogrulanir
    And indirimli ürün sayfasına gidilir
    And ürünler sepete eklenir
    And sepete git butonuna tiklanir
    And sepeti onayla butonuna tiklanir2
    And devam et butonuna tiklanir
    And teslimat saati secilir
    And devam et2 butonuna tiklanir
    And ödeme yöntemi belirlenir
    And koşul ve sözlesmeler onaylanir
    And ödeme yap butonuna tiklanir