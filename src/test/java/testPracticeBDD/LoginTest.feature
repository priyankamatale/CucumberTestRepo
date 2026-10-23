Feature: OrangeHRM Login

Background: 
Given User is on Login page

@smoke
@testcaseno1
Scenario: login with valid credentials

When user enter username "Admin"
And user enter password "admin123"
And click on Login button


@testcaseno2
Scenario:Login with invalid credentials
When user enter username "235"
And user enter password "45677"
And click on Login button

@testcaseno3
Scenario Outline:Scenario Outline check
When user enter username "<username>"
And user enter password "<password>"

Examples:
|username | password|
|Admin |admin123|
|Priyanka | 1234|
|trisha | 23445|





