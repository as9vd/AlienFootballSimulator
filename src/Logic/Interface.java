package Logic;

import FootballerAndManager.*;
import Lists.StartingXI;

import java.util.Scanner;

public class Interface {

    private Scanner scanner;
    private User user;
    private String name;
    private StartingXI startingXI;
    private Step0 step0;
    private Step1 step1;
    private Step2 step2;
    private Step3 step3;
    private Step4 step4;
    private Step5 step5;
    private Step6 step6;
    private Step7 step7;
    private Step8 step8;
    private Step9 step9;
    private Step10 step10;
    private Step11 step11;
    private Step12 step12;
    private Step13 step13;

    public Interface() {
        this.scanner = new Scanner(System.in);
        this.user = new User();
        this.name = null;
        this.startingXI = new StartingXI();
        this.step0 = new Step0(this.scanner, this.user);
        this.step1 = new Step1(this.scanner, this.user);
        this.step2 = new Step2(this.scanner, this.user);
        this.step3 = new Step3(this.scanner, this.user);
        this.step4 = new Step4(this.scanner, this.user);
        this.step5 = new Step5(this.scanner, this.user);
        this.step6 = new Step6(this.scanner, this.user);
        this.step7 = new Step7(this.scanner, this.user);
        this.step8 = new Step8(this.scanner, this.user);
        this.step9 = new Step9(this.scanner, this.user);
        this.step10 = new Step10(this.scanner, this.user);
        this.step11 = new Step11(this.scanner, this.user);
        this.step12 = new Step12(this.scanner, this.user);
        this.step13 = new Step13(this.scanner, this.user);
    }

    public void start() throws InterruptedException {
        this.step0.stepZeroIntro();
        this.step1.stepOneIntro();
        this.step2.stepTwoIntro();
        this.step3.stepThreeIntro();
        this.step4.stepFourIntro();
        this.step5.stepFiveIntro();
        this.step6.stepSixIntro();
        this.step7.stepSevenIntro();
        this.step8.stepEightIntro();
        this.step9.stepNineIntro();
        if (this.step9.getVictory() == true) {
            this.step10.stepTenIntro();
        }
        if (this.step10.getVictory() == true) {
            this.step11.stepElevenIntro();
        }
        if (this.step11.getVictory() == true) {
            this.step12.stepTwelveIntro();
        }
        if (this.step12.getVictory() == true) {
            this.step13.stepThirteenIntro();
        }
        if (this.step13.getVictory() == true) {
            Thread.sleep(1000);
            System.out.println("Actually, there isn't a next round. You've won the game.");
            Thread.sleep(500);
            System.out.println("Wow. I'm in awe.");
            Thread.sleep(500);
            System.out.println("You are amazing. You've saved the Earth.");
            Thread.sleep(500);
            System.out.println("Thank you for your work, and thank you for playing my game.");
            Thread.sleep(500);
            System.out.println("I appreciate you, lad.");
        }
    }

    public String getName() {
        return this.name;
    }

    public Scanner getScanner() {
        return this.scanner;
    }

}