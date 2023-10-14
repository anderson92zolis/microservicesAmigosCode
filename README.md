# microservicesAmigosCode
![Architecture microservice](https://github.com/anderson92zolis/microservicesAmigosCode/blob/Sleuth_Zipkin/microserviceArchitecture.png)


### Microservices Overview

This project provides a comprehensive overview of the microservices architecture and how to build microservices using various technologies, including Docker, Eureka, OpenFeign, and Zipkin.

Microservices, also known as the microservice architecture, is an architectural style that structures an application as a collection of services that are:

- Highly maintainable and testable
- Loosely coupled
- Independently deployable
- Organized around business capabilities
- Owned by a small team

The microservice architecture enables the rapid, frequent, and reliable delivery of large, complex applications. It also allows an organization to evolve its technology stack.

## Part 1: Parent Configuration & First Microservice

- Microservices architecture overview
- Building a microservice that connects to its own database running on Docker.

## Part 2: HTTP Communication

This part covers internal communication between the Customer and Fraud Microservice.

- Setting up the Fraud Microservice, Internal communication between Customer and Fraud Microservices
- Database Setup
- Controller Service and Repository
- Using RestTemplate
- Microservices HTTP Communication in Action

## Part 3: Server Discovery and Load Balancer

Here, we will create the Eureka server microservices and Eureka clients.

- Configuration for the parent project and the rest of the microservices (pom.xml, application.yml)

When building distributed systems, having a load balancer is crucial for any organization. We will learn about load balancers, load balancer algorithms, load balancer health checks, and the benefits of having a load balancer.

## Part 4: OpenFeign

Utilizing OpenFeign in microservices simplifies the process of making HTTP requests and invoking RESTful services between microservices. OpenFeign is a declarative HTTP client library that allows you to define API interfaces with annotations, making it easier to work with remote services. You can easily integrate OpenFeign into your microservices architecture to simplify inter-service communication. It abstracts many complexities of making HTTP requests, making it a convenient choice for microservices that need to interact with each other over RESTful APIs.

## Part 5: Notification

These microservices often need to communicate with each other to exchange information or trigger actions. A notification service can facilitate this communication by sending notifications or messages between microservices.

## Part 6: Zipkin

Zipkin is a distributed tracing system used for monitoring and troubleshooting microservices-based architectures. It helps you track and visualize the flow of requests as they traverse through multiple services within a complex application. 

## Part 7: ApiGateway

Is a critical component in a microservices architecture. It serves as a reverse proxy to accept all application programming interface (API) calls, aggregate the different services required to fulfill them, and return the appropriate result