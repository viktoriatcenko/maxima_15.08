package lesson_12.model;

import java.util.Objects;

public class Coin implements Comparable<Coin> {

    // 10 * 1.5 * 50 * 41 * 91 * 2004 = 5607693000
    // 3 * 1.9 * 81 * 51 * 64 * 2022 = 3047131353.6

    // 1.5 * 10 * 50 * 41 * 91 * 2004 = 5607693000

    private Integer nominal;
    private Double diameter;
    private String country; // char [] R (50) u (41) s (91)
    private Integer price;
    private Matherial matherial;

    public Coin(Integer nominal, Double diameter, String country, Integer price, Matherial matherial) {
        this.matherial = matherial;
        Coin o = this;
        this.nominal = nominal;
        this.diameter = diameter;
        this.country = country;
        this.price = price;
    }

    public Integer getNominal() {
        return nominal;
    }

    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Coin() {
        super();
    }

    public Matherial getMatherial() {
        return matherial;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Coin{");
        sb.append("nominal=").append(nominal);
        sb.append(", diameter=").append(diameter);
        sb.append(", country='").append(country).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coin coin = (Coin) o;
        boolean equalsNom = Objects.equals(nominal, coin.nominal);
        boolean equalsD = Objects.equals(diameter, coin.diameter);
        boolean equalsCountry = Objects.equals(country, coin.country);
        boolean equalsYear = Objects.equals(price, coin.price);
        boolean b = equalsNom && equalsD && equalsCountry && equalsYear;
        return b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominal, diameter, country, price);
    }

    // this.compareTo(coin3)
    @Override
    public int compareTo(Coin coin) {

        Integer price = coin.price;
        if(price != this.price) {
            return price - this.price;
        }

        Integer nominal = coin.nominal;
        if (nominal != this.nominal) {
            return nominal - this.nominal;
        }

        Double diam = coin.diameter;
        return diam.compareTo(this.diameter);
    }
}
