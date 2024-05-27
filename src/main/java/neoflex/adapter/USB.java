package main.java.neoflex.adapter;

public class USB implements IUSB{
    @Override
    public void read() {
        System.out.println("USB подключен");
    }
}
