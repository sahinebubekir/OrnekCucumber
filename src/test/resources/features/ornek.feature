@google
Feature: Google User Story'si

  @urlTestGoogle
  Scenario: Google Url Test Case
    Given Kullanici Google Ana Sayfasina Gider
    And Kullanici sayfanin urlini alir
    Then Kullanici sayfanin urlinin google icerdigini dogrular
    And Driver kapatilir

  @titleTestGoogle
  Scenario: Google Title Test Case
    Given Kullanici Google Ana Sayfasina Gider
    And Kullanici sayfanin titleini alir
    Then Kullanici sayfanin titleinin google icerdigini dogrular
    And Driver kapatilir

