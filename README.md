# springbootrestapiexample

## A small java application showing Spring Boot, MySQL, JPA, Hibernate Restful CRUD API

#### The Spring Framework is an application framework and inversion of control container for the Java platform. 
#### The framework's core features can be used by any Java application, but there are extensions for building web 
#### applications on top of the Java EE platform.

#### 1. Spring Boot is a Spring framework module which provides RAD (Rapid Application Development) feature to the Spring framework. 
#### It is highly dependent on the starter templates feature which is very powerful and works flawlessly.

#### 2. MySQL database as backend

#### JPA - The Java Persistence API is a Java application programming interface specification that describes 
#### the management of relational data in applications using Java Platform, Standard Edition and Java Platform, Enterprise Edition.

#### 4. Hibernate ORM is an object-relational mapping tool for the Java programming language. 
#### It provides a framework for mapping an object-oriented domain model to a relational database.

#### Pre-requisites of this application to run:
##### Go to /springbootrestapiexample/src/main/resources/application.properties file and change the following parameters:

spring.datasource.url=
spring.datasource.username=
spring.datasource.password=


#### Steps to execute this Service and expose the Restful CRUD API for Employees (an example taken to enter Employee records):
I. Right Click on this Git cloned Maven project --> click Run As --> Maven clean (target folder having 
deployment file (springbootrestapiexample.war) gets deleted)

<<Do your code changes if any>>

II. Right Click on this Git cloned Maven project --> click Run As --> Maven build

III. springbootrestapiexample --> src/main/java --> com.letsstartcoding.springbootrestapiexample 
                                                       --> Right Click on EmployeeApplication.java --> Click Run As --> Java Application


Thank you.