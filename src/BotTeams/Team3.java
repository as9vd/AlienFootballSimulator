package BotTeams;

import FootballerAndManager.Footballer;
import FootballerAndManager.Manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Team3 extends TeamTemplate {
    private ArrayList<List<Footballer>> compilation;

    public Team3() {
        super();
        super.getForwards().add(new Footballer("Sadio", "Mane", "Senegal", 29, 8.5, 8, 8.5, 8.5, 8.5, 0));
        super.getForwards().add(new Footballer("Samuel", "Eto'o", "Cameroon", 29, 10, 8.5, 8.5, 8.5, 8.5, 0));
        super.getForwards().add(new Footballer("George", "Weah", "Liberia", 28, 10, 7.5, 9, 9, 8.5, 0));
        super.getForwards().add(new Footballer("Mohamed", "Salah", "Egypt", 28, 8.5, 8, 8, 8, 8.5, 0));
        super.getMidfielders().add(new Footballer("Yaya", "Toure", "Ivory Coast", 31, 8.5, 8, 8, 7.5, 7.5, 0));
        super.getMidfielders().add(new Footballer("Michael", "Essien", "Ghana", 28, 7, 8.5, 8.5, 8, 8, 0));
        super.getDefenders().add(new Footballer("Joseph", "Yobo", "Nigeria", 27, 7, 7, 7, 7, 7, 0));
        super.getDefenders().add(new Footballer("Kolo", "Toure", "Ivory Coast", 25, 7, 8, 8, 8, 7.5, 0));
        super.getDefenders().add(new Footballer("Sammy", "Kuffour", "Ghana", 27, 7.5, 8.5, 9, 8.5, 8.5, 0));
        super.getDefenders().add(new Footballer("Geremi", "Cameroon", 28, 8.5, 7, 8, 8, 7.5, 0));
        super.getGoalkeepers().add(new Footballer("Bruce", "Grobbelaar", "Zimbabwe", 31, 0, 9, 9, 9.5, 8.5, 0));
        super.getManagers().add(new Manager("Carlos", "Queiroz", "Mozambique", 60, 8.5, 7, 7, 8.5, 8, 0));

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
            builder.append(super.getForwards().get(1).getLast() + " / ");
        } else {
            builder.append(super.getForwards().get(1).getFirst() + " / ");
        }

        if (!(super.getForwards().get(2).getLast() == null)) {
            builder.append(super.getForwards().get(2).getLast() + " / ");
        } else {
            builder.append(super.getForwards().get(2).getFirst() + " / ");
        }

        if (!(super.getForwards().get(3).getLast() == null)) {
            builder.append(super.getForwards().get(3).getLast());
        } else {
            builder.append(super.getForwards().get(3).getFirst());
        }

        return builder.toString();
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
            builder.append(super.getMidfielders().get(1).getLast());
        } else {
            builder.append(super.getMidfielders().get(1).getFirst());
        }

        return " \t \t" + builder.toString();
    }

    @Override
    public Footballer getRandom(int teamIndex, int playerIndex) {
        if (teamIndex == 0) {
            return this.getForwards().get(playerIndex);
        } else if (teamIndex == 1) {
            if (playerIndex > 1) {
                playerIndex = 1;
            }
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