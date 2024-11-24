package Factory;

public class CoffeeFactory {

    public Coffee getCoffee(CoffeeType coffeeType) {
        Coffee coffee = null;

        switch (coffeeType) {
            case AMERICANO:
                coffee = new Americano();
                break;
            case ESPRESSO:
                coffee = new Espresso();
                break;
            default: throw new IllegalArgumentException("Invalid coffee type" + coffeeType);
        }
        return coffee;
    }

}
