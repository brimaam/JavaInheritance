package controller;

import model.Tiger;

public class AccessTiger {
    public static void main(String[] args) {
        //created tiger instance
        Tiger tiger = new Tiger(15, 220.43,"Shere Khan");

        System.out.println("Tiger Name: " + tiger.getName());
        System.out.println("Tiger Weight: " + tiger.getWeight() + " kg");
        System.out.println("Tiger Age: " + tiger.getAge());
        System.out.println("\nWhat the tiger does?");
        tiger.meowing(); //tiger produces meow
        tiger.running();
        tiger.eating();
    }
}
