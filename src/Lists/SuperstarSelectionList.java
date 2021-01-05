package Lists;

import FootballerAndManager.Footballer;

import java.util.ArrayList;

public class SuperstarSelectionList {

    private ArrayList<Footballer> list;

    public SuperstarSelectionList() {
        this.list = new ArrayList<>();
        this.list.add(new Footballer("Diego", "Maradona", "Argentina",29, 12, 9, 12, 15, 9, 15));
        this.list.add(new Footballer("Pele", "Brazil", 25, 12, 10, 15, 12, 10, 15));
        this.list.add(new Footballer("George", "Best", "Northern Ireland", 26, 12, 8, 12, 12, 9, 14));
        this.list.add(new Footballer("Bobby", "Charlton", "England", 29, 10, 10, 15, 13, 10, 14));
        this.list.add(new Footballer("Marco", "van Basten", "Netherlands", 27, 12, 8, 13, 12, 10, 14));
        this.list.add(new Footballer("Eusebio", "Portugal", 27, 12, 8, 13, 13, 10, 14));
        this.list.add(new Footballer("Stanley", "Matthews", "England", 35, 11, 9, 13, 13, 10, 14));
        this.list.add(new Footballer("Zinedine", "Zidane", "France", 30, 12, 10, 15, 14, 9, 14));
    }

    public Footballer get(int index) {
        if (index >= 0 && index <= this.list.size()) {
            return this.list.get(index);
        }
        else {
            return null;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (Footballer legend: this.list) {
            if (!(legend.getLast() == null)) {
                builder.append(legend.getFirst() + " " + legend.getLast() + ", " + legend.getCountry() + "; " + "($" + legend.getPrice() + ") \n");
            } else {
                builder.append(legend.getFirst() + ", " + legend.getCountry() + "; " + "($" + legend.getPrice() + ") \n");
            }

        }

        return builder.toString();
    }
}