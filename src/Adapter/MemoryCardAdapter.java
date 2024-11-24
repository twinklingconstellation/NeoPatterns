package Adapter;

public class MemoryCardAdapter implements USB {

    private MemoryCard memoryCard;

    public MemoryCardAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void readData() {
        System.out.println("MemoryCardAdapter readData");
        memoryCard.readData();
    }
}
