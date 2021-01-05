package FootballerAndManager;

import Lists.StartingXI;

public class User {

    private double money;
    private StartingXI squad;

    public User() {
        this.money = 84;
        this.squad = new StartingXI();
    }

    public double getMoney() {
        return this.money;
    }

    public StartingXI getSquad() {
        return this.squad;
    }

    public int staffCount() {
        int sum = this.squad.getMidfielders().size() + this.squad.getWingers().size() + this.squad.getStrikers().size() + this.squad.getDefenders().size() + this.squad.getFullbacks().size() + this.squad.getGoalkeepers().size() + this.squad.getManagers().size();
        return sum;
    }

    public void addMoney(double num) {
        this.money = this.money + num;
    }

    public void takeMoney(double num) {
        this.money = this.money - num;
    }

}
