package com.hoangminh.spring.config;

import com.hoangminh.spring.hello.Helloworld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by minhphan on 5/22/2017.
 */
@Configuration
public class AppConfig {
    @Bean(name = "helloBean")
    public Helloworld helloworld(){
        return new Helloworld();
    }
}
