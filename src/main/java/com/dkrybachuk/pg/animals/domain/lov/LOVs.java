/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkrybachuk.pg.animals.domain.lov;

import java.math.BigInteger;
import lombok.Data;

/**
 *
 * @author dk
 */
@Data
public class LOVs {
    
    private BigInteger id;
    private BigInteger parentId;
    private String value;
    private Boolean isActive;
    private String jsonValues;
    
}
