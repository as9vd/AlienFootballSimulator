package Lists;

import FootballerAndManager.Footballer;
import java.util.ArrayList;

public class ForwardSelectionList {

    private ArrayList<Footballer> list;

    public ForwardSelectionList() {
        this.list = new ArrayList<>();
        this.list.add(new Footballer("Cristano","Ronaldo","Portugal", 35, 10, 6.5, 10, 10, 10, 10));
        this.list.add(new Footballer("Robert", "Lewandowski", "Poland", 32, 9.5, 6.5, 9, 9.5, 10, 10));
        this.list.add(new Footballer("Kylian", "Mbappe", "France", 22, 10, 6, 8, 9.5, 9, 9));
        this.list.add(new Footballer("Luis", "Suarez", "Uruguay", 33, 9, 7.5, 8, 9.5, 9, 9));
        this.list.add(new Footballer("Erling", "Haaland", "Norway", 20, 9, 6, 7.5, 8, 9, 8));
        this.list.add(new Footballer("Jamie", "Vardy", "England", 33, 9, 6, 8, 7.5, 8.5, 8));
        this.list.add(new Footballer("Ciro", "Immobile", "Italy", 31, 8.5, 6.5, 7.5, 7, 8, 7.5));
        this.list.add(new Footballer("Timo", "Werner", "Germany", 24, 8, 6, 7, 7, 7, 7));
        this.list.add(new Footballer("Raul", "Jimenez", "Mexico", 29, 7.5, 7, 7.5, 6.5, 8, 7));
        this.list.add(new Footballer("Gabriel", "Jesus", "Brazil", 24, 7.5, 6.5, 6.5, 7, 6.5, 6));
        this.list.add(new Footballer("Anthony", "Martial", "France", 24, 8.5, 6, 6, 8, 5.5, 6));
        this.list.add(new Footballer("Alvaro", "Morata", "Spain", 27, 7, 6.5, 6.5, 6, 5.5, 5.5));
        this.list.add(new Footballer("Dominic", "Calvert-Lewin", "England", 22, 6.5, 6, 6, 6, 7, 5));
        this.list.add(new Footballer("Andre", "Silva", "Portugal", 24, 6, 6, 5.5, 5, 5, 5));
        this.list.add(new Footballer("Alexis", "Sanchez", "Chile", 33, 4.5, 6, 8, 7, 5, 4.5));
        this.list.add(new Footballer("Callum", "Wilson", "England", 29, 6, 4.5, 5, 5.5, 5, 4));
        this.list.add(new Footballer("Michy", "Batshyuai", "Belgium", 26, 5, 4, 5, 4, 4.5, 3.5));
        this.list.add(new Footballer("Islam", "Slimani", "Algeria", 32, 5, 3, 5, 4, 4, 3));
        this.list.add(new Footballer("Troy", "Deeney", "England", 33, 3, 2, 7.5, 6.5, 3, 2));
        this.list.add(new Footballer("Rudy", "Gestede", "France", 32, 2.5, 2, 4, 2, 2, 1));
        this.list.add(new Footballer("Oliver", "McBurnie", "Scotland", 25, 3, 1.5, 4, 3, 2.5, 1));
        this.list.add(new Footballer("Andy", "Carroll", "England", 32, 4, 1, 3, 4.5, 2, 1));
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (Footballer footballer: this.list) {
            builder.append(footballer.getFirst() + " " + footballer.getLast() + ", " + footballer.getCountry() + "; " + "($" + footballer.getPrice() + ") \n");
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