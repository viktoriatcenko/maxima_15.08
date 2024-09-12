package lesson_7;

// square
// cost
// district
// name

public class Flat {

    // fields
    int square;
    int cost;
    String district;
    String name;


    // constructor

    public Flat(int square) {
        this.square = square;
    }

    public Flat(int square, int cost) {
        this.square = square;
        this.cost = cost;
    }

    public Flat(int square, int cost, String district) {
        this.square = square;
        this.cost = cost;
        this.district = district;
    }

    public Flat(int square, int cost, String district, String name) {
        this.square = square;
        this.cost = cost;
        this.district = district;
        this.name = name;
    }

    // getters and setters


    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
