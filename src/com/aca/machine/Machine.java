package com.aca.machine;

public class Machine {
    private int cup;
    public Machine(int cup){
         this.cup=cup;
    }
    public void machine(){
        System.out.println("For "+cup+" cups of coffee you will need:");
        System.out.println( 200*cup+" ml of water");
        System.out.println(50*cup+" ml of milk");
        System.out.println(15*cup+" g of coffee beans");
    }
}
