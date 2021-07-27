package model;

public class Animal {
    //attributes
    protected int age;
    protected double weight;

    //constructors
    public Animal(){
    }

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    //getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //methods
    public void running() {
        System.out.println("run run run...");
    }
    public void eating() {
        System.out.println("nom nom nom...");
    }
}
