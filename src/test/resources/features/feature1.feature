Feature: aaaa

  Scenario: (1)
    Given the price list for an international coffee shop
      |   name  | price |
      | KMSY | 29 |
      | KSFO | 37 |
      | KSEA | 47 |
      | KJFK | 40 |
    Given I have 3 RED balls
    Given I have 4 cookies in my belly
    Given I have 42 cucumbers in my belly
    Given I have 1 cucumber in my stomach
    Then the result should be ABC
    Then getting shared param
