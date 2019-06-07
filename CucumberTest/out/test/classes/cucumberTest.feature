Feature: cucumber  test

  @focusStart
  Scenario Outline: Creating a file
    Given User want to create <Name> file
    When User calls the createFile method
    Then File with this name appears in folder

    Examples:
      | Name |
      | "./testOneFile.txt"  |
      | "./testTwoFile.txt" |