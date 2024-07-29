Feature: Traveloka Car Booking

  Scenario: Book a car without a driver
    Given User is on Traveloka homepage
    When User selects Cars Product
    And User selects tab Without Driver
    And User selects Pick-up Location
    And User selects Pick-up Date & Time 2 days from now at "09:00"
    And User selects Drop-off Date & Time 5 days from now at "11:00"
    And User clicks button Search Car
    And User selects a car
    And User selects a car provider
    And User clicks button Continue in Product Detail
    And User selects Pick-up Location in Rental Office
    And User selects Drop-off Location in Other Location
    And User inputs Pick-up/Drop-off notes
    And User clicks button Book Now
    And User fills Contact Details
    And User fills Driver Details
    And User clicks Continue
    And User adds a special request
    And User checks all rental requirements
    And User clicks Continue after checking rental requirements
    And User selects payment method and proceeds to payment
    Then Booking is completed successfully
