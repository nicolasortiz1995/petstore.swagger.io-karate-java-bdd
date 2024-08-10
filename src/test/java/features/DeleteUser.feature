Feature: Delete the user

    Background: Payload setup, user creation and update user
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
        Given header Content-Type = 'application/json'
        And path '/v2/user'
        And request requestPayload
        When method post
        Then status 200
        And match $.code == 200
        And match $.type == 'unknown'
        And match $.message != null
        * def userUsername = requestPayload.username
        * print requestPayload
        * print response
        Given header Content-Type = 'application/json'
        And path '/v2/user/' + userUsername
        * def updatePayload = read('classpath:payload/UpdateUserPayload.json')
        * set updatePayload.username = Java.type('utils.TestDataCreator').getUserName()
        * set updatePayload.firstName = Java.type('utils.TestDataCreator').getFirstName()
        * set updatePayload.lastName = Java.type('utils.TestDataCreator').getLastName()
        * set updatePayload.email = Java.type('utils.TestDataCreator').getEmailAdress()
        And request updatePayload
        When method put
        Then status 200
        * print updatePayload
        * print response
        Given header Content-Type = 'application/json'
        And path '/v2/user/' + updatePayload.username
        When method get
        Then status 200
        And match $.username == updatePayload.username
        And match $.firstName == updatePayload.firstName
        And match $.lastName == updatePayload.lastName
        And match $.email == updatePayload.email
        * print response

    Scenario: Delete user
        Given header Content-Type = 'application/json'
        And path '/v2/user/' + updatePayload.username
        When method delete
        Then status 200
        And match $.code == 200
        And match $.type == 'unknown'
        And match $.message == updatePayload.username
        * print response
