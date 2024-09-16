package lesson_7.model;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(20, 5);

        cat.setHeight(20);
        cat.setWeight(5);

        System.out.println(cat.getHeight());

        Russian r = new Russian(33, "Viktor");
        r.talk();

        French f = new French(35, "Victooor");
        f.talk();
    }
}
