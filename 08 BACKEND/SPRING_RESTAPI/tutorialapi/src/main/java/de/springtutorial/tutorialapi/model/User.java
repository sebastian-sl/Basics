package de.springtutorial.tutorialapi.model;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name="users")
public class User {
    @Id
    private Integer id;
    public Integer getId() {return this.id;}
    public void setId(Integer id) {this.id = id;}

    private String first_name;
    public String getFirstName() {return this.first_name;}
    public void setFirstName(String name) {this.first_name = name;}

    private String last_name;
    public String getLastName() {return this.last_name;}
    public void setLastName(String name) {this.last_name = name;}
}
