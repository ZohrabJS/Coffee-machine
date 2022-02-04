package com.aca.loop.coffee;

import com.aca.best.machin.BestMachine;

import java.util.Scanner;

public class LoopCoffee extends BestMachine {

    public static int first() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Buy one cup of coffee or to fill the ingredients or to take it's money");
        System.out.println("1.Buy coffee");
        System.out.println("2.Fill the ingredients");
        System.out.println("3.Take your money");
        System.out.println("4.Remaining");
        System.out.println("5.Exit");
        int variant = scanner.nextInt();
        return variant;
    }

    public static int buyCoffee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Espresso 4$");
        System.out.println("2.Late 7$");
        System.out.println("3.Cappuccino 6$");
        System.out.println("4.Back");
        int cof = scanner.nextInt();
        return cof;
    }

    public void fill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fill water");
        int water = scanner.nextInt();
        setWater(water);
        System.out.println("Fill milk");
        int milk = scanner.nextInt();
        setMilk(milk);
        System.out.println("Fill coffee");
        int coffee = scanner.nextInt();
        setCoffee(coffee);
        System.out.println("Fill cup");
        int cup = scanner.nextInt();
        setCup(cup);
        System.out.println("All is filled");
    }
    public void change(){
        Scanner scanner=new Scanner(System.in);
        getMany();
        System.out.println("How much money do you take?");
        int cheng=scanner.nextInt();
        setMany(cheng);

    }

    public boolean testEspresso() {
        if (getWater() / 250 < 1 || getCoffee() / 16 < 1 || getCup() == 0) {
            return false;
        }
        return true;
    }

    public boolean testLate() {
        if (getWater() / 350 < 1 || getMilk() / 75 < 1 || getCoffee() / 20 < 1 || getCup() == 0) {
            return false;
        }
        return true;
    }

    public boolean testCappuccino() {
        if (getWater() / 200 < 1 || getMilk() / 100 < 1 || getCoffee() / 12 < 1 || getCup() == 0) {
            return false;
        }
        return true;
    }


    public void loop() {
        for (int n = first(); n != 5; ) {
            if (n == 1) {
                for (int variant = buyCoffee(); variant != 4; ) {
                    if (variant == 1) {
                        if (testEspresso()) {
                            makeEspresso();
                        } else {
                            System.out.println("can't make a cup of coffee");
                        }
                    } else if (variant == 2) {
                        if (testLate()) {
                            makeLate();
                        } else {
                            System.out.println("can't make a cup of coffee");
                        }
                    } else if (variant == 3) {
                        if (testCappuccino()) {
                            makeCappuccino();
                        } else {
                            System.out.println("can't make a cup of coffee");
                        }
                    }
                    else{
                        System.out.println("Wrong , try again");
                    }
                    variant = buyCoffee();
                }
            }
            if(n==2){
                fill();
            }
            if(n==3){
                change();
            }
            if(n==4){
                stat();
            }
            n = first();
        }
    }

}
