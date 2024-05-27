package main.java.neoflex.adapter;

public class Computer {
    public void connect(IUSB iusb){
        iusb.read();
        System.out.println("Подключение выполнено успешно");
    }
}
