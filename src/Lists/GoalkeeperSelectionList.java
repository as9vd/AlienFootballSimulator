package Lists;

import FootballerAndManager.Footballer;

import java.util.ArrayList;

public class GoalkeeperSelectionList {

    private ArrayList<Footballer> list;

    public GoalkeeperSelectionList() {
        this.list = new ArrayList<>();
        this.list.add(new Footballer("Jan", "Oblak", "Slovenia", 27, 0, 10, 9, 10, 10, 10));
        this.list.add(new Footballer("Manuel", "Neuer", "Germany", 34, 0, 10, 10, 10, 9.5, 10));
        this.list.add(new Footballer("Alisson", "Brazil", 28, 0, 9.5, 9.5, 9.5, 9.5, 9.5));
        this.list.add(new Footballer("David", "de Gea", "Spain", 29, 0, 10, 9, 9, 9, 9));
        this.list.add(new Footballer("Hugo", "Lloris", "France", 33, 0, 8, 9, 8, 7, 8));
        this.list.add(new Footballer("Ederson", "Brazil", 26, 0, 8, 8, 9, 7.5, 8));
        this.list.add(new Footballer("Bernd", "Leno", "Germany", 28, 0, 7.5, 8, 8.5, 8, 7));
        this.list.add(new Footballer("Andre", "Onana", "Cameroon", 25, 0, 8, 7, 8.5, 8, 7));
        this.list.add(new Footballer("Kasper", "Schmeichel", "France", 33, 0, 7.5, 8.5, 8, 8, 7));
        this.list.add(new Footballer("Martin", "Dubravka", "Slovakia", 33, 0, 7, 7, 7, 8, 6));
        this.list.add(new Footballer("Nick", "Pope", "England", 28, 0, 7.5, 6, 5.5, 8, 5));
        this.list.add(new Footballer("Simon", "Mignolet", "Belgium", 32, 0, 5.5, 6, 5, 6, 4));
        this.list.add(new Footballer("Sergio", "Romero", "Argentina", 33, 0, 6.5, 5.5, 7, 7, 4));
        this.list.add(new Footballer("Ben", "Foster", "England", 37, 0, 5, 5.5, 5, 6, 3));
        this.list.add(new Footballer("Loris", "Karius", "Germany", 28, 0, 4.5, 4, 3, 5, 2));
        this.list.add(new Footballer("Joe", "Hart", "England", 33, 0, 5, 5, 5, 4, 1));
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (Footballer footballer: this.list) {
            if (!(footballer.getLast() == null)) {
                builder.append(footballer.getFirst() + " " + footballer.getLast() + ", " + footballer.getCountry() + "; " + "($" + footballer.getPrice() + ") \n");
            } else {
                builder.append(footballer.getFirst() + ", " + footballer.getCountry() + "; " + "($" + footballer.getPrice() + ") \n");
            }

        }

        return builder.toString();
    }

    public Footballer get(int index) {
        if (index >= 0 && index <= this.list.size() - 1) {
            return this.list.get(index);
        } else {
            return null;
        }
    }

}
