package BotTeams;

import FootballerAndManager.Footballer;
import FootballerAndManager.Manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Team4 extends TeamTemplate {
    private ArrayList<List<Footballer>> compilation;

    public Team4() {
        super();
        super.getForwards().add(new Footballer("Dennis", "Bergkamp", "Netherlands", 31, 8, 5, 8, 7.5, 8, 0));
        super.getMidfielders().add(new Footballer("Jairzinho", "Brazil", 26, 8, 4, 8, 8, 8, 0));
        super.getMidfielders().add(new Footballer("Roberto", "Baggio", "Italy", 28, 8, 4, 8, 8, 7.5, 0));
        super.getMidfielders().add(new Footballer("Enzo", "Francescoli", "Uruguay", 29, 7.5, 4, 7.5, 7, 8, 0));
        super.getMidfielders().add(new Footballer("Garrincha", "Brazil", 27, 8, 4, 7.5, 8, 7.5, 0));
        super.getMidfielders().add(new Footballer("Johan", "Neeskens", "Netherlands", 24, 7, 6, 8, 7, 7.5, 0));
        super.getDefenders().add(new Footballer("Roberto", "Carlos", "Brazil", 29, 7, 6, 8, 7, 7.5, 0));
        super.getDefenders().add(new Footballer("Paul", "McGrath", "Republic of Ireland", 32, 5, 7, 7, 7, 7, 0));
        super.getDefenders().add(new Footballer("Javier", "Mascherano", "Argentina", 31, 3.5, 7, 8, 7, 8, 0));
        super.getDefenders().add(new Footballer("Carlos Alberto", "Torres", "Brazil", 26, 7, 6.5, 8, 7, 8, 0));
        super.getGoalkeepers().add(new Footballer("Edwin", "van der Sar", "Netherlands", 35, 0, 8, 8, 7, 8.5, 0));
        super.getManagers().add(new Manager("Johan", "Cruyff", "Netherlands", 50, 8, 7, 7.5, 8, 8, 0));

        this.compilation = new ArrayList<>();
        this.compilation.add(super.getForwards());
        this.compilation.add(super.getMidfielders());
        this.compilation.add(super.getDefenders());
    }

    @Override
    public String forwardString() {
        StringBuilder builder = new StringBuilder();
        if (!(super.getForwards().get(0).getLast() == null)) {
            builder.append("\t \t \t" + super.getForwards().get(0).getLast() + "\n");
        } else {
            builder.append("\t \t \t" + super.getForwards().get(0).getFirst() + "\n");
        }

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
    public String midfieldString() {
        StringBuilder builder = new StringBuilder();
        if (!(super.getMidfielders().get(4).getLast() == null)) {
            builder.append(super.getMidfielders().get(4).getLast());
        } else {
            builder.append(super.getMidfielders().get(4).getFirst());
        }
        return "\t \t \t" + builder.toString();
    }

    @Override
    public Footballer getRandom(int teamIndex, int playerIndex) {
        if (teamIndex == 0) {
            if (playerIndex > 0) {
                playerIndex = 0;
            }
            return this.getForwards().get(playerIndex);
        } else if (teamIndex == 1) {
            return this.getMidfielders().get(playerIndex);
        } else {
            if (playerIndex > 3) {
                playerIndex = 3;
            }
            return this.getDefenders().get(playerIndex);
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