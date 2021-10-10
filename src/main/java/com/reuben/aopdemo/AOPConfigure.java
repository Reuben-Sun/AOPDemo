package com.reuben.aopdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AOPConfigure {
    @Bean
    public Test test(){
        return new Test();
    }

    @Bean
    public ProfilerAspect profilerAspect(){
        return new ProfilerAspect();
    }

}
