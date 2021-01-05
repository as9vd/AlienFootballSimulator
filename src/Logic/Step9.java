package Logic;

import FootballerAndManager.User;
import BotTeams.*;

import java.util.Scanner;

public class Step9 extends PurchasingPlayersTemplate {
    private Team1 team1;
    private HeadToHeadTemplate h2h;

    public Step9(Scanner scanner, User user) {
        super(scanner, user);
        this.team1 = new Team1();
        this.h2h = new HeadToHead(super.getUser(), this.team1);
    }

    public void stepNineIntro() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("This is the qualifying round for the cup. Lose this, and not only will you be eliminated already, but the Earth will explode.");
        Thread.sleep(500);
        System.out.println("You cannot bottle this. No chance.");
        Thread.sleep(500);
        System.out.println("The first team you're playing is Brexit Ball Football Club, managed by an alien imitation of Tony Pulis.");
        Thread.sleep(500);
        System.out.println();
        this.team1.teamComposition();
        Thread.sleep(500);
        System.out.print("Ready to face them? ");
        Thread.sleep(500);
        this.team1.readyOrNot(super.getScanner());
        System.out.println();
        Thread.sleep(500);
        this.h2h.startMatch();
    }

    public boolean getVictory() {
        return this.h2h.getVictoryStatus();
    }

}