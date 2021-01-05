package Logic;

import FootballerAndManager.User;

import java.util.Scanner;

public class Step4 extends PurchasingPlayersTemplate {
    public Step4(Scanner scanner, User user) {
        super(scanner, user);
    }

    public void stepFourIntro() throws InterruptedException {
        if (super.getUser().getSquad().getDefenders().size() == 0) {
            super.displayMoney();
            Thread.sleep(500);
            System.out.println("Now, onto defenders. You now have to purchase two centre-halves.");
            Thread.sleep(500);
            System.out.println("Which two would you like to purchase?");
            Thread.sleep(500);
            System.out.println();
            System.out.println(super.centerHalfShop());
            System.out.print("Choose defender one: ");
            Thread.sleep(500);
            int c1 = super.centreHalfPurchase();
            if (c1 == 0) {
                while (true) {
                    System.out.println("You can't purchase a manager and field a full XI if you make this purchase.");
                    System.out.println("Try again.");
                    System.out.print("Choose defender one: ");
                    c1 = super.centreHalfPurchase();
                    if (!(c1 == 0)) {
                        break;
                    }
                }
            }
            System.out.print("Choose defender two: ");
            int c2 = super.centreHalfPurchase();
            if (c2 == 0) {
                while (true) {
                    System.out.println("Sorry mate.");
                    System.out.println("Either you can't purchase a manager and field a full XI if you make this purchase, or you're trying to purchase a duplicate. Or maybe both.");
                    System.out.println("Try again.");
                    System.out.print("Choose defender two: ");
                    c2 = super.centreHalfPurchase();
                    if (!(c2 == 0)) {
                        break;
                    }
                }
            }
            Thread.sleep(500);
            System.out.println("Excellent! Your two centre-halves are " + super.getUser().getSquad().getDefenders().get(0) + " and " + super.getUser().getSquad().getDefenders().get(1) + ".");
        } else if (super.getUser().getSquad().getDefenders().size() == 2) {
            super.displayMoney();
            Thread.sleep(500);
            System.out.println("Now that you've got your centre-halves in check, it's time for you to complete your back-line.");
            Thread.sleep(500);
            System.out.println("Which two full-backs would you like to purchase?");
            System.out.println();
            System.out.println(fullBackShop());
            Thread.sleep(500);
            System.out.print("Choose full-back one: ");
            int c1 = super.fullBackPurchase();
            if (c1 == 0) {
                while (true) {
                    System.out.println("Sorry mate.");
                    System.out.println("Either you can't purchase a manager and field a full XI if you make this purchase, or you're trying to purchase a duplicate.");
                    System.out.println("Try again.");
                    System.out.print("Choose full-back one: ");
                    c1 = super.fullBackPurchase();
                    if (!(c1 == 0)) {
                        break;
                    }
                }
            }
            Thread.sleep(500);
            System.out.print("Choose full-back two: ");
            int c2 = super.fullBackPurchase();
            if (c2 == 0) {
                while (true) {
                    System.out.println("Sorry mate.");
                    System.out.println("Either you can't purchase a manager and field a full XI if you make this purchase, or you're trying to purchase a duplicate. Or maybe both.");
                    System.out.println("Try again.");
                    System.out.print("Choose full-back two: ");
                    c2 = super.fullBackPurchase();
                    if (!(c2 == 0)) {
                        break;
                    }
                }
            }
            Thread.sleep(500);
            System.out.println("Grand. Your full-backs are " + super.getUser().getSquad().getFullbacks().get(0) + " and " + super.getUser().getSquad().getFullbacks().get(1) + ".");
        }
    }
}