/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkrybachuk.pg.animals.domain.user;

import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;
import org.springframework.hateoas.Identifiable;

/**
 *
 * @author dk
 */
@Data
@Entity
public class User implements Identifiable<BigInteger>{

    @Id
    @GeneratedValue 
    private BigInteger id;
    @Column(nullable=false)
    private String name;
    @Column(nullable=false)
    private String login;
    @Column(nullable=true)
    private char[] password;
    @Column(nullable=true)
    private String email;
                
}
