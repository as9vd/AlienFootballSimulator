package Logic;

import BotTeams.HeadToHead;
import BotTeams.Team4;
import BotTeams.Team5;
import FootballerAndManager.User;

import java.util.Scanner;

public class Step13 extends PurchasingPlayersTemplate {
    private Team5 team5;
    private HeadToHead h2h;

    public Step13(Scanner scanner, User user) {
        super(scanner, user);
        this.team5 = new Team5();
        this.h2h = new HeadToHead(super.getUser(), this.team5);
    }

    public void stepThirteenIntro() throws InterruptedException {
        System.out.println("This is it. The finale.");
        Thread.sleep(500);
        System.out.println("You've done well to make it this far. You've only got one more opponent to face.");
        Thread.sleep(500);
        System.out.println("Unfortunately for you, this is quite the mighty opponent you'll be facing.");
        Thread.sleep(500);
        System.out.println("I don't wish to be condescending, but good luck. We really need Earth to remain in tact. Just do the best you can.");
        Thread.sleep(500);
        System.out.println("I believe in you.");
        Thread.sleep(500);
        System.out.println("This is the greatest side of all time. No ifs and buts. There is a GOAT in each position, and it's managed by the GOAT of them all, Sir Alex.");
        Thread.sleep(500);
        System.out.println("Here's how they're lining up: ");
        Thread.sleep(500);
        System.out.println();
        this.team5.teamComposition();
        System.out.print("Ready to face your biggest challenge yet? ");
        Thread.sleep(500);
        this.team5.readyOrNot(super.getScanner());
        System.out.println();
        Thread.sleep(500);
        this.h2h.startMatch();
    }

    public boolean getVictory() {
        return this.h2h.getVictoryStatus();
    }

}