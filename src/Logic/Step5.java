package Logic;

import FootballerAndManager.User;

import java.util.Scanner;

public class Step5 extends PurchasingPlayersTemplate {
    public Step5(Scanner scanner, User user) {
        super(scanner, user);
    }

    public void stepFiveIntro() throws InterruptedException {
        if (super.getUser().getSquad().getFullbacks().size() == 0) {
            super.displayMoney();
            Thread.sleep(500);
            System.out.println("Now that you've got your centre-halves in check, it's time for you to complete your back-line.");
            Thread.sleep(500);
            System.out.println("Which two full-backs would you like to purchase?");
            Thread.sleep(500);
            System.out.println();
            System.out.println(super.fullBackShop());
            Thread.sleep(500);
            System.out.print("Choose full-back one: ");
            int f1 = super.fullBackPurchase();
            if (f1 == 0) {
                while (true) {
                    System.out.println("Sorry mate, you can't purchase a manager and field a full XI if you make this purchase. Try a cheaper alternative.");
                    System.out.print("Choose full-back one: ");
                    f1 = super.fullBackPurchase();
                    if (!(f1 == 0)) {
                        break;
                    }
                }
            }
            Thread.sleep(500);
            System.out.print("Choose full-back two: ");
            int f2 = super.fullBackPurchase();
            if (f2 == 0) {
                while (true) {
                    System.out.println("Sorry mate.");
                    System.out.println("Either you can't purchase a manager and field a full XI if you make this purchase, or you're trying to purchase a duplicate. Or maybe both.");
                    System.out.println("Try again.");
                    System.out.print("Choose full-back two: ");
                    f2 = super.fullBackPurchase();
                    if (!(f2 == 0)) {
                        break;
                    }
                }
            }
            Thread.sleep(500);
            System.out.println("Grand. Your full-backs are " + super.getUser().getSquad().getFullbacks().get(0) + " and " + super.getUser().getSquad().getFullbacks().get(1) + ".");
        } else if (super.getUser().getSquad().getFullbacks().size() == 2) {
            super.displayMoney();
            Thread.sleep(500);
            System.out.println("Now that you've got your full-backs, pick the goalkeeper you trust to man the posts.");
            Thread.sleep(500);
            System.out.println("Which keeper would you like to purchase?");
            Thread.sleep(500);
            System.out.println();
            System.out.println(super.goalkeeperShop());
            System.out.print("Choose your keeper: ");
            Thread.sleep(500);
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
        }
    }
}
