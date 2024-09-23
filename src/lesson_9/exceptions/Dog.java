package lesson_9.exceptions;

public class Dog {

    // fields

    String name;

    // constructors


    public Dog(String name) {
        this.name = name;
    }

    // methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayMyName() throws DogDoesNotKnownHisNameException {
        if (this.name == null) {
            throw new DogDoesNotKnownHisNameException("Пес не знает своего имени");
        } else {
            System.out.println(this.name);
        }

    }
}
