package com.javacodegeeks.snippets.enterprise.interfaces;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
 
@Retention(RetentionPolicy.RUNTIME)//@Retention(RetentionPolicy,SOURCE),@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)//ElementType - Field,Constructor,Local Variable ,Package,Parameter ,Annotation type
public @interface Mandatory {
}