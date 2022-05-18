Feature: Validating facebook page using valid credentials

  Scenario Outline: checking user is in the facebook login page
    Given when user in on loginpage
    When user enter "<username>" and "<password>"
    When user should click login button

    Examples: 
      | username     | password  |
      | Dhanraj      | dhan@123  |
      | Gobielumalai | gobi@123  |
      | sudhan       | sudhu@123 |
