package Factory;

public class Espresso implements Coffee {

    @Override
    public void makeCoffee() {
        System.out.println("Espresso coffee is ready");
    }
}
