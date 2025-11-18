public class BrewingState implements CoffeeMachineState {

    private CoffeeMachine machine;

    public BrewingState(CoffeeMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Brewing... please wait!");
    }

    @Override
    public void pressButton() {
        System.out.println("Already brewing.");
    }

    @Override
    public void dispenseCoffee() {
        System.out.println("Coffee is ready! Enjoy ☕");
        machine.setState(machine.getNoCoinState());
    }
}
