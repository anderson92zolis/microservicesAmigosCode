# microservicesAmigosCode

// part #1  parent configuration & first microservices

I will give the microservices architecture overview and will build one microservice that connects to its own database running on docker.

Microservices - also known as the microservice architecture - is an architectural style that structures an application as a collection of services that are

- Highly maintainable and testable
- Loosely coupled
- Independently deployable
- Organized around business capabilities
- Owned by a small team

The microservice architecture enables the rapid, frequent and reliable delivery of large, complex applications. It also enables an organisation to evolve its technology stack.


// part #2   HTTP Communication 

Internal communication between Customer and Fraud Microservice

- Fraud Microservice
- Database Setup
- Controller Service and Repository
- RestTemplate
- Microservices HTTP Communication In Action

// part 3 # Server Discovery and Load Balancer

creating the Eureka server microservices and Eureka clients. 
- config the parent project and the rest of microservices customer and fraud (pom.xml, application.yml)

When building Distributed systems having a load balancer is key to any organisation. I learnd what is load balancers, load balancer algorithms, load balancer health checks and the benefits of having a load balancer.

// part # 4    openFeign

Using OpenFeign in microservices is a popular approach to simplify the process of making HTTP requests and invoking RESTful services between microservices. OpenFeign is a declarative HTTP client library that allows you to define API interfaces with annotations, making it easier to work with remote services.  you can easily integrate OpenFeign into your microservices architecture to simplify inter-service communication. OpenFeign abstracts away many of the complexities of making HTTP requests, making it a convenient choice for microservices that need to interact with each other over RESTful APIs.
