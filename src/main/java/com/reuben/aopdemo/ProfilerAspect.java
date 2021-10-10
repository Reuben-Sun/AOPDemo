package com.reuben.aopdemo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ProfilerAspect {
    @Around("execution(* com.reuben.aopdemo.Test.*(..))&&@annotation(com.reuben.aopdemo.Profiler)")
    public Object Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long time = System.currentTimeMillis();
        Object obj = proceedingJoinPoint.proceed();//相当于开始调div地
        long time2 = System.currentTimeMillis();
        System.out.println("耗时："+(time2 - time));
        return obj;
    }

}
