Feature: Parameter Conversion for Cucumber-JVM 2

  Scenario: Delimiter Annotation scenario
    Given the user names are jane,john,colin,alice
    Given the users are jane,john,colin,alice

  Scenario: Format Annotation scenario
    Given the date is 2017-11-05T09:54:13

  Scenario: Transformer Annotation scenario
    Given the name is 'John Mich Arthur Doe'
    Given the amount is $91.63

  Scenario: Single argument constructor scenario
    Given the user name is John Doe

  Scenario: NO single argument constructor scenario
    Given the professor is John Doe

  Scenario: Enum scenario
    Given the professor level is ASSOCIATE
