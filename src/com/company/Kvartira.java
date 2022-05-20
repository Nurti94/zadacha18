package com.company;

public class Kvartira extends Person implements Arenda{


    public Kvartira(String name) {
        super(name);
    }



    @Override
    public void many() {
        System.out.println("Kom usluga : 4000 som");
    }

    @Override
    public void address() {
        System.out.println("Address : Bokonbaeva");

    }
}





