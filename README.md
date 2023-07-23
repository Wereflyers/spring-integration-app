# spring-integration-app :incoming_envelope:

The project implements messaging functionality within and between containers. The request is received from the web server, processed in the main container and then forwarded to the container responsible for the necessary functionality of changing the message content.

## Structure

Project is written in Java 11. Maven is used for package and containerization. There is three branches with slightly different frameworks:
#### main
This is the simplest version of the functionality. There are no containers, the start of messaging comes directly from the calling method. Messaging is configured using a xml file as part of the Spring framework configuration.
#### project-with-modules
Spring framework. The project is divided into 3 modules. Communication between modules is set up (integration.xml).
#### develop
This branch has the most complex structure:    
1. Spring Boot    
2. Maven    
3. Spring integration    
4. JavaDSL    
5. Rest Controller    
6. Custom validator for Request body    
7. Postman tests    
   
## Installation
*Install Java 11, Maven    
*Perform a clone of this repo.    
*Run MasterApplication    
*Navigate to http://localhost:8080/

## Plans for future
:black_square_button: Add RabbitMQ    
:black_square_button: Cover with tests    
