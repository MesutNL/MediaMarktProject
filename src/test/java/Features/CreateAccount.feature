Feature:  Create Account Functionality

  Scenario: Create Account
    Given Navigate To Media Markt NL Website
    And Click to Mijn MediaMarkt
    And Click to Mijn Account
    And Click to Nog Geen Account ? Account Aanmaken
    Then Select to Consument
    Then Select to Gender
    And Enter Voornaam  and Achternaam
    And Select GeboorteDatum
    And Enter E-mailadres  and Wachtwoord  and Herhaal Nieuw Wachtwoord as
    And Click to AANMELDEN
    Then User Should be Succesfully
