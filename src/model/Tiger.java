package model;

public class Tiger extends FelidaeFamily{
    //attributes
    private String name;

    //constructors
    public Tiger() {
    }

    public Tiger(int age, double weight, String name) {
        super(age, weight);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
