package Lists;

import FootballerAndManager.Footballer;
import FootballerAndManager.Manager;

import java.util.ArrayList;

public class ManagerSelectionList {

    private ArrayList<Manager> list;

    public ManagerSelectionList() {
        this.list = new ArrayList<>();
        this.list.add(new Manager("Alex", "Ferguson", "Scotland", 65, 10, 10, 11, 10, 10, 10));
        this.list.add(new Manager("Rinus", "Michels", "Netherlands", 50, 9.5, 9.5, 8, 10, 10, 10));
        this.list.add(new Manager("Arsene", "Wenger", "France", 65, 9.5, 8, 9, 9.5, 9.5, 9.5));
        this.list.add(new Manager("Pep", "Guardiola", "Catalonia", 45, 10, 7.5, 8, 10, 8.5,9));
        this.list.add(new Manager("Jose", "Mourinho", "Portugal", 55, 8, 10, 7.5, 8.5, 9, 9));
        this.list.add(new Manager("Carlo", "Ancelotti", "Italy", 60, 8.5, 8.5, 10, 8, 9, 8.5));
        this.list.add(new Manager("Bill", "Shankly", "Scotland", 60, 8, 8, 10, 8, 8,8.5));
        this.list.add(new Manager("Louis", "van Gaal", "Netherlands", 60, 8, 9, 6.5, 7, 7, 8));
        this.list.add(new Manager("Sven", "Goran-Eriksson", "Sweden", 65, 8.5, 8.5, 7, 7, 6.5, 8));
        this.list.add(new Manager("Marcelo", "Bielsa", "Argentina", 65, 10, 7, 6, 9, 8, 7));
        this.list.add(new Manager("Gerard", "Houllier", "France", 60, 7.5, 7.5, 7, 7, 7.5, 7));
        this.list.add(new Manager("Unai", "Emery", "Spain", 48, 7, 7, 7, 6.5, 6.5, 7));
        this.list.add(new Manager("Luiz", "Felipe Scolari", "Brazil", 65, 7.5, 7.5, 6.5, 6, 8, 7));
        this.list.add(new Manager("Roy", "Hodgson", "England", 70, 5.5, 8.5, 7.5,5, 5, 6.5));
        this.list.add(new Manager("Roberto", "Martinez", "Spain", 47, 8, 5, 6.5, 7, 6, 6));
        this.list.add(new Manager("Ole", "Gunnar Solskjaer", "Norway", 47, 6.5, 7, 8, 6, 6.5, 6));
        this.list.add(new Manager("Nigel", "Pearson", "England", 55, 6, 6.5, 7.5, 5, 6,5.5));
        this.list.add(new Manager("Chris", "Hughton", "England", 62, 5.5, 6.5, 6.5, 4.5, 5, 5));
        this.list.add(new Manager("Paul", "Lambert", "England", 50, 5, 5, 5, 4, 4,4.5));
        this.list.add(new Manager("Roberto", "Di Matteo", "Italy", 50, 6, 3.5, 7, 4, 4, 4));
        this.list.add(new Manager("Paul", "Ince", "England", 50, 5, 4, 5, 3, 3, 3));
        this.list.add(new Manager("Gianfranco", "Zola", "Italy", 54, 6, 3, 5, 3, 4, 3));
        this.list.add(new Manager("Avram", "Grant", "Israel", 65, 3.5, 5, 3, 1.5, 2,2.5));
        this.list.add(new Manager("Bob", "Bradley", "United States of America", 62, 3, 3, 2, 1, 1, 2));
        this.list.add(new Manager("Frank", "de Boer", "Netherlands", 50, 4, 2.5, 1.5, 2, 1.5, 2));
        this.list.add(new Manager("John", "Carver", "England", 55, 2, 2, 2.5, 1, 1,1));
        this.list.add(new Manager("Gary", "Neville", "England", 45, 2, 3, 3, 1,1, 1));
        this.list.add(new Manager("Alan", "Shearer", "England", 45, 3, 2, 3, 1,1,1));
        this.list.add(new Manager("Tony", "Adams", "England", 55, 1.5, 3.5, 2, 1, 0.5, 1));
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (Manager manager: this.list) {
            if (!(manager.getLast() == null)) {
                builder.append(manager.getFirst() + " " + manager.getLast() + ", " + manager.getCountry() + "; " + "($" + manager.getPrice() + ") \n");
            } else {
                builder.append(manager.getFirst() + ", " + manager.getCountry() + "; " + "($" + manager.getPrice() + ") \n");
            }

        }

        return builder.toString();
    }

    public Manager get(int index) {
        if (index >= 0 && index <= this.list.size() - 1) {
            return this.list.get(index);
        } else {
            return null;
        }
    }
}