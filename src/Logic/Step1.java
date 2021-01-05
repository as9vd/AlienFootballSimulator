package Logic;

import FootballerAndManager.User;

import java.util.Scanner;

public class Step1 extends PurchasingPlayersTemplate {
    public Step1(Scanner scanner, User user) {
        super(scanner, user);
    }

    public void stepOneIntro() throws InterruptedException {
        if (super.getUser().getSquad().getStrikers().size() == 1) {
            super.displayMoney();
            Thread.sleep(500);
            System.out.println("OK, now that you've already picked a striker, we'll move onto wingers.");
            Thread.sleep(500);
            System.out.println("Which two wingers will you purchase to complete your front-line?");
            System.out.println();
            System.out.println(wingerShop());
            Thread.sleep(500);
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
        } else if (super.getUser().getSquad().getWingers().size() == 1 || super.getUser().getSquad().getMidfielders().size() == 1) {
            super.displayMoney();
            Thread.sleep(500);
            System.out.println("We'll now move onto your starting striker.");
            Thread.sleep(500);
            System.out.println("Who will you purchase to be your primary goalscorer?");
            System.out.println();
            System.out.println(strikerShop());
            Thread.sleep(500);
            System.out.print("Choose your striker: ");
            strikerPurchase();
            Thread.sleep(500);
            System.out.println("Good choice, my friend. Your striker of choice is " + super.getUser().getSquad().getStrikers().get(0) + ".");
        }
    }
}