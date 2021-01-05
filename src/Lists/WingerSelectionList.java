package Lists;

import FootballerAndManager.Footballer;

import java.util.ArrayList;

public class WingerSelectionList {

    private ArrayList<Footballer> list;

    public WingerSelectionList() {
        this.list = new ArrayList<>();
        this.list.add(new Footballer("Lionel", "Messi", "Argentina", 33, 11, 7.5, 10, 10, 11, 10));
        this.list.add(new Footballer("Neymar", "Brazil", 28, 10, 8, 9, 10, 9, 10));
        this.list.add(new Footballer("Mohamed", "Salah", "Egypt", 28, 9.5, 8, 9.5, 9.5, 10, 9.5));
        this.list.add(new Footballer("Sadio", "Mane", "Senegal", 28, 9, 8, 9.5, 9, 9.5, 9));
        this.list.add(new Footballer("Eden", "Hazard", "Belgium", 29, 9.5, 8, 9, 10, 8, 8.5));
        this.list.add(new Footballer("Raheem", "Sterling", "England", 26, 9, 7.5, 8.5, 8.5, 8.5, 8));
        this.list.add(new Footballer("Marcus", "Rashford", "England", 22, 8.5, 7.5, 8, 9, 7.5, 7.5));
        this.list.add(new Footballer("Lorenzo", "Insigne", "Italy", 28, 8, 7, 9, 7, 8, 7.5));
        this.list.add(new Footballer("Ousmane", "Dembele", "France", 23, 9, 6, 7, 8.5, 6.5, 7));
        this.list.add(new Footballer("Gareth", "Bale", "Wales", 31, 7.5, 6.5, 8.5, 8, 5.5, 6));
        this.list.add(new Footballer("Thomas", "Lemar", "France", 26, 7, 6, 6, 6, 6, 5));
        this.list.add(new Footballer("Lucas", "Vazquez", "Spain", 30, 5, 8, 7, 7, 6.5, 4));
        this.list.add(new Footballer("Andros", "Townsend", "England", 29, 7.5, 5, 6, 6.5, 5, 4));
        this.list.add(new Footballer("Daniel", "James", "Wales", 23, 5.5, 6.5, 5, 5, 3.5, 3));
        this.list.add(new Footballer("Demarai", "Gray", "England", 26, 5, 5, 4.5, 4, 3.5, 2.5));
        this.list.add(new Footballer("Aaron", "Lennon", "England", 33, 3, 3, 3.5, 3, 2, 2));
        this.list.add(new Footballer("Arda", "Turan", "Turkey", 33, 2.5, 2.5, 1.5, 4.5, 1, 1));
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (Footballer winger : this.list) {
            if (!(winger.getLast() == null)) {
                builder.append(winger.getFirst() + " " + winger.getLast() + ", " + winger.getCountry() + "; " + "($" + winger.getPrice() + ") \n");
            } else {
                builder.append(winger.getFirst() + ", " + winger.getCountry() + "; " + "($" + winger.getPrice() + ") \n");
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