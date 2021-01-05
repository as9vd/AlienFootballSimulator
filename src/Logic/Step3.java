package Logic;

import FootballerAndManager.User;

import java.util.Scanner;

public class Step3 extends PurchasingPlayersTemplate {
    public Step3(Scanner scanner, User user) {
        super(scanner, user);
    }

    public void stepThreeIntro() throws InterruptedException {
        if (super.getUser().getSquad().getMidfielders().size() == 0) {
            super.displayMoney();
            Thread.sleep(500);
            System.out.println("Now that you have a striker and two wingers in your side, it is time for you to purchase three players to bolster your midfield.");
            Thread.sleep(500);
            System.out.println("Which three would you like to purchase?");
            System.out.println();
            Thread.sleep(500);
            System.out.println(super.midfieldShop());
            Thread.sleep(500);
            System.out.print("Choose midfielder one: ");
            super.midfieldPurchase();
            Thread.sleep(500);
            System.out.print("Choose midfielder two: ");
            int m2 = super.midfieldPurchase();
            if (m2 == 0) {
                while (true) {
                    System.out.println("Sorry mate, you can't purchase duplicates. Try again.");
                    System.out.print("Choose your second midfielder: ");
                    m2 = super.midfieldPurchase();
                    if (!(m2 == 0)) {
                        break;
                    }
                }
            }
            Thread.sleep(500);
            System.out.print("Choose midfielder three: ");
            int m3 = super.midfieldPurchase();
            if (m3 == 0) {
                while (true) {
                    System.out.println("Sorry mate, you can't purchase duplicates. Try again.");
                    System.out.print("Choose your third midfielder: ");
                    m3 = super.midfieldPurchase();
                    if (!(m3 == 0)) {
                        break;
                    }
                }
            }
            Thread.sleep(500);
            System.out.println("Good choices, my friend. Your three midfielders of choice are " + super.getUser().getSquad().getMidfielders().get(0) + ", " + super.getUser().getSquad().getMidfielders().get(1) + ", and " + super.getUser().getSquad().getMidfielders().get(2) + ".");
        } else if (super.getUser().getSquad().getMidfielders().size() == 1) {
            super.displayMoney();
            Thread.sleep(500);
            System.out.println("Now that you've got your wingers, fill out the rest of your midfield. You can purchase two more midfielders.");
            Thread.sleep(500);
            System.out.println("Which two would you like to purchase?");
            System.out.println();
            System.out.println(super.midfieldShop());
            Thread.sleep(500);
            System.out.print("Choose midfielder one: ");
            super.midfieldPurchase();
            System.out.print("Choose midfielder two: ");
            int m2 = super.midfieldPurchase();
            if (m2 == 0) {
                while (true) {
                    System.out.println("Sorry mate, you can't purchase duplicates. Try again.");
                    System.out.print("Choose your second midfielder: ");
                    m2 = super.midfieldPurchase();
                    if (!(m2 == 0)) {
                        break;
                    }
                }
            }
            Thread.sleep(500);
            System.out.println("Good choices, my friend. You've got three midfielders now: " + super.getUser().getSquad().getMidfielders().get(0) + ", " + super.getUser().getSquad().getMidfielders().get(1) + ", and " + super.getUser().getSquad().getMidfielders().get(2) + ".");
        } else if (super.getUser().getSquad().getMidfielders().size() == 3) {
            super.displayMoney();
            Thread.sleep(500);
            System.out.println("Now, onto defenders. You now have to purchase two centre-halves.");
            Thread.sleep(500);
            System.out.println("Which two would you like to purchase?");
            System.out.println();
            Thread.sleep(500);
            System.out.println(super.centerHalfShop());
            Thread.sleep(500);
            System.out.print("Choose defender one: ");
            int c1 = super.centreHalfPurchase();
            if (c1 == 0) {
                while (true) {
                    System.out.println("Sorry mate.");
                    System.out.println("Either you can't purchase a manager and field a full XI if you make this purchase, or you're trying to purchase a duplicate.");
                    System.out.println("Try again.");
                    System.out.print("Choose defender one: ");
                    c1 = super.centreHalfPurchase();
                    if (!(c1 == 0)) {
                        break;
                    }
                }
            }
            System.out.print("Choose defender two: ");
            Thread.sleep(500);
            int c2 = super.centreHalfPurchase();
            if (c2 == 0) {
                while (true) {
                    System.out.println("Sorry mate.");
                    System.out.println("Either you can't purchase a manager and field a full XI if you make this purchase, or you're trying to purchase a duplicate.");
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
        }
    }
}