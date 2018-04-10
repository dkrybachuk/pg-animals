/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkrybachuk.pg.animals.integration.user;

import com.dkrybachuk.pg.animals.domain.user.User;
import com.dkrybachuk.pg.animals.domain.user.UserRepository;
import java.math.BigInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dk
 */
@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserRepository userRepository;
    
    public User getUserById(@PathVariable String userId) {
            return userRepository.findById(new BigInteger(userId)).get();
    }
}
