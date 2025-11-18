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
