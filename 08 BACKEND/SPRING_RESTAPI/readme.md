# Spring Rest API

### 1) Setup

* Generate & Download Project via [start.spring.io](https://start.spring.io/) 
* Add dependancies (here: Spring Web, Spring Data JPA, MySQL)
* you can add depencandies later in the [pom.xml](https://github.com/sebastian-sl/Basics/blob/main/08%20BACKEND/SPRING_RESTAPI/tutorialapi/pom.xml) with [mvnrepository](https://mvnrepository.com/) too
  
<br>  
  
    
### 2) Database Setup (existing DB)

* edit [src/main/resources/application.properties](https://github.com/sebastian-sl/Basics/blob/main/08%20BACKEND/SPRING_RESTAPI/tutorialapi/src/main/resources/application.properties) and set Database

  
<br>  
  
### 3) Configuration

* create Model class inside [model](https://github.com/sebastian-sl/Basics/blob/main/08%20BACKEND/SPRING_RESTAPI/tutorialapi/src/main/java/de/springtutorial/tutorialapi/model/User.java)   
---> add @Entity and @Table(name="tablename")  
---> create class with attributes and add setters/getters

* create Repository interface for the model inside [repository](https://github.com/sebastian-sl/Basics/blob/main/08%20BACKEND/SPRING_RESTAPI/tutorialapi/src/main/java/de/springtutorial/tutorialapi/repository/UserRepository.java)  
---> import the created Model and JpaRepository  
---> repository extends the JpaRepository<Model, Identifier>

* (optional) create service layer  
---> bind JPA methods to custom method names  
---> can be used for dataprocessing

* create Controller class for the model inside [controller](https://github.com/sebastian-sl/Basics/blob/main/08%20BACKEND/SPRING_RESTAPI/tutorialapi/src/main/java/de/springtutorial/tutorialapi/controller/UserController.java)  
---> start with @Restcontroller and @RequestMapping  
---> initialize the Controller with the repository  
---> create Endpoints @GetMapping and return types (List for multiple, ResponseEntity for single results)
