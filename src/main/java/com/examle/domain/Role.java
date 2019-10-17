package com.examle.domain;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by ASUS on 10/11/2019.
 */
public enum  Role implements GrantedAuthority{

    USER, ADMIN;

    @Override
    public String getAuthority() {
        return name();
    }
}
