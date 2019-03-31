package com.jiayixuan.gateway.filter;

import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;

import java.io.Serializable;

public class GatewayPermissionEvaluator implements PermissionEvaluator {

    public boolean hasPermission(Authentication authentication, Object targetDomainObject,
                          Object permission){
        return false;
    }

    public boolean hasPermission(Authentication authentication, Serializable targetId,
                                            String targetType, Object permission){
        return false;
    }

    public boolean hasAuthority(String user){
        if(user.equals("USER")){
            return true;
        }
        return false;
    }

}
