package model;

public class FelidaeFamily extends Animal{

    //constructors
    public FelidaeFamily(){
    }

    public FelidaeFamily(int age, double weight) {
        super(age, weight);
    }

    //methods
    public void meowing(){
        System.out.println("Meow meow meow...");
    }

}
