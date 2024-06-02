package com.dop.restapi.repositories;

import com.dop.restapi.models.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public User findUserByEmail(String email){
        User user = new User(email, "test user", "123qwe");
        return  user;
    }
}

