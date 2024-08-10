Feature: Create an user

  Background: The Request Body Configuration
    * url baseUrl
    * def requestPayload = read('classpath:payload/CreateUserPayload.json')
    * set requestPayload.id = Java.type('utils.TestDataCreator').getID()
    * set requestPayload.username = Java.type('utils.TestDataCreator').getUserName()
    * set requestPayload.firstName = Java.type('utils.TestDataCreator').getFirstName()
    * set requestPayload.lastName = Java.type('utils.TestDataCreator').getLastName()
    * set requestPayload.email = Java.type('utils.TestDataCreator').getEmailAdress()
    * set requestPayload.password = Java.type('utils.TestDataCreator').getPassword()
    * set requestPayload.phone = Java.type('utils.TestDataCreator').getPhone()
    * set requestPayload.userStatus = Java.type('utils.TestDataCreator').getStatusInt()[0]

  Scenario: Create an user
    Given header Content-Type = 'application/json'
    And path '/v2/user'
    And request requestPayload
    When method post
    Then status 200
    And match $.code == 200
    And match $.type == 'unknown'
    And match $.message != null
    * print response





