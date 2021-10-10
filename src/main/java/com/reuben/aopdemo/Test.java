package com.reuben.aopdemo;

public class Test {
    @Profiler
    public void f1(){
        System.out.println("1");
    }
    @Profiler
    public void f2(){
        System.out.println("2");
    }
    @Profiler
    public void f3(){
        for (int i = 0; i < 1000; i++){

        }
    }
}
