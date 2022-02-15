# Hibernate ORM Quick Guide:


### Setup
* start Project with Maven
* add dependencies in pom.xml (mysql-connector and hibernate-core)
* create hibernate config file as name.cfg.xml inside resources (add Dialect, Url, User, PW and mapping resource! - see: https://www.tutorialspoint.com/hibernate/hibernate_configuration.html)


### Entity
* create Model class with @Entity and @Table(name=name) annotations
* declare every column with @Column(name=name) annotation, add @Id for Primary Keys and create setters/getters
* add an empty constructor and constructor with all declared variables 
* at best you override the toString() method, so it returns a readable Version :)

### Application
* build SessionFactory and session
* see [App.java]() for CRUD operations


Thats it :P