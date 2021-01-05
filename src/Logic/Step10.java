package Logic;

import BotTeams.HeadToHead;
import BotTeams.Team2;
import FootballerAndManager.User;

import java.util.Scanner;

public class Step10 extends PurchasingPlayersTemplate {
    private Team2 team2;
    private HeadToHead h2h;

    public Step10(Scanner scanner, User user) {
        super(scanner, user);
        this.team2 = new Team2();
        this.h2h = new HeadToHead(super.getUser(), this.team2);
    }

    public void stepTenIntro() throws InterruptedException {
        System.out.println("Round of 16. Now that you're actually in the tournament, you've got genuine competition.");
        Thread.sleep(500);
        System.out.println("Don't expect your opponents to roll over like Brexit Ball Football Club did.");
        Thread.sleep(500);
        System.out.println("Now, your next opponents are Club Atlético Bielsa.");
        Thread.sleep(500);
        System.out.println("This club play beautiful, possession-based football, coupled with a high intensity press.");
        Thread.sleep(500);
        System.out.println("These aliens really enjoyed Bielsa's football, so they resurrected him and gave him the freedom to do what he wished with the team.");Thread.sleep(500);
        Thread.sleep(500);
        System.out.println("Here is the team:");
        Thread.sleep(500);
        System.out.println();
        this.team2.teamComposition();
        System.out.print("Ready to face them? ");
        Thread.sleep(500);
        this.team2.readyOrNot(super.getScanner());
        Thread.sleep(500);
        System.out.println();
        this.h2h.startMatch();
    }

    public boolean getVictory() {
        return this.h2h.getVictoryStatus();
    }
}