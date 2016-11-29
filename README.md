![Build Status][travis-badge]][travis-badge-url]

Togglz Rest Hello World
===================
This is  a simple REST service example using [**Togglz**](https://www.togglz.org/). 
Togglz is an implementation of Martin Fowler's 
 [Feature Toggles](http://martinfowler.com/bliki/FeatureToggle.html) pattern for Java.
 
If you are interested in knowing more about this project, you can find it in my blog 
['Togglz Integration with REST'](https://indrabasak.wordpress.com/2016/04/01/togglz-integration-with-rest/). 

# Build
Execute the following command from the parent directory to compile the project:

```
mvn clean install
```
Once the build completes successfully, you should have the artifact `togglz-rest-helloworld.war` in the `target` folder.

# Deploy
You can deploy the `togglz-rest-helloworld.war` in a [Tomcat](http://tomcat.apache.org/) web container or any other JEE web 
container of your choice.

# Test
You can test it using RESTClient or Postman. This project has been tested using RESTClient. 
To test follow the steps below:

1. Download WizTools.org RESTClient.
2. Start REST Client: java -jar restclient-ui-3.4-jar-with-dependencies.jar

#### Testing GET Operation
URL: `http://localhost:8080/togglz-rest-helloworld/customers/1`
HTTP Method: GET
Header: Accept: application/json

Expected Response Body:
```json
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
```

#### Testing POST Operation
URL: `http://localhost:8080/togglz-rest-helloworld/customers`
HTTP Method: POST
Header: 
Content-Type: application/json
Accept: application/json
Request Body:
```json
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
```

Expected Response Body:
```json
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
```

#### Testing DELETE Operation
URL: `http://localhost:8080/togglz-rest-helloworld/customers/4`
HTTP Method: POST
Header: 
Content-Type: application/json
Accept: application/json

Expected Response Body:
```json
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
```

#### Testing UPDATE Operation
URL: `http://localhost:8080/togglz-rest-helloworld/customers/1`
HTTP Method: PUT
Header: 
Content-Type: application/json
Accept: application/json
Request Body:
```json
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
```

Expected Response Body:
```json
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
```

#### Testing UPDATE Operation
URL: http://localhost:8080/togglz-rest-helloworld/customers/1
HTTP Method: PUT
Header: 
Content-Type: application/json
Accept: application/json
Request Body:
```json
{
  "firstName" : "John"
}
```

Expected Response Body:
```json
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
```

#### Access Tooglz Admin Console
*****************************************
URL: `http://localhost:8080/tooglz-rest-helloworld/togglz`


[travis-badge]: https://travis-ci.org/indrabasak/togglz-rest-helloworld.svg?branch=master
[travis-badge-url]: https://travis-ci.org/indrabasak/togglz-rest-helloworld/