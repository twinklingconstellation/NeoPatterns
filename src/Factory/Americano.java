package Factory;

public class Americano implements Coffee {

    @Override
    public void makeCoffee() {
        System.out.println("Americano coffee is ready");
    }
}
