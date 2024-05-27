package main.java.neoflex.factory;

public class Espresso extends Coffee{
    @Override
    public void prepare() {
        System.out.println("Готовим espresso");
    }
}
