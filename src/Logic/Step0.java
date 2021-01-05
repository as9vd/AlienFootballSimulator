package Logic;

import FootballerAndManager.User;
import Lists.SuperstarSelectionList;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Step0 {

    private Scanner scanner;
    private User user;
    private SuperstarSelectionList superList;

    public Step0(Scanner scanner, User user) {
        this.scanner = scanner;
        this.user = user;
        this.superList = new SuperstarSelectionList();
    }

    public void stepZeroIntro() throws InterruptedException {
        System.out.println("Hello! Welcome to this football management simulation.");
        Thread.sleep(500);
        System.out.println("The Earth is under attack by aliens. To save it from its impending doom, you must win the illustrious McDonald's Cup.");
        Thread.sleep(500);
        System.out.println("You will come up against five teams, each of varying difficulty, and will need to win every single one to save the Earth and win the cup.");
        Thread.sleep(500);
        System.out.println("OK, let's get started! What is your team name?");
        String name = this.scanner.nextLine();
        Thread.sleep(500);
        System.out.println(name + ".. that's amazing.");
        Thread.sleep(500);
        System.out.println("Now, you will get into assembling your team. You have $" + this.user.getMoney() + " and have to purchase an entire starting XI and a manager.");
        Thread.sleep(500);
        System.out.println("Make sure to pace your spending, because that's a total of 12 purchases you'll need to make. Don't purchase six players for $10 and end up with crap $1 players to fill out the rest of your squad.");
        Thread.sleep(500);
        System.out.println("First of all, every top side needs a world-class player to build around. Luckily for you, I've got plenty of those to offer.");
        Thread.sleep(500);
        System.out.println("But as an added twist, I've got the greatest players of all-time for you to choose from. You wanted quality, didn't you?");
        Thread.sleep(500);
        System.out.println("Here's who you can pick from:");
        Thread.sleep(500);
        System.out.println();
        System.out.println(legendShop());
        System.out.println("Which one of these lads are you going to recruit?");
        int num = this.legendPurchase();
        Thread.sleep(500);
        System.out.println(this.legendDescription(num));
    }

    public int legendPurchase() {
        String answer = this.scanner.nextLine();
        while (answer != null) {
            if (answer.toLowerCase().contains("die") || answer.toLowerCase().contains("mar")) {
                this.user.getSquad().getMidfielders().add(this.superList.get(0));
                this.user.takeMoney(15);
                return 1;
            } else if (answer.toLowerCase().contains("pel")) {
                this.user.getSquad().getStrikers().add(this.superList.get(1));
                this.user.takeMoney(15);
                return 2;
            } else if (answer.toLowerCase().contains("geo") || answer.toLowerCase().contains("best") ) {
                this.user.getSquad().getWingers().add(this.superList.get(2));
                this.user.takeMoney(14);
                return 3;
            } else if (answer.toLowerCase().contains("bob") || answer.toLowerCase().contains("cha") ) {
                this.user.getSquad().getMidfielders().add(this.superList.get(3));
                this.user.takeMoney(14);
                return 4;
            } else if (answer.toLowerCase().contains("van") || answer.toLowerCase().contains("bas") ) {
                this.user.getSquad().getStrikers().add(this.superList.get(4));
                this.user.takeMoney(14);
                return 5;
            } else if (answer.toLowerCase().contains("eus")) {
                this.user.getSquad().getStrikers().add(this.superList.get(5));
                this.user.takeMoney(14);
                return 6;
            } else if (answer.toLowerCase().contains("stan") || answer.toLowerCase().contains("mat") ) {
                this.user.getSquad().getWingers().add(this.superList.get(6));
                this.user.takeMoney(14);
                return 7;
            } else if (answer.toLowerCase().contains("zin") || answer.toLowerCase().contains("zid")) {
                this.user.getSquad().getMidfielders().add(this.superList.get(7));
                this.user.takeMoney(14);
                return 8;
            } else {
                System.out.print("Unrecognised player name, try again. Choose your legend: ");
                answer = this.scanner.nextLine();
            }
        }
        return 0;
    }

    public String legendDescription(int number) {
        if (number == 1) {
            return "King Diego! Great choice. He will fit perfectly in your midfield.";
        } else if (number == 2) {
            return "King of the World Cup, Pele! Amazing choice. He will be your starting striker.";
        } else if (number == 3) {
            return "George Best? Amazing choice. He will fit perfectly on your wings.";
        } else if (number == 4) {
            return "Sir Bobby, the greatest English footballer of all time. Amazing choice. He will be your midfield stalwart.";
        } else if (number == 5) {
            return "Van Basten, arguably the best striker of all time. Very good choice. He is your starting striker.";
        } else if (number == 6) {
            return "Eusebio will be your starting striker. Amazing player, built for the big occasions. Excellent choice." ;
        } else if (number == 7) {
            return "The first Ballon D'or winner, Stanley Matthews, will be one of your starting wingers. Great choice.";
        } else {
            return "Zidane, the big game player. Amazing choice. He will be in your midfield.";
        }
    }

    public String legendShop() {
        SuperstarSelectionList list = new SuperstarSelectionList();
        return list.toString();
    }

}
