/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkrybachuk.pg.animals.domain.role;

import java.math.BigInteger;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author dk
 */
public interface RoleRepository extends PagingAndSortingRepository<Role, BigInteger> {
    
}
