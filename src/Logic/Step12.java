package Logic;

import BotTeams.HeadToHead;
import BotTeams.Team4;
import BotTeams.TeamTemplate;
import FootballerAndManager.User;

import java.util.Scanner;

public class Step12 extends PurchasingPlayersTemplate {
    private Team4 team4;
    private HeadToHead h2h;

    public Step12(Scanner scanner, User user) {
        super(scanner, user);
        this.team4 = new Team4();
        this.h2h = new HeadToHead(super.getUser(), this.team4);
    }

    public void stepTwelveIntro() throws InterruptedException {
        System.out.println("Congrats on making the semi-finals!");
        Thread.sleep(500);
        System.out.println("Two matches away from doing the unthinkable. Keep at it, mate.");
        Thread.sleep(500);
        System.out.println("However, let's focus on your upcoming match.");
        Thread.sleep(500);
        System.out.println("You are going to be playing The Strongest, an alien offshoot of the Bolivian club of the same name.");
        Thread.sleep(500);
        System.out.println("They are managed by Johan Cruyff (RIP).");
        Thread.sleep(500);
        System.out.println("Mate, this side lives up to their name. Jesus Christ. There's flair all across the pitch. Good luck, and I mean it.");
        Thread.sleep(500);
        System.out.printf("This is how they're lining up: ");
        Thread.sleep(500);
        System.out.println();
        this.team4.teamComposition();
        Thread.sleep(500);
        System.out.print("Ready to face them? ");
        this.team4.readyOrNot(super.getScanner());
        System.out.println();
        Thread.sleep(500);
        this.h2h.startMatch();
    }

    public boolean getVictory() {
        return this.h2h.getVictoryStatus();
    }
}