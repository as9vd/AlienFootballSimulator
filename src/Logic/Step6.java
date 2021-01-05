package Logic;

import FootballerAndManager.User;

import java.util.Scanner;

public class Step6 extends PurchasingPlayersTemplate {
    public Step6(Scanner scanner, User user) {
        super(scanner, user);
    }

    public void stepSixIntro() throws InterruptedException {
        if (super.getUser().getSquad().getGoalkeepers().size() == 0) {
            super.displayMoney();
            Thread.sleep(500);
            System.out.println("Now that you've got your full-backs, pick the goalkeeper you trust to man the posts.");
            Thread.sleep(500);
            System.out.println("Which keeper would you like to purchase?");
            Thread.sleep(500);
            System.out.println();
            System.out.println(super.goalkeeperShop());
            Thread.sleep(500);
            System.out.print("Choose your keeper: ");
            int gk = super.goalkeeperPurchase();
            if (gk == 0) {
                while (true) {
                    System.out.println("Sorry mate, you can't purchase a manager and field a full XI if you make this purchase. Try a cheaper alternative.");
                    System.out.print("Choose your keeper: ");
                    gk = super.goalkeeperPurchase();
                    if (!(gk == 0)) {
                        break;
                    }
                }
            }
            Thread.sleep(500);
            System.out.println("Excellent. You finished the playing squad. Your keeper is " + super.getUser().getSquad().getGoalkeepers().get(0) + ".");
        } else if (super.getUser().getSquad().getGoalkeepers().size() == 1) {
            super.displayMoney();
            Thread.sleep(500);
            System.out.println("Now, it's time to choose who will manage this team of yours.");
            Thread.sleep(500);
            System.out.println("You have the a mixture of past managers and current managers to choose from.");
            Thread.sleep(500);
            System.out.println("Which one will you pick?");
            System.out.println();
            System.out.println(super.managerShop());
            Thread.sleep(500);
            System.out.print("Choose your manager: ");
            int m = super.managerPurchase();
            if (m == 0) {
                while (true) {
                    System.out.println("Sorry mate, that's out of your reach. Try a cheaper alternative.");
                    System.out.print("Choose your manager: ");
                    m = super.managerPurchase();
                    if (!(m == 0)) {
                        break;
                    }
                }
            }
            Thread.sleep(500);
            System.out.println("Congrats! " + super.getUser().getSquad().getManagers().get(0) + " will be the manager of your dream team.");
        }
    }
}