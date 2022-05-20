package com.company;

public class Main {

    public static void main(String[] args) {
	 Person person=new Kvartira("  Azamat");
	 Person person1=new Kvartira("  Bektur");
        System.out.println("____________________________");
     System.out.println("       ***Kvartiranty***");
     Person[] kvartiras=new Person[]{person,person1};
     int countr=0;
        for (Person persona:kvartiras) {
            countr++;
            System.out.println(persona);

        }Arenda arenda=new Kvartira("===Kishi sany===");
        System.out.println(arenda);
        System.out.println(countr);

        arenda.many();
        arenda.address();
        System.out.println("____________________________");
        System.out.println("      ***OBSHAGA***");
     Person person2=new Obshaga("   Aijan");
     Person person3=new Obshaga("   Aizat");
     Person[]obshaga=new Person[]{person2,person3};
     int country1=0;
        for (Person persona1:obshaga) {
            country1++;
            System.out.println(persona1);

        }Arenda arenda1=new Obshaga("***Kishi sany***");
        System.out.println(arenda1);
        System.out.println(country1);
        arenda.many();
        arenda.address();
        System.out.println("____________________________");
        System.out.println("     ***HOTEL***");
     Person person4=new Hotel("    Nurbek");
     Person person5=new Hotel("    Aibek");
        Person[]hotel=new Person[]{person4,person5};
        int country2=0;
        for (Person persona2:hotel) {
            country2++;
            System.out.println(persona2);
        }Arenda arenda2=new Hotel("Kishi sany");
        System.out.println(arenda2);
        System.out.println(country2);
        arenda.many();
        arenda.address();



    }
}
