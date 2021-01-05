package BotTeams;

import FootballerAndManager.Footballer;
import FootballerAndManager.User;

import java.util.*;

public abstract class HeadToHeadTemplate {

    private User user;
    private TeamTemplate botTeam;
    private int userShots;
    private int userGoals;
    private int botShots;
    private int botGoals;
    private int userGoalBoundary;
    private int botGoalBoundary;
    private ArrayList<Integer> shotValuesList;
    private boolean victory;

    public HeadToHeadTemplate(User user, TeamTemplate botTeam) {
        this.user = user;
        this.botTeam = botTeam;
        this.userGoalBoundary = 9;
        this.botGoalBoundary = 9;
        this.victory = false;

        this.shotValuesList = new ArrayList<>();
        this.shotValuesList.add(1);
        this.shotValuesList.add(2);
        this.shotValuesList.add(3);
        this.shotValuesList.add(4);
        this.shotValuesList.add(5);
        this.shotValuesList.add(6);
    }

    public void startMatch() throws InterruptedException {
        for (int i = 0; i <= 120; i++) {
            int compiler = eventCompiler();

            if (i == 0) {
                System.out.println("Kick-off!");
            }

            System.out.print(i + ": ");
            System.out.println(eventReader(compiler));

            if (i == 45) {
                System.out.println("Half-time. Score is " + this.userGoals + " - " + this.botGoals + ".");
            }

            if (i == 90 && (!(this.userGoals == this.botGoals))) {
                System.out.println("Final score: " + this.userGoals + " - " + this.botGoals);
                if (this.botGoals > this.userGoals) {
                    System.out.println("Terrible defeat. The Earth has now been destroyed, and the remains of humankind have perished.");
                    this.victory = false;
                } else if (this.botGoals < this.userGoals) {
                    System.out.println("What a resounding victory! You have done well. Onto the next round!");
                    this.victory = true;
                }
                break;
            }
            if (i == 90 && (this.userGoals == this.botGoals)) {
                System.out.println("End of full-time. We will have overtime.");
            }

            if (i == 120 && (!(this.userGoals == this.botGoals))) {
                System.out.println("Final score: " + this.userGoals + " - " + this.botGoals);
                if (this.botGoals > this.userGoals) {
                    System.out.println("Terrible defeat. The Earth has now been destroyed, and the remains of humankind have perished. Game over. Thank you for trying.");
                    this.victory = false;
                } else if (this.botGoals < this.userGoals) {
                    System.out.println("What a resounding victory! You have done well. Onto the next round!");
                    this.victory = true;
                }
                break;
            }
            if (i == 120 && (this.userGoals == this.botGoals)) {
                System.out.println("Hard-fought match. Unfortunately, one team will still have to lose.");
                System.out.println("To settle this, we will have a coin flip.");
                System.out.println("Enter 'H' for heads, or 'T' for tails. Better hope you get lucky!");
                boolean result = this.headsOrTails(new Scanner(System.in));
                if (result == true) {
                    System.out.println("You made it! Luckily, but you made it. Good job!");
                    this.victory = true;
                } else {
                    System.out.println("Unlucky. You lost due to a coin toss. I genuinely feel for you; I'm sorry.");
                    System.out.println("The game is over. Earth has vaporised. Better luck next time.");
                    this.victory = false;
                }
            }
            Thread.sleep(250);
        }
    }

    public int shotGeneratorUser() {
        double userAttVsBotDef = this.user.getSquad().calculateTrueOffence() - this.botTeam.calculateTrueDefence();

        if (this.user.getSquad().calculateTrueOffence() >= this.botTeam.calculateTrueDefence()) {
            if (userAttVsBotDef >= 10) {
                int num1 = new Random().nextInt(3);
                if (num1 == 1) {
                    return 1;
                }
                return 0;
            } else if (userAttVsBotDef < 10 && userAttVsBotDef >= 5) {
                int num2 = new Random().nextInt(4);
                if (num2 == 1) {
                    return 2;
                }
                return 0;
            } else if (userAttVsBotDef < 5 && userAttVsBotDef >= 0) {
                int num3 = new Random().nextInt(5);
                if (num3 == 1) {
                    return 3;
                }
                return 0;
            }
        }
        if (this.user.getSquad().calculateTrueOffence() < this.botTeam.calculateTrueDefence()) {
            if (userAttVsBotDef < 0 && userAttVsBotDef >= -5) {
                int num4 = new Random().nextInt(5);
                if (num4 == 1) {
                    return 4;
                }
                return 0;
            } else if (userAttVsBotDef < -5 && userAttVsBotDef >= -10) {
                int num5 = new Random().nextInt(6);
                if (num5 == 1) {
                    return 5;
                }
                return 0;
            } else if (userAttVsBotDef - userAttVsBotDef < -10) {
                int num6 = new Random().nextInt(7);
                if (num6 == 1) {
                    return 6;
                }
                return 0;
            }
        }
        return 0;
    }

