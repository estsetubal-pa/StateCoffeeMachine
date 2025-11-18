public class HasCoinState implements CoffeeMachineState {

    private CoffeeMachine machine;

    public HasCoinState(CoffeeMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted.");
    }

    @Override
    public void pressButton() {
        System.out.println("Brewing coffee...");
        machine.setState(machine.getBrewingState());
        machine.dispenseCoffee();
    }

    @Override
    public void dispenseCoffee() {
        System.out.println("Press the button to brew.");
    }
}
