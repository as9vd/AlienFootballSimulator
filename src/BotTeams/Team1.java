package BotTeams;

import FootballerAndManager.Footballer;
import FootballerAndManager.Manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Team1 extends TeamTemplate {
    private ArrayList<List<Footballer>> compilation;

    public Team1() {
        super();
        super.getForwards().add(new Footballer("Peter", "Crouch", "England", 33, 5, 7, 6.5, 6.5, 6, 0));
        super.getForwards().add(new Footballer("Jamie", "Vardy", "England", 33, 8, 6, 8, 8, 8, 0));
        super.getMidfielders().add(new Footballer("Matthew", "Etherington", "England", 30, 4.5, 5, 5, 5, 5, 0));
        super.getMidfielders().add(new Footballer("Joey", "Barton", "England", 28, 4, 5, 5, 5, 5.5, 0));
        super.getMidfielders().add(new Footballer("Vinnie", "Jones", "Wales", 30, 4, 5, 5.5, 5, 5.5, 0));
        super.getMidfielders().add(new Footballer("Craig", "Bellamy", "Wales", 33, 5, 5.5, 5, 5, 5, 0));
        super.getDefenders().add(new Footballer("Charlie", "Taylor", "England", 26, 3, 6, 5, 5, 5, 0));
        super.getDefenders().add(new Footballer("Robert", "Huth", "Germany", 30, 3.5, 6, 6.5, 5, 6, 0));
        super.getDefenders().add(new Footballer("Ryan", "Shawcross", "England", 28, 3, 6, 6.5, 5, 6.5, 0));
        super.getDefenders().add(new Footballer("Kieran", "Trippier", "England", 29, 5, 6.5, 6, 5.5, 5, 0));
        super.getGoalkeepers().add(new Footballer("Nick", "Pope", "England", 28, 0, 7, 6, 5.5, 6, 0));
        super.getManagers().add(new Manager("Tony", "Pulis", "Wales", 55, 4, 7, 6.5, 4, 6, 0));

        this.compilation = new ArrayList<>();
        this.compilation.add(super.getForwards());
        this.compilation.add(super.getMidfielders());
        this.compilation.add(super.getDefenders());
    }

    public boolean readyOrNot(Scanner scanner) {
        if (scanner.nextLine().contains("y")) {
            return true;
        } else {
            return false;
        }
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

    public ArrayList<List<Footballer>> getCompilation() {
        return this.compilation;
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
}