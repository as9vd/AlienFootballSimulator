package Lists;

import FootballerAndManager.Footballer;

import java.util.ArrayList;

public class CentreHalfSelectionList {

    private ArrayList<Footballer> list;

    public CentreHalfSelectionList() {
        this.list = new ArrayList<>();
        this.list.add(new Footballer("Virgil", "van Dijk", "Netherlands", 29, 9.5, 10, 10, 10, 10, 10));
        this.list.add(new Footballer("Sergio", "Ramos", "Spain", 35, 10, 9, 10, 10, 9.5, 9.5));
        this.list.add(new Footballer("Kalidou", "Koulibaly", "Senegal", 29, 9, 9.5, 9.5, 9.5, 9, 9));
        this.list.add(new Footballer("Gerard", "Pique", "Spain", 34, 9.5, 8.5, 9.5, 9, 8, 8));
        this.list.add(new Footballer("Giorgio", "Chiellini", "Italy", 35, 8, 10, 10, 9, 8, 8));
        this.list.add(new Footballer("Raphael", "Varane", "France", 27, 7.5, 8, 8, 8, 8, 7.5));
        this.list.add(new Footballer("Harry", "Maguire", "England", 27, 7.5, 8.5, 9, 8, 8.5, 7.5));
        this.list.add(new Footballer("Marquinhos", "Brazil", 26, 7, 8.5, 8, 7.5, 8, 7));
        this.list.add(new Footballer("Joel", "Matip", "Cameroon", 29, 6.5, 8, 8, 8, 8, 6.5));
        this.list.add(new Footballer("Kurt", "Zouma","France", 25, 7, 7, 7, 6.5, 6.5, 6));
        this.list.add(new Footballer("Eder", "Militao", "Brazil", 25, 6.5, 6.5, 6.5, 7, 7, 5.5));
        this.list.add(new Footballer("Davinson", "Sanchez", "Colombia", 24, 6, 7, 6.5, 6.5, 6.5, 5));
        this.list.add(new Footballer("Willy", "Boly", "France", 30, 5, 7, 6, 5.5, 7, 4.5));
        this.list.add(new Footballer("Eric", "Dier", "England", 25, 4, 7.5, 6, 7, 6, 4));
        this.list.add(new Footballer("David", "Luiz", "Brazil", 34, 6.5, 4, 6, 7, 5.5, 3));
        this.list.add(new Footballer("Shkodran", "Mustafi", "Germany", 29, 5.5, 2.5, 4.5, 5.5, 4, 2));
        this.list.add(new Footballer("Marcos", "Rojo", "Argentina", 30, 4, 3.5, 3.5, 6, 3, 1));
        this.list.add(new Footballer("Phil", "Jones", "England", 27, 3.5, 5, 5, 5, 4, 1));
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
