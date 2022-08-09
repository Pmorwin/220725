## Web Server 101
- A Web Server is a programming that can respond to HTTP requests

## HTTP
- Hyper Text Transfer Protocol
    - This is how 99% of all the information on the web is sent around
- Request Response based system
    - A client will send an HTTP requst
    - A server will send back an HTTP response

## Anatomy of an HTTP Request

- Verb


## Anatomy of HTTP Response
- Status Code
    - Ordered by the Hundreds
        - 404, 403
- Body
    - Primary content of the response
- Header
    - Key value pairs that contain meta-information about the response

## RESTful Web Server
- Is a archituecture of a web server that is designed to track a sepcific resource(s)
- A resource is just a grop of objects you are tracking
    - Cars
    - Computers
    - Physicians
- **CRUD** operations fro that resource
    - Create
    - Read
    - Update
    - Delete

- Examples:
    - GET /cars
        - Should return all the cars on your server
    - POST /cars
        - Should add a car to the server
    - PUT /cars/101
        - Should replace that specific car
    - DELETE /cars/203
        - Should delete that specific car

## It is impossible to send back a Java OBJECT from a server

### The Problem with web servers
- Ideally the internet should be Programming Language Agnostic
    - There are billions of different web servers using tond of different languages
    - And they all want to talk to each other in some standard format
- Every programming language has unique datatypes
    - Python has int, float
    - Java has int, long, double, etc
    - C++ has signed and unsigned numbers
- **String**
    - Is the one data type that is near uniformly supported in every programming language
    - Whenever we send or recieve information from a web server it will be a String
    - However, we want that string in a SPECIFIC format for ease of use by all types of web servers
- **JavaScript** is the most popular programming language in the world
    - Every single browser runs on JS
    - Web Browsers are BY FAR the most popular way to make web requests
- **JSON**
    - JavaScript Object Notation is a **STRING FORMAT**
    - Primary format for sending information on the web

### Rules of JSON
- An object is denoted as curly brackets
- The keys of the object are put in quotes
- String vales are put in quotes
- boolean and numeric values are not put in quotes

```Java
class Person{
    private int ssn;
    private String fname;
    private String lname;
    private boolean isAlive;
    
    // imagine constructors and getters/setters
}
Person patrick = new Person(123456789, "Patrick", "Orwin", true);

```

- The patrick Java Object ***serialized** as a JSON String
```JSON
{
    "ssn":123456789,
    "fname":"Patrick",
    "lname":"Orwin",
    "isAlive":true
}

```