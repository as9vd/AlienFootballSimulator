package Lists;

import BotTeams.TeamTemplate;
import FootballerAndManager.Footballer;
import FootballerAndManager.Manager;

import java.util.ArrayList;
import java.util.List;

public class StartingXI extends TeamTemplate {

    private final List<Footballer> strikers;
    private final List<Footballer> wingers;
    private final List<Footballer> midfielders;
    private final List<Footballer> defenders;
    private final List<Footballer> fullbacks;
    private final List<Footballer> goalkeepers;
    private final List<Manager> managers;
    private final List<List> compilationList;
    private int o;
    private int d;
    private double trueOffence;
    private double trueDefence;

    public StartingXI() {
        this.trueOffence = 0;
        this.trueDefence = 0;
        this.o = 0;
        this.d = 0;
        this.strikers = new ArrayList<>();
        this.wingers = new ArrayList<>();
        this.midfielders = new ArrayList<>();
        this.defenders = new ArrayList<>();
        this.fullbacks = new ArrayList<>();
        this.goalkeepers = new ArrayList<>();
        this.managers = new ArrayList<>();

        this.compilationList = new ArrayList<>();
        this.compilationList.add(this.strikers);
        this.compilationList.add(this.wingers);
        this.compilationList.add(this.midfielders);
        this.compilationList.add(this.defenders);
        this.compilationList.add(this.fullbacks);
        this.compilationList.add(this.goalkeepers);
    }

    @Override
    public double calculateTrueOffence() {
        if (o==0) {
            for (Footballer striker: getStrikers()) {
                this.trueOffence = this.trueOffence + (striker.getOffence() * 1.3) + (striker.getIntangibles() * 1.3) + (striker.getLeadership() * 1.1) + (striker.getConsistency() * 1.3);
            }

            for (Footballer winger: getWingers()) {
                this.trueOffence = this.trueOffence + (winger.getOffence() * 1.25) + (winger.getIntangibles() * 1.25) + (winger.getLeadership() * 1.1) + (winger.getConsistency() * 1.3);
            }

            for (Footballer midfielder: getMidfielders()) {
                this.trueOffence = this.trueOffence + (midfielder.getOffence()) + (midfielder.getIntangibles()) + (midfielder.getLeadership()) + (midfielder.getConsistency());
            }

            for (Footballer fullback: getFullbacks()) {
                this.trueOffence = this.trueOffence + (fullback.getOffence() * 0.7) + (fullback.getIntangibles()) + (fullback.getLeadership() * 0.7) + (fullback.getConsistency() * 0.7);
            }

            for (Footballer defender: getDefenders()) {
                this.trueOffence = this.trueOffence + (defender.getOffence() * 0.65) + (defender.getIntangibles() * 0.4) + (defender.getLeadership() * 0.4) + (defender.getConsistency() * 0.4);
            }
            this.o++;

            for (Manager manager: getManagers()) {
                this.trueOffence = this.trueOffence + (manager.getOffence()) + (manager.getLeadership());
            }
        }
        return this.trueOffence;
    }

    @Override
    public double calculateTrueDefence() {
        if (this.d==0) {
            for (Footballer striker: getStrikers()) {
                this.trueDefence = this.trueDefence + (striker.getDefence() * 0.6) + (striker.getIntangibles() * 0.6) + (striker.getLeadership() * 0.6) + (striker.getConsistency() * 0.55);
            }

            for (Footballer winger: getWingers()) {
                this.trueDefence = this.trueDefence + (winger.getDefence() * 0.9) + (winger.getIntangibles() * 0.8) + (winger.getLeadership() * 0.8) + (winger.getConsistency() * 0.7);
            }

            for (Footballer midfielder: getMidfielders()) {
                this.trueDefence = this.trueDefence + (midfielder.getDefence() * 1.1) + (midfielder.getIntangibles()) + (midfielder.getLeadership() * 1.2) + (midfielder.getConsistency() * 1.2);
            }

            for (Footballer fullback: getFullbacks()) {
                this.trueDefence = this.trueDefence + (fullback.getDefence() * 1.3) + (fullback.getIntangibles()) + (fullback.getLeadership() * 1.3) + (fullback.getConsistency() * 1.3);
            }

            for (Footballer defender: getDefenders()) {
                this.trueDefence = this.trueDefence + (defender.getDefence() * 1.65) + (defender.getIntangibles() * 1.5) + (defender.getLeadership() * 1.65) + (defender.getConsistency() * 1.6);
            }

            for (Manager manager: getManagers()) {
                this.trueDefence = this.trueDefence + (manager.getDefence()) + (manager.getLeadership() * 1.2);
            }

            this.d++;
        }
        return this.trueDefence;
    }

