package com.pa.pattern.state;

public class CoffeeMachine {



    private CoffeeMachineState currentState;

    public CoffeeMachine() {
          currentState = new NoCoinState(this);
    }

    public void setState(CoffeeMachineState state) {
        currentState = state;
    }

    public void insertCoin() { currentState.insertCoin(); }
    public void pressButton() { currentState.pressButton(); }
    public void dispenseCoffee() { currentState.dispenseCoffee(); }
}
