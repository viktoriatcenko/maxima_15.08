package lesson_7.model;

public class Animal {


    // fields
    protected int height;
    protected int weight;

    // constructor


    public Animal() {
    }

    public Animal(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    // getters and setters


    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
