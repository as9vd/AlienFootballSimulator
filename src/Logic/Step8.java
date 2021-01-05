package Logic;

import FootballerAndManager.User;

import java.util.Scanner;

public class Step8 extends PurchasingPlayersTemplate {

    public Step8(Scanner scanner, User user) {
        super(scanner, user);
    }

    public void stepEightIntro() throws InterruptedException {
        super.displayMoney();
        Thread.sleep(500);
        System.out.println("You have officially assembled your dream squad. Well done.");
        Thread.sleep(500);
        System.out.println("This is what it looks like: ");
        System.out.println();
        Thread.sleep(500);
        System.out.println(super.getUser().getSquad().managerString());
        System.out.println();
        Thread.sleep(500);
        System.out.println(super.getUser().getSquad().forwardString());
        Thread.sleep(500);
        System.out.println(super.getUser().getSquad().midfieldString());
        Thread.sleep(500);
        System.out.println(super.getUser().getSquad().defenceString());
        Thread.sleep(500);
        System.out.println(super.getUser().getSquad().goalkeeperString());
        Thread.sleep(500);
        System.out.println();
        System.out.println("Solid team! Now, we will test its strength in the cup.");
    }
}