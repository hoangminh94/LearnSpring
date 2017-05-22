package com.hoangminh.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by minhphan on 5/22/2017.
 */
public class Application {
    public static void main(String [] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean.xml");
        Helloworld helloworld = (Helloworld)context.getBean("helloBean");
        helloworld.printHelloword();
    }
}
