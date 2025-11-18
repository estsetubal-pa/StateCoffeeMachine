package com.pa.pattern;

import com.pa.pattern.state.CoffeeMachine;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();
        machine.pressButton();
        machine.insertCoin();
        machine.pressButton();
        machine.insertCoin();
        machine.dispenseCoffee();
    }
}
