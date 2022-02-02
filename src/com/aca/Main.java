package com.aca;

import com.aca.coffee.Coffee;

public class Main {

    public static void main(String[] args) {
        Coffee late=new Coffee();
        late.start();
        late.grind();
        late.boil();
        late.mix();
        late.pour();
        late.milk();
        late.ready();
    }
}
