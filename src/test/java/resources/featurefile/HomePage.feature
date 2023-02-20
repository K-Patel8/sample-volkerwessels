Feature: VolkerWessels Sample Test
  As a candidate I am showing interviewer my framework

  Scenario: User verify VolkerWessels homepage
    Given user is on VolkerWessels main page
    When user hovers mouse on WHAT WE DO tab and user click on Rail Infrastructure option
    Then user is successfully navigated to Rail Infrastructure project

  Scenario: User lists out inside WHAT WE DO tasks and print them
    Given user is on VolkerWessels main page
    When user hovers mouse on WHAT WE DO tab and checks how many tasks are there
    Then user is successfully prints the list of tasks

