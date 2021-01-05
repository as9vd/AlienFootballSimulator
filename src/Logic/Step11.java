package Logic;

import BotTeams.HeadToHead;
import BotTeams.HeadToHeadTemplate;
import BotTeams.Team3;
import FootballerAndManager.User;

import java.util.Scanner;

public class Step11 extends PurchasingPlayersTemplate {
    private Team3 team3;
    private HeadToHeadTemplate h2h;

    public Step11(Scanner scanner, User user) {
        super(scanner, user);
        this.team3 = new Team3();
        this.h2h = new HeadToHead(super.getUser(), this.team3);
    }

    public void stepElevenIntro() throws InterruptedException {
        System.out.println("Quarter-finals! How exciting! Win three more matches, and the Earth is saved! Keep going, king.");
        Thread.sleep(500);
        System.out.println("The team you'll be facing is Africa's Best Ever XI. Now the competition gets really tough.");
        Thread.sleep(500);
        System.out.println("Every position is stacked. This will be a difficult match.");
        Thread.sleep(500);
        System.out.println("In addition, they're managed by Carlos Quieroz. Hope Roy Keane doesn't hear about this, else he might explode.");
        Thread.sleep(500);
        System.out.println("Here's their team:");
        Thread.sleep(500);
        System.out.println();
        this.team3.teamComposition();
        System.out.print("Ready to face them? ");
        Thread.sleep(500);
        this.team3.readyOrNot(super.getScanner());
        Thread.sleep(500);
        System.out.println();
        this.h2h.startMatch();
    }

    public boolean getVictory() {
        return this.h2h.getVictoryStatus();
    }
}
