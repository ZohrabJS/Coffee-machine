package com.aca;

import com.aca.best.machin.BestMachine;
import com.aca.coffee.Coffee;
import com.aca.loop.coffee.LoopCoffee;
import com.aca.machin.pro.MachinePro;
import com.aca.machine.Machine;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Task1

//        Coffee late=new Coffee();
//        late.start();
//        late.grind();
//        late.boil();
//        late.mix();
//        late.pour();
//        late.milk();
//        late.ready();

        //Task2
//        System.out.println("Write how many cups of coffee you will need:");
//        int num = scanner.nextInt();
//        Machine calc = new Machine(num);
//        calc.machine();

        //Task3
//        System.out.println("Input water");
//        int water = scanner.nextInt();
//        System.out.println("Input milk");
//        int milk = scanner.nextInt();
//        System.out.println("Input coffee");
//        int coffee = scanner.nextInt();
//        MachinePro detal = new MachinePro(water, milk, coffee);
//        System.out.println("Input cup");
//        int cup = scanner.nextInt();
//        detal.calc(cup);

        //Task4
//        BestMachine mac = new BestMachine();
//        System.out.println("Buy one cup of coffee or to fill the ingredients or to take it's money");
//        System.out.println("1.Buy coffee");
//        System.out.println("2.Fill the ingredients");
//        System.out.println("3.Take your money");
//        int variant = scanner.nextInt();
//        switch (variant) {
//            case 1:
//                mac.stat();
//                System.out.println("1.Espresso 4$");
//                System.out.println("2.Late 7$");
//                System.out.println("3.Cappuccino 6$");
//                int cof= scanner.nextInt();
//                if(cof==1){
//                    mac.makeEspresso();
//                }
//                else if(cof==2){
//                    mac.makeLate();
//                }
//                else if(cof==3){
//                    mac.makeCappuccino();
//                }
//                mac.stat();
//                break;
//            case 2:
//                System.out.println("Fill water");
//                int water=scanner.nextInt();
//                mac.setWater(water);
//                System.out.println("Fill milk");
//                int milk= scanner.nextInt();
//                mac.setMilk(milk);
//                System.out.println("Fill coffee");
//                int coffee= scanner.nextInt();
//                mac.setCoffee(coffee);
//                System.out.println("Fill cup");
//                int cup=scanner.nextInt();
//                mac.setCup(cup);
//                mac.stat();
//                break;
//            case 3:
//                mac.getMany();
//                System.out.println("How much money do you take?");
//                int money= scanner.nextInt();
//                mac.setMany(money);
//                mac.getMany();
//                break;
//            default:
//                System.out.println("Input error");
//                mac.stat();
//                break;
//
//        }

        //Task 5
        LoopCoffee loop=new LoopCoffee();
        loop.loop();

    }
}
