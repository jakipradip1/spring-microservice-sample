/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hantsylabs.sample.springmicroservice.auth;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 *
 * @author hantsy
 */
@Data
@AllArgsConstructor
@Builder
public class AuthenticationResult implements Serializable {
    private Object user;
    private String token;
}