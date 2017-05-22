package com.hoangminh.spring;

/**
 * Created by minhphan on 5/22/2017.
 */
public class Helloworld {

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public void printHelloword(){
        System.out.println( "hello : " + name);
    }
}
