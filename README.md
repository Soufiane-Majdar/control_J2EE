# Project Title: Microservices Development with Spring Cloud

## Team Members
- [Majdar Soufiane]
- [Bensellak Elbachir]

## Introduction
This project focuses on the development of microservices using Spring Cloud to handle CRUD operations on the "COMMANDE" entity with zero SQL queries. Two case studies have been undertaken, each with specific requirements.

### Case Study 1: Microservice-commandes (Version 1)
1. **Table Structure (Version 1):**
    - Columns: [id, description, quantity, date, amount]

2. **Spring Cloud Configuration and GitHub:**
    - Manage microservice configuration using Spring Cloud and GitHub.

3. **Custom Configuration Property:**
    - Introduce a custom property `mes-config-ms.commandes-last` in the configuration.
    - Example: `mes-config-ms.commandes-last = 10` displays commands received in the last 10 days.

4. **Dynamic Configuration Update:**
    - Utilize Spring Actuator to modify the property to 20 dynamically.
    - Implement hot reloading for the microservice to display commands received in the last 20 days.

5. **Health Supervision:**
    - Use Spring Actuator to monitor the health of the microservice.
    - Display status as "UP."

6. **Customized Health Supervision:**
    - Define custom health status: "UP" when there are commands in the "COMMANDE" table; otherwise, display "DOWN."

### Case Study 2: Microservices Interaction
1. **Table Structure (Version 2):**
    - Columns: [id, description, quantity, date, amount, id_produit]

2. **Eureka Registration:**
    - Register microservice-commandes and microservice-produit with Eureka.

3. **API Gateway Implementation:**
    - Introduce an API Gateway to serve as the single entry point for the application.

4. **CRUD Functionality:**
    - Implement CRUD operations for microservice-commandes.

5. **Timeout Simulation and Hystrix:**
    - Simulate a timeout for one of the microservices.
    - Implement Hystrix for fault tolerance, protecting the calling microservice.



## Conclusion
This project showcases the development of microservices using Spring Cloud, addressing various aspects such as configuration management, health monitoring, service registration, and fault tolerance. Feel free to explore the code and configurations for a deeper understanding of the implementation.
