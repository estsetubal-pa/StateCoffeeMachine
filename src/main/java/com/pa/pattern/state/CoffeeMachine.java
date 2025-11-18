public class CoffeeMachine {

    private CoffeeMachineState noCoinState;
    private CoffeeMachineState hasCoinState;
    private CoffeeMachineState brewingState;

    private CoffeeMachineState currentState;

    public CoffeeMachine() {
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        brewingState = new BrewingState(this);
        currentState = noCoinState;
    }

    public void setState(CoffeeMachineState state) {
        currentState = state;
    }

    public CoffeeMachineState getNoCoinState() { return noCoinState; }
    public CoffeeMachineState getHasCoinState() { return hasCoinState; }
    public CoffeeMachineState getBrewingState() { return brewingState; }

    public void insertCoin() { currentState.insertCoin(); }
    public void pressButton() { currentState.pressButton(); }
    public void dispenseCoffee() { currentState.dispenseCoffee(); }
}
