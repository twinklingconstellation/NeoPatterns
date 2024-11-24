package Adapter;

public class SDMemoryCard  implements MemoryCard {
    @Override
    public void readData() {
        System.out.println("SDMemoryCard read Data ");
    }
}
