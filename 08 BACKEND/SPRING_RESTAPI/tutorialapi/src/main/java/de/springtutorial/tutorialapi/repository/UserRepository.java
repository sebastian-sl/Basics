package de.springtutorial.tutorialapi.repository;

import de.springtutorial.tutorialapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{
    
}
