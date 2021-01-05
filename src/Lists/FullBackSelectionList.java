package Lists;

import FootballerAndManager.Footballer;

import java.util.ArrayList;

public class FullBackSelectionList {

    private ArrayList<Footballer> list;

    public FullBackSelectionList() {
        this.list = new ArrayList<>();
        this.list.add(new Footballer("Joshua", "Kimmich", "Germany", 25, 9.5, 9, 10, 10, 10, 10));
        this.list.add(new Footballer("Trent", "Alexander-Arnold", "England", 21, 11, 7, 8, 10, 8.5, 10));
        this.list.add(new Footballer("Andrew", "Robertson", "Scotland", 25, 9, 9, 9.5, 10, 10, 9.5));
        this.list.add(new Footballer("Jordi", "Alba", "Spain", 31, 9, 8, 9, 9.5, 9, 9));
        this.list.add(new Footballer("Carvajal", "Spain", 29, 9, 8.5, 9, 9, 8.5, 8.5));
        this.list.add(new Footballer("Kyle", "Walker", "England", 30, 8, 8, 8, 7.5, 9, 8));
        this.list.add(new Footballer("Aaron", "Wan-Bissaka", "England", 22, 7, 10, 8, 9, 9.5, 8));
        this.list.add(new Footballer("Ferland", "Mendy", "France", 25, 7.5, 8.5, 8, 8.5, 10, 7));
        this.list.add(new Footballer("Lucas", "Hernandez", "France", 25, 7, 7.5, 8, 8, 8, 7));
        this.list.add(new Footballer("Marcelo", "Brazil", 33, 8.5, 5.5, 10, 10, 7, 6.5));
        this.list.add(new Footballer("Juan", "Bernat", "Spain", 27, 6.5, 6.5, 6, 7, 8, 6));
        this.list.add(new Footballer("Kieran", "Trippier", "England", 30, 7, 5, 6, 7.5, 7, 5));
        this.list.add(new Footballer("Aleksandar", "Kolarov", "Serbia", 34, 6.5, 4, 5.5, 7, 5.5, 4.5));
        this.list.add(new Footballer("Serge", "Aurier", "Ivory Coast", 27, 6, 3.5, 4.5, 6, 5, 4));
        this.list.add(new Footballer("Emerson", "Italy", 25, 5.5, 4, 4, 3.5, 6, 3));
        this.list.add(new Footballer("Davide", "Zappacosta", "Italy", 29, 4, 4.5, 3, 3, 5.5, 3));
        this.list.add(new Footballer("Branislav", "Ivanovic", "Serbia", 36, 2, 5, 5.5, 6, 4.5, 2));
        this.list.add(new Footballer("Alberto", "Moreno", "Spain", 27, 6.5, 1.5, 2, 3.5, 3, 2));
        this.list.add(new Footballer("Matthew", "Lowton", "England", 31, 2.5, 3, 2.5, 3, 4, 1));
        this.list.add(new Footballer("Sam", "Byram", "England", 26, 3, 2, 3, 3, 4.5, 1));
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

    public ArrayList getList() {
        return this.list;
    }
}
