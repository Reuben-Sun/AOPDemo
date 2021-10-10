package com.reuben.aopdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AopDemoApplication {

    private static Logger logger = LoggerFactory.getLogger(AopDemoApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(AopDemoApplication.class, args);

        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(AOPConfigure.class);
        Test t = app.getBean(Test.class);
        //logger.warn(t.getClass().getName());
        System.out.println(t.getClass().getName());
        t.f1();
        t.f2();
        t.f3();
        app.close();
    }

}
