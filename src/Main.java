import Adapter.*;
import Factory.Coffee;
import Factory.CoffeeFactory;
import Factory.CoffeeType;
import Proxy.Database;
import Proxy.DatabaseProxy;
import Singleton.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // realise Singleton
        Logger logger = Logger.getInstance();
        logger.classLog(new TestClass(), "How are you?");


        // realise Factory
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee coffee1 = coffeeFactory.getCoffee(CoffeeType.ESPRESSO);
        coffee1.makeCoffee();


        //Adapter
        MemoryCard sdCard = new SDMemoryCard();

        USB usbAdapter = new MemoryCardAdapter(sdCard);
        usbAdapter.readData();

        //Proxy
        Database database = new DatabaseProxy("myDatabase", "localhost:8080");
        database.connect();











    }

}

    class TestClass {}