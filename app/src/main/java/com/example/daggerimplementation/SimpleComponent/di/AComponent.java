package com.example.daggerimplementation.SimpleComponent.di;

import com.example.daggerimplementation.SimpleComponent.Main2Activity;
import com.example.daggerimplementation.SimpleComponent.MainActivity;

import javax.inject.Singleton;


//it is implemented via Builder pattern
//inject functions injects in every @inject annotated variable
//using generated factory pattern  of @provide annotated function in module

//@dagger.Component(modules = AModule.class)
@dagger.Component()
@Singleton
public interface AComponent {

    //when passing AppCompactActivity or activity or BaseActivity implementation on inject was empty
    //but when passing MainActivity used mainActivityMemborInjector
    void inject(MainActivity activity);

    void inject(Main2Activity activity);

    //component class can be used only with builder
    //and AModule is provided to builder
    //{@Link getA} its implementation uses Factory class of @Provide annotated function in module
//    A getA();
}
