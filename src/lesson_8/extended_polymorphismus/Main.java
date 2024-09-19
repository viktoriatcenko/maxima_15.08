package lesson_8.extended_polymorphismus;

public class Main {

    public static void main(String[] args) {
       Gepard chester = new Gepard("Chester");
       Penguin penguin = new Penguin("Kinder");

       Animal [] kovcheg = new Animal[2];

       kovcheg[0] = chester;
       kovcheg[1] = penguin;

        for (int i = 0; i < kovcheg.length; i++) {
            System.out.println(kovcheg[i].getName());
        }
    }

}
