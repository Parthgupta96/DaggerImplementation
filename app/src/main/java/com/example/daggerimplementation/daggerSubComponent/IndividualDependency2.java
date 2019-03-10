package com.example.daggerimplementation.daggerSubComponent;

public class IndividualDependency2 {

    private static int counter = 0;
    private String name;
    private ParentLevelDependency pld;

    public IndividualDependency2(ParentLevelDependency engine) {
        this.pld = engine;
        name = "parent : " + pld.name + " child :" + String.valueOf(++counter);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ParentLevelDependency getPld() {
        return pld;
    }

    public void setPld(ParentLevelDependency pld) {
        this.pld = pld;
    }
}
