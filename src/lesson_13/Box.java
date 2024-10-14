package lesson_13;

public class Box<A> {
    private A item;

    public Box(A item) {
        this.item = item;
    }

    public A getItem() {
        return item;
    }

    public void setItem(A item) {
        this.item = item;
    }
}
