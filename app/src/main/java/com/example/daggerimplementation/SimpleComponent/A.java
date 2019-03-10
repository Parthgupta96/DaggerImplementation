package com.example.daggerimplementation.SimpleComponent;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class A {
    private static int count;
    String name;

    @Inject
    public A() {
        count++;
        this.name = getClass().getSimpleName() + String.valueOf(count);
    }

//    everytime you're injecting @Singleton annotated class (with @Inject annotation) it will be the same instance
//    as long as you inject it from the same Component.

}
