package lesson_14;

import lesson_14.model.Fridge;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Fridge fridge = new Fridge();

        fridge.putProducts("Tomato", 5);
        fridge.putProducts("Kefir", 1);
        fridge.putProducts("Juice", 1);
        fridge.putProducts("Bananas", 3);
        fridge.putProducts("Water", 1);
        fridge.putProducts("Cucumber", 2);
        fridge.putProducts("Apple", 3);
        fridge.putProducts("Meat", 1);

        fridge.outProducts();

        Thread.sleep(3000);

        fridge.checkProducts("Bananas", 4);

        System.out.println("----------------------");

        fridge.outProducts();

    }
}