    @Override
    public String forwardString() {
        StringBuilder builder = new StringBuilder();
        if (!(getWingers().get(0).getLast() == null)) {
            builder.append(getWingers().get(0).getLast()).append(" / ");
        } else {
            builder.append(getWingers().get(0).getFirst()).append(" / ");
        }

        if (!(getStrikers().get(0).getLast() == null)) {
            builder.append(getStrikers().get(0).getLast()).append(" / ");
        } else {
            builder.append(getStrikers().get(0).getFirst()).append(" / ");
        }

        if (!(getWingers().get(1).getLast() == null)) {
            builder.append(getWingers().get(1).getLast());
        } else {
            builder.append(getWingers().get(1).getFirst());
        }

        return builder.toString();
    }

    @Override
    public String midfieldString() {
        StringBuilder builder = new StringBuilder();
        if (!(getMidfielders().get(0).getLast() == null)) {
            builder.append(getMidfielders().get(0).getLast()).append(" / ");
        } else {
            builder.append(getMidfielders().get(0).getFirst()).append(" / ");
        }

        if (!(getMidfielders().get(1).getLast() == null)) {
            builder.append(getMidfielders().get(1).getLast()).append(" / ");
        } else {
            builder.append(getMidfielders().get(1).getFirst()).append(" / ");
        }

        if (!(getMidfielders().get(2).getLast() == null)) {
            builder.append(getMidfielders().get(2).getLast());
        } else {
            builder.append(getMidfielders().get(2).getFirst());
        }

        return builder.toString();
    }

    @Override
    public String defenceString() {
        StringBuilder builder = new StringBuilder();
        if (!(getFullbacks().get(0).getLast() == null)) {
            builder.append(getFullbacks().get(0).getLast() + " / ");
        } else {
            builder.append(getFullbacks().get(0).getFirst() + " / ");
        }

        if (!(getDefenders().get(0).getLast() == null)) {
            builder.append(getDefenders().get(0).getLast() + " / ");
        } else {
            builder.append(getDefenders().get(0).getFirst() + " / ");
        }

        if (!(getDefenders().get(1).getLast() == null)) {
            builder.append(getDefenders().get(1).getLast() + " / ");
        } else {
            builder.append(getDefenders().get(1).getFirst() + " / ");
        }

        if (!(getFullbacks().get(1).getLast() == null)) {
            builder.append(getFullbacks().get(1).getLast());
        } else {
            builder.append(getFullbacks().get(1).getFirst());
        }
        return builder.toString();
    }

    @Override
    public double getOffence() {
        double sum = 0;
        for (List<Footballer> list: this.compilationList) {
            for (Footballer footballer: list) {
                sum = footballer.getOffence() + sum;
            }
        }
        return sum;
    }

    @Override
    public double getDefence() {
        double sum = 0;
        for (List<Footballer> list: this.compilationList) {
            for (Footballer footballer: list) {
                sum = footballer.getDefence() + sum;
            }
        }
        return sum;
    }

    @Override
    public double getLeadership() {
        double sum = 0;
        for (List<Footballer> list: this.compilationList) {
            for (Footballer footballer: list) {
                sum = footballer.getLeadership() + sum;
            }
        }
        return sum;
    }

    @Override
    public double getIntangibles() {
        double sum = 0;
        for (List<Footballer> list: this.compilationList) {
            for (Footballer footballer: list) {
                sum = footballer.getIntangibles() + sum;
            }
        }
        return sum;
    }

    @Override
    public double getConsistency() {
        double sum = 0;
        for (List<Footballer> list: this.compilationList) {
            for (Footballer footballer: list) {
                sum = footballer.getConsistency() + sum;
            }
        }
        return sum;
    }

    public List<Footballer> getStrikers() {
        return this.strikers;
    }

    public List<Footballer> getWingers() {
        return this.wingers;
    }

    public List<Footballer> getMidfielders() {
        return this.midfielders;
    }

    public List<Footballer> getDefenders() {
        return this.defenders;
    }

    public List<Footballer> getFullbacks() {
        return this.fullbacks;
    }

    public List<Footballer> getGoalkeepers() {
        return this.goalkeepers;
    }

    public List<Manager> getManagers() {
        return this.managers;
    }

    public List<List> getCompilationList() {
        return this.compilationList;
    }

    public double getTrueOffence() {
        return this.trueOffence;
    }

    public double getTrueDefence() {
        return this.trueOffence;
    }

    public Footballer getRandom(int teamIndex, int playerIndex) {
        if (teamIndex == 0) {
            if (playerIndex > 0) {
                playerIndex = 0;
            }
            return this.getStrikers().get(playerIndex);
        } else if (teamIndex == 1) {
            if (playerIndex > 1) {
                playerIndex = 1;
            }
            return this.getWingers().get(playerIndex);
        } else if (teamIndex == 2) {
            return this.getMidfielders().get(playerIndex);
        } else if (teamIndex == 3) {
            if (playerIndex > 1) {
                playerIndex = 1;
            }
            return this.getFullbacks().get(playerIndex);
        } else {
            if (playerIndex > 1) {
                playerIndex = 1;
            }
            return this.getMidfielders().get(playerIndex);
        }
    }

}
