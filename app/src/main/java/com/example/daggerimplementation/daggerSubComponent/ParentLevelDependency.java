package com.example.daggerimplementation.daggerSubComponent;

public class ParentLevelDependency {

    static int counter = 0;
    String name;

    public ParentLevelDependency(){
        name = "count : "+ String.valueOf(++counter);
    }
}
