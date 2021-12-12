# Distributed services with Spring Boot and Spring Cloud

Demonstrates distributed systems with Spring Cloud

- Centralized Microservice Configuration with Spring Cloud Config Server
- Establishing Communication between Microservices using RestTemplate
- Simplify communication with other Microservices using Feign REST Client
- Implement client side load balancing with Spring Cloud load balancer
- Implement dynamic scaling using Eureka Naming Server
- Implement API Gateway with Spring Cloud API Gateway
- Implement LoggingFilter
- Implement Fault Tolerance with Resilience4j

## Ports

|     Application       |     Port          |
| ------------- | ------------- |
| Limits Service | 8080, 8081, ... |
| Spring Cloud Config Server | 8888 |
|  |  |
| Currency Exchange Service | 8000, 8001, 8002, ..  |
| Currency Conversion Service | 8100, 8101, 8102, ... |
| Netflix Eureka Naming Server | 8761 |
| Netflix Zuul API Gateway Server | 8765 |
| Zipkin Distributed Tracing Server | 9411 |

## URLs

### Limits Service
- http://localhost:8080/limits

### Cloud Config Server
- http://localhost:8888/limits-service/default
- http://localhost:8888/limits-service/qa
- http://localhost:8888/limits-service/dev

### Currency Exchange Service
- http://localhost:8000/currency-exchange/from/USD/to/INR

### Currency Conversion Service
- http://localhost:8100/currency-conversion/from/USD/to/INR/quantity/10
- http://localhost:8100/currency-conversion-feign/from/USD/to/INR/quantity/10

### Eureka
- http://localhost:8761/

### Spring Cloud Api Gateway

Initial
- http://localhost:8765/CURRENCY-EXCHANGE/currency-exchange/from/USD/to/INR
- http://localhost:8765/CURRENCY-CONVERSION/currency-conversion/from/USD/to/INR/quantity/10
- http://localhost:8765/CURRENCY-CONVERSION/currency-conversion-feign/from/USD/to/INR/quantity/10

Intermediate
- http://localhost:8765/currency-exchange/currency-exchange/from/USD/to/INR
- http://localhost:8765/currency-conversion/currency-conversion/from/USD/to/INR/quantity/10
- http://localhost:8765/currency-conversion/currency-conversion-feign/from/USD/to/INR/quantity/10

Final
- http://localhost:8765/currency-exchange/from/USD/to/INR
- http://localhost:8765/currency-conversion/from/USD/to/INR/quantity/10
- http://localhost:8765/currency-conversion-feign/from/USD/to/INR/quantity/10
- http://localhost:8765/currency-conversion-new/from/USD/to/INR/quantity/10
