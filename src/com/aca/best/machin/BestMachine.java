package com.aca.best.machin;

public class BestMachine {
    private int many=550;
    private int water=400;
    private int milk=540;
    private int coffee=120;
    private int cup=9;

    public  void stat(){
        System.out.println("At the moment, the coffee machine has $" + many+","+water+" ml of water, "+milk+" ml of milk, "+coffee+" g of coffee beans, and "+cup+" disposable cups.");
    }
    public void makeEspresso(){
        this.water-=250;
        this.coffee-=16;
        this.cup--;
        this.many+=4;
        System.out.println("Take Espresso");
    }
    public void makeLate(){
        this.water-=350;
        this.milk-=75;
        this.coffee-=20;
        this.cup--;
        this.many+=7;
        System.out.println("Take Late");
    }
    public void makeCappuccino(){
        this.water-=200;
        this.milk-=100;
        this.coffee-=12;
        this.cup--;
        this.many+=6;
        System.out.println("Take Cappuccino");
    }
    public void setMany(int many){
        if(many>this.many){
            System.out.println("Not enough money,i can give "+this.many+"$");
        }
        else{
        this.many-=many;
            System.out.println("Change success");
        }
    }
    public void getMany(){
        System.out.println("At the moment, the coffee machine has $"+many);
    }
    public void setWater(int water){
        this.water+=water;
    }
    public int getWater(){
        return water;
    }
    public void setMilk(int milk){
        this.milk+=milk;
    }
    public int getMilk(){
        return milk;
    }
    public void setCoffee(int coffee){
        this.coffee+=coffee;
    }
    public int getCoffee(){
        return coffee;
    }
    public void setCup(int cup){
        this.cup+=cup;
    }
    public int getCup(){
        return cup;
    }
}
