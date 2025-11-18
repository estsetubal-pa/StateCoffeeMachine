package com.pa.pattern.state;
public class NoCoinState implements CoffeeMachineState {

    private CoffeeMachine machine;

    public NoCoinState(CoffeeMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted. Ready to brew.");
        machine.setState(new HasCoinState(machine));
    }

    @Override
    public void pressButton() {
        System.out.println("Insert a coin first.");
    }

    @Override
    public void dispenseCoffee() {
        System.out.println("No coffee without payment.");
    }
}
