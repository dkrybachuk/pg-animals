/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkrybachuk.pg.animals.domain.role;

import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author dk
 */
@Data
@Entity
public class Role {
    
    @Id
    @GeneratedValue
    private BigInteger id;
    @Column(nullable=false)
    private String name;
    
}
