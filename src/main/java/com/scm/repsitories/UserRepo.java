package com.scm.repsitories;

import com.scm.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepo extends JpaRepository<User,String> {

//    extra db related operation
//custom query method
// custom finder method




    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email, String password);
}
