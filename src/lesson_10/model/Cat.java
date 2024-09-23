package lesson_10.model;

public class Cat {

    // fields
    private int age;
    private String name;

    private static Cat singleCat; // = new Cat();

    public static Cat getSingleCat() {
        if (singleCat == null) {
            singleCat = new Cat();
        }
        return singleCat;
    }

    // constructor
    //  = new
    private Cat() {
    }


    // methods


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
