package com.company;

public class Obshaga extends Person implements Arenda{
    public Obshaga(String name) {
        super(name);
    }

    @Override
    public void many() {
        System.out.println("Arenda plata : 2000 som");
    }

    @Override
    public void address() {
        System.out.println("Address : Ahunbaeva belinka");
    }
}
