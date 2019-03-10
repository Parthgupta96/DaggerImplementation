package com.example.daggerimplementation.daggerSubComponent;

public class IndividualDependency {

    private static int counter = 0;
    private String name;
    private ParentLevelDependency pld;

    public IndividualDependency(ParentLevelDependency engine) {
        this.pld = engine;
        name = "parent : " + pld.name + " child :" + String.valueOf(++counter);
    }

    public String getName() {
        return name;
    }

    public ParentLevelDependency getPld() {
        return pld;
    }
}
