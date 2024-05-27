package main.java.neoflex.adapter;

public class MemoryCardAdapter implements IUSB {
    private MemoryCard memoryCard;
    public MemoryCardAdapter(MemoryCard memoryCard){
        this.memoryCard = memoryCard;
    }
    @Override
    public void read() {
        memoryCard.read();
    }
}
