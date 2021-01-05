package Logic;

import FootballerAndManager.User;

import java.util.Scanner;

public class Step2 extends PurchasingPlayersTemplate {
    public Step2(Scanner scanner, User user) {
        super(scanner, user);
    }

    public void stepTwoIntro() throws InterruptedException {
        if (super.getUser().getSquad().getWingers().size() == 1) {
            super.displayMoney();
            Thread.sleep(500);
            System.out.println("Now, time to buy a second winger.");
            Thread.sleep(500);
            System.out.println("Who would you like to buy to complement " + super.getUser().getSquad().getWingers().get(0) + "?");
            Thread.sleep(500);
            System.out.println();
            System.out.println(wingerShop());
            System.out.print("Choose your winger: ");
            super.wingerPurchase();
            Thread.sleep(500);
            System.out.println("Good choice, my friend. You have two wingers now: " + super.getUser().getSquad().getWingers().get(0) + " and " + super.getUser().getSquad().getWingers().get(1) + ".");
        } else if (super.getUser().getSquad().getWingers().size() == 0) {
            super.displayMoney();
            Thread.sleep(500);
            System.out.println("OK, now that you've already picked a striker, we'll move onto wingers.");
            Thread.sleep(500);
            System.out.println("Which two wingers will you purchase to complete your front-line?");
            Thread.sleep(500);
            System.out.println();
            System.out.println(wingerShop());
            System.out.print("Choose winger one: ");
            super.wingerPurchase();
            Thread.sleep(500);
            System.out.print("Choose winger two: ");
            int w2 = super.wingerPurchase();
            Thread.sleep(500);
            if (w2 == 0) {
                while (true) {
                    System.out.println("Sorry mate, you can't purchase duplicates. Try again.");
                    System.out.print("Choose your second winger: ");
                    w2 = super.wingerPurchase();
                    if (!(w2 == 0)) {
                        break;
                    }
                }
            }
            Thread.sleep(500);
            System.out.println("Good choices, my friend. Your two wingers of choice are " + super.getUser().getSquad().getWingers().get(0) + " and " + super.getUser().getSquad().getWingers().get(1) + ".");
        } else if (super.getUser().getSquad().getWingers().size() == 2) {
            super.displayMoney();
            Thread.sleep(500);
            System.out.println("Now that you have a striker and two wingers in your side, it is time for you to purchase three players to bolster your midfield.");
            Thread.sleep(500);
            System.out.println("Which three would you like to purchase?");
            Thread.sleep(500);
            System.out.println();
            System.out.println(super.midfieldShop());
            System.out.print("Choose midfielder one: ");
            super.midfieldPurchase();
            Thread.sleep(500);
            System.out.print("Choose midfielder two: ");
            Thread.sleep(500);
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
            System.out.print("Choose midfielder three: ");
            Thread.sleep(500);
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
        }
    }
}