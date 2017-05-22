package com.hoangminh.spring.core;

import com.hoangminh.spring.config.AppConfig;
import com.hoangminh.spring.hello.Helloworld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by minhphan on 5/22/2017.
 */
public class App {

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Helloworld helloworld = (Helloworld)context.getBean("helloBean");
        helloworld.printMsg(" phan hoang minh");
    }
}
