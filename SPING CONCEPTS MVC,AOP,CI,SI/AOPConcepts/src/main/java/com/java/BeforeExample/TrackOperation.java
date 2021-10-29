package com.java.BeforeExample;

import org.aspectj.lang.JoinPoint;  
import org.aspectj.lang.annotation.Aspect;  
import org.aspectj.lang.annotation.Before;  
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;  
  

@Component
@Aspect 
@EnableAspectJAutoProxy
public class TrackOperation{  
  @Pointcut("execution(* Operation.*(..))")  
   public void k(){System.out.println("this is tracking k");}//pointcut name  
      
    @Before("k()")//applying pointcut on before advice  
    public void myadvice(JoinPoint jp)//it is advice (before advice)  
    {  
        System.out.println("additional concern");  
        System.out.println("Method Signature: "  + jp.getSignature());  
    }  
}  