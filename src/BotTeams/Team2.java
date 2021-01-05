package BotTeams;

import FootballerAndManager.Footballer;
import FootballerAndManager.Manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Team2 extends TeamTemplate {
    private ArrayList<List<Footballer>> compilation;

    public Team2() {
        super();
        super.getForwards().add(new Footballer("Gabriel", "Batistuta", "Argentina", 28, 10, 8, 9.5, 9.5, 10, 0));
        super.getForwards().add(new Footballer("Fernando", "Llorente", "Spain", 30, 8.5, 7.5, 8, 9, 8.5, 0));
        super.getMidfielders().add(new Footballer("Juan", "Riquelme", "Argentina", 25, 9, 6, 7, 9, 6, 0));
        super.getMidfielders().add(new Footballer("Arturo", "Vidal", "Chile", 28, 8, 8, 8.5, 9, 9, 0));
        super.getMidfielders().add(new Footballer("Mikel", "Arteta", "Spain", 30, 7, 7, 7.5, 7, 7, 0));
        super.getMidfielders().add(new Footballer("Juan", "Veron", "Argentina", 28, 9.5, 6, 7, 9, 6, 0));
        super.getDefenders().add(new Footballer("Emiliano", "Insua", "Argentina", 25, 6, 6, 6, 6, 6, 0));
        super.getDefenders().add(new Footballer("Nicolas", "Otamendi", "Argentina", 25, 7, 6, 8, 6, 7, 0));
        super.getDefenders().add(new Footballer("John", "Stones", "England", 25, 7.5, 5.5, 6, 7, 5.5, 0));
        super.getDefenders().add(new Footballer("Sergi", "Roberto", "Spain", 28, 7, 5.5, 7, 7.5, 7, 0));
        super.getGoalkeepers().add(new Footballer("Kepa", "Arrizabalaga", "Spain", 23, 0, 7, 6, 7.5, 7, 0));
        super.getManagers().add(new Manager("Marcelo", "Bielsa", "Argentina", 60, 9, 6.5, 6, 8.5, 6, 0));

        this.compilation = new ArrayList<>();
        this.compilation.add(super.getForwards());
        this.compilation.add(super.getMidfielders());
        this.compilation.add(super.getDefenders());
    }

    public ArrayList<List<Footballer>> getCompilation() {
        return this.compilation;
    }

    @Override
    public String forwardString() {
        StringBuilder builder = new StringBuilder();
        if (!(super.getForwards().get(0).getLast() == null)) {
            builder.append(super.getForwards().get(0).getLast() + " / ");
        } else {
            builder.append(super.getForwards().get(0).getFirst() + " / ");
        }

        if (!(super.getForwards().get(1).getLast() == null)) {
            builder.append(super.getForwards().get(1).getLast());
        } else {
            builder.append(super.getForwards().get(1).getFirst());
        }

        return " \t \t" + builder.toString();
    }

    @Override
    public String midfieldString() {
        StringBuilder builder = new StringBuilder();
        if (!(super.getMidfielders().get(0).getLast() == null)) {
            builder.append(super.getMidfielders().get(0).getLast() + " / ");
        } else {
            builder.append(super.getMidfielders().get(0).getFirst() + " / ");
        }

        if (!(super.getMidfielders().get(1).getLast() == null)) {
            builder.append(super.getMidfielders().get(1).getLast() + " / ");
        } else {
            builder.append(super.getMidfielders().get(1).getFirst() + " / ");
        }

        if (!(super.getMidfielders().get(2).getLast() == null)) {
            builder.append(super.getMidfielders().get(2).getLast() + " / ");
        } else {
            builder.append(super.getMidfielders().get(2).getFirst() + " / ");
        }

        if (!(super.getMidfielders().get(3).getLast() == null)) {
            builder.append(super.getMidfielders().get(3).getLast());
        } else {
            builder.append(super.getMidfielders().get(3).getFirst());
        }

        return builder.toString();
    }

    @Override
    public Footballer getRandom(int teamIndex, int playerIndex) {
        if (teamIndex == 0) {
            if (playerIndex > 1) {
                playerIndex = 1;
            }
            return this.getForwards().get(playerIndex);
        } else if (teamIndex == 1) {
            return this.getMidfielders().get(playerIndex);
        } else {
            return this.getDefenders().get(playerIndex);
        }
    }

    public boolean readyOrNot(Scanner scanner) {
        if (scanner.nextLine().contains("y")) {
            return true;
        } else {
            return false;
        }
    }

}