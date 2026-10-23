@regression
Feature:Login page feature
Background:
//Given user is on the login page
@smoke
@TestcaseNo:1
Scenario: Login page valid scenarios
When I enter username as "abc@gmail.com"
And I enter password as "123454y"
And user clicks on login button
Then user should be logged in successfully

@smoke
@TestcaseNo:2
Scenario: Login page invalid scenario
When I enter username as "xyz@gmail.com"
And I enter password as "456"
And user clicks on login button
Then user should not be logged in

@TestcaseNo:3
Scenario Outline: Scenario outline feature check
When I enter username as "<username>"
And I enter password as "<password>"

Examples:

|username          |   password    |
|pri@example.com   |	abc123		|
|amit@gmail.com    |	xyz345		|


