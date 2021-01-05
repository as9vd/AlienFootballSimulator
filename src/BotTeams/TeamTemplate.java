package BotTeams;

import FootballerAndManager.Footballer;
import FootballerAndManager.Manager;

import java.util.ArrayList;
import java.util.List;

public abstract class TeamTemplate {
    private final ArrayList<Footballer> forwards;
    private final ArrayList<Footballer> midfielders;
    private final ArrayList<Footballer> defenders;
    private final ArrayList<Footballer> goalkeepers;
    private final ArrayList<Manager> managers;
    private final ArrayList<ArrayList<Footballer>> compilationList;
    private int o;
    private int d;
    private double trueOffence;
    private double trueDefence;

    public TeamTemplate() {
        this.forwards = new ArrayList<>();
        this.midfielders = new ArrayList<>();
        this.defenders = new ArrayList<>();
        this.goalkeepers = new ArrayList<>();
        this.managers = new ArrayList<>();
        this.o = 0;
        this.d = 0;

        this.compilationList = new ArrayList<>();
        this.compilationList.add(this.forwards);
        this.compilationList.add(this.midfielders);
        this.compilationList.add(this.defenders);
        this.compilationList.add(this.goalkeepers);
    }

    public double calculateTrueOffence() {
        if (o==0) {
            for (Footballer forward: getForwards()) {
                this.trueOffence = this.trueOffence + (forward.getOffence() * 1.5) + (forward.getIntangibles() * 1.5) + (forward.getLeadership() * 1.3) + (forward.getConsistency() * 1.45);
            }

            for (Footballer midfielder: getMidfielders()) {
                this.trueOffence = this.trueOffence + (midfielder.getOffence() * 1.15) + (midfielder.getIntangibles() * 1.15) + (midfielder.getLeadership() * 1.25) + (midfielder.getConsistency() * 1.2);
            }

            for (Footballer defender: getDefenders()) {
                this.trueOffence = this.trueOffence + (defender.getOffence() * 0.65) + (defender.getIntangibles() * 0.7) + (defender.getLeadership() * 0.5) + (defender.getConsistency() * 0.6);
            }
            this.o++;

            for (Manager manager: getManagers()) {
                this.trueOffence = this.trueOffence + (manager.getOffence()) + (manager.getLeadership() * 1.2);
            }
        }
        return this.trueOffence;
    }

    public double calculateTrueDefence() {
        if (d==0) {
            for (Footballer forward: getForwards()) {
                this.trueDefence = this.trueDefence + (forward.getDefence() * 0.5) + (forward.getIntangibles() * 0.5) + (forward.getLeadership() * 0.4) + (forward.getConsistency() * 0.4);
            }

            for (Footballer midfielder: getMidfielders()) {
                this.trueDefence = this.trueDefence + (midfielder.getDefence()) + (midfielder.getIntangibles()) + (midfielder.getLeadership()) + (midfielder.getConsistency());
            }

            for (Footballer defender: getDefenders()) {
                this.trueDefence = this.trueDefence + (defender.getDefence() * 1.25) + (defender.getIntangibles() * 1.1) + (defender.getLeadership() * 1.1) + (defender.getConsistency() * 1.25);
            }

            for (Footballer keeper: getGoalkeepers()) {
                this.trueDefence = this.trueDefence + (keeper.getDefence() * 1.15) + (keeper.getIntangibles() * 0.3) + (keeper.getLeadership() * 1.15) + (keeper.getConsistency() * 1.15);
            }

            for (Manager manager: getManagers()) {
                this.trueDefence = this.trueDefence + (manager.getDefence()) + (manager.getLeadership() * 1.1);
            }

            this.d++;
        }
        return this.trueDefence;
    }

    public double getOffence() {
        double sum = 0;
        for (ArrayList<Footballer> list: this.compilationList) {
            for (Footballer footballer: list) {
                sum = footballer.getOffence() + sum;
            }
        }
        return sum;
    }

    public double getDefence() {
        double sum = 0;
        for (ArrayList<Footballer> list: this.compilationList) {
            for (Footballer footballer: list) {
                sum = footballer.getDefence() + sum;
            }
        }
        return sum;
    }

    public double getLeadership() {
        double sum = 0;
        for (ArrayList<Footballer> list: this.compilationList) {
            for (Footballer footballer: list) {
                sum = footballer.getLeadership() + sum;
            }
        }
        for (Manager manager: getManagers()) {
            sum = sum + (manager.getLeadership());
        }
        return sum;
    }

    public double getIntangibles() {
        double sum = 0;
        for (ArrayList<Footballer> list: this.compilationList) {
            for (Footballer footballer: list) {
                sum = footballer.getIntangibles() + sum;
            }
        }
        return sum;
    }

    public double getConsistency() {
        double sum = 0;
        for (ArrayList<Footballer> list: this.compilationList) {
            for (Footballer footballer: list) {
                sum = footballer.getConsistency() + sum;
            }
        }
        return sum;
    }

    public void teamComposition() {
        System.out.println(forwardString());
        System.out.println(midfieldString());
        System.out.println(defenceString());
        System.out.println(goalkeeperString());
    }

    public  String managerString() {
        return "Managed by " + this.getManagers().get(0) + ".";
    }

    public abstract String forwardString();

    public abstract String midfieldString();

    public String defenceString() {
        StringBuilder builder = new StringBuilder();
        if (!(this.getDefenders().get(0).getLast() == null)) {
            builder.append(this.getDefenders().get(0).getLast());
        } else {
            builder.append(this.getDefenders().get(0).getFirst());
        }
        builder.append(" / ");

        if (!(this.getDefenders().get(1).getLast() == null)) {
            builder.append(this.getDefenders().get(1).getLast());
        } else {
            builder.append(this.getDefenders().get(1).getFirst());
        }
        builder.append(" / ");

        if (!(this.getDefenders().get(2).getLast() == null)) {
            builder.append(this.getDefenders().get(2).getLast());
        } else {
            builder.append(this.getDefenders().get(2).getFirst());
        }
        builder.append(" / ");

        if (!(this.getDefenders().get(3).getLast() == null)) {
            builder.append(this.getDefenders().get(3).getLast());
        } else {
            builder.append(this.getDefenders().get(3).getFirst());
        }

        return builder.toString();
    }

    public String goalkeeperString() {
        StringBuilder builder = new StringBuilder();
        if (!(this.getGoalkeepers().get(0).getLast() == null)) {
            builder.append(this.getGoalkeepers().get(0).getLast());
        } else {
            builder.append(this.getGoalkeepers().get(0).getFirst());
        }
        return "\t \t \t" + builder.toString();
    }

    public List<Footballer> getForwards() {
        return this.forwards;
    }

    public List<Footballer> getMidfielders() {
        return this.midfielders;
    }

    public List<Footballer> getDefenders() {
        return this.defenders;
    }

    public List<Footballer> getGoalkeepers() {
        return this.goalkeepers;
    }

    public List<Manager> getManagers() {
        return this.managers;
    }

    public abstract Footballer getRandom(int teamIndex, int playerIndex);

}