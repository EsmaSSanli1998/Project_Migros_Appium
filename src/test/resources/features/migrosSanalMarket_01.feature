@SanalTest_01
Feature: Migros sanal market - Musteri Uygulama uzerinden kampanya kullanarak siparis olusturabilmeli
  @migrossepet
  Scenario: TC01 | Urunlerde indirim kampanyalari sepette uygulanıyormu test edilir
    Given migros uygulamasina giris yapilir2
    And bildirimleri kapatA
    And uye olmadan devam et sekmesine tiklanir2
    And magazadan teslim alacagim butonuna tiklanir
    When Sehir ılce mahalle ve magaza secilir
    When Sanal alisveris sayfasina gidilmeli
    And Search butonuna tiklanir
    Then sayfaya yonlendirildigi dogrulanir2
    And indirimli ürün sayfasına gidilir
    And ürünler sepete eklenir
    And sepete git butonuna tiklanir
    And sepeti onayla butonuna tiklanir2
    And devam et butonuna tiklanir
    And adres ayarları duzenlenir
    And tekrar sepete gidilirA
    And eposta ve diger kisisel bilgiler girilirA
    And devam et2 butonuna tiklanir
    And ödeme yöntemi belirlenir






