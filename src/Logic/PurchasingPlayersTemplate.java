package Logic;

import FootballerAndManager.Footballer;
import FootballerAndManager.User;
import Lists.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public abstract class PurchasingPlayersTemplate {

    private User user;
    private Scanner scanner;
    private SuperstarSelectionList superList;
    private ForwardSelectionList strikerList;
    private WingerSelectionList wingerList;
    private MidfieldSelectionList midfieldList;
    private CentreHalfSelectionList centreHalfList;
    private FullBackSelectionList fullBackList;
    private GoalkeeperSelectionList goalkeeperList;
    private ManagerSelectionList managerList;
    private ArrayList<List<Footballer>> compilation;

    public PurchasingPlayersTemplate(Scanner scanner, User user) {
        this.user = user;
        this.scanner = scanner;
        this.superList = new SuperstarSelectionList();
        this.strikerList = new ForwardSelectionList();
        this.wingerList = new WingerSelectionList();
        this.midfieldList = new MidfieldSelectionList();
        this.centreHalfList = new CentreHalfSelectionList();
        this.fullBackList = new FullBackSelectionList();
        this.goalkeeperList = new GoalkeeperSelectionList();
        this.managerList = new ManagerSelectionList();
    }

    public void displayMoney() {
        System.out.println("You currently have $" + this.user.getMoney() + " left to spend.");
    }

    public boolean moneyCheck(double fee) {
        if (((this.user.getMoney() - fee)/(12 - this.user.staffCount())) < 1) {
            return false;
        }
        return true;
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
            } else if (answer.toLowerCase().contains("geo") || answer.toLowerCase().contains("best")) {
                this.user.getSquad().getWingers().add(this.superList.get(2));
                this.user.takeMoney(14);
                return 3;
            } else if (answer.toLowerCase().contains("bob") || answer.toLowerCase().contains("cha")) {
                this.user.getSquad().getMidfielders().add(this.superList.get(3));
                this.user.takeMoney(14);
                return 4;
            } else if (answer.toLowerCase().contains("van") || answer.toLowerCase().contains("bas")) {
                this.user.getSquad().getStrikers().add(this.superList.get(4));
                this.user.takeMoney(14);
                return 5;
            } else if (answer.toLowerCase().contains("eus")) {
                this.user.getSquad().getStrikers().add(this.superList.get(5));
                this.user.takeMoney(14);
                return 6;
            } else if (answer.toLowerCase().contains("stan") || answer.toLowerCase().contains("mat")) {
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

    public int strikerPurchase(){
        String name = this.scanner.nextLine();
        while (name != null) {
            if (name.toLowerCase().contains("cris") || name.toLowerCase().contains("rona")) {
                this.user.getSquad().getStrikers().add(this.strikerList.get(0));
                this.user.takeMoney(this.strikerList.get(0).getPrice());
                return 1;
            } else if (name.toLowerCase().contains("robe") || name.toLowerCase().contains("lewa")) {
                this.user.getSquad().getStrikers().add(this.strikerList.get(1));
                this.user.takeMoney(this.strikerList.get(1).getPrice());
                return 2;
            } else if (name.toLowerCase().contains("kyli") || name.toLowerCase().contains("mba")) {
                this.user.getSquad().getStrikers().add(this.strikerList.get(2));
                this.user.takeMoney(this.strikerList.get(2).getPrice());
                return 3;
            } else if (name.toLowerCase().contains("lui") || name.toLowerCase().contains("suar")) {
                this.user.getSquad().getStrikers().add(this.strikerList.get(3));
                this.user.takeMoney(this.strikerList.get(3).getPrice());
                return 4;
            } else if (name.toLowerCase().contains("erl") || name.toLowerCase().contains("haal")) {
                this.user.getSquad().getStrikers().add(this.strikerList.get(4));
                this.user.takeMoney(this.strikerList.get(4).getPrice());
                return 5;
            } else if (name.toLowerCase().contains("jam") || name.toLowerCase().contains("var")) {
                this.user.getSquad().getStrikers().add(this.strikerList.get(5));
                this.user.takeMoney(this.strikerList.get(5).getPrice());
                return 6;
            } else if (name.toLowerCase().contains("cir") || name.toLowerCase().contains("immo")) {
                this.user.getSquad().getStrikers().add(this.strikerList.get(6));
                this.user.takeMoney(this.strikerList.get(6).getPrice());
                return 7;
            } else if (name.toLowerCase().contains("timo") || name.toLowerCase().contains("wern")) {
                this.user.getSquad().getStrikers().add(this.strikerList.get(7));
                this.user.takeMoney(this.strikerList.get(7).getPrice());
                return 8;
            } else if (name.toLowerCase().contains("raul") || name.toLowerCase().contains("jime")) {
                this.user.getSquad().getStrikers().add(this.strikerList.get(8));
                this.user.takeMoney(this.strikerList.get(8).getPrice());
                return 9;
            } else if (name.toLowerCase().contains("gabr") || name.toLowerCase().contains("jes")) {
                this.user.getSquad().getStrikers().add(this.strikerList.get(9));
                this.user.takeMoney(this.strikerList.get(9).getPrice());
                return 10;
            } else if (name.toLowerCase().contains("anth") || name.toLowerCase().contains("mart")) {
                this.user.getSquad().getStrikers().add(this.strikerList.get(10));
                this.user.takeMoney(this.strikerList.get(10).getPrice());
                return 11;
            } else if (name.toLowerCase().contains("alva") || name.toLowerCase().contains("mora")) {
                this.user.getSquad().getStrikers().add(this.strikerList.get(11));
                this.user.takeMoney(this.strikerList.get(11).getPrice());
                return 12;
            } else if (name.toLowerCase().contains("domin") || name.toLowerCase().contains("calv")) {
                this.user.getSquad().getStrikers().add(this.strikerList.get(12));
                this.user.takeMoney(this.strikerList.get(12).getPrice());
                return 13;
            } else if (name.toLowerCase().contains("andre") || name.toLowerCase().contains("silv")) {
                this.user.getSquad().getStrikers().add(this.strikerList.get(13));
                this.user.takeMoney(this.strikerList.get(13).getPrice());
                return 14;
            } else if (name.toLowerCase().contains("alex") || name.toLowerCase().contains("sanc")) {
                this.user.getSquad().getStrikers().add(this.strikerList.get(14));
                this.user.takeMoney(this.strikerList.get(14).getPrice());
                return 15;
            } else if (name.toLowerCase().contains("call") || name.toLowerCase().contains("wils")) {
                this.user.getSquad().getStrikers().add(this.strikerList.get(15));
                this.user.takeMoney(this.strikerList.get(15).getPrice());
                return 16;
            } else if (name.toLowerCase().contains("mich") || name.toLowerCase().contains("bats")) {
                this.user.getSquad().getStrikers().add(this.strikerList.get(16));
                this.user.takeMoney(this.strikerList.get(16).getPrice());
                return 17;
            } else if (name.toLowerCase().contains("isl") || name.toLowerCase().contains("slim")) {
                this.user.getSquad().getStrikers().add(this.strikerList.get(17));
                this.user.takeMoney(this.strikerList.get(17).getPrice());
                return 18;
            } else if (name.toLowerCase().contains("tro") || name.toLowerCase().contains("dee")) {
                this.user.getSquad().getStrikers().add(this.strikerList.get(18));
                this.user.takeMoney(this.strikerList.get(18).getPrice());
                return 19;
            } else if (name.toLowerCase().contains("rud") || name.toLowerCase().contains("gest")) {
                this.user.getSquad().getStrikers().add(this.strikerList.get(19));
                this.user.takeMoney(this.strikerList.get(19).getPrice());
                return 20;
            } else if (name.toLowerCase().contains("oli") || name.toLowerCase().contains("mcbu")) {
                this.user.getSquad().getStrikers().add(this.strikerList.get(20));
                this.user.takeMoney(this.strikerList.get(20).getPrice());
                return 21;
            } else if (name.toLowerCase().contains("andy") || name.toLowerCase().contains("carr")) {
                this.user.getSquad().getStrikers().add(this.strikerList.get(21));
                this.user.takeMoney(this.strikerList.get(21).getPrice());
                return 22;
            } else {
                System.out.print("Unrecognised player name, try again. Choose your striker: ");
                name = this.scanner.nextLine();
            }
        }
        return 0;
    }

    public int wingerPurchase() {
        String name = this.scanner.nextLine();
        while (name != null) {
            if (name.toLowerCase().contains("lio") || name.toLowerCase().contains("mess")) {
                if (wingerCheck(0) == false) {
                    return 0;
                }
                this.user.getSquad().getWingers().add(this.wingerList.get(0));
                this.user.takeMoney(this.wingerList.get(0).getPrice());
                return 1;
            } else if (name.toLowerCase().contains("ney")) {
                if (wingerCheck(1) == false) {
                    return 0;
                }
                this.user.getSquad().getWingers().add(this.wingerList.get(1));
                this.user.takeMoney(this.wingerList.get(1).getPrice());
                return 2;
            } else if (name.toLowerCase().contains("moh") || name.toLowerCase().contains("sal")) {
                if (wingerCheck(2) == false) {
                    return 0;
                }
                this.user.getSquad().getWingers().add(this.wingerList.get(2));
                this.user.takeMoney(this.wingerList.get(2).getPrice());
                return 3;
            } else if (name.toLowerCase().contains("sad") || name.toLowerCase().contains("man")) {
                if (wingerCheck(3) == false) {
                    return 0;
                }
                this.user.getSquad().getWingers().add(this.wingerList.get(3));
                this.user.takeMoney(this.wingerList.get(3).getPrice());
                return 4;
            } else if (name.toLowerCase().contains("ede") || name.toLowerCase().contains("haz")) {
                if (wingerCheck(4) == false) {
                    return 0;
                }
                this.user.getSquad().getWingers().add(this.wingerList.get(4));
                this.user.takeMoney(this.wingerList.get(4).getPrice());
                return 5;
            } else if (name.toLowerCase().contains("rah") || name.toLowerCase().contains("ster")) {
                if (wingerCheck(5) == false) {
                    return 0;
                }
                this.user.getSquad().getWingers().add(this.wingerList.get(5));
                this.user.takeMoney(this.wingerList.get(5).getPrice());
                return 6;
            } else if (name.toLowerCase().contains("marc") || name.toLowerCase().contains("rash")) {
                if (wingerCheck(6) == false) {
                    return 0;
                }
                this.user.getSquad().getWingers().add(this.wingerList.get(6));
                this.user.takeMoney(this.wingerList.get(6).getPrice());
                return 7;
            } else if (name.toLowerCase().contains("lore") || name.toLowerCase().contains("insi")) {
                if (wingerCheck(7) == false) {
                    return 0;
                }
                this.user.getSquad().getWingers().add(this.wingerList.get(7));
                this.user.takeMoney(this.wingerList.get(7).getPrice());
                return 8;
            } else if (name.toLowerCase().contains("ous") || name.toLowerCase().contains("dem")) {
                if (wingerCheck(8) == false) {
                    return 0;
                }
                this.user.getSquad().getWingers().add(this.wingerList.get(8));
                this.user.takeMoney(this.wingerList.get(8).getPrice());
                return 9;
            } else if (name.toLowerCase().contains("gar") || name.toLowerCase().contains("bal")) {
                if (wingerCheck(9) == false) {
                    return 0;
                }
                this.user.getSquad().getWingers().add(this.wingerList.get(9));
                this.user.takeMoney(this.wingerList.get(9).getPrice());
                return 10;
            } else if (name.toLowerCase().contains("thom") || name.toLowerCase().contains("lem")) {
                if (wingerCheck(10) == false) {
                    return 0;
                }
                this.user.getSquad().getWingers().add(this.wingerList.get(10));
                this.user.takeMoney(this.wingerList.get(10).getPrice());
                return 11;
            } else if (name.toLowerCase().contains("luca") || name.toLowerCase().contains("vaz")) {
                if (wingerCheck(11) == false) {
                    return 0;
                }
                this.user.getSquad().getWingers().add(this.wingerList.get(11));
                this.user.takeMoney(this.wingerList.get(11).getPrice());
                return 12;
            } else if (name.toLowerCase().contains("andr") || name.toLowerCase().contains("tow")) {
                if (wingerCheck(12) == false) {
                    return 0;
                }
                this.user.getSquad().getWingers().add(this.wingerList.get(12));
                this.user.takeMoney(this.wingerList.get(12).getPrice());
                return 13;
            } else if (name.toLowerCase().contains("dani") || name.toLowerCase().contains("jam")) {
                if (wingerCheck(13) == false) {
                    return 0;
                }
                this.user.getSquad().getWingers().add(this.wingerList.get(13));
                this.user.takeMoney(this.wingerList.get(13).getPrice());
                return 14;
            } else if (name.toLowerCase().contains("dema") || name.toLowerCase().contains("gra")) {
                if (wingerCheck(14) == false) {
                    return 0;
                }
                this.user.getSquad().getWingers().add(this.wingerList.get(14));
                this.user.takeMoney(this.wingerList.get(14).getPrice());
                return 15;
            } else if (name.toLowerCase().contains("aar") || name.toLowerCase().contains("lenn")) {
                if (wingerCheck(15) == false) {
                    return 0;
                }
                this.user.getSquad().getWingers().add(this.wingerList.get(15));
                this.user.takeMoney(this.wingerList.get(15).getPrice());
                return 16;
            } else if (name.toLowerCase().contains("ard") || name.toLowerCase().contains("tura")) {
                if (wingerCheck(16) == false) {
                    return 0;
                }
                this.user.getSquad().getWingers().add(this.wingerList.get(16));
                this.user.takeMoney(this.wingerList.get(16).getPrice());
                return 17;
            } else {
                System.out.print("Unrecognised player name, try again. Choose your winger: ");
                name = this.scanner.nextLine();
            }
        }
        return 0;
    }

    public int midfieldPurchase() {
        String name = this.scanner.nextLine();
        while (name != null) {
            if (name.toLowerCase().contains("kev") || name.toLowerCase().contains("bruyne")) {
                if (midfieldCheck(0) == false) {
                    return 0;
                }
                this.user.getSquad().getMidfielders().add(this.midfieldList.get(0));
                this.user.takeMoney(this.midfieldList.get(0).getPrice());
                return 1;
            } else if (name.toLowerCase().contains("ton") || name.toLowerCase().contains("kro")) {
                if (midfieldCheck(1) == false) {
                    return 0;
                }
                this.user.getSquad().getMidfielders().add(this.midfieldList.get(1));
                this.user.takeMoney(this.midfieldList.get(1).getPrice());
                return 2;
            } else if (name.toLowerCase().contains("bruno") || name.toLowerCase().contains("fern")) {
                if (midfieldCheck(2) == false) {
                    return 0;
                }
                this.user.getSquad().getMidfielders().add(this.midfieldList.get(2));
                this.user.takeMoney(this.midfieldList.get(2).getPrice());
                return 3;
            } else if (name.toLowerCase().contains("luk") || name.toLowerCase().contains("modr")) {
                if (midfieldCheck(3) == false) {
                    return 0;
                }
                this.user.getSquad().getMidfielders().add(this.midfieldList.get(3));
                this.user.takeMoney(this.midfieldList.get(3).getPrice());
                return 4;
            } else if (name.toLowerCase().contains("pau") || name.toLowerCase().contains("pog")) {
                if (midfieldCheck(4) == false) {
                    return 0;
                }
                this.user.getSquad().getMidfielders().add(this.midfieldList.get(4));
                this.user.takeMoney(this.midfieldList.get(4).getPrice());
                return 5;
            } else if (name.toLowerCase().contains("marco") || name.toLowerCase().contains("ver")) {
                if (midfieldCheck(5) == false) {
                    return 0;
                }
                this.user.getSquad().getMidfielders().add(this.midfieldList.get(5));
                this.user.takeMoney(this.midfieldList.get(5).getPrice());
                return 6;
            } else if (name.toLowerCase().contains("david") || name.toLowerCase().contains("silv")) {
                if (midfieldCheck(6) == false) {
                    return 0;
                }
                this.user.getSquad().getMidfielders().add(this.midfieldList.get(6));
                this.user.takeMoney(this.midfieldList.get(6).getPrice());
                return 7;
            } else if (name.toLowerCase().contains("fren") || name.toLowerCase().contains("jon")) {
                if (midfieldCheck(7) == false) {
                    return 0;
                }
                this.user.getSquad().getMidfielders().add(this.midfieldList.get(7));
                this.user.takeMoney(this.midfieldList.get(7).getPrice());
                return 8;
            } else if (name.toLowerCase().contains("leo") || name.toLowerCase().contains("gor")) {
                if (midfieldCheck(8) == false) {
                    return 0;
                }
                this.user.getSquad().getMidfielders().add(this.midfieldList.get(8));
                this.user.takeMoney(this.midfieldList.get(8).getPrice());
                return 9;
            } else if (name.toLowerCase().contains("geo") || name.toLowerCase().contains("wij")) {
                if (midfieldCheck(9) == false) {
                    return 0;
                }
                this.user.getSquad().getMidfielders().add(this.midfieldList.get(9));
                this.user.takeMoney(this.midfieldList.get(9).getPrice());
                return 10;
            } else if (name.toLowerCase().contains("marcel") || name.toLowerCase().contains("broz")) {
                if (midfieldCheck(10) == false) {
                    return 0;
                }
                this.user.getSquad().getMidfielders().add(this.midfieldList.get(10));
                this.user.takeMoney(this.midfieldList.get(10).getPrice());
                return 11;
            } else if (name.toLowerCase().contains("luca") || name.toLowerCase().contains("lei")) {
                if (midfieldCheck(11) == false) {
                    return 0;
                }
                this.user.getSquad().getMidfielders().add(this.midfieldList.get(11));
                this.user.takeMoney(this.midfieldList.get(11).getPrice());
                return 12;
            } else if (name.toLowerCase().contains("jorg")) {
                if (midfieldCheck(12) == false) {
                    return 0;
                }
                this.user.getSquad().getMidfielders().add(this.midfieldList.get(12));
                this.user.takeMoney(this.midfieldList.get(12).getPrice());
                return 13;
            } else if (name.toLowerCase().contains("bla") || name.toLowerCase().contains("matu")) {
                if (midfieldCheck(13) == false) {
                    return 0;
                }
                this.user.getSquad().getMidfielders().add(this.midfieldList.get(13));
                this.user.takeMoney(this.midfieldList.get(13).getPrice());
                return 14;
            } else if (name.toLowerCase().contains("mart") || name.toLowerCase().contains("roo")) {
                if (midfieldCheck(14) == false) {
                    return 0;
                }
                this.user.getSquad().getMidfielders().add(this.midfieldList.get(14));
                this.user.takeMoney(this.midfieldList.get(14).getPrice());
                return 15;
            } else if (name.toLowerCase().contains("andr") || name.toLowerCase().contains("pere")) {
                if (midfieldCheck(15) == false) {
                    return 0;
                }
                this.user.getSquad().getMidfielders().add(this.midfieldList.get(15));
                this.user.takeMoney(this.midfieldList.get(15).getPrice());
                return 16;
            } else if (name.toLowerCase().contains("harr") || name.toLowerCase().contains("win")) {
                if (midfieldCheck(16) == false) {
                    return 0;
                }
                this.user.getSquad().getMidfielders().add(this.midfieldList.get(16));
                this.user.takeMoney(this.midfieldList.get(16).getPrice());
                return 17;
            } else if (name.toLowerCase().contains("yan") || name.toLowerCase().contains("vil")) {
                if (midfieldCheck(17) == false) {
                    return 0;
                }
                this.user.getSquad().getMidfielders().add(this.midfieldList.get(17));
                this.user.takeMoney(this.midfieldList.get(17).getPrice());
                return 18;
            } else if (name.toLowerCase().contains("ash") || name.toLowerCase().contains("wes")) {
                if (midfieldCheck(18) == false) {
                    return 0;
                }
                this.user.getSquad().getMidfielders().add(this.midfieldList.get(18));
                this.user.takeMoney(this.midfieldList.get(18).getPrice());
                return 19;
            } else if (name.toLowerCase().contains("jac") || name.toLowerCase().contains("cor")) {
                if (midfieldCheck(19) == false) {
                    return 0;
                }
                this.user.getSquad().getMidfielders().add(this.midfieldList.get(19));
                this.user.takeMoney(this.midfieldList.get(19).getPrice());
                return 20;
            } else if (name.toLowerCase().contains("mark") || name.toLowerCase().contains("nob")) {
                if (midfieldCheck(20) == false) {
                    return 0;
                }
                this.user.getSquad().getMidfielders().add(this.midfieldList.get(20));
                this.user.takeMoney(this.midfieldList.get(20).getPrice());
                return 21;
            } else if (name.toLowerCase().contains("sco") || name.toLowerCase().contains("brow")) {
                if (midfieldCheck(21) == false) {
                    return 0;
                }
                this.user.getSquad().getMidfielders().add(this.midfieldList.get(21));
                this.user.takeMoney(this.midfieldList.get(21).getPrice());
                return 22;
            } else {
                System.out.print("Unrecognised player name, try again. Choose your midfielder: ");
                name = this.scanner.nextLine();
            }
        }
        return 0;
    }

    public int centreHalfPurchase() {
        String name = this.scanner.nextLine();
        while (name != null) {
            if (name.toLowerCase().contains("virg") || name.toLowerCase().contains("van")) {
                if (!(moneyCheck(this.centreHalfList.get(0).getPrice())) || (centreHalfCheck(0) == false)) {
                    return 0;
                }
                this.user.getSquad().getDefenders().add(this.centreHalfList.get(0));
                this.user.takeMoney(this.centreHalfList.get(0).getPrice());
                return 1;
            } else if (name.toLowerCase().contains("serg") || name.toLowerCase().contains("ram")) {
                if (!(moneyCheck(this.centreHalfList.get(1).getPrice())) || (centreHalfCheck(1) == false)) {
                    return 0;
                }
                this.user.getSquad().getDefenders().add(this.centreHalfList.get(1));
                this.user.takeMoney(this.centreHalfList.get(1).getPrice());
                return 2;
            } else if (name.toLowerCase().contains("kal") || name.toLowerCase().contains("koul")) {
                if (!(moneyCheck(this.centreHalfList.get(2).getPrice())) || (centreHalfCheck(2) == false)) {
                    return 0;
                }
                this.user.getSquad().getDefenders().add(this.centreHalfList.get(2));
                this.user.takeMoney(this.centreHalfList.get(2).getPrice());
                return 3;
            } else if (name.toLowerCase().contains("gera") || name.toLowerCase().contains("piq")) {
                if (!(moneyCheck(this.centreHalfList.get(3).getPrice())) || (centreHalfCheck(3) == false)) {
                    return 0;
                }
                this.user.getSquad().getDefenders().add(this.centreHalfList.get(3));
                this.user.takeMoney(this.centreHalfList.get(3).getPrice());
                return 4;
            } else if (name.toLowerCase().contains("gio") || name.toLowerCase().contains("chie")) {
                if (!(moneyCheck(this.centreHalfList.get(4).getPrice())) || (centreHalfCheck(4) == false)) {
                    return 0;
                }
                this.user.getSquad().getDefenders().add(this.centreHalfList.get(4));
                this.user.takeMoney(this.centreHalfList.get(4).getPrice());
                return 5;
            } else if (name.toLowerCase().contains("raph") || name.toLowerCase().contains("vara")) {
                if (!(moneyCheck(this.centreHalfList.get(5).getPrice())) || (centreHalfCheck(5) == false)) {
                    return 0;
                }
                this.user.getSquad().getDefenders().add(this.centreHalfList.get(5));
                this.user.takeMoney(this.centreHalfList.get(5).getPrice());
                return 6;
            } else if (name.toLowerCase().contains("harr") || name.toLowerCase().contains("mag")) {
                if (!(moneyCheck(this.centreHalfList.get(6).getPrice())) || (centreHalfCheck(6) == false)) {
                    return 0;
                }
                this.user.getSquad().getDefenders().add(this.centreHalfList.get(6));
                this.user.takeMoney(this.centreHalfList.get(6).getPrice());
                return 7;
            } else if (name.toLowerCase().contains("marq")) {
                if (!(moneyCheck(this.centreHalfList.get(7).getPrice())) || (centreHalfCheck(7) == false)) {
                    return 0;
                }
                this.user.getSquad().getDefenders().add(this.centreHalfList.get(7));
                this.user.takeMoney(this.centreHalfList.get(7).getPrice());
                return 8;
            } else if (name.toLowerCase().contains("joe") || name.toLowerCase().contains("mat")) {
                if (!(moneyCheck(this.centreHalfList.get(8).getPrice())) || (centreHalfCheck(8) == false)) {
                    return 0;
                }
                this.user.getSquad().getDefenders().add(this.centreHalfList.get(8));
                this.user.takeMoney(this.centreHalfList.get(8).getPrice());
                return 9;
            } else if (name.toLowerCase().contains("kur") || name.toLowerCase().contains("zou")) {
                if (!(moneyCheck(this.centreHalfList.get(9).getPrice())) || (centreHalfCheck(9) == false)) {
                    return 0;
                }
                this.user.getSquad().getDefenders().add(this.centreHalfList.get(9));
                this.user.takeMoney(this.centreHalfList.get(9).getPrice());
                return 10;
            } else if (name.toLowerCase().contains("ede") || name.toLowerCase().contains("mil")) {
                if (!(moneyCheck(this.centreHalfList.get(10).getPrice())) || (centreHalfCheck(10) == false)) {
                    return 0;
                }
                this.user.getSquad().getDefenders().add(this.centreHalfList.get(10));
                this.user.takeMoney(this.centreHalfList.get(10).getPrice());
                return 11;
            } else if (name.toLowerCase().contains("davin") || name.toLowerCase().contains("sanc")) {
                if (!(moneyCheck(this.centreHalfList.get(11).getPrice())) || (centreHalfCheck(11) == false)) {
                    return 0;
                }
                this.user.getSquad().getDefenders().add(this.centreHalfList.get(11));
                this.user.takeMoney(this.centreHalfList.get(11).getPrice());
                return 12;
            } else if (name.toLowerCase().contains("wil") || name.toLowerCase().contains("bol")) {
                if (!(moneyCheck(this.centreHalfList.get(12).getPrice())) || (centreHalfCheck(12) == false)) {
                    return 0;
                }
                this.user.getSquad().getDefenders().add(this.centreHalfList.get(12));
                this.user.takeMoney(this.centreHalfList.get(12).getPrice());
                return 13;
            } else if (name.toLowerCase().contains("eri") || name.toLowerCase().contains("die")) {
                if (!(moneyCheck(this.centreHalfList.get(13).getPrice())) || (centreHalfCheck(13) == false)) {
                    return 0;
                }
                this.user.getSquad().getDefenders().add(this.centreHalfList.get(13));
                this.user.takeMoney(this.centreHalfList.get(13).getPrice());
                return 14;
            } else if (name.toLowerCase().contains("david") || name.toLowerCase().contains("lui")) {
                if (!(moneyCheck(this.centreHalfList.get(14).getPrice())) || (centreHalfCheck(14) == false)) {
                    return 0;
                }
                this.user.getSquad().getDefenders().add(this.centreHalfList.get(14));
                this.user.takeMoney(this.centreHalfList.get(14).getPrice());
                return 15;
            } else if (name.toLowerCase().contains("shk") || name.toLowerCase().contains("mus")) {
                if (!(moneyCheck(this.centreHalfList.get(15).getPrice())) || (centreHalfCheck(15) == false)) {
                    return 0;
                }
                this.user.getSquad().getDefenders().add(this.centreHalfList.get(15));
                this.user.takeMoney(this.centreHalfList.get(15).getPrice());
                return 16;
            } else if (name.toLowerCase().contains("marc") || name.toLowerCase().contains("roj")) {
                if (!(moneyCheck(this.centreHalfList.get(16).getPrice())) || (centreHalfCheck(16) == false)) {
                    return 0;
                }
                this.user.getSquad().getDefenders().add(this.centreHalfList.get(16));
                this.user.takeMoney(this.centreHalfList.get(16).getPrice());
                return 17;
            } else if (name.toLowerCase().contains("phi") || name.toLowerCase().contains("jon")) {
                if (!(moneyCheck(this.centreHalfList.get(17).getPrice())) || (centreHalfCheck(17) == false)) {
                    return 0;
                }
                this.user.getSquad().getDefenders().add(this.centreHalfList.get(17));
                this.user.takeMoney(this.centreHalfList.get(17).getPrice());
                return 18;
            } else {
                System.out.print("Unrecognised player name, try again. Choose your defender: ");
                name = this.scanner.nextLine();
            }
        }
        return 0;
    }

    public int fullBackPurchase() {
        String name = this.scanner.nextLine();
        while (name != null) {
            if (name.toLowerCase().contains("josh") || name.toLowerCase().contains("kim")) {
                if (!(moneyCheck(this.fullBackList.get(0).getPrice())) || (fullBackCheck(0) == false)) {
                    return 0;
                }
                this.user.getSquad().getFullbacks().add(this.fullBackList.get(0));
                this.user.takeMoney(this.fullBackList.get(0).getPrice());
                return 1;
            } else if (name.toLowerCase().contains("tren") || name.toLowerCase().contains("arno")) {
                if (!(moneyCheck(this.fullBackList.get(1).getPrice())) || (fullBackCheck(1) == false)) {
                    return 0;
                }
                this.user.getSquad().getFullbacks().add(this.fullBackList.get(1));
                this.user.takeMoney(this.fullBackList.get(1).getPrice());
                return 2;
            } else if (name.toLowerCase().contains("andr") || name.toLowerCase().contains("robe")) {
                if (!(moneyCheck(this.fullBackList.get(2).getPrice())) || (fullBackCheck(2) == false)) {
                    return 0;
                }
                this.user.getSquad().getFullbacks().add(this.fullBackList.get(2));
                this.user.takeMoney(this.fullBackList.get(2).getPrice());
                return 3;
            } else if (name.toLowerCase().contains("jord") || name.toLowerCase().contains("alb")) {
                if (!(moneyCheck(this.fullBackList.get(3).getPrice())) || (fullBackCheck(3) == false)) {
                    return 0;
                }
                this.user.getSquad().getFullbacks().add(this.fullBackList.get(3));
                this.user.takeMoney(this.fullBackList.get(3).getPrice());
                return 4;
            } else if (name.toLowerCase().contains("carv")) {
                if (!(moneyCheck(this.fullBackList.get(4).getPrice())) || (fullBackCheck(4) == false)) {
                    return 0;
                }
                this.user.getSquad().getFullbacks().add(this.fullBackList.get(4));
                this.user.takeMoney(this.fullBackList.get(4).getPrice());
                return 5;
            } else if (name.toLowerCase().contains("kyl") || name.toLowerCase().contains("walk")) {
                if (!(moneyCheck(this.fullBackList.get(5).getPrice())) || (fullBackCheck(5) == false)) {
                    return 0;
                }
                this.user.getSquad().getFullbacks().add(this.fullBackList.get(5));
                this.user.takeMoney(this.fullBackList.get(5).getPrice());
                return 6;
            } else if (name.toLowerCase().contains("aar") || name.toLowerCase().contains("biss")) {
                if (!(moneyCheck(this.fullBackList.get(6).getPrice())) || (fullBackCheck(6) == false)) {
                    return 0;
                }
                this.user.getSquad().getFullbacks().add(this.fullBackList.get(6));
                this.user.takeMoney(this.fullBackList.get(6).getPrice());
                return 7;
            } else if (name.toLowerCase().contains("ferl") || name.toLowerCase().contains("mend")) {
                if (!(moneyCheck(this.fullBackList.get(7).getPrice())) || (fullBackCheck(7) == false)) {
                    return 0;
                }
                this.user.getSquad().getFullbacks().add(this.fullBackList.get(7));
                this.user.takeMoney(this.fullBackList.get(7).getPrice());
                return 8;
            } else if (name.toLowerCase().contains("luca") || name.toLowerCase().contains("hern")) {
                if (!(moneyCheck(this.fullBackList.get(8).getPrice())) || (fullBackCheck(8) == false)) {
                    return 0;
                }
                this.user.getSquad().getFullbacks().add(this.fullBackList.get(8));
                this.user.takeMoney(this.fullBackList.get(8).getPrice());
                return 9;
            } else if (name.toLowerCase().contains("marce")) {
                if (!(moneyCheck(this.fullBackList.get(9).getPrice())) || (fullBackCheck(9) == false)) {
                    return 0;
                }
                this.user.getSquad().getFullbacks().add(this.fullBackList.get(9));
                this.user.takeMoney(this.fullBackList.get(9).getPrice());
                return 10;
            } else if (name.toLowerCase().contains("jua") || name.toLowerCase().contains("bern")) {
                if (!(moneyCheck(this.fullBackList.get(10).getPrice())) || (fullBackCheck(10) == false)) {
                    return 0;
                }
                this.user.getSquad().getFullbacks().add(this.fullBackList.get(10));
                this.user.takeMoney(this.fullBackList.get(10).getPrice());
                return 11;
            } else if (name.toLowerCase().contains("kier") || name.toLowerCase().contains("trip")) {
                if (!(moneyCheck(this.fullBackList.get(11).getPrice())) || (fullBackCheck(11) == false)) {
                    return 0;
                }
                this.user.getSquad().getFullbacks().add(this.fullBackList.get(11));
                this.user.takeMoney(this.fullBackList.get(11).getPrice());
                return 12;
            } else if (name.toLowerCase().contains("alek") || name.toLowerCase().contains("kola")) {
                if (!(moneyCheck(this.fullBackList.get(12).getPrice())) || (fullBackCheck(12) == false)) {
                    return 0;
                }
                this.user.getSquad().getFullbacks().add(this.fullBackList.get(12));
                this.user.takeMoney(this.fullBackList.get(12).getPrice());
                return 13;
            } else if (name.toLowerCase().contains("serg") || name.toLowerCase().contains("aur")) {
                if (!(moneyCheck(this.fullBackList.get(13).getPrice())) || (fullBackCheck(13) == false)) {
                    return 0;
                }
                this.user.getSquad().getFullbacks().add(this.fullBackList.get(13));
                this.user.takeMoney(this.fullBackList.get(13).getPrice());
                return 14;
            } else if (name.toLowerCase().contains("emer")) {
                if (!(moneyCheck(this.fullBackList.get(14).getPrice())) || (fullBackCheck(14) == false)) {
                    return 0;
                }
                this.user.getSquad().getFullbacks().add(this.fullBackList.get(14));
                this.user.takeMoney(this.fullBackList.get(14).getPrice());
                return 15;
            } else if (name.toLowerCase().contains("davi") || name.toLowerCase().contains("zap")) {
                if (!(moneyCheck(this.fullBackList.get(15).getPrice())) || (fullBackCheck(15) == false)) {
                    return 0;
                }
                this.user.getSquad().getFullbacks().add(this.fullBackList.get(15));
                this.user.takeMoney(this.fullBackList.get(15).getPrice());
                return 16;
            } else if (name.toLowerCase().contains("bran") || name.toLowerCase().contains("ivan")) {
                if (!(moneyCheck(this.fullBackList.get(16).getPrice())) || (fullBackCheck(16) == false)) {
                    return 0;
                }
                this.user.getSquad().getFullbacks().add(this.fullBackList.get(16));
                this.user.takeMoney(this.fullBackList.get(16).getPrice());
                return 17;
            } else if (name.toLowerCase().contains("alb") || name.toLowerCase().contains("more")) {
                if (!(moneyCheck(this.fullBackList.get(17).getPrice())) || (fullBackCheck(17) == false)) {
                    return 0;
                }
                this.user.getSquad().getFullbacks().add(this.fullBackList.get(17));
                this.user.takeMoney(this.fullBackList.get(17).getPrice());
                return 18;
            } else if (name.toLowerCase().contains("matt") || name.toLowerCase().contains("lowt")) {
                if (!(moneyCheck(this.fullBackList.get(18).getPrice())) || (fullBackCheck(18) == false)) {
                    return 0;
                }
                this.user.getSquad().getFullbacks().add(this.fullBackList.get(18));
                this.user.takeMoney(this.fullBackList.get(18).getPrice());
                return 19;
            } else if (name.toLowerCase().contains("sam") || name.toLowerCase().contains("byr")) {
                if (!(moneyCheck(this.fullBackList.get(19).getPrice())) || (fullBackCheck(19) == false)) {
                    return 0;
                }
                this.user.getSquad().getFullbacks().add(this.fullBackList.get(19));
                this.user.takeMoney(this.fullBackList.get(19).getPrice());
                return 20;
            } else {
                System.out.print("Unrecognised player name, try again. Choose your defender: ");
                name = this.scanner.nextLine();
            }
        }
        return 0;
    }

    public int goalkeeperPurchase() {
        String name = this.scanner.nextLine();
        while (name != null) {
            if (name.toLowerCase().contains("jan") || name.toLowerCase().contains("obl")) {
                if (!(moneyCheck(this.goalkeeperList.get(0).getPrice()))) {
                    return 0;
                }
                this.user.getSquad().getGoalkeepers().add(this.goalkeeperList.get(0));
                this.user.takeMoney(this.goalkeeperList.get(0).getPrice());
                return 1;
            } else if (name.toLowerCase().contains("manu") || name.toLowerCase().contains("neu")) {
                if (!(moneyCheck(this.goalkeeperList.get(1).getPrice()))) {
                    return 0;
                }
                this.user.getSquad().getGoalkeepers().add(this.goalkeeperList.get(1));
                this.user.takeMoney(this.goalkeeperList.get(1).getPrice());
                return 2;
            } else if (name.toLowerCase().contains("ali")) {
                if (!(moneyCheck(this.goalkeeperList.get(2).getPrice()))) {
                    return 0;
                }
                this.user.getSquad().getGoalkeepers().add(this.goalkeeperList.get(2));
                this.user.takeMoney(this.goalkeeperList.get(2).getPrice());
                return 3;
            } else if (name.toLowerCase().contains("davi") || name.toLowerCase().contains("gea")) {
                if (!(moneyCheck(this.goalkeeperList.get(3).getPrice()))) {
                    return 0;
                }
                this.user.getSquad().getGoalkeepers().add(this.goalkeeperList.get(3));
                this.user.takeMoney(this.goalkeeperList.get(3).getPrice());
                return 4;
            } else if (name.toLowerCase().contains("hug") || name.toLowerCase().contains("llo")) {
                if (!(moneyCheck(this.goalkeeperList.get(4).getPrice()))) {
                    return 0;
                }
                this.user.getSquad().getGoalkeepers().add(this.goalkeeperList.get(4));
                this.user.takeMoney(this.goalkeeperList.get(4).getPrice());
                return 5;
            } else if (name.toLowerCase().contains("eder")) {
                if (!(moneyCheck(this.goalkeeperList.get(5).getPrice()))) {
                    return 0;
                }
                this.user.getSquad().getGoalkeepers().add(this.goalkeeperList.get(5));
                this.user.takeMoney(this.goalkeeperList.get(5).getPrice());
                return 6;
            } else if (name.toLowerCase().contains("bern") || name.toLowerCase().contains("len")) {
                if (!(moneyCheck(this.goalkeeperList.get(6).getPrice()))) {
                    return 0;
                }
                this.user.getSquad().getGoalkeepers().add(this.goalkeeperList.get(6));
                this.user.takeMoney(this.goalkeeperList.get(6).getPrice());
                return 7;
            } else if (name.toLowerCase().contains("andr") || name.toLowerCase().contains("ona")) {
                if (!(moneyCheck(this.goalkeeperList.get(7).getPrice()))) {
                    return 0;
                }
                this.user.getSquad().getGoalkeepers().add(this.goalkeeperList.get(7));
                this.user.takeMoney(this.goalkeeperList.get(7).getPrice());
                return 8;
            } else if (name.toLowerCase().contains("kas") || name.toLowerCase().contains("schm")) {
                if (!(moneyCheck(this.goalkeeperList.get(8).getPrice()))) {
                    return 0;
                }
                this.user.getSquad().getGoalkeepers().add(this.goalkeeperList.get(8));
                this.user.takeMoney(this.goalkeeperList.get(8).getPrice());
                return 9;
            } else if (name.toLowerCase().contains("mart") || name.toLowerCase().contains("dub")) {
                if (!(moneyCheck(this.goalkeeperList.get(9).getPrice()))) {
                    return 0;
                }
                this.user.getSquad().getGoalkeepers().add(this.goalkeeperList.get(9));
                this.user.takeMoney(this.goalkeeperList.get(9).getPrice());
                return 10;
            } else if (name.toLowerCase().contains("nic") || name.toLowerCase().contains("pop")) {
                if (!(moneyCheck(this.goalkeeperList.get(10).getPrice()))) {
                    return 0;
                }
                this.user.getSquad().getGoalkeepers().add(this.goalkeeperList.get(10));
                this.user.takeMoney(this.goalkeeperList.get(10).getPrice());
                return 11;
            } else if (name.toLowerCase().contains("simo") || name.toLowerCase().contains("mig")) {
                if (!(moneyCheck(this.goalkeeperList.get(11).getPrice()))) {
                    return 0;
                }
                this.user.getSquad().getGoalkeepers().add(this.goalkeeperList.get(11));
                this.user.takeMoney(this.goalkeeperList.get(11).getPrice());
                return 12;
            } else if (name.toLowerCase().contains("serg") || name.toLowerCase().contains("rome")) {
                if (!(moneyCheck(this.goalkeeperList.get(12).getPrice()))) {
                    return 0;
                }
                this.user.getSquad().getGoalkeepers().add(this.goalkeeperList.get(12));
                this.user.takeMoney(this.goalkeeperList.get(12).getPrice());
                return 13;
            } else if (name.toLowerCase().contains("ben") || name.toLowerCase().contains("fos")) {
                if (!(moneyCheck(this.goalkeeperList.get(13).getPrice()))) {
                    return 0;
                }
                this.user.getSquad().getGoalkeepers().add(this.goalkeeperList.get(13));
                this.user.takeMoney(this.goalkeeperList.get(13).getPrice());
                return 14;
            } else if (name.toLowerCase().contains("lori") || name.toLowerCase().contains("kari")) {
                if (!(moneyCheck(this.goalkeeperList.get(14).getPrice()))) {
                    return 0;
                }
                this.user.getSquad().getGoalkeepers().add(this.goalkeeperList.get(14));
                this.user.takeMoney(this.goalkeeperList.get(14).getPrice());
                return 15;
            } else if (name.toLowerCase().contains("joe") || name.toLowerCase().contains("hart")) {
                if (!(moneyCheck(this.goalkeeperList.get(15).getPrice()))) {
                    return 0;
                }
                this.user.getSquad().getGoalkeepers().add(this.goalkeeperList.get(15));
                this.user.takeMoney(this.goalkeeperList.get(15).getPrice());
                return 16;
            } else {
                System.out.print("Unrecognised player name, try again. Choose your keeper: ");
                name = this.scanner.nextLine();
            }
        }
        return 0;
    }

    public int managerPurchase() {
        String name = this.scanner.nextLine();
        while (name != null) {
            if (name.toLowerCase().contains("alex") || name.toLowerCase().contains("ferg")) {
                if (this.managerList.get(0).getPrice() > this.user.getMoney()) {
                    return 0;
                }
                this.user.getSquad().getManagers().add(this.managerList.get(0));
                this.user.takeMoney(this.managerList.get(0).getPrice());
                return 1;
            } else if (name.toLowerCase().contains("rinu") || name.toLowerCase().contains("miche")) {
                if (this.managerList.get(1).getPrice() > this.user.getMoney()) {
                    return 0;
                }
                this.user.getSquad().getManagers().add(this.managerList.get(1));
                this.user.takeMoney(this.managerList.get(1).getPrice());
                return 2;
            } else if (name.toLowerCase().contains("arse") || name.toLowerCase().contains("weng")) {
                if (this.managerList.get(2).getPrice() > this.user.getMoney()) {
                    return 0;
                }
                this.user.getSquad().getManagers().add(this.managerList.get(2));
                this.user.takeMoney(this.managerList.get(2).getPrice());
                return 3;
            } else if (name.toLowerCase().contains("pep") || name.toLowerCase().contains("guar")) {
                if (this.managerList.get(3).getPrice() > this.user.getMoney()) {
                    return 0;
                }
                this.user.getSquad().getManagers().add(this.managerList.get(3));
                this.user.takeMoney(this.managerList.get(3).getPrice());
                return 4;
            } else if (name.toLowerCase().contains("jose") || name.toLowerCase().contains("mour")) {
                if (this.managerList.get(4).getPrice() > this.user.getMoney()) {
                    return 0;
                }
                this.user.getSquad().getManagers().add(this.managerList.get(4));
                this.user.takeMoney(this.managerList.get(4).getPrice());
                return 5;
            } else if (name.toLowerCase().contains("carl") || name.toLowerCase().contains("ancel")) {
                if (this.managerList.get(5).getPrice() > this.user.getMoney()) {
                    return 0;
                }
                this.user.getSquad().getManagers().add(this.managerList.get(5));
                this.user.takeMoney(this.managerList.get(5).getPrice());
                return 6;
            } else if (name.toLowerCase().contains("bill") || name.toLowerCase().contains("shan")) {
                if (this.managerList.get(6).getPrice() > this.user.getMoney()) {
                    return 0;
                }
                this.user.getSquad().getManagers().add(this.managerList.get(6));
                this.user.takeMoney(this.managerList.get(6).getPrice());
                return 7;
            } else if (name.toLowerCase().contains("lou") || name.toLowerCase().contains("gaa")) {
                if (this.managerList.get(7).getPrice() > this.user.getMoney()) {
                    return 0;
                }
                this.user.getSquad().getManagers().add(this.managerList.get(7));
                this.user.takeMoney(this.managerList.get(7).getPrice());
                return 8;
            } else if (name.toLowerCase().contains("sve") || name.toLowerCase().contains("erik")) {
                if (this.managerList.get(8).getPrice() > this.user.getMoney()) {
                    return 0;
                }
                this.user.getSquad().getManagers().add(this.managerList.get(8));
                this.user.takeMoney(this.managerList.get(8).getPrice());
                return 9;
            } else if (name.toLowerCase().contains("marce") || name.toLowerCase().contains("biel")) {
                if (this.managerList.get(9).getPrice() > this.user.getMoney()) {
                    return 0;
                }
                this.user.getSquad().getManagers().add(this.managerList.get(9));
                this.user.takeMoney(this.managerList.get(9).getPrice());
                return 10;
            } else if (name.toLowerCase().contains("gera") || name.toLowerCase().contains("houl")) {
                if (this.managerList.get(10).getPrice() > this.user.getMoney()) {
                    return 0;
                }
                this.user.getSquad().getManagers().add(this.managerList.get(10));
                this.user.takeMoney(this.managerList.get(10).getPrice());
                return 11;
            } else if (name.toLowerCase().contains("una") || name.toLowerCase().contains("emer")) {
                if (this.managerList.get(11).getPrice() > this.user.getMoney()) {
                    return 0;
                }
                this.user.getSquad().getManagers().add(this.managerList.get(11));
                this.user.takeMoney(this.managerList.get(11).getPrice());
                return 12;
            } else if (name.toLowerCase().contains("lui") || name.toLowerCase().contains("scol")) {
                if (this.managerList.get(12).getPrice() > this.user.getMoney()) {
                    return 0;
                }
                this.user.getSquad().getManagers().add(this.managerList.get(12));
                this.user.takeMoney(this.managerList.get(12).getPrice());
                return 13;
            } else if (name.toLowerCase().contains("roy") || name.toLowerCase().contains("hodg")) {
                if (this.managerList.get(13).getPrice() > this.user.getMoney()) {
                    return 0;
                }
                this.user.getSquad().getManagers().add(this.managerList.get(13));
                this.user.takeMoney(this.managerList.get(13).getPrice());
                return 14;
            } else if (name.toLowerCase().contains("marti")) {
                if (this.managerList.get(14).getPrice() > this.user.getMoney()) {
                    return 0;
                }
                this.user.getSquad().getManagers().add(this.managerList.get(14));
                this.user.takeMoney(this.managerList.get(14).getPrice());
                return 15;
            } else if (name.toLowerCase().contains("ole") || name.toLowerCase().contains("sols")) {
                if (this.managerList.get(15).getPrice() > this.user.getMoney()) {
                    return 0;
                }
                this.user.getSquad().getManagers().add(this.managerList.get(15));
                this.user.takeMoney(this.managerList.get(15).getPrice());
                return 16;
            } else if (name.toLowerCase().contains("nige") || name.toLowerCase().contains("pear")) {
                if (this.managerList.get(16).getPrice() > this.user.getMoney()) {
                    return 0;
                }
                this.user.getSquad().getManagers().add(this.managerList.get(16));
                this.user.takeMoney(this.managerList.get(16).getPrice());
                return 17;
            } else if (name.toLowerCase().contains("chris") || name.toLowerCase().contains("hugh")) {
                if (this.managerList.get(17).getPrice() > this.user.getMoney()) {
                    return 0;
                }
                this.user.getSquad().getManagers().add(this.managerList.get(17));
                this.user.takeMoney(this.managerList.get(17).getPrice());
                return 18;
            } else if (name.toLowerCase().contains("lamb")) {
                if (this.managerList.get(18).getPrice() > this.user.getMoney()) {
                    return 0;
                }
                this.user.getSquad().getManagers().add(this.managerList.get(18));
                this.user.takeMoney(this.managerList.get(18).getPrice());
                return 19;
            } else if (name.toLowerCase().contains("matte")) {
                if (this.managerList.get(19).getPrice() > this.user.getMoney()) {
                    return 0;
                }
                this.user.getSquad().getManagers().add(this.managerList.get(19));
                this.user.takeMoney(this.managerList.get(19).getPrice());
                return 20;
            } else if (name.toLowerCase().contains("ince")) {
                if (this.managerList.get(20).getPrice() > this.user.getMoney()) {
                    return 0;
                }
                this.user.getSquad().getManagers().add(this.managerList.get(20));
                this.user.takeMoney(this.managerList.get(20).getPrice());
                return 21;
            } else if (name.toLowerCase().contains("gian") || name.toLowerCase().contains("zol")) {
                if (this.managerList.get(21).getPrice() > this.user.getMoney()) {
                    return 0;
                }
                this.user.getSquad().getManagers().add(this.managerList.get(21));
                this.user.takeMoney(this.managerList.get(21).getPrice());
                return 22;
            } else if (name.toLowerCase().contains("avr") || name.toLowerCase().contains("gra")) {
                if (this.managerList.get(22).getPrice() > this.user.getMoney()) {
                    return 0;
                }
                this.user.getSquad().getManagers().add(this.managerList.get(22));
                this.user.takeMoney(this.managerList.get(22).getPrice());
                return 23;
            } else if (name.toLowerCase().contains("bob") || name.toLowerCase().contains("brad")) {
                if (this.managerList.get(23).getPrice() > this.user.getMoney()) {
                    return 0;
                }
                this.user.getSquad().getManagers().add(this.managerList.get(23));
                this.user.takeMoney(this.managerList.get(23).getPrice());
                return 24;
            } else if (name.toLowerCase().contains("fran") || name.toLowerCase().contains("boer")) {
                if (this.managerList.get(24).getPrice() > this.user.getMoney()) {
                    return 0;
                }
                this.user.getSquad().getManagers().add(this.managerList.get(24));
                this.user.takeMoney(this.managerList.get(24).getPrice());
                return 25;
            } else if (name.toLowerCase().contains("john") || name.toLowerCase().contains("carv")) {
                if (this.managerList.get(25).getPrice() > this.user.getMoney()) {
                    return 0;
                }
                this.user.getSquad().getManagers().add(this.managerList.get(25));
                this.user.takeMoney(this.managerList.get(25).getPrice());
                return 26;
            } else if (name.toLowerCase().contains("gar") || name.toLowerCase().contains("nevi")) {
                if (this.managerList.get(26).getPrice() > this.user.getMoney()) {
                    return 0;
                }
                this.user.getSquad().getManagers().add(this.managerList.get(26));
                this.user.takeMoney(this.managerList.get(26).getPrice());
                return 27;
            } else if (name.toLowerCase().contains("alan") || name.toLowerCase().contains("shea")) {
                if (this.managerList.get(27).getPrice() > this.user.getMoney()) {
                    return 0;
                }
                this.user.getSquad().getManagers().add(this.managerList.get(27));
                this.user.takeMoney(this.managerList.get(27).getPrice());
                return 28;
            } else if (name.toLowerCase().contains("tony") || name.toLowerCase().contains("ada")) {
                if (this.managerList.get(28).getPrice() > this.user.getMoney()) {
                    return 0;
                }
                this.user.getSquad().getManagers().add(this.managerList.get(28));
                this.user.takeMoney(this.managerList.get(28).getPrice());
                return 29;
            } else {
                System.out.print("Unrecognised manager name, try again. Choose your manager: ");
                name = this.scanner.nextLine();
            }
        }
        return 0;
    }

    public User getUser() {
        return this.user;
    }

    public Scanner getScanner() {
        return this.scanner;
    }

    public String legendShop() {
        SuperstarSelectionList list = new SuperstarSelectionList();
        return list.toString();
    }

    public String strikerShop() {
        ForwardSelectionList list = new ForwardSelectionList();
        return list.toString();
    }

    public String wingerShop() {
        WingerSelectionList list = new WingerSelectionList();
        return list.toString();
    }

    public String midfieldShop() {
        MidfieldSelectionList list = new MidfieldSelectionList();
        return list.toString();
    }

    public String centerHalfShop() {
        CentreHalfSelectionList list = new CentreHalfSelectionList();
        return list.toString();
    }

    public String fullBackShop() {
        FullBackSelectionList list = new FullBackSelectionList();
        return list.toString();
    }

    public String goalkeeperShop() {
        GoalkeeperSelectionList list = new GoalkeeperSelectionList();
        return list.toString();
    }

    public String managerShop() {
        ManagerSelectionList list = new ManagerSelectionList();
        return list.toString();
    }

    public boolean wingerCheck(int num) {
        if (!(this.user.getSquad().getWingers().contains(this.wingerList.getList().get(num)))) {
            return true;
        }

        return false;
    }

    public boolean midfieldCheck(int num) {
        if (!(this.user.getSquad().getMidfielders().contains(this.midfieldList.getList().get(num)))) {
            return true;
        }

        return false;
    }

    public boolean centreHalfCheck(int num) {
        if (!(this.user.getSquad().getDefenders().contains(this.centreHalfList.getList().get(num)))) {
            return true;
        }

        return false;
    }

    public boolean fullBackCheck(int num) {
        if (!(this.user.getSquad().getFullbacks().contains(this.fullBackList.getList().get(num)))) {
            return true;
        }

        return false;
    }


}