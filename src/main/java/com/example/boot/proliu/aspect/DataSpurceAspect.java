package com.example.boot.proliu.aspect;

import com.example.boot.proliu.config.MyDynamicDataSource;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class DataSpurceAspect {

    @Pointcut("@annotation(com.example.boot.proliu.aspect.DynamicDateSource)")
    public void annotationPointCut() {

    }

    @Before("annotationPointCut()")
    public void before(JoinPoint joinPoint){
        MethodSignature sign =  (MethodSignature)joinPoint.getSignature();
        Method method = sign.getMethod();
        DynamicDateSource annotation = method.getAnnotation(DynamicDateSource.class);
        if(annotation != null){

            MyDynamicDataSource.setDatabasekey(annotation.value());
        }
    }

    @After("annotationPointCut()")
    public void after(){
        if(null != MyDynamicDataSource.getDatabasekey())
            MyDynamicDataSource.removeDatabasekey();
    }
}
