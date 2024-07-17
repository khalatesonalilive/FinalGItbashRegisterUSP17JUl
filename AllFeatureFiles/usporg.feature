Feature: Test Register USP Create Account Application

  Scenario: Validate the New Account Information # parameter
    Given user open "edge" browser
    When user enter valid "Sonali", "Khalate","Female","khalatesonali@gmail.com","khalatesonali@1234" and "khalatesonali@1234"

  Scenario Outline: Test Company and Organization information #data driven testing in cucumber
    Given user enter valid "<companyname>", "<Jobtitle>"

    Examples: 
      | companyname | Jobtitle                       |
      | TCS         | Patient safety Specialist plus |
      | TCS         | Pharmacovigilance Scientist I  |
      | Dutch Bank  | Manager                        |

  Scenario: Test and validate the entered Address Functionality #dataTable
    Given user enter the valid streetaddress,city,state, country,zipcode,
      | Pune | Pune | Maharashtra | INDIA | 2323232 |

  Scenario: Test and validate the contactinformation functionality
    Given user enter valid phonenumber
    When user select and validate the role from dropdownlist
    Then user again validate and enter industry from dropdownlist
    And user agree the registration policy and click on i agree checkbox
