*****************************************
REST Client
*****************************************
1. Download WizTools.org RESTClient.
2. Start REST Client: java -jar restclient-ui-3.4-jar-with-dependencies.jar

*****************************************
Testing GET operation
*****************************************
URL: http://localhost:8080/togglz-rest-helloworld/customers/1
HTTP Method: GET
Header: Accept: application/json

Expected Response Body:
{
  "id" : 1,
  "firstName" : "Robert",
  "lastName" : "Land",
  "address" : {
    "street" : "2486 Maxwell Farm Road",
    "city" : "Waynesboro",
    "state" : "VA",
    "zipCode" : "22980"
  }
}

*****************************************
Testing POST operation
*****************************************
URL: http://localhost:8080/togglz-rest-helloworld/customers
HTTP Method: POST
Header: 
Content-Type: application/json
Accept: application/json
Request Body:
{
  "firstName" : "John",
  "lastName" : "Doe",
  "address" : {
    "street" : "123 Nowhere Street",
    "city" : "Notown",
    "state" : "MA",
    "zipCode" : "02456"
  }
}

Expected Response Body:
{
  "id" : 4,
  "firstName" : "John",
  "lastName" : "Doe",
  "address" : {
    "street" : "123 Nowhere Street",
    "city" : "Notown",
    "state" : "MA",
    "zipCode" : "02456"
  }
}

*****************************************
Testing DELETE operation
*****************************************
URL: http://localhost:8080/togglz-rest-helloworld/customers/4
HTTP Method: POST
Header: 
Content-Type: application/json
Accept: application/json

Expected Response Body:
{
  "id" : 4,
  "firstName" : "John",
  "lastName" : "Doe",
  "address" : {
    "street" : "123 Nowhere Street",
    "city" : "Notown",
    "state" : "MA",
    "zipCode" : "02456"
  }
}

*****************************************
Testing UPDATE operation
*****************************************
URL: http://localhost:8080/togglz-rest-helloworld/customers/1
HTTP Method: PUT
Header: 
Content-Type: application/json
Accept: application/json
Request Body:
{
  "firstName" : "Robert",
  "lastName" : "Redford",
  "address" : {
    "street" : "2486 Maxwell Farm Road",
    "city" : "Waynesboro",
    "state" : "VA",
    "zipCode" : "22980"
  }
}

Expected Response Body:
{
  "id" : 1,
  "firstName" : "Robert",
  "lastName" : "Redford",
  "address" : {
    "street" : "2486 Maxwell Farm Road",
    "city" : "Waynesboro",
    "state" : "VA",
    "zipCode" : "22980"
  }
}

*****************************************
Testing UPDATE operation
*****************************************
URL: http://localhost:8080/togglz-rest-helloworld/customers/1
HTTP Method: PUT
Header: 
Content-Type: application/json
Accept: application/json
Request Body:
{
  "firstName" : "John",
}

Expected Response Body:
{
  "id" : 1,
  "firstName" : "Robert",
  "lastName" : "Redford",
  "address" : {
    "street" : "2486 Maxwell Farm Road",
    "city" : "Waynesboro",
    "state" : "VA",
    "zipCode" : "22980"
  }
}

*****************************************
To Access Tooglz Admin Console
*****************************************
URL: http://localhost:8080/tooglz-rest-helloworld/togglz