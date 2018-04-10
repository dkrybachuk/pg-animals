/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkrybachuk.pg.animals;

import com.dkrybachuk.pg.animals.domain.role.Role;
import com.dkrybachuk.pg.animals.domain.user.User;
import java.math.BigInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author dk
 */
@Component
public class ApplicationConfig {
    
    @Component
    public static class DataGenerator {
        
        private final CrudRepository<User, BigInteger> userRepository;
        private final CrudRepository<Role, BigInteger> roleRepository;

        @Autowired
        public DataGenerator(CrudRepository<User, BigInteger> userRepository, CrudRepository<Role, BigInteger> roleRepository) {
            this.userRepository = userRepository;
            this.roleRepository = roleRepository;
        }
        
        @Bean
        CommandLineRunner commandLineRunner(DataGenerator dataGenerator) {
            return (o) -> dataGenerator.generate();
        }
                
        
        void generate() {
            User user = new User();
            user.setName("Ben Gur");
            user.setLogin("BenGur");
            user.setPassword("Pass".toCharArray());
            user.setEmail("bengur@mail.me");
            userRepository.save(user);
            
            Role role1 = new Role();
            role1.setName("Read");
            roleRepository.save(role1);
            
            Role role2 = new Role();
            role2.setName("Write");
            roleRepository.save(role2);
        }
    }
    
}
