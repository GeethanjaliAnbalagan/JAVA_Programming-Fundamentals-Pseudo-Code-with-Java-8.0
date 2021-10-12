package com.java.consumersupplier;

@FunctionalInterface
public interface Supplier<T> {

  T get();
 
}