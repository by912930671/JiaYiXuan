package com.jiayixuan.gateway.model;

public class GateUser {

    private String name;
    private String id;

    public GateUser(String name, String id){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return id + " "+ name;
    }
}
