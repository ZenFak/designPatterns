package main.java.neoflex.factory;

public class Americano extends Coffee {
    @Override
    public void prepare() {
        System.out.println("Готовим americano");
    }
}
