# Spring Rest API

### 1) Setup

* Generate & Download Project via [start.spring.io](start.spring.io) 
* Add dependancies (here: Spring Web, Spring Data JPA, MySQL)
* you can add depencandies later in the [pom.xml]() with [mvnrepository](https://mvnrepository.com/) too
  
    
      
<br>

### 2) Database Setup (existing DB)

* edit [application.properties]() and set Database


### 3) Configuration

* create Model class inside [model]()   
---> add @Entity and @Table(name="tablename")  
---> create class with attributes and add setters/getters

* create Repository interface for the model inside [repository]()  
---> import the created Model and JpaRepository  
---> repository extends the JpaRepository<Model, Identifier>

* (optional) create service layer  
---> bind JPA methods to custom method names  
---> can be used for dataprocessing

* create Controller class for the model inside [controller]()  
---> start with @Restcontroller and @RequestMapping  
---> initialize the Controller with the repository  
---> create Endpoints @GetMapping and return types (List for multiple, ResponseEntity for single results)