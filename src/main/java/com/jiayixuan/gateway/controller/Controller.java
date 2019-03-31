package com.jiayixuan.gateway.controller;

import com.jiayixuan.gateway.model.GateUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class Controller {

    @Autowired
    private GateUser gateUser;

    @RequestMapping(method = RequestMethod.GET)
    List getAll(){
        return null;
    }


    @PreAuthorize("hasAuthority('USER)")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    String getInfo(@PathVariable("id")String id){
        return gateUser.toString() + " your Id "+ id;
    }

    public void redistest(){
    }
}
