package com.laptrinhjavaweb.util;

import com.laptrinhjavaweb.dto.UserCustom;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.ArrayList;
import java.util.List;

public class SecurityUtils {

    public static UserCustom getPrincipal(){
        UserCustom userCustom = (UserCustom) (SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        return userCustom;
    }


    public static List<String> getAuthorities() {
        List<String> results = new ArrayList<>();
        List<GrantedAuthority> authorities = (List<GrantedAuthority>)(SecurityContextHolder.getContext().getAuthentication().getAuthorities());
        for (GrantedAuthority authority : authorities) {
            results.add(authority.getAuthority());
        }
        return results;
    }
}
