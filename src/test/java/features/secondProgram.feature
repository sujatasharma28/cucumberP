#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Application Login
 
Background:
When launch the browser from config variable
And hit the homepage url of banking site


@RegressionTest @NetBanking
Scenario: User page default login
  
Given User is on Netbanking landing page
When User login into application with user and password 0953
Then Home page is displayed
And Cards are displayed

@SmokeTest @RegressionTest @Mortgage
Scenario Outline: Mortgage User page default login
  
Given User is on Netbanking landing page
When User login into application with <Username> and password <Password>
Then Home page is displayed
And Cards are displayed

Examples:
  |Username  | Password|
  |debituser | hello12 |
  |credituser| jhg123  |
  


 
