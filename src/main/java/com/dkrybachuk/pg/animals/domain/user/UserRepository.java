/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkrybachuk.pg.animals.domain.user;

import java.math.BigInteger;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author dk
 */
public interface UserRepository extends CrudRepository<User, BigInteger>{
    
}
