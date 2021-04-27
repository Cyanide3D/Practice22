package com.example.Practice22;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@org.aspectj.lang.annotation.Aspect
public class Aspect {
    @Before("allServiceMethods()")
    public void logParameters(JoinPoint joinPoint) {
        log.info(joinPoint.getSignature().getName() + " method has been run...");

    }
    @Pointcut("within(com.example.Practice22.service.*)")
    public void allServiceMethods() {}
}
