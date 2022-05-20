package com.company;

public class Hotel extends Person implements Arenda {
    private String adress;
    public Hotel(String name) {
        super(name);
    }

    @Override
    public void many() {
        System.out.println("Arenda plata : 4000 som");
    }

    @Override
    public void address() {
        System.out.println("Address : Magistral");
    }
}
