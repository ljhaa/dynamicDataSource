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


/**
 * 里边用到的几个注解
 *
 * @Aspect
 * @Pointcut
 * @Before
 * @After  这都是aop这一块的注解
 */
@Aspect
@Component
public class DataSpurceAspect {


    //定义切面
    @Pointcut("@annotation(com.example.boot.proliu.aspect.DynamicDateSource)")
    public void annotationPointCut() {

    }

    //前置增强 检查方法是否需要切换数据源 和数据源切换
    @Before("annotationPointCut()")
    public void before(JoinPoint joinPoint){
        MethodSignature sign =  (MethodSignature)joinPoint.getSignature();
        Method method = sign.getMethod();
        DynamicDateSource annotation = method.getAnnotation(DynamicDateSource.class);
        if(annotation != null){

            MyDynamicDataSource.setDatabasekey(annotation.value());
        }
    }

    //后置增强  方法调用完之后回复默认数据源   @After注解是不管怎样都会执行
    @After("annotationPointCut()")
    public void after(){
        if(null != MyDynamicDataSource.getDatabasekey())
            MyDynamicDataSource.removeDatabasekey();
    }
}