    public int shotGeneratorBot() {
        double botAttVsUserDef = this.botTeam.calculateTrueOffence() - this.user.getSquad().calculateTrueDefence();

        if (this.botTeam.calculateTrueOffence() >= this.user.getSquad().calculateTrueDefence()) {
            if (botAttVsUserDef >= 10) {
                int num1 = new Random().nextInt(5);
                if (num1 == 1) {
                    return 1;
                }
            } else if (botAttVsUserDef < 10 && botAttVsUserDef >= 5) {
                int num2 = new Random().nextInt(6);
                if (num2 == 1) {
                    return 2;
                }
            } else if (botAttVsUserDef < 5 && botAttVsUserDef >= 0) {
                int num3 = new Random().nextInt(7);
                if (num3 == 1) {
                    return 3;
                }
            }
        }
        if (this.botTeam.calculateTrueOffence() < this.user.getSquad().calculateTrueDefence()) {
            if (botAttVsUserDef < 0 && botAttVsUserDef >= -5) {
                int num4 = new Random().nextInt(8);
                if (num4 == 1) {
                    return 4;
                }
            } else if (botAttVsUserDef < -5 && botAttVsUserDef >= -10) {
                int num5 = new Random().nextInt(9);
                if (num5 == 1) {
                    return 5;
                }
            } else if (botAttVsUserDef < -10) {
                int num6 = new Random().nextInt(10);
                if (num6 == 1) {
                    return 6;
                }
            }
        }
        return 0;
    }

    public int bookingGeneratorUser() {
        int randNum = new Random().nextInt(30);

        if (randNum == 1) {
            return 1;
        }

        return 0;
    }

    public int bookingGeneratorBot() {
        int randNum = new Random().nextInt(30);

        if (randNum == 1) {
            return 1;
        }

        return 0;
    }

    public int goalLotteryUser() {
        if (this.userShots >= 3) {
            this.userGoalBoundary--;
        }

        if (this.userGoalBoundary < 2) {
            this.userGoalBoundary = 2;
        }

        int randNum = new Random().nextInt(this.userGoalBoundary);
        if (randNum == 1) {
            this.userGoalBoundary = 9;
            return 1;
        }

        return 0;
    }

    public int goalLotteryBot() {
        if (this.botShots >= 3) {
            this.botGoalBoundary--;
        }

        if (this.botGoalBoundary < 2) {
            this.botGoalBoundary = 2;
        }

        int randNum = new Random().nextInt(this.botGoalBoundary);
        if (randNum == 1) {
            this.botGoalBoundary = 9;
            return 1;
        }

        return 0;
    }

