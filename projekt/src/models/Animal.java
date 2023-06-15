package models;

import interfaces.AnimalInterface;
import interfaces.BasicInterface;

/**
 * Class Animal
 */
public class Animal extends BasicData implements BasicInterface, AnimalInterface {
    private String type;
    private double weight;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String[] AnimalData() {
        return new String[]{
                "type: " + this.getType(),
                "name: " + this.getName(),
                "age: " + this.getAge(),
                "weight: " + this.getWeight()
        };
    }

    @Override
    public void welcome(String opt) {
        System.out.println(HELLO + opt);
    }
}
