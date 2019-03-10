package com.example.daggerimplementation.SimpleComponent;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class B {
    String name;

    @Inject
    public B() {
        this.name = getClass().getSimpleName();
    }
}
