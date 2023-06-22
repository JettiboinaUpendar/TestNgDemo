Feature: feature to test google functionlity functionality

  Scenario: Enter into MakMyTripPage
    Given browser is open
    And click on Charter Flights
    Then click on ROUND TRIP
    And click on FROM
    When user enter location in serch field
    Then select the location
    And click on TO button
    When user enter location into search field
    Then select the to location
    And select date
    Then select time
    And select return date
    Then select return time
    And select number of passengers
    Then click on search
    Then click on cheapest flight
    And close the browser
