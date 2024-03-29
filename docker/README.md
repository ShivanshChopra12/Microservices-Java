# Docker

## Images

- https://hub.docker.com/repositories/shivansh740
- Currency Exchange Service 
	- shivansh740/currency-exchange-service.jar
- Currency Conversion Service
	- shivansh740/currency-conversion-service.jar

## URLS

#### Currency Exchange Service
- http://localhost:8000/currency-exchange/from/USD/to/INR

#### Currency Conversion Service
- http://localhost:8100/currency-conversion/from/USD/to/INR/quantity/10
- http://localhost:8100/currency-conversion-feign/from/USD/to/INR/quantity/10

#### Eureka
- http://localhost:8761/

#### Zipkin
- http://localhost:9411/

#### API GATEWAY
- http://localhost:8765/currency-exchange/from/USD/to/INR
- http://localhost:8765/currency-conversion/from/USD/to/INR/quantity/10
- http://localhost:8765/currency-conversion-feign/from/USD/to/INR/quantity/10
- http://localhost:8765/currency-conversion-new/from/USD/to/INR/quantity/10

#### Commands
```
docker run -p 9411:9411 openzipkin/zipkin:2.23
docker push shivansh740/currency-conversion-service.jar:tagname
docker push shivansh740/currency-exchange-service.jar:tagname
docker-compose --version
docker-compose up
```
