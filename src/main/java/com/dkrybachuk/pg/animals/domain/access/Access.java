/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkrybachuk.pg.animals.domain.access;

import com.dkrybachuk.pg.animals.domain.role.Role;
import lombok.Data;

/**
 *
 * @author dk
 */
@Data
public class Access {
    
    private Role role;
    private String rights;
    
}