    public int eventCompiler() {
        int generatedShotOddsUser = shotGeneratorUser();
        int generatedBookingOddsUser = bookingGeneratorUser();
        int generatedGoalOddsUser = goalLotteryUser();

        int generatedShotOddsBot = shotGeneratorBot();
        int generatedBookingOddsBot = bookingGeneratorBot();
        int generatedGoalOddsBot = goalLotteryBot();

        boolean userSuccessShot = this.shotValuesList.contains(generatedShotOddsUser);
        boolean userSuccessBooking = (generatedBookingOddsUser == 1);
        boolean userGoalSuccess = (generatedGoalOddsUser == 1);

        boolean botSuccessShot = this.shotValuesList.contains(generatedShotOddsBot);
        boolean botSuccessBooking = (generatedBookingOddsBot == 1);
        boolean botGoalSuccess = (generatedGoalOddsBot == 1);

        boolean onlyUserShot = ((userSuccessShot == true) && (botSuccessShot == false) && (userSuccessBooking == false) && (botSuccessBooking == false));
        boolean onlyUserBooking = ((userSuccessShot == false) && (botSuccessShot == false) && (userSuccessBooking == true) && (botSuccessBooking == false));

        boolean onlyBotShot = ((userSuccessShot == false) && (botSuccessShot == true) && (userSuccessBooking == false) && (botSuccessBooking == false));
        boolean onlyBotBooking = ((userSuccessShot == false) && (botSuccessShot == false) && (userSuccessBooking == false) && (botSuccessBooking == true));

        boolean onlyShots = ((userSuccessShot == true) && (botSuccessShot == true) && (userSuccessBooking == false) && (botSuccessBooking == false));
        boolean onlyBookings = ((userSuccessShot == false) && (botSuccessShot == false) && (userSuccessBooking == true) && (botSuccessBooking == true));

        if (onlyUserShot == true || onlyShots == true) {
            if (userGoalSuccess == true) {
                return 10;
            }
            return 1;
        } else if (onlyBotShot == true) {
            if (botGoalSuccess == true) {
                return 11;
            }
            return 2;
        } else if (onlyUserBooking == true) {
            return 3;
        } else if (onlyBotBooking == true) {
            return 4;
        } else if (onlyShots == true) {
            if (userGoalSuccess == true) {
                return 10;
            }
            return 1;
        } else if (onlyBookings == true) {
            return 4;
        } else if (userSuccessShot == true) {
            if (userGoalSuccess == true) {
                return 10;
            }
            return 1;
        } else if (botSuccessShot == true) {
            if (botGoalSuccess == true) {
                return 11;
            }
            return 2;
        }

        return 0;
    }

    public String eventReader(int compiler) {
        if (compiler == 1) {
            this.userShots++;
            return "Shot on target by " + randomPlayerUser(new Random().nextInt(3), new Random().nextInt(3)) + ".";
        } else if (compiler == 2) {
            this.botShots++;
            return "Shot on target by " + randomPlayerBot(new Random().nextInt(2), new Random().nextInt(4)) + ".";
        } else if (compiler == 3) {
            Footballer randomFootballer = randomPlayerUser(new Random().nextInt(4), new Random().nextInt(3));
            if (randomFootballer.getBookings() == 1) {
                return "";
            }
            randomFootballer.setBookings(1);
            return randomFootballer + " has picked up his first booking.";
        } else if (compiler == 4) {
            Footballer randomFootballer = randomPlayerBot(new Random().nextInt(3), new Random().nextInt(4));
            if (randomFootballer.getBookings() == 1) {
                return "";
            }
            randomFootballer.setBookings(1);
            return randomFootballer + " has picked up his first booking.";
        } else if (compiler == 10) {
            Footballer randomPlayer = randomPlayerUser(new Random().nextInt(3), new Random().nextInt(2));
            this.userGoals++;
            return "Goal for your team! The scorer is " + randomPlayer + ".  Score is now " + this.userGoals + " - " + this.botGoals + ".";
        } else if (compiler == 11) {
            Footballer randomPlayer = randomPlayerBot(new Random().nextInt(2), new Random().nextInt(4));
            this.botGoals++;
            return "Goal for your opponents. The scorer is " + randomPlayer + ". Score is now " + this.userGoals + " - " + this.botGoals + ".";
        }
        return "";
    }

    public Footballer randomPlayerUser(int teamIndex, int playerIndex) {
        return this.user.getSquad().getRandom(teamIndex, playerIndex);
    }

    public Footballer randomPlayerBot(int teamIndex, int playerIndex) {
        return this.botTeam.getRandom(teamIndex, playerIndex);
    }

    public boolean getVictoryStatus() {
        return this.victory;
    }

    public boolean headsOrTails(Scanner scanner) {
        int randomNum = new Random().nextInt(2);
        String answer = scanner.nextLine();
        int numAnswer = 11;

        if (answer.toLowerCase().contains("h")) {
            numAnswer = 0;
        } else {
            numAnswer = 1;
        }

        if (numAnswer == randomNum) {
            return true;
        }

        return false;
    }
}