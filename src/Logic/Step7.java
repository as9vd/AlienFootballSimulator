package Logic;

import FootballerAndManager.User;

import java.util.Scanner;

public class Step7 extends PurchasingPlayersTemplate {
    public Step7(Scanner scanner, User user) {
        super(scanner, user);
    }

    public void stepSevenIntro() throws InterruptedException {
        if (super.getUser().getSquad().getManagers().size() == 0) {
            super.displayMoney();
            Thread.sleep(500);
            System.out.println("Now, it's time to choose who will manage this team of yours.");
            Thread.sleep(500);
            System.out.println("You have the a mixture of past managers and current managers to choose from.");
            Thread.sleep(500);
            System.out.println("Which one will you pick?");
            Thread.sleep(500);
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