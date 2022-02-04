package com.aca.machin.pro;

public class MachinePro {
    private int water;
    private int milk;
    private int coffee;
    public MachinePro(int water, int milk, int coffee){
        this.water=water;
         this.milk=milk;
        this.coffee=coffee;
    }
    public void calc(int cup){
        int n=water/200;
        if(n>milk/50){
            n=milk/50;
        }
        if(n>coffee/15){
            n=coffee/15;
        }
        if(cup==n){
            System.out.println("Yes, I can make that amount of coffee");
        }
        else if(cup<n){
            System.out.println("Yes, I can make that amount of coffee (and even "+(n-cup)+" more than that)");
        }
        else{
            System.out.println("No, I can make only "+n+" cup(s) of coffee");
        }
    }
}
