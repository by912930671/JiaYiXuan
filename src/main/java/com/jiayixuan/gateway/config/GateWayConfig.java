package com.jiayixuan.gateway.config;

import com.jiayixuan.gateway.filter.GatewayPermissionEvaluator;
import com.jiayixuan.gateway.model.GateUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.PermissionEvaluator;

@Configuration
public class GateWayConfig {

    @Bean
    GateUser user(){
        return new GateUser("jiayixuan", "12345");
    }

    @Bean
    PermissionEvaluator permissionEvaluator(){
        return new GatewayPermissionEvaluator();
    }
}
