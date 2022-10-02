Feature: Ornek 2

  @urlTestGoogle
  Scenario: Google Url Test Case Ornek2 Feature
    Given Kullanici Google Ana Sayfasina Gider
    And Kullanici sayfanin urlini alir
    Then Kullanici sayfanin urlinin google icerdigini dogrular
    And Driver kapatilir