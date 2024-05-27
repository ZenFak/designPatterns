package main.java.neoflex.adapter;

public class MemoryCard implements IMemoryCard{
    @Override
    public void read() {
        System.out.println("Карта памяти подключена");
    }
}
