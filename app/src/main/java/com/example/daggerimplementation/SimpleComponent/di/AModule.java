package com.example.daggerimplementation.SimpleComponent.di;

//dagger creates a factory class for each @proved annotated function
//and creates a static function named (proxy___) to provide that class
// and uses these static functions in member injector of those classes

//only make module when they are needed
// as in this case A & B can be injected without module

@dagger.Module()
public class AModule {

//    @Singleton
//    @Provides
//    B provideB(){
//        return new B("class name : ");
//    }


}
