import Singleton.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        logger.classLog(new TestClass(), "How are you?");
        }
    }
    class TestClass {}