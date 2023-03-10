# Spring Microservices = REST + Microservices + Spring Boot + Spring Cloud + Docker + Kubernetes
![image](https://user-images.githubusercontent.com/102555294/224428637-4a92fa5f-59d3-44ce-b711-1dde357e0ea2.png)

This repository showcases the creation and deployment of microservices using Spring Boot. It includes code for building microservices and deploying them in a microservices based architecture. Both aspects of the microservices implementation are covered in this project.

Tools: Spring Boot Docker Eclipse IDE Git client

Orchestration platform: Kubernetes

![image](https://user-images.githubusercontent.com/102555294/224428801-28c631e2-f3d4-431f-9344-16fa1b863155.png)

Two microservices were created with the help of the spring boot framework.​​

The (light weight) database i.e. H2 ​has been used.​

The Eureka Server is used to keep track of all active clients, API gateways, and microservice instances that are currently running.​​

Dynamic scaling has been implemented with the aid of the Eureka naming server and an API gateway made using Spring Cloud Gateway.​​

Using Docker and Kubernetes, containerization and deployment have been carried out​​

working demo of the project: https://drive.google.com/file/d/1HOLN3WYC7sSg2JSixInGkkqnxTRvSBdu/view

## URLS

#### Currency Exchange Service
- http://localhost:8000/currency-exchange/from/USD/to/INR

#### Currency Conversion Service
- http://localhost:8100/currency-conversion-feign/from/USD/to/INR/quantity/10

#### Eureka
- http://localhost:8761/

#### Zipkin
- http://localhost:9411/

#### API GATEWAY
- http://localhost:8765/currency-conversion-feign/from/USD/to/INR/quantity/10
- http://localhost:8765/currency-conversion-new/from/USD/to/INR/quantity/10
