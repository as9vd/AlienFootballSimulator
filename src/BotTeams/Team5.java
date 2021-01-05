package BotTeams;

import FootballerAndManager.Footballer;
import FootballerAndManager.Manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Team5 extends TeamTemplate {
    private ArrayList<List<Footballer>> compilation;

    public Team5() {
        super();
        super.getForwards().add(new Footballer("Cristiano", "Ronaldo", "Portugal", 34, 8.5, 6.5, 8, 8, 8, 0));
        super.getForwards().add(new Footballer("Pele", "Brazil", 28, 8.5, 7, 8, 8, 8, 0));
        super.getForwards().add(new Footballer("Lionel", "Messi", "Argentina", 31, 8.5, 6, 8, 8, 8, 0));
        super.getMidfielders().add(new Footballer("Diego", "Maradona", "Argentina", 28, 9, 6, 8, 8, 8, 0));
        super.getMidfielders().add(new Footballer("Bobby", "Charlton", "England", 31, 8.5, 7, 8, 8, 8, 0));
        super.getMidfielders().add(new Footballer("Johann", "Cruyff", "Netherlands", 28, 8, 6.5, 8, 8, 8, 0));
        super.getDefenders().add(new Footballer("Paolo", "Maldini", "Italy", 31, 4.5, 9, 8, 8, 8, 0));
        super.getDefenders().add(new Footballer("Franz", "Beckenbauer", "Germany", 30, 5, 9, 8, 8, 8, 0));
        super.getDefenders().add(new Footballer("Bobby", "Moore", "England", 30, 6, 9, 8, 8, 8, 0));
        super.getDefenders().add(new Footballer("Cafu", "Brazil", 29, 8, 8, 8, 8, 8, 0));
        super.getGoalkeepers().add(new Footballer("Peter", "Schmeichel", "Denmark", 31, 0, 8.5, 8, 8, 8, 0));
        super.getManagers().add(new Manager("Alex", "Ferguson", "Scotland", 65, 9, 9, 9, 9, 9, 0));

        this.compilation = new ArrayList<>();
        this.compilation.add(super.getForwards());
        this.compilation.add(super.getMidfielders());
        this.compilation.add(super.getDefenders());
    }

    @Override
    public String forwardString() {
        StringBuilder builder = new StringBuilder();
        if (!(super.getForwards().get(0).getLast() == null)) {
            builder.append(super.getForwards().get(0).getLast()).append(" / ");
        } else {
            builder.append(super.getForwards().get(0).getFirst()).append(" / ");
        }

        if (!(super.getForwards().get(1).getLast() == null)) {
            builder.append(super.getForwards().get(1).getLast()).append(" / ");
        } else {
            builder.append(super.getForwards().get(1).getFirst()).append(" / ");
        }

        if (!(super.getForwards().get(2).getLast() == null)) {
            builder.append(super.getForwards().get(2).getLast());
        } else {
            builder.append(super.getForwards().get(2).getFirst());
        }

        return builder.toString();
    }

    @Override
    public String midfieldString() {
        StringBuilder builder = new StringBuilder();
        if (!(super.getMidfielders().get(0).getLast() == null)) {
            builder.append(super.getMidfielders().get(0).getLast()).append(" / ");
        } else {
            builder.append(super.getMidfielders().get(0).getFirst()).append(" / ");
        }

        if (!(super.getMidfielders().get(1).getLast() == null)) {
            builder.append(super.getMidfielders().get(1).getLast()).append(" / ");
        } else {
            builder.append(super.getMidfielders().get(1).getFirst()).append(" / ");
        }

        if (!(super.getMidfielders().get(2).getLast() == null)) {
            builder.append(super.getMidfielders().get(2).getLast());
        } else {
            builder.append(super.getMidfielders().get(2).getFirst());
        }

        return builder.toString();
    }

    @Override
    public Footballer getRandom(int teamIndex, int playerIndex) {
        if (teamIndex == 0) {
            if (playerIndex > 2) {
                playerIndex = 2;
            }
            return super.getForwards().get(playerIndex);
        } else if (teamIndex == 1) {
            if (playerIndex > 2) {
                playerIndex = 2;
            }
            return super.getMidfielders().get(playerIndex);
        } else {
            return super.getDefenders().get(playerIndex);
        }
    }

    public ArrayList<List<Footballer>> getCompilation() {
        return this.compilation;
    }

    public boolean readyOrNot(Scanner scanner) {
        if (scanner.nextLine().contains("y")) {
            return true;
        } else {
            return false;
        }
    }

}