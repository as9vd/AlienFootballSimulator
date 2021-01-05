package Lists;

import FootballerAndManager.Footballer;
import java.util.ArrayList;

public class MidfieldSelectionList {

    private ArrayList<Footballer> list;

    public MidfieldSelectionList() {
        this.list = new ArrayList<>();
        this.list.add(new Footballer("Kevin", "de Bruyne", "Belgium", 29, 9.5, 9, 10, 10, 10, 10));
        this.list.add(new Footballer("Toni", "Kroos", "Germany", 30, 10, 8, 10, 10, 9, 9.5));
        this.list.add(new Footballer("Bruno", "Fernandes", "Portugal", 26, 10, 7.5, 10, 9.5, 9.5, 9));
        this.list.add(new Footballer("Luka", "Modric", "Croatia", 34, 9, 8, 9.5, 10, 9, 9));
        this.list.add(new Footballer("Paul", "Pogba", "France", 27, 10, 7.5, 8.5, 7, 8, 8.5));
        this.list.add(new Footballer("Marco", "Verratti", "Italy", 27, 8, 9, 8.5, 8, 9, 8));
        this.list.add(new Footballer("David", "Silva", "Spain",34, 8.5, 7, 8, 8.5, 6.5, 8));
        this.list.add(new Footballer("Frenkie", "de Jong", "Netherlands", 22, 8, 8, 7.5, 8, 7.5, 7.5));
        this.list.add(new Footballer("Leon", "Goretzka", "Germany", 25, 7, 7.5, 8, 7, 7, 7));
        this.list.add(new Footballer("Georginio", "Wijnaldum", "Netherlands",30, 7.5, 7.5, 8, 8, 7, 7));
        this.list.add(new Footballer("Marcelo", "Brozovic", "Croatia", 27, 7, 8, 7, 7, 7, 6.5));
        this.list.add(new Footballer("Lucas", "Leiva", "Brazil", 33, 5.5, 8, 8, 8, 6, 6));
        this.list.add(new Footballer("Jorginho", "Italy", 29, 6, 6, 7.5, 7.5, 5, 5.5));
        this.list.add(new Footballer("Blaise", "Matuidi", "France", 33, 5, 8, 7, 7, 5.5, 5));
        this.list.add(new Footballer("Marten", "de Roon", "Netherlands", 29, 5, 5.5, 6, 6, 4, 4));
        this.list.add(new Footballer("Andreas", "Pereira", "Brazil", 25, 6, 4, 5, 5, 3.5, 3));
        this.list.add(new Footballer("Harry", "Winks", "England", 25, 5, 5, 5, 6, 4, 3));
        this.list.add(new Footballer("Yann", "M'Vila", "France", 30, 3.5, 5, 4, 3, 3, 2));
        this.list.add(new Footballer("Ashley", "Westwood", "England", 30, 2, 4.5, 3.5, 5, 4, 1.5));
        this.list.add(new Footballer("Jack", "Cork", "England", 31, 2, 4.5, 3.5, 5, 4, 1.5));
        this.list.add(new Footballer("Mark", "Noble", "England", 33, 1.5, 4, 6, 4, 2, 1));
        this.list.add(new Footballer("Scott", "Brown", "Scotland", 36, 1.5, 4, 6, 5, 2, 1));
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