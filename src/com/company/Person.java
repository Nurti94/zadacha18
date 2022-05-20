package com.company;

public abstract class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                  name + "\t"
                ;
    }

    public Person(String name) {
        this.name = name;


    }

}
